/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dossier Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem#getId <em>Id</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem#getDossier <em>Dossier</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDossierItem()
 * @model abstract="true"
 * @generated
 */
public interface DossierItem extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDossierItem_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Dossier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dossier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dossier</em>' reference.
	 * @see #setDossier(Dossier)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDossierItem_Dossier()
	 * @model required="true"
	 * @generated
	 */
	Dossier getDossier();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem#getDossier <em>Dossier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dossier</em>' reference.
	 * @see #getDossier()
	 * @generated
	 */
	void setDossier(Dossier value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDossierItem_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDocument();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	boolean isDossierSection();

} // DossierItem
