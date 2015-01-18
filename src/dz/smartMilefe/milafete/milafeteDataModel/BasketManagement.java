/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basket Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.BasketManagement#getAllBasketCategories <em>All Basket Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getBasketManagement()
 * @model
 * @generated
 */
public interface BasketManagement extends EObject {
	/**
	 * Returns the value of the '<em><b>All Basket Categories</b></em>' reference list.
	 * The list contents are of type {@link dz.smartMilefe.milafete.milafeteDataModel.BasketCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Basket Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Basket Categories</em>' reference list.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getBasketManagement_AllBasketCategories()
	 * @model
	 * @generated
	 */
	EList<BasketCategory> getAllBasketCategories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Create the initial Basket Configuration: Set of predefined Basket Types from which are selected Baskets to assign to Users
	 * <!-- end-model-doc -->
	 * @model
	 * @generated
	 */
	void initializeBasketCategories();

} // BasketManagement
