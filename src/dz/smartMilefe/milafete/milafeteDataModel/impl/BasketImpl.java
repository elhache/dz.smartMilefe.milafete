/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import dz.smartMilefe.milafete.milafeteDataModel.ActionBasket;
import dz.smartMilefe.milafete.milafeteDataModel.Basket;
import dz.smartMilefe.milafete.milafeteDataModel.BasketCategory;
import dz.smartMilefe.milafete.milafeteDataModel.Dossier;
import dz.smartMilefe.milafete.milafeteDataModel.User;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basket</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketImpl#getId <em>Id</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketImpl#getDossierList <em>Dossier List</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketImpl#getName <em>Name</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketImpl#getActionList <em>Action List</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketImpl#getOwnerUser <em>Owner User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class BasketImpl extends MinimalEObjectImpl.Container implements Basket {
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
	 * The cached value of the '{@link #getDossierList() <em>Dossier List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDossierList()
	 * @generated
	 * @ordered
	 */
	protected EList<Dossier> dossierList;

	/**
	 * The cached value of the '{@link #getCategory() <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCategory()
	 * @generated
	 * @ordered
	 */
	protected BasketCategory category;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getActionList() <em>Action List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionList()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionBasket> actionList;
	/**
	 * The cached value of the '{@link #getOwnerUser() <em>Owner User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnerUser()
	 * @generated
	 * @ordered
	 */
	protected User ownerUser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	protected BasketImpl() {
		super();
		dossierList = new BasicEList<Dossier>(); 
		actionList = new BasicEList<ActionBasket>() ; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return milafeteDataModelPackage.Literals.BASKET;
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
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.BASKET__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Dossier> getDossierList() {
		if (dossierList == null) {
			dossierList = new EObjectResolvingEList<Dossier>(Dossier.class, this, milafeteDataModelPackage.BASKET__DOSSIER_LIST);
		}
		return dossierList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasketCategory getCategory() {
		if (category != null && category.eIsProxy()) {
			InternalEObject oldCategory = (InternalEObject)category;
			category = (BasketCategory)eResolveProxy(oldCategory);
			if (category != oldCategory) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, milafeteDataModelPackage.BASKET__CATEGORY, oldCategory, category));
			}
		}
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasketCategory basicGetCategory() {
		return category;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCategory(BasketCategory newCategory) {
		BasketCategory oldCategory = category;
		category = newCategory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.BASKET__CATEGORY, oldCategory, category));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.BASKET__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionBasket> getActionList() {
		if (actionList == null) {
			actionList = new EObjectResolvingEList<ActionBasket>(ActionBasket.class, this, milafeteDataModelPackage.BASKET__ACTION_LIST);
		}
		return actionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getOwnerUser() {
		if (ownerUser != null && ownerUser.eIsProxy()) {
			InternalEObject oldOwnerUser = (InternalEObject)ownerUser;
			ownerUser = (User)eResolveProxy(oldOwnerUser);
			if (ownerUser != oldOwnerUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, milafeteDataModelPackage.BASKET__OWNER_USER, oldOwnerUser, ownerUser));
			}
		}
		return ownerUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetOwnerUser() {
		return ownerUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOwnerUser(User newOwnerUser) {
		User oldOwnerUser = ownerUser;
		ownerUser = newOwnerUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.BASKET__OWNER_USER, oldOwnerUser, ownerUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addDossierElement(Dossier _dossier) {
		dossierList.add(_dossier);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Dossier dossierElementAt(int ind) {
		Dossier res = null ; 
		if (ind >=0 && ind <dossierList.size()) {
			res = dossierList.get(ind);
		}
		return res ; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addActionElement(ActionBasket _actionBasket) {
		actionList.add(_actionBasket); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public ActionBasket actionElementAt(int ind) {
		ActionBasket res = null ; 
		if (ind >=0 && ind<actionList.size()) {
			res = actionList.get(ind); 
		}
		return res ; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case milafeteDataModelPackage.BASKET__ID:
				return getId();
			case milafeteDataModelPackage.BASKET__DOSSIER_LIST:
				return getDossierList();
			case milafeteDataModelPackage.BASKET__CATEGORY:
				if (resolve) return getCategory();
				return basicGetCategory();
			case milafeteDataModelPackage.BASKET__NAME:
				return getName();
			case milafeteDataModelPackage.BASKET__ACTION_LIST:
				return getActionList();
			case milafeteDataModelPackage.BASKET__OWNER_USER:
				if (resolve) return getOwnerUser();
				return basicGetOwnerUser();
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
			case milafeteDataModelPackage.BASKET__ID:
				setId((String)newValue);
				return;
			case milafeteDataModelPackage.BASKET__DOSSIER_LIST:
				getDossierList().clear();
				getDossierList().addAll((Collection<? extends Dossier>)newValue);
				return;
			case milafeteDataModelPackage.BASKET__CATEGORY:
				setCategory((BasketCategory)newValue);
				return;
			case milafeteDataModelPackage.BASKET__NAME:
				setName((String)newValue);
				return;
			case milafeteDataModelPackage.BASKET__ACTION_LIST:
				getActionList().clear();
				getActionList().addAll((Collection<? extends ActionBasket>)newValue);
				return;
			case milafeteDataModelPackage.BASKET__OWNER_USER:
				setOwnerUser((User)newValue);
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
			case milafeteDataModelPackage.BASKET__ID:
				setId(ID_EDEFAULT);
				return;
			case milafeteDataModelPackage.BASKET__DOSSIER_LIST:
				getDossierList().clear();
				return;
			case milafeteDataModelPackage.BASKET__CATEGORY:
				setCategory((BasketCategory)null);
				return;
			case milafeteDataModelPackage.BASKET__NAME:
				setName(NAME_EDEFAULT);
				return;
			case milafeteDataModelPackage.BASKET__ACTION_LIST:
				getActionList().clear();
				return;
			case milafeteDataModelPackage.BASKET__OWNER_USER:
				setOwnerUser((User)null);
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
			case milafeteDataModelPackage.BASKET__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case milafeteDataModelPackage.BASKET__DOSSIER_LIST:
				return dossierList != null && !dossierList.isEmpty();
			case milafeteDataModelPackage.BASKET__CATEGORY:
				return category != null;
			case milafeteDataModelPackage.BASKET__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case milafeteDataModelPackage.BASKET__ACTION_LIST:
				return actionList != null && !actionList.isEmpty();
			case milafeteDataModelPackage.BASKET__OWNER_USER:
				return ownerUser != null;
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
			case milafeteDataModelPackage.BASKET___ADD_DOSSIER_ELEMENT__DOSSIER:
				addDossierElement((Dossier)arguments.get(0));
				return null;
			case milafeteDataModelPackage.BASKET___DOSSIER_ELEMENT_AT__INT:
				return dossierElementAt((Integer)arguments.get(0));
			case milafeteDataModelPackage.BASKET___ADD_ACTION_ELEMENT__ACTIONBASKET:
				addActionElement((ActionBasket)arguments.get(0));
				return null;
			case milafeteDataModelPackage.BASKET___ACTION_ELEMENT_AT__INT:
				return actionElementAt((Integer)arguments.get(0));
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
		result.append(", name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //BasketImpl
