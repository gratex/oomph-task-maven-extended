/**
 *
 */
package com.gratex.oomph.task.maven.impl;

import org.eclipse.m2e.core.project.ProjectImportConfiguration;
import org.eclipse.m2e.core.project.ResolverConfiguration;

import org.apache.maven.model.Model;

import java.util.regex.Matcher;

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

  private static final String PARENT_DIR_NAME = "\\[parentDirName\\]"; //$NON-NLS-1$

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
    String parentDirName = model.getProjectDirectory().getParentFile().getName();

    // XXX needs MavenProjectManager update to resolve groupId and version
    return projectNameTemplate.replaceAll(GROUP_ID, cleanProjectNameComponent(groupId, true))
        .replaceAll(ARTIFACT_ID, cleanProjectNameComponent(artifactId, true)).replaceAll(NAME, cleanProjectNameComponent(name, true))
        .replaceAll(VERSION, version == null ? "" : cleanProjectNameComponent(version, true))
        .replaceAll(PARENT_DIR_NAME, cleanProjectNameComponent(parentDirName, true));
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
