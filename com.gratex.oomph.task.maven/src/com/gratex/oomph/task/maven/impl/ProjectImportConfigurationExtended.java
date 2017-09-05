/**
 *
 */
package com.gratex.oomph.task.maven.impl;

import org.eclipse.m2e.core.project.ProjectImportConfiguration;
import org.eclipse.m2e.core.project.ResolverConfiguration;

import org.apache.maven.model.Model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * @author jkovalux
 *
 */
public class ProjectImportConfigurationExtended extends ProjectImportConfiguration
{

  private static final String GROUP_ID = "\\[groupId\\]"; //$NON-NLS-1$

  private static final String ARTIFACT_ID = "\\[artifactId\\]"; //$NON-NLS-1$

  private static final String VERSION = "\\[version\\]"; //$NON-NLS-1$

  private static final String NAME = "\\[name\\]"; //$NON-NLS-1$

  private static final Pattern VERSION_REGEX = Pattern.compile("\\[version:(.*?):\\]"); //$NON-NLS-1$
  // [version:^.*-(.*)$:]

  /**
   *
   */
  public ProjectImportConfigurationExtended()
  {
    super();
  }

  /**
   * @param resolverConfiguration
   */
  public ProjectImportConfigurationExtended(ResolverConfiguration resolverConfiguration)
  {
    super(resolverConfiguration);
  }

  @Override
  public String getProjectName(Model model)
  {
    String projectNameTemplate = getProjectNameTemplate();
    if (projectNameTemplate.length() == 0)
    {
      return cleanProjectNameComponent(model.getArtifactId(), false);
    }

    String artifactId = model.getArtifactId();
    String groupId = model.getGroupId();
    if (groupId == null && model.getParent() != null)
    {
      groupId = model.getParent().getGroupId();
    }
    String version = model.getVersion();
    if (version == null && model.getParent() != null)
    {
      version = model.getParent().getVersion();
    }
    String name = model.getName();
    if (name == null || name.trim().isEmpty())
    {
      name = artifactId;
    }

    // XXX needs MavenProjectManager update to resolve groupId and version
    projectNameTemplate = projectNameTemplate.replaceAll(GROUP_ID, cleanProjectNameComponent(groupId, true))
        .replaceAll(ARTIFACT_ID, cleanProjectNameComponent(artifactId, true)).replaceAll(NAME, cleanProjectNameComponent(name, true))
        .replaceAll(VERSION, version == null ? "" : cleanProjectNameComponent(version, true));

    return replaceRegex(VERSION_REGEX, projectNameTemplate, version == null ? "" : cleanProjectNameComponent(version, true));
  }

  private static String replaceRegex(Pattern pattern, String projectNameTemplate, String version)
  {
    if (version == null)
    {
      return projectNameTemplate;
    }
    StringBuffer sb = new StringBuffer(projectNameTemplate.length());
    Matcher m = pattern.matcher(projectNameTemplate);
    while (m.find())
    {
      String regex = m.group(1);
      if (regex == null || regex.length() == 0)
      {
        continue;
      }
      try
      {
        Pattern innerPattern = Pattern.compile(regex);
        Matcher m1 = innerPattern.matcher(version);
        if (m1.matches())
        {
          m.appendReplacement(sb, Matcher.quoteReplacement(m1.group(1)));
        }
        else
        {
          m.appendReplacement(sb, "");
        }
      }
      catch (PatternSyntaxException ex)
      {
        // NOP
      }
    }
    m.appendTail(sb);
    return sb.toString();
  }

  public static void main(String[] args)
  {
    System.out.println(ProjectImportConfigurationExtended.replaceRegex(VERSION_REGEX, "[version:^.*-(.*)$:]-[version:^.*-(.*)$:]", "1.2.3-multi"));
    System.out.println(ProjectImportConfigurationExtended.replaceRegex(VERSION_REGEX, "[version::]-[version:^.*-(.*)$:]", "1.2.3-multi"));
    System.out.println(ProjectImportConfigurationExtended.replaceRegex(VERSION_REGEX, "[version::]-[version:^.*-(.*)$:]", ""));
    System.out.println(ProjectImportConfigurationExtended.replaceRegex(VERSION_REGEX, "[version:^.*-(.*)$:]", "1.2.3"));
  }

  private static final String cleanProjectNameComponent(String value, boolean quote)
  {
    // remove property placeholders
    value = value.replaceAll("\\$\\{[^\\}]++\\}", ""); //$NON-NLS-1$ $NON-NLS-2$
    if (quote)
    {
      value = Matcher.quoteReplacement(value);
    }
    return value;
  }
}
