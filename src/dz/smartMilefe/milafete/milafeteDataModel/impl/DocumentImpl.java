/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.impl;

import dz.smartMilefe.milafete.milafeteDataModel.Document;
import dz.smartMilefe.milafete.milafeteDataModel.DocumentFormat;
import dz.smartMilefe.milafete.milafeteDataModel.DocumentType;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

import java.lang.reflect.InvocationTargetException;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DocumentImpl#getDateCreation <em>Date Creation</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DocumentImpl#getLieuCreationID <em>Lieu Creation ID</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DocumentImpl#getDocumentType <em>Document Type</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DocumentImpl#getDocumentFormat <em>Document Format</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DocumentImpl#getDocumentPath <em>Document Path</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DocumentImpl#getDocumentFilename <em>Document Filename</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentImpl extends DossierItemImpl implements Document {
	/**
	 * The default value of the '{@link #getDateCreation() <em>Date Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreation()
	 * @generated
	 * @ordered
	 */
	protected static final Date DATE_CREATION_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDateCreation() <em>Date Creation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateCreation()
	 * @generated
	 * @ordered
	 */
	protected Date dateCreation = DATE_CREATION_EDEFAULT;
	/**
	 * The default value of the '{@link #getLieuCreationID() <em>Lieu Creation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieuCreationID()
	 * @generated
	 * @ordered
	 */
	protected static final String LIEU_CREATION_ID_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLieuCreationID() <em>Lieu Creation ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieuCreationID()
	 * @generated
	 * @ordered
	 */
	protected String lieuCreationID = LIEU_CREATION_ID_EDEFAULT;
	/**
	 * The default value of the '{@link #getDocumentType() <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentType()
	 * @generated
	 * @ordered
	 */
	protected static final DocumentType DOCUMENT_TYPE_EDEFAULT = DocumentType.SCANNED;
	/**
	 * The cached value of the '{@link #getDocumentType() <em>Document Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentType()
	 * @generated
	 * @ordered
	 */
	protected DocumentType documentType = DOCUMENT_TYPE_EDEFAULT;
	/**
	 * The default value of the '{@link #getDocumentFormat() <em>Document Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentFormat()
	 * @generated
	 * @ordered
	 */
	protected static final DocumentFormat DOCUMENT_FORMAT_EDEFAULT = DocumentFormat.PDF;
	/**
	 * The cached value of the '{@link #getDocumentFormat() <em>Document Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentFormat()
	 * @generated
	 * @ordered
	 */
	protected DocumentFormat documentFormat = DOCUMENT_FORMAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDocumentPath() <em>Document Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentPath()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_PATH_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDocumentPath() <em>Document Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentPath()
	 * @generated
	 * @ordered
	 */
	protected String documentPath = DOCUMENT_PATH_EDEFAULT;
	/**
	 * The default value of the '{@link #getDocumentFilename() <em>Document Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String DOCUMENT_FILENAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getDocumentFilename() <em>Document Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDocumentFilename()
	 * @generated
	 * @ordered
	 */
	protected String documentFilename = DOCUMENT_FILENAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentImpl() {
		super();
	}

	@Override
	public boolean isDocument() {
		return true; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return milafeteDataModelPackage.Literals.DOCUMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Date getDateCreation() {
		return dateCreation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateCreation(Date newDateCreation) {
		Date oldDateCreation = dateCreation;
		dateCreation = newDateCreation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOCUMENT__DATE_CREATION, oldDateCreation, dateCreation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLieuCreationID() {
		return lieuCreationID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLieuCreationID(String newLieuCreationID) {
		String oldLieuCreationID = lieuCreationID;
		lieuCreationID = newLieuCreationID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOCUMENT__LIEU_CREATION_ID, oldLieuCreationID, lieuCreationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType getDocumentType() {
		return documentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentType(DocumentType newDocumentType) {
		DocumentType oldDocumentType = documentType;
		documentType = newDocumentType == null ? DOCUMENT_TYPE_EDEFAULT : newDocumentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOCUMENT__DOCUMENT_TYPE, oldDocumentType, documentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentFormat getDocumentFormat() {
		return documentFormat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentFormat(DocumentFormat newDocumentFormat) {
		DocumentFormat oldDocumentFormat = documentFormat;
		documentFormat = newDocumentFormat == null ? DOCUMENT_FORMAT_EDEFAULT : newDocumentFormat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOCUMENT__DOCUMENT_FORMAT, oldDocumentFormat, documentFormat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentPath() {
		return documentPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentPath(String newDocumentPath) {
		String oldDocumentPath = documentPath;
		documentPath = newDocumentPath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOCUMENT__DOCUMENT_PATH, oldDocumentPath, documentPath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDocumentFilename() {
		return documentFilename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDocumentFilename(String newDocumentFilename) {
		String oldDocumentFilename = documentFilename;
		documentFilename = newDocumentFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOCUMENT__DOCUMENT_FILENAME, oldDocumentFilename, documentFilename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public String absoluteFilename() {
		return documentPath+documentFilename ; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case milafeteDataModelPackage.DOCUMENT__DATE_CREATION:
				return getDateCreation();
			case milafeteDataModelPackage.DOCUMENT__LIEU_CREATION_ID:
				return getLieuCreationID();
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_TYPE:
				return getDocumentType();
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_FORMAT:
				return getDocumentFormat();
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_PATH:
				return getDocumentPath();
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_FILENAME:
				return getDocumentFilename();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case milafeteDataModelPackage.DOCUMENT__DATE_CREATION:
				setDateCreation((Date)newValue);
				return;
			case milafeteDataModelPackage.DOCUMENT__LIEU_CREATION_ID:
				setLieuCreationID((String)newValue);
				return;
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_TYPE:
				setDocumentType((DocumentType)newValue);
				return;
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_FORMAT:
				setDocumentFormat((DocumentFormat)newValue);
				return;
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_PATH:
				setDocumentPath((String)newValue);
				return;
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_FILENAME:
				setDocumentFilename((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case milafeteDataModelPackage.DOCUMENT__DATE_CREATION:
				setDateCreation(DATE_CREATION_EDEFAULT);
				return;
			case milafeteDataModelPackage.DOCUMENT__LIEU_CREATION_ID:
				setLieuCreationID(LIEU_CREATION_ID_EDEFAULT);
				return;
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_TYPE:
				setDocumentType(DOCUMENT_TYPE_EDEFAULT);
				return;
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_FORMAT:
				setDocumentFormat(DOCUMENT_FORMAT_EDEFAULT);
				return;
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_PATH:
				setDocumentPath(DOCUMENT_PATH_EDEFAULT);
				return;
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_FILENAME:
				setDocumentFilename(DOCUMENT_FILENAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case milafeteDataModelPackage.DOCUMENT__DATE_CREATION:
				return DATE_CREATION_EDEFAULT == null ? dateCreation != null : !DATE_CREATION_EDEFAULT.equals(dateCreation);
			case milafeteDataModelPackage.DOCUMENT__LIEU_CREATION_ID:
				return LIEU_CREATION_ID_EDEFAULT == null ? lieuCreationID != null : !LIEU_CREATION_ID_EDEFAULT.equals(lieuCreationID);
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_TYPE:
				return documentType != DOCUMENT_TYPE_EDEFAULT;
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_FORMAT:
				return documentFormat != DOCUMENT_FORMAT_EDEFAULT;
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_PATH:
				return DOCUMENT_PATH_EDEFAULT == null ? documentPath != null : !DOCUMENT_PATH_EDEFAULT.equals(documentPath);
			case milafeteDataModelPackage.DOCUMENT__DOCUMENT_FILENAME:
				return DOCUMENT_FILENAME_EDEFAULT == null ? documentFilename != null : !DOCUMENT_FILENAME_EDEFAULT.equals(documentFilename);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case milafeteDataModelPackage.DOCUMENT___ABSOLUTE_FILENAME:
				return absoluteFilename();
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (dateCreation: ");
		result.append(dateCreation);
		result.append(", lieuCreationID: ");
		result.append(lieuCreationID);
		result.append(", documentType: ");
		result.append(documentType);
		result.append(", documentFormat: ");
		result.append(documentFormat);
		result.append(", documentPath: ");
		result.append(documentPath);
		result.append(", documentFilename: ");
		result.append(documentFilename);
		result.append(')');
		return result.toString();
	}

} //DocumentImpl
