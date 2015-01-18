/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dossier Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.DossierSection#getItemList <em>Item List</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDossierSection()
 * @model
 * @generated
 */
public interface DossierSection extends DossierItem {
	/**
	 * Returns the value of the '<em><b>Item List</b></em>' containment reference list.
	 * The list contents are of type {@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Item List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item List</em>' containment reference list.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDossierSection_ItemList()
	 * @model containment="true"
	 * @generated
	 */
	EList<DossierItem> getItemList();

} // DossierSection
