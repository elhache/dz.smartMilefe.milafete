/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dz.smartMilefe.milafete.milafeteDataModel.Dossier;
import dz.smartMilefe.milafete.milafeteDataModel.DossierItem;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dossier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierImpl#getItemList <em>Item List</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierImpl#getId <em>Id</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierImpl#getDateCreation <em>Date Creation</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierImpl#getLieuCreationID <em>Lieu Creation ID</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierImpl#getLieuResidenceID <em>Lieu Residence ID</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DossierImpl extends MinimalEObjectImpl.Container implements Dossier {
	/**
	 * The cached value of the '{@link #getItemList() <em>Item List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getItemList()
	 * @generated
	 * @ordered
	 */
	protected EList<DossierItem> itemList;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

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
	 * The default value of the '{@link #getLieuResidenceID() <em>Lieu Residence ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieuResidenceID()
	 * @generated
	 * @ordered
	 */
	protected static final String LIEU_RESIDENCE_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLieuResidenceID() <em>Lieu Residence ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLieuResidenceID()
	 * @generated
	 * @ordered
	 */
	protected String lieuResidenceID = LIEU_RESIDENCE_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DossierImpl() {
		super();
		itemList = new BasicEList<DossierItem>() ; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return milafeteDataModelPackage.Literals.DOSSIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DossierItem> getItemList() {
		if (itemList == null) {
			itemList = new EObjectContainmentEList<DossierItem>(DossierItem.class, this, milafeteDataModelPackage.DOSSIER__ITEM_LIST);
		}
		return itemList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOSSIER__ID, oldId, id));
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
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOSSIER__DATE_CREATION, oldDateCreation, dateCreation));
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
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOSSIER__LIEU_CREATION_ID, oldLieuCreationID, lieuCreationID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLieuResidenceID() {
		return lieuResidenceID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLieuResidenceID(String newLieuResidenceID) {
		String oldLieuResidenceID = lieuResidenceID;
		lieuResidenceID = newLieuResidenceID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOSSIER__LIEU_RESIDENCE_ID, oldLieuResidenceID, lieuResidenceID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOSSIER__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addItemElement(DossierItem _itemDossier) {
		itemList.add(_itemDossier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT  
	 */
	public DossierItem itemElementAt(int _ind) {
		DossierItem res=null; 
		if (_ind>=0 && _ind<itemList.size()) {
			res = itemList.get(_ind); 
		}
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case milafeteDataModelPackage.DOSSIER__ITEM_LIST:
				return ((InternalEList<?>)getItemList()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case milafeteDataModelPackage.DOSSIER__ITEM_LIST:
				return getItemList();
			case milafeteDataModelPackage.DOSSIER__ID:
				return getId();
			case milafeteDataModelPackage.DOSSIER__DATE_CREATION:
				return getDateCreation();
			case milafeteDataModelPackage.DOSSIER__LIEU_CREATION_ID:
				return getLieuCreationID();
			case milafeteDataModelPackage.DOSSIER__LIEU_RESIDENCE_ID:
				return getLieuResidenceID();
			case milafeteDataModelPackage.DOSSIER__LABEL:
				return getLabel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case milafeteDataModelPackage.DOSSIER__ITEM_LIST:
				getItemList().clear();
				getItemList().addAll((Collection<? extends DossierItem>)newValue);
				return;
			case milafeteDataModelPackage.DOSSIER__ID:
				setId((String)newValue);
				return;
			case milafeteDataModelPackage.DOSSIER__DATE_CREATION:
				setDateCreation((Date)newValue);
				return;
			case milafeteDataModelPackage.DOSSIER__LIEU_CREATION_ID:
				setLieuCreationID((String)newValue);
				return;
			case milafeteDataModelPackage.DOSSIER__LIEU_RESIDENCE_ID:
				setLieuResidenceID((String)newValue);
				return;
			case milafeteDataModelPackage.DOSSIER__LABEL:
				setLabel((String)newValue);
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
			case milafeteDataModelPackage.DOSSIER__ITEM_LIST:
				getItemList().clear();
				return;
			case milafeteDataModelPackage.DOSSIER__ID:
				setId(ID_EDEFAULT);
				return;
			case milafeteDataModelPackage.DOSSIER__DATE_CREATION:
				setDateCreation(DATE_CREATION_EDEFAULT);
				return;
			case milafeteDataModelPackage.DOSSIER__LIEU_CREATION_ID:
				setLieuCreationID(LIEU_CREATION_ID_EDEFAULT);
				return;
			case milafeteDataModelPackage.DOSSIER__LIEU_RESIDENCE_ID:
				setLieuResidenceID(LIEU_RESIDENCE_ID_EDEFAULT);
				return;
			case milafeteDataModelPackage.DOSSIER__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case milafeteDataModelPackage.DOSSIER__ITEM_LIST:
				return itemList != null && !itemList.isEmpty();
			case milafeteDataModelPackage.DOSSIER__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case milafeteDataModelPackage.DOSSIER__DATE_CREATION:
				return DATE_CREATION_EDEFAULT == null ? dateCreation != null : !DATE_CREATION_EDEFAULT.equals(dateCreation);
			case milafeteDataModelPackage.DOSSIER__LIEU_CREATION_ID:
				return LIEU_CREATION_ID_EDEFAULT == null ? lieuCreationID != null : !LIEU_CREATION_ID_EDEFAULT.equals(lieuCreationID);
			case milafeteDataModelPackage.DOSSIER__LIEU_RESIDENCE_ID:
				return LIEU_RESIDENCE_ID_EDEFAULT == null ? lieuResidenceID != null : !LIEU_RESIDENCE_ID_EDEFAULT.equals(lieuResidenceID);
			case milafeteDataModelPackage.DOSSIER__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
			case milafeteDataModelPackage.DOSSIER___ADD_ITEM_ELEMENT__DOSSIERITEM:
				addItemElement((DossierItem)arguments.get(0));
				return null;
			case milafeteDataModelPackage.DOSSIER___ITEM_ELEMENT_AT__INT:
				return itemElementAt((Integer)arguments.get(0));
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
		result.append(" (id: ");
		result.append(id);
		result.append(", dateCreation: ");
		result.append(dateCreation);
		result.append(", lieuCreationID: ");
		result.append(lieuCreationID);
		result.append(", lieuResidenceID: ");
		result.append(lieuResidenceID);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //DossierImpl
