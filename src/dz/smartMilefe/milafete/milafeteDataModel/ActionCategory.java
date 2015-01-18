/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.ActionCategory#getActionLabel <em>Action Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getActionCategory()
 * @model
 * @generated
 */
public interface ActionCategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Label</b></em>' attribute.
	 * The literals are from the enumeration {@link dz.smartMilefe.milafete.milafeteDataModel.ActionLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Label</em>' attribute.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionLabel
	 * @see #setActionLabel(ActionLabel)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getActionCategory_ActionLabel()
	 * @model
	 * @generated
	 */
	ActionLabel getActionLabel();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionCategory#getActionLabel <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Label</em>' attribute.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionLabel
	 * @see #getActionLabel()
	 * @generated
	 */
	void setActionLabel(ActionLabel value);

} // ActionCategory
