/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basket Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.BasketCategory#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getBasketCategory()
 * @model
 * @generated
 */
public interface BasketCategory extends EObject {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * The literals are from the enumeration {@link dz.smartMilefe.milafete.milafeteDataModel.BasketLabel}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketLabel
	 * @see #setLabel(BasketLabel)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getBasketCategory_Label()
	 * @model
	 * @generated
	 */
	BasketLabel getLabel();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.BasketCategory#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketLabel
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(BasketLabel value);

} // BasketCategory
