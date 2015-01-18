/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.impl;

import dz.smartMilefe.milafete.milafeteDataModel.ActionBasket;
import dz.smartMilefe.milafete.milafeteDataModel.Basket;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Basket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ActionBasketImpl#getFromBasketAction <em>From Basket Action</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ActionBasketImpl#getIntoBasketAction <em>Into Basket Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionBasketImpl extends ActionImpl implements ActionBasket {
	/**
	 * The cached value of the '{@link #getFromBasketAction() <em>From Basket Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFromBasketAction()
	 * @generated
	 * @ordered
	 */
	protected Basket fromBasketAction;
	/**
	 * The cached value of the '{@link #getIntoBasketAction() <em>Into Basket Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntoBasketAction()
	 * @generated
	 * @ordered
	 */
	protected Basket intoBasketAction;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionBasketImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return milafeteDataModelPackage.Literals.ACTION_BASKET;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basket getFromBasketAction() {
		if (fromBasketAction != null && fromBasketAction.eIsProxy()) {
			InternalEObject oldFromBasketAction = (InternalEObject)fromBasketAction;
			fromBasketAction = (Basket)eResolveProxy(oldFromBasketAction);
			if (fromBasketAction != oldFromBasketAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, milafeteDataModelPackage.ACTION_BASKET__FROM_BASKET_ACTION, oldFromBasketAction, fromBasketAction));
			}
		}
		return fromBasketAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basket basicGetFromBasketAction() {
		return fromBasketAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFromBasketAction(Basket newFromBasketAction) {
		Basket oldFromBasketAction = fromBasketAction;
		fromBasketAction = newFromBasketAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.ACTION_BASKET__FROM_BASKET_ACTION, oldFromBasketAction, fromBasketAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basket getIntoBasketAction() {
		if (intoBasketAction != null && intoBasketAction.eIsProxy()) {
			InternalEObject oldIntoBasketAction = (InternalEObject)intoBasketAction;
			intoBasketAction = (Basket)eResolveProxy(oldIntoBasketAction);
			if (intoBasketAction != oldIntoBasketAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, milafeteDataModelPackage.ACTION_BASKET__INTO_BASKET_ACTION, oldIntoBasketAction, intoBasketAction));
			}
		}
		return intoBasketAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Basket basicGetIntoBasketAction() {
		return intoBasketAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIntoBasketAction(Basket newIntoBasketAction) {
		Basket oldIntoBasketAction = intoBasketAction;
		intoBasketAction = newIntoBasketAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.ACTION_BASKET__INTO_BASKET_ACTION, oldIntoBasketAction, intoBasketAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case milafeteDataModelPackage.ACTION_BASKET__FROM_BASKET_ACTION:
				if (resolve) return getFromBasketAction();
				return basicGetFromBasketAction();
			case milafeteDataModelPackage.ACTION_BASKET__INTO_BASKET_ACTION:
				if (resolve) return getIntoBasketAction();
				return basicGetIntoBasketAction();
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
			case milafeteDataModelPackage.ACTION_BASKET__FROM_BASKET_ACTION:
				setFromBasketAction((Basket)newValue);
				return;
			case milafeteDataModelPackage.ACTION_BASKET__INTO_BASKET_ACTION:
				setIntoBasketAction((Basket)newValue);
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
			case milafeteDataModelPackage.ACTION_BASKET__FROM_BASKET_ACTION:
				setFromBasketAction((Basket)null);
				return;
			case milafeteDataModelPackage.ACTION_BASKET__INTO_BASKET_ACTION:
				setIntoBasketAction((Basket)null);
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
			case milafeteDataModelPackage.ACTION_BASKET__FROM_BASKET_ACTION:
				return fromBasketAction != null;
			case milafeteDataModelPackage.ACTION_BASKET__INTO_BASKET_ACTION:
				return intoBasketAction != null;
		}
		return super.eIsSet(featureID);
	}

} //ActionBasketImpl
