/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Application Data Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getUserManagement <em>User Management</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getBasketManagement <em>Basket Management</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getActionManagement <em>Action Management</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getInstitution <em>Institution</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getApplicationDataManagement()
 * @model
 * @generated
 */
public interface ApplicationDataManagement extends EObject {
	/**
	 * Returns the value of the '<em><b>User Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User Management</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User Management</em>' containment reference.
	 * @see #setUserManagement(UserManagement)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getApplicationDataManagement_UserManagement()
	 * @model containment="true"
	 * @generated
	 */
	UserManagement getUserManagement();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getUserManagement <em>User Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>User Management</em>' containment reference.
	 * @see #getUserManagement()
	 * @generated
	 */
	void setUserManagement(UserManagement value);

	/**
	 * Returns the value of the '<em><b>Basket Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basket Management</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basket Management</em>' containment reference.
	 * @see #setBasketManagement(BasketManagement)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getApplicationDataManagement_BasketManagement()
	 * @model containment="true"
	 * @generated
	 */
	BasketManagement getBasketManagement();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getBasketManagement <em>Basket Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Basket Management</em>' containment reference.
	 * @see #getBasketManagement()
	 * @generated
	 */
	void setBasketManagement(BasketManagement value);

	/**
	 * Returns the value of the '<em><b>Action Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Management</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Management</em>' containment reference.
	 * @see #setActionManagement(ActionManagement)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getApplicationDataManagement_ActionManagement()
	 * @model containment="true"
	 * @generated
	 */
	ActionManagement getActionManagement();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getActionManagement <em>Action Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Management</em>' containment reference.
	 * @see #getActionManagement()
	 * @generated
	 */
	void setActionManagement(ActionManagement value);

	/**
	 * Returns the value of the '<em><b>Institution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Institution</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Institution</em>' reference.
	 * @see #setInstitution(Institution)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getApplicationDataManagement_Institution()
	 * @model
	 * @generated
	 */
	Institution getInstitution();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getInstitution <em>Institution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Institution</em>' reference.
	 * @see #getInstitution()
	 * @generated
	 */
	void setInstitution(Institution value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialization();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Creates One configuration (user/Basket/Data) to use test the system. Should be removed later 
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void createOneAppDataConfig();

} // ApplicationDataManagement
