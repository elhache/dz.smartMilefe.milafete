/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage
 * @generated
 */
public interface milafeteDataModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	milafeteDataModelFactory eINSTANCE = dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Agent</em>'.
	 * @generated
	 */
	Agent createAgent();

	/**
	 * Returns a new object of class '<em>Administrator</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Administrator</em>'.
	 * @generated
	 */
	Administrator createAdministrator();

	/**
	 * Returns a new object of class '<em>Basket Regular</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basket Regular</em>'.
	 * @generated
	 */
	BasketRegular createBasketRegular();

	/**
	 * Returns a new object of class '<em>Institution</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Institution</em>'.
	 * @generated
	 */
	Institution createInstitution();

	/**
	 * Returns a new object of class '<em>Dossier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dossier</em>'.
	 * @generated
	 */
	Dossier createDossier();

	/**
	 * Returns a new object of class '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document</em>'.
	 * @generated
	 */
	Document createDocument();

	/**
	 * Returns a new object of class '<em>Dossier Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dossier Section</em>'.
	 * @generated
	 */
	DossierSection createDossierSection();

	/**
	 * Returns a new object of class '<em>User Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Management</em>'.
	 * @generated
	 */
	UserManagement createUserManagement();

	/**
	 * Returns a new object of class '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action</em>'.
	 * @generated
	 */
	Action createAction();

	/**
	 * Returns a new object of class '<em>Action Basket</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Basket</em>'.
	 * @generated
	 */
	ActionBasket createActionBasket();

	/**
	 * Returns a new object of class '<em>Action Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Management</em>'.
	 * @generated
	 */
	ActionManagement createActionManagement();

	/**
	 * Returns a new object of class '<em>Basket Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basket Management</em>'.
	 * @generated
	 */
	BasketManagement createBasketManagement();

	/**
	 * Returns a new object of class '<em>Basket Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Basket Category</em>'.
	 * @generated
	 */
	BasketCategory createBasketCategory();

	/**
	 * Returns a new object of class '<em>Application Data Management</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Application Data Management</em>'.
	 * @generated
	 */
	ApplicationDataManagement createApplicationDataManagement();

	/**
	 * Returns a new object of class '<em>Action Category</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Action Category</em>'.
	 * @generated
	 */
	ActionCategory createActionCategory();

	/**
	 * Returns a new object of class '<em>Bad Parameter Exception</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Bad Parameter Exception</em>'.
	 * @generated
	 */
	BadParameterException createBadParameterException();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	milafeteDataModelPackage getmilafeteDataModelPackage();

} //milafeteDataModelFactory
