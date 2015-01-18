/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Basket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.ActionBasket#getFromBasketAction <em>From Basket Action</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.ActionBasket#getIntoBasketAction <em>Into Basket Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getActionBasket()
 * @model
 * @generated
 */
public interface ActionBasket extends Action {

	/**
	 * Returns the value of the '<em><b>From Basket Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From Basket Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From Basket Action</em>' reference.
	 * @see #setFromBasketAction(Basket)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getActionBasket_FromBasketAction()
	 * @model required="true"
	 * @generated
	 */
	Basket getFromBasketAction();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionBasket#getFromBasketAction <em>From Basket Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From Basket Action</em>' reference.
	 * @see #getFromBasketAction()
	 * @generated
	 */
	void setFromBasketAction(Basket value);

	/**
	 * Returns the value of the '<em><b>Into Basket Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Into Basket Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Into Basket Action</em>' reference.
	 * @see #setIntoBasketAction(Basket)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getActionBasket_IntoBasketAction()
	 * @model required="true"
	 * @generated
	 */
	Basket getIntoBasketAction();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionBasket#getIntoBasketAction <em>Into Basket Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Into Basket Action</em>' reference.
	 * @see #getIntoBasketAction()
	 * @generated
	 */
	void setIntoBasketAction(Basket value);
} // ActionBasket
