/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.impl;

import dz.smartMilefe.milafete.milafeteDataModel.ActionCategory;
import dz.smartMilefe.milafete.milafeteDataModel.ActionLabel;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Category</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ActionCategoryImpl#getActionLabel <em>Action Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionCategoryImpl extends MinimalEObjectImpl.Container implements ActionCategory {
	/**
	 * The default value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected static final ActionLabel ACTION_LABEL_EDEFAULT = ActionLabel.INDEFINED;

	/**
	 * The cached value of the '{@link #getActionLabel() <em>Action Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionLabel()
	 * @generated
	 * @ordered
	 */
	protected ActionLabel actionLabel = ACTION_LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return milafeteDataModelPackage.Literals.ACTION_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLabel getActionLabel() {
		return actionLabel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionLabel(ActionLabel newActionLabel) {
		ActionLabel oldActionLabel = actionLabel;
		actionLabel = newActionLabel == null ? ACTION_LABEL_EDEFAULT : newActionLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.ACTION_CATEGORY__ACTION_LABEL, oldActionLabel, actionLabel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case milafeteDataModelPackage.ACTION_CATEGORY__ACTION_LABEL:
				return getActionLabel();
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
			case milafeteDataModelPackage.ACTION_CATEGORY__ACTION_LABEL:
				setActionLabel((ActionLabel)newValue);
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
			case milafeteDataModelPackage.ACTION_CATEGORY__ACTION_LABEL:
				setActionLabel(ACTION_LABEL_EDEFAULT);
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
			case milafeteDataModelPackage.ACTION_CATEGORY__ACTION_LABEL:
				return actionLabel != ACTION_LABEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
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
		result.append(" (actionLabel: ");
		result.append(actionLabel);
		result.append(')');
		return result.toString();
	}

} //ActionCategoryImpl
