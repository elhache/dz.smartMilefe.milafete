/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import dz.smartMilefe.milafete.milafeteDataModel.DossierItem;
import dz.smartMilefe.milafete.milafeteDataModel.DossierSection;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Dossier Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierSectionImpl#getItemList <em>Item List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DossierSectionImpl extends DossierItemImpl implements DossierSection {
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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected DossierSectionImpl() {
		super();
		itemList = new BasicEList<DossierItem>();
	}

	@Override
	public boolean isDossierSection() {
		return true; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return milafeteDataModelPackage.Literals.DOSSIER_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DossierItem> getItemList() {
		if (itemList == null) {
			itemList = new EObjectContainmentEList<DossierItem>(DossierItem.class, this, milafeteDataModelPackage.DOSSIER_SECTION__ITEM_LIST);
		}
		return itemList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case milafeteDataModelPackage.DOSSIER_SECTION__ITEM_LIST:
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
			case milafeteDataModelPackage.DOSSIER_SECTION__ITEM_LIST:
				return getItemList();
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
			case milafeteDataModelPackage.DOSSIER_SECTION__ITEM_LIST:
				getItemList().clear();
				getItemList().addAll((Collection<? extends DossierItem>)newValue);
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
			case milafeteDataModelPackage.DOSSIER_SECTION__ITEM_LIST:
				getItemList().clear();
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
			case milafeteDataModelPackage.DOSSIER_SECTION__ITEM_LIST:
				return itemList != null && !itemList.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //DossierSectionImpl
