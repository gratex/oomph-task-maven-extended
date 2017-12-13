# oomph-task-maven-extended
[Eclipse Oomph](https://projects.eclipse.org/projects/tools.oomph) extension tasks for extended maven import

# Feature

The standard oomph maven task uses default project name template logic.
This oomph task extends the project name template logic and adds the ability to extract parts from version and use them as part of imported project name.

Following example demonstrates usage of the task. It will import maven projects and create workspace project names with template: [artifactId] [[version:^.*-(.*)$:]].
In this case it will extract last part after '-' from version string.

```xml
<setupTask
   xsi:type="maven_1:MavenImportTask"
   projectNameTemplate="[artifactId] [[version:^.*-(.*)$:]]">
   <sourceLocator
       rootFolder="deps"
       locateNestedProjects="true"/>
   <description></description>
</setupTask>
```
If we have following two pom files:

Library with feature1
```xml
<project>
    <groupId>org.test</groupId>
    <artifactId>test</artifactId>
    <version>1.0.3-feature1</version>
</project>
```

Library with feature2
```xml
<project>
    <groupId>org.test</groupId>
    <artifactId>test</artifactId>
    <version>1.0.3-feature2</version>
</project>
```

After oomph maven import the workspace will contain two projects: 
* test feature1
* test feature2
