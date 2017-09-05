/**
 */
package com.gratex.oomph.task.maven;

import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.gratex.oomph.task.maven.MavenFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore schemaLocation='https://raw.githubusercontent.com/gratex/oomph-task-maven-extended/master/com.gratex.oomph.task.maven/model/Maven-1.0.ecore'"
 * @generated
 */
public interface MavenPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "maven";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.gratex.com/oomph/task/maven/1.0";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "maven";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MavenPackage eINSTANCE = com.gratex.oomph.task.maven.impl.MavenPackageImpl.init();

  /**
   * The meta object id for the '{@link com.gratex.oomph.task.maven.impl.MavenImportTaskImpl <em>Import Task</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see com.gratex.oomph.task.maven.impl.MavenImportTaskImpl
   * @see com.gratex.oomph.task.maven.impl.MavenPackageImpl#getMavenImportTask()
   * @generated
   */
  int MAVEN_IMPORT_TASK = 0;

  /**
   * The feature id for the '<em><b>Annotations</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAVEN_IMPORT_TASK__ANNOTATIONS = SetupPackage.SETUP_TASK__ANNOTATIONS;

  /**
   * The feature id for the '<em><b>ID</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAVEN_IMPORT_TASK__ID = SetupPackage.SETUP_TASK__ID;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAVEN_IMPORT_TASK__DESCRIPTION = SetupPackage.SETUP_TASK__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Scope Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAVEN_IMPORT_TASK__SCOPE_TYPE = SetupPackage.SETUP_TASK__SCOPE_TYPE;

  /**
   * The feature id for the '<em><b>Excluded Triggers</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAVEN_IMPORT_TASK__EXCLUDED_TRIGGERS = SetupPackage.SETUP_TASK__EXCLUDED_TRIGGERS;

  /**
   * The feature id for the '<em><b>Disabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAVEN_IMPORT_TASK__DISABLED = SetupPackage.SETUP_TASK__DISABLED;

  /**
   * The feature id for the '<em><b>Predecessors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAVEN_IMPORT_TASK__PREDECESSORS = SetupPackage.SETUP_TASK__PREDECESSORS;

  /**
   * The feature id for the '<em><b>Successors</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAVEN_IMPORT_TASK__SUCCESSORS = SetupPackage.SETUP_TASK__SUCCESSORS;

  /**
   * The feature id for the '<em><b>Restrictions</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAVEN_IMPORT_TASK__RESTRICTIONS = SetupPackage.SETUP_TASK__RESTRICTIONS;

  /**
   * The feature id for the '<em><b>Filter</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAVEN_IMPORT_TASK__FILTER = SetupPackage.SETUP_TASK__FILTER;

  /**
   * The feature id for the '<em><b>Source Locators</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAVEN_IMPORT_TASK__SOURCE_LOCATORS = SetupPackage.SETUP_TASK_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Project Name Template</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAVEN_IMPORT_TASK__PROJECT_NAME_TEMPLATE = SetupPackage.SETUP_TASK_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Import Task</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int MAVEN_IMPORT_TASK_FEATURE_COUNT = SetupPackage.SETUP_TASK_FEATURE_COUNT + 2;

  /**
   * Returns the meta object for class '{@link com.gratex.oomph.task.maven.MavenImportTask <em>Import Task</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Import Task</em>'.
   * @see com.gratex.oomph.task.maven.MavenImportTask
   * @generated
   */
  EClass getMavenImportTask();

  /**
   * Returns the meta object for the containment reference list '{@link com.gratex.oomph.task.maven.MavenImportTask#getSourceLocators <em>Source Locators</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Source Locators</em>'.
   * @see com.gratex.oomph.task.maven.MavenImportTask#getSourceLocators()
   * @see #getMavenImportTask()
   * @generated
   */
  EReference getMavenImportTask_SourceLocators();

  /**
   * Returns the meta object for the attribute '{@link com.gratex.oomph.task.maven.MavenImportTask#getProjectNameTemplate <em>Project Name Template</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Project Name Template</em>'.
   * @see com.gratex.oomph.task.maven.MavenImportTask#getProjectNameTemplate()
   * @see #getMavenImportTask()
   * @generated
   */
  EAttribute getMavenImportTask_ProjectNameTemplate();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  MavenFactory getMavenFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link com.gratex.oomph.task.maven.impl.MavenImportTaskImpl <em>Import Task</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see com.gratex.oomph.task.maven.impl.MavenImportTaskImpl
     * @see com.gratex.oomph.task.maven.impl.MavenPackageImpl#getMavenImportTask()
     * @generated
     */
    EClass MAVEN_IMPORT_TASK = eINSTANCE.getMavenImportTask();

    /**
     * The meta object literal for the '<em><b>Source Locators</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference MAVEN_IMPORT_TASK__SOURCE_LOCATORS = eINSTANCE.getMavenImportTask_SourceLocators();

    /**
     * The meta object literal for the '<em><b>Project Name Template</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute MAVEN_IMPORT_TASK__PROJECT_NAME_TEMPLATE = eINSTANCE.getMavenImportTask_ProjectNameTemplate();

  }

} // MavenPackage
