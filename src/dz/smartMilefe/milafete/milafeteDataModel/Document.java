/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import java.util.Date;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDateCreation <em>Date Creation</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getLieuCreationID <em>Lieu Creation ID</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentFormat <em>Document Format</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentPath <em>Document Path</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentFilename <em>Document Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDocument()
 * @model
 * @generated
 */
public interface Document extends DossierItem {

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
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDocument_DateCreation()
	 * @model
	 * @generated
	 */
	Date getDateCreation();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDateCreation <em>Date Creation</em>}' attribute.
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
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDocument_LieuCreationID()
	 * @model
	 * @generated
	 */
	String getLieuCreationID();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getLieuCreationID <em>Lieu Creation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lieu Creation ID</em>' attribute.
	 * @see #getLieuCreationID()
	 * @generated
	 */
	void setLieuCreationID(String value);

	/**
	 * Returns the value of the '<em><b>Document Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dz.smartMilefe.milafete.milafeteDataModel.DocumentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Type</em>' attribute.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DocumentType
	 * @see #setDocumentType(DocumentType)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDocument_DocumentType()
	 * @model
	 * @generated
	 */
	DocumentType getDocumentType();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentType <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Type</em>' attribute.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DocumentType
	 * @see #getDocumentType()
	 * @generated
	 */
	void setDocumentType(DocumentType value);

	/**
	 * Returns the value of the '<em><b>Document Format</b></em>' attribute.
	 * The literals are from the enumeration {@link dz.smartMilefe.milafete.milafeteDataModel.DocumentFormat}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Format</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Format</em>' attribute.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DocumentFormat
	 * @see #setDocumentFormat(DocumentFormat)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDocument_DocumentFormat()
	 * @model
	 * @generated
	 */
	DocumentFormat getDocumentFormat();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentFormat <em>Document Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Format</em>' attribute.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DocumentFormat
	 * @see #getDocumentFormat()
	 * @generated
	 */
	void setDocumentFormat(DocumentFormat value);

	/**
	 * Returns the value of the '<em><b>Document Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Path</em>' attribute.
	 * @see #setDocumentPath(String)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDocument_DocumentPath()
	 * @model
	 * @generated
	 */
	String getDocumentPath();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentPath <em>Document Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Path</em>' attribute.
	 * @see #getDocumentPath()
	 * @generated
	 */
	void setDocumentPath(String value);

	/**
	 * Returns the value of the '<em><b>Document Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Document Filename</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Document Filename</em>' attribute.
	 * @see #setDocumentFilename(String)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDocument_DocumentFilename()
	 * @model
	 * @generated
	 */
	String getDocumentFilename();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentFilename <em>Document Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Document Filename</em>' attribute.
	 * @see #getDocumentFilename()
	 * @generated
	 */
	void setDocumentFilename(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	String absoluteFilename();
} // Document
