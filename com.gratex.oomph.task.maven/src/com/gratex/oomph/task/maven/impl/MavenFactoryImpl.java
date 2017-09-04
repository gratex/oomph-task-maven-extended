/**
 */
package com.gratex.oomph.task.maven.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.gratex.oomph.task.maven.MavenFactory;
import com.gratex.oomph.task.maven.MavenImportTask;
import com.gratex.oomph.task.maven.MavenPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MavenFactoryImpl extends EFactoryImpl implements MavenFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static MavenFactory init()
  {
    try
    {
      MavenFactory theMavenFactory = (MavenFactory)EPackage.Registry.INSTANCE.getEFactory(MavenPackage.eNS_URI);
      if (theMavenFactory != null)
      {
        return theMavenFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MavenFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MavenFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
    case MavenPackage.MAVEN_IMPORT_TASK:
      return createMavenImportTask();
    default:
      throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MavenImportTask createMavenImportTask()
  {
    MavenImportTaskImpl mavenImportTask = new MavenImportTaskImpl();
    return mavenImportTask;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MavenPackage getMavenPackage()
  {
    return (MavenPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static MavenPackage getPackage()
  {
    return MavenPackage.eINSTANCE;
  }

} // MavenFactoryImpl
