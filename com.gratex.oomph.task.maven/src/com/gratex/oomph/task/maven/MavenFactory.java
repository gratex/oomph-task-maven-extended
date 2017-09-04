/**
 */
package com.gratex.oomph.task.maven;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.gratex.oomph.task.maven.MavenPackage
 * @generated
 */
public interface MavenFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MavenFactory eINSTANCE = com.gratex.oomph.task.maven.impl.MavenFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Import Task</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Import Task</em>'.
   * @generated
   */
  MavenImportTask createMavenImportTask();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MavenPackage getMavenPackage();

} // MavenFactory
