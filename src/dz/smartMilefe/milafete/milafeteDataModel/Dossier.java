/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dossier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getItemList <em>Item List</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getId <em>Id</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getDateCreation <em>Date Creation</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getLieuCreationID <em>Lieu Creation ID</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getLieuResidenceID <em>Lieu Residence ID</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDossier()
 * @model
 * @generated
 */
public interface Dossier extends EObject {
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
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDossier_ItemList()
	 * @model containment="true"
	 * @generated
	 */
	EList<DossierItem> getItemList();

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
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDossier_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Date Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Creation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Creation</em>' attribute.
	 * @see #setDateCreation(Date)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDossier_DateCreation()
	 * @model
	 * @generated
	 */
	Date getDateCreation();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getDateCreation <em>Date Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Creation</em>' attribute.
	 * @see #getDateCreation()
	 * @generated
	 */
	void setDateCreation(Date value);

	/**
	 * Returns the value of the '<em><b>Lieu Creation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lieu Creation ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lieu Creation ID</em>' attribute.
	 * @see #setLieuCreationID(String)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDossier_LieuCreationID()
	 * @model
	 * @generated
	 */
	String getLieuCreationID();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getLieuCreationID <em>Lieu Creation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lieu Creation ID</em>' attribute.
	 * @see #getLieuCreationID()
	 * @generated
	 */
	void setLieuCreationID(String value);

	/**
	 * Returns the value of the '<em><b>Lieu Residence ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lieu Residence ID</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lieu Residence ID</em>' attribute.
	 * @see #setLieuResidenceID(String)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDossier_LieuResidenceID()
	 * @model
	 * @generated
	 */
	String getLieuResidenceID();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getLieuResidenceID <em>Lieu Residence ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lieu Residence ID</em>' attribute.
	 * @see #getLieuResidenceID()
	 * @generated
	 */
	void setLieuResidenceID(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * File's label. Used in GUI (could be the filename, unless the filename is too long)
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDossier_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getLabel <em>Label</em>}' attribute.
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
	 * @model
	 * @generated
	 */
	void addItemElement(DossierItem _itemDossier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	DossierItem itemElementAt(int _ind);

} // Dossier
