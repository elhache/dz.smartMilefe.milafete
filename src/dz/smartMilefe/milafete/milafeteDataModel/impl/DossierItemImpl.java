/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.impl;

import dz.smartMilefe.milafete.milafeteDataModel.Dossier;
import dz.smartMilefe.milafete.milafeteDataModel.DossierItem;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dossier Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierItemImpl#getId <em>Id</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierItemImpl#getDossier <em>Dossier</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierItemImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DossierItemImpl extends MinimalEObjectImpl.Container implements DossierItem {
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
	 * The cached value of the '{@link #getDossier() <em>Dossier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDossier()
	 * @generated
	 * @ordered
	 */
	protected Dossier dossier;

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
	 * @generated
	 */
	protected DossierItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return milafeteDataModelPackage.Literals.DOSSIER_ITEM;
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
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOSSIER_ITEM__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dossier getDossier() {
		if (dossier != null && dossier.eIsProxy()) {
			InternalEObject oldDossier = (InternalEObject)dossier;
			dossier = (Dossier)eResolveProxy(oldDossier);
			if (dossier != oldDossier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, milafeteDataModelPackage.DOSSIER_ITEM__DOSSIER, oldDossier, dossier));
			}
		}
		return dossier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dossier basicGetDossier() {
		return dossier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDossier(Dossier newDossier) {
		Dossier oldDossier = dossier;
		dossier = newDossier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOSSIER_ITEM__DOSSIER, oldDossier, dossier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.DOSSIER_ITEM__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDocument() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isDossierSection() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case milafeteDataModelPackage.DOSSIER_ITEM__ID:
				return getId();
			case milafeteDataModelPackage.DOSSIER_ITEM__DOSSIER:
				if (resolve) return getDossier();
				return basicGetDossier();
			case milafeteDataModelPackage.DOSSIER_ITEM__LABEL:
				return getLabel();
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
			case milafeteDataModelPackage.DOSSIER_ITEM__ID:
				setId((String)newValue);
				return;
			case milafeteDataModelPackage.DOSSIER_ITEM__DOSSIER:
				setDossier((Dossier)newValue);
				return;
			case milafeteDataModelPackage.DOSSIER_ITEM__LABEL:
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
			case milafeteDataModelPackage.DOSSIER_ITEM__ID:
				setId(ID_EDEFAULT);
				return;
			case milafeteDataModelPackage.DOSSIER_ITEM__DOSSIER:
				setDossier((Dossier)null);
				return;
			case milafeteDataModelPackage.DOSSIER_ITEM__LABEL:
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
			case milafeteDataModelPackage.DOSSIER_ITEM__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case milafeteDataModelPackage.DOSSIER_ITEM__DOSSIER:
				return dossier != null;
			case milafeteDataModelPackage.DOSSIER_ITEM__LABEL:
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
			case milafeteDataModelPackage.DOSSIER_ITEM___IS_DOCUMENT:
				return isDocument();
			case milafeteDataModelPackage.DOSSIER_ITEM___IS_DOSSIER_SECTION:
				return isDossierSection();
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
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //DossierItemImpl
