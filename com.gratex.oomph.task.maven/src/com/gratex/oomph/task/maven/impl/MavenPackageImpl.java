/**
 */
package com.gratex.oomph.task.maven.impl;

import org.eclipse.oomph.resources.ResourcesPackage;
import org.eclipse.oomph.setup.SetupPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

import com.gratex.oomph.task.maven.MavenFactory;
import com.gratex.oomph.task.maven.MavenImportTask;
import com.gratex.oomph.task.maven.MavenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MavenPackageImpl extends EPackageImpl implements MavenPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass mavenImportTaskEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see com.gratex.oomph.task.maven.MavenPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private MavenPackageImpl()
  {
    super(eNS_URI, MavenFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link MavenPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static MavenPackage init()
  {
    if (isInited)
    {
      return (MavenPackage)EPackage.Registry.INSTANCE.getEPackage(MavenPackage.eNS_URI);
    }

    // Obtain or create and register package
    MavenPackageImpl theMavenPackage = (MavenPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MavenPackageImpl
        ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MavenPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    ResourcesPackage.eINSTANCE.eClass();
    SetupPackage.eINSTANCE.eClass();

    // Create package meta-data objects
    theMavenPackage.createPackageContents();

    // Initialize created meta-data
    theMavenPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theMavenPackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(MavenPackage.eNS_URI, theMavenPackage);
    return theMavenPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMavenImportTask()
  {
    return mavenImportTaskEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getMavenImportTask_SourceLocators()
  {
    return (EReference)mavenImportTaskEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getMavenImportTask_ProjectNameTemplate()
  {
    return (EAttribute)mavenImportTaskEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MavenFactory getMavenFactory()
  {
    return (MavenFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated)
    {
      return;
    }
    isCreated = true;

    // Create classes and their features
    mavenImportTaskEClass = createEClass(MAVEN_IMPORT_TASK);
    createEReference(mavenImportTaskEClass, MAVEN_IMPORT_TASK__SOURCE_LOCATORS);
    createEAttribute(mavenImportTaskEClass, MAVEN_IMPORT_TASK__PROJECT_NAME_TEMPLATE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized)
    {
      return;
    }
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    SetupPackage theSetupPackage = (SetupPackage)EPackage.Registry.INSTANCE.getEPackage(SetupPackage.eNS_URI);
    ResourcesPackage theResourcesPackage = (ResourcesPackage)EPackage.Registry.INSTANCE.getEPackage(ResourcesPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    mavenImportTaskEClass.getESuperTypes().add(theSetupPackage.getSetupTask());

    // Initialize classes and features; add operations and parameters
    initEClass(mavenImportTaskEClass, MavenImportTask.class, "MavenImportTask", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getMavenImportTask_SourceLocators(), theResourcesPackage.getSourceLocator(), null, "sourceLocators", null, 1, -1, MavenImportTask.class,
        !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getMavenImportTask_ProjectNameTemplate(), ecorePackage.getEString(), "projectNameTemplate", null, 0, 1, MavenImportTask.class, !IS_TRANSIENT,
        !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource("http://www.gratex.com/oomph/task/maven/schemas/Maven-1.0.ecore");

    // Create annotations
    // http://www.eclipse.org/emf/2002/Ecore
    createEcoreAnnotations();
    // http://www.eclipse.org/oomph/setup/Enablement
    createEnablementAnnotations();
    // http://www.eclipse.org/oomph/setup/ValidTriggers
    createValidTriggersAnnotations();
    // http:///org/eclipse/emf/ecore/util/ExtendedMetaData
    createExtendedMetaDataAnnotations();
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/Ecore</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEcoreAnnotations()
  {
    String source = "http://www.eclipse.org/emf/2002/Ecore";
    addAnnotation(this, source, new String[] { "schemaLocation", "http://www.gratex.com/oomph/task/maven/schemas/Maven-1.0.ecore" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/Enablement</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createEnablementAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/Enablement";
    addAnnotation(mavenImportTaskEClass, source, new String[] { "variableName", "p2.maven", "repository", "http://download.gratex.com/oomph/task/maven/updates",
        "installableUnits", "com.gratex.oomph.task.maven.feature.group" });
  }

  /**
   * Initializes the annotations for <b>http://www.eclipse.org/oomph/setup/ValidTriggers</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createValidTriggersAnnotations()
  {
    String source = "http://www.eclipse.org/oomph/setup/ValidTriggers";
    addAnnotation(mavenImportTaskEClass, source, new String[] { "triggers", "STARTUP MANUAL" });
  }

  /**
   * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createExtendedMetaDataAnnotations()
  {
    String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
    addAnnotation(getMavenImportTask_SourceLocators(), source, new String[] { "name", "sourceLocator" });
  }

} // MavenPackageImpl
