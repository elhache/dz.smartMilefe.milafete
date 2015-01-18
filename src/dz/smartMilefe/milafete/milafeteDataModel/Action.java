/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Action#getActionCategoy <em>Action Categoy</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends IAction {
	/**
	 * Returns the value of the '<em><b>Action Categoy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Categoy</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Categoy</em>' reference.
	 * @see #setActionCategoy(ActionCategory)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getAction_ActionCategoy()
	 * @model
	 * @generated
	 */
	ActionCategory getActionCategoy();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Action#getActionCategoy <em>Action Categoy</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Categoy</em>' reference.
	 * @see #getActionCategoy()
	 * @generated
	 */
	void setActionCategoy(ActionCategory value);

} // Action
