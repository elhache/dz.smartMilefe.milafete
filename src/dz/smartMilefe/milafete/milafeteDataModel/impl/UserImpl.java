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

import dz.smartMilefe.milafete.milafeteDataModel.Basket;
import dz.smartMilefe.milafete.milafeteDataModel.IAction;
import dz.smartMilefe.milafete.milafeteDataModel.Institution;
import dz.smartMilefe.milafete.milafeteDataModel.User;
import dz.smartMilefe.milafete.milafeteDataModel.UserStatus;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl#getMatricule <em>Matricule</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl#getUserName <em>User Name</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl#getLastName <em>Last Name</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl#getEmail <em>Email</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl#getPhoneNumber <em>Phone Number</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl#getPictureFilename <em>Picture Filename</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl#getSupervisor <em>Supervisor</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl#getBasketList <em>Basket List</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl#getInstitution <em>Institution</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl#getActionList <em>Action List</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class UserImpl extends MinimalEObjectImpl.Container implements User {
	/**
	 * The default value of the '{@link #getMatricule() <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricule()
	 * @generated
	 * @ordered
	 */
	protected static final String MATRICULE_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getMatricule() <em>Matricule</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMatricule()
	 * @generated
	 * @ordered
	 */
	protected String matricule = MATRICULE_EDEFAULT;
	/**
	 * The default value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String USER_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUserName() <em>User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserName()
	 * @generated
	 * @ordered
	 */
	protected String userName = USER_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected static final String FIRST_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getFirstName() <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstName()
	 * @generated
	 * @ordered
	 */
	protected String firstName = FIRST_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected static final String LAST_NAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getLastName() <em>Last Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLastName()
	 * @generated
	 * @ordered
	 */
	protected String lastName = LAST_NAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected static final String EMAIL_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getEmail() <em>Email</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmail()
	 * @generated
	 * @ordered
	 */
	protected String email = EMAIL_EDEFAULT;
	/**
	 * The default value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected static final String PHONE_NUMBER_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPhoneNumber() <em>Phone Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected String phoneNumber = PHONE_NUMBER_EDEFAULT;
	/**
	 * The default value of the '{@link #getPictureFilename() <em>Picture Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPictureFilename()
	 * @generated
	 * @ordered
	 */
	protected static final String PICTURE_FILENAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPictureFilename() <em>Picture Filename</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPictureFilename()
	 * @generated
	 * @ordered
	 */
	protected String pictureFilename = PICTURE_FILENAME_EDEFAULT;
	/**
	 * The cached value of the '{@link #getSupervisor() <em>Supervisor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupervisor()
	 * @generated
	 * @ordered
	 */
	protected User supervisor;
	/**
	 * The cached value of the '{@link #getBasketList() <em>Basket List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasketList()
	 * @generated
	 * @ordered
	 */
	protected EList<Basket> basketList;

	/**
	 * The cached value of the '{@link #getInstitution() <em>Institution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected Institution institution;

	/**
	 * The cached value of the '{@link #getActionList() <em>Action List</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionList()
	 * @generated
	 * @ordered
	 */
	protected EList<IAction> actionList;

	/**
	 * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected static final UserStatus STATUS_EDEFAULT = UserStatus.ACTIVE;
	/**
	 * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatus()
	 * @generated
	 * @ordered
	 */
	protected UserStatus status = STATUS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected UserImpl() {
		super();
		basketList = new BasicEList<Basket>() ;
		actionList = new BasicEList<IAction>() ; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return milafeteDataModelPackage.Literals.USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getMatricule() {
		return matricule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMatricule(String newMatricule) {
		String oldMatricule = matricule;
		matricule = newMatricule;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.USER__MATRICULE, oldMatricule, matricule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserName(String newUserName) {
		String oldUserName = userName;
		userName = newUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.USER__USER_NAME, oldUserName, userName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		String oldFirstName = firstName;
		firstName = newFirstName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.USER__FIRST_NAME, oldFirstName, firstName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLastName(String newLastName) {
		String oldLastName = lastName;
		lastName = newLastName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.USER__LAST_NAME, oldLastName, lastName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmail(String newEmail) {
		String oldEmail = email;
		email = newEmail;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.USER__EMAIL, oldEmail, email));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhoneNumber(String newPhoneNumber) {
		String oldPhoneNumber = phoneNumber;
		phoneNumber = newPhoneNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.USER__PHONE_NUMBER, oldPhoneNumber, phoneNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPictureFilename() {
		return pictureFilename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPictureFilename(String newPictureFilename) {
		String oldPictureFilename = pictureFilename;
		pictureFilename = newPictureFilename;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.USER__PICTURE_FILENAME, oldPictureFilename, pictureFilename));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getSupervisor() {
		if (supervisor != null && supervisor.eIsProxy()) {
			InternalEObject oldSupervisor = (InternalEObject)supervisor;
			supervisor = (User)eResolveProxy(oldSupervisor);
			if (supervisor != oldSupervisor) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, milafeteDataModelPackage.USER__SUPERVISOR, oldSupervisor, supervisor));
			}
		}
		return supervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetSupervisor() {
		return supervisor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupervisor(User newSupervisor) {
		User oldSupervisor = supervisor;
		supervisor = newSupervisor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.USER__SUPERVISOR, oldSupervisor, supervisor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Basket> getBasketList() {
		if (basketList == null) {
			basketList = new EObjectResolvingEList<Basket>(Basket.class, this, milafeteDataModelPackage.USER__BASKET_LIST);
		}
		return basketList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Institution getInstitution() {
		if (institution != null && institution.eIsProxy()) {
			InternalEObject oldInstitution = (InternalEObject)institution;
			institution = (Institution)eResolveProxy(oldInstitution);
			if (institution != oldInstitution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, milafeteDataModelPackage.USER__INSTITUTION, oldInstitution, institution));
			}
		}
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Institution basicGetInstitution() {
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstitution(Institution newInstitution) {
		Institution oldInstitution = institution;
		institution = newInstitution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.USER__INSTITUTION, oldInstitution, institution));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<IAction> getActionList() {
		if (actionList == null) {
			actionList = new EObjectResolvingEList<IAction>(IAction.class, this, milafeteDataModelPackage.USER__ACTION_LIST);
		}
		return actionList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStatus getStatus() {
		return status;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatus(UserStatus newStatus) {
		UserStatus oldStatus = status;
		status = newStatus == null ? STATUS_EDEFAULT : newStatus;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.USER__STATUS, oldStatus, status));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void addBasketElement(Basket _basket) {
		basketList.add(_basket);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public Basket basketElementAt(int ind) {
		Basket res = null ; 
		if (ind >=0 && ind <basketList.size()) {
			res = basketList.get(ind); 
		}
		return res; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public void addActionElement(IAction _action) {
		actionList.add(_action);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated Not 
	 */
	public IAction actionElementAt(int ind) {
		IAction res = null ; 
		if (ind >=0 && ind<actionList.size()) {
			res=actionList.get(ind);
		}
		return res; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean isAdministrator() {
		return false ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public boolean isAgent() {
		return false ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean authentification(String pwd) {
		boolean res = false;
		if (pwd.trim().length() != 0) res = true ;
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
			case milafeteDataModelPackage.USER__MATRICULE:
				return getMatricule();
			case milafeteDataModelPackage.USER__USER_NAME:
				return getUserName();
			case milafeteDataModelPackage.USER__FIRST_NAME:
				return getFirstName();
			case milafeteDataModelPackage.USER__LAST_NAME:
				return getLastName();
			case milafeteDataModelPackage.USER__EMAIL:
				return getEmail();
			case milafeteDataModelPackage.USER__PHONE_NUMBER:
				return getPhoneNumber();
			case milafeteDataModelPackage.USER__PICTURE_FILENAME:
				return getPictureFilename();
			case milafeteDataModelPackage.USER__SUPERVISOR:
				if (resolve) return getSupervisor();
				return basicGetSupervisor();
			case milafeteDataModelPackage.USER__BASKET_LIST:
				return getBasketList();
			case milafeteDataModelPackage.USER__INSTITUTION:
				if (resolve) return getInstitution();
				return basicGetInstitution();
			case milafeteDataModelPackage.USER__ACTION_LIST:
				return getActionList();
			case milafeteDataModelPackage.USER__STATUS:
				return getStatus();
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
			case milafeteDataModelPackage.USER__MATRICULE:
				setMatricule((String)newValue);
				return;
			case milafeteDataModelPackage.USER__USER_NAME:
				setUserName((String)newValue);
				return;
			case milafeteDataModelPackage.USER__FIRST_NAME:
				setFirstName((String)newValue);
				return;
			case milafeteDataModelPackage.USER__LAST_NAME:
				setLastName((String)newValue);
				return;
			case milafeteDataModelPackage.USER__EMAIL:
				setEmail((String)newValue);
				return;
			case milafeteDataModelPackage.USER__PHONE_NUMBER:
				setPhoneNumber((String)newValue);
				return;
			case milafeteDataModelPackage.USER__PICTURE_FILENAME:
				setPictureFilename((String)newValue);
				return;
			case milafeteDataModelPackage.USER__SUPERVISOR:
				setSupervisor((User)newValue);
				return;
			case milafeteDataModelPackage.USER__BASKET_LIST:
				getBasketList().clear();
				getBasketList().addAll((Collection<? extends Basket>)newValue);
				return;
			case milafeteDataModelPackage.USER__INSTITUTION:
				setInstitution((Institution)newValue);
				return;
			case milafeteDataModelPackage.USER__ACTION_LIST:
				getActionList().clear();
				getActionList().addAll((Collection<? extends IAction>)newValue);
				return;
			case milafeteDataModelPackage.USER__STATUS:
				setStatus((UserStatus)newValue);
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
			case milafeteDataModelPackage.USER__MATRICULE:
				setMatricule(MATRICULE_EDEFAULT);
				return;
			case milafeteDataModelPackage.USER__USER_NAME:
				setUserName(USER_NAME_EDEFAULT);
				return;
			case milafeteDataModelPackage.USER__FIRST_NAME:
				setFirstName(FIRST_NAME_EDEFAULT);
				return;
			case milafeteDataModelPackage.USER__LAST_NAME:
				setLastName(LAST_NAME_EDEFAULT);
				return;
			case milafeteDataModelPackage.USER__EMAIL:
				setEmail(EMAIL_EDEFAULT);
				return;
			case milafeteDataModelPackage.USER__PHONE_NUMBER:
				setPhoneNumber(PHONE_NUMBER_EDEFAULT);
				return;
			case milafeteDataModelPackage.USER__PICTURE_FILENAME:
				setPictureFilename(PICTURE_FILENAME_EDEFAULT);
				return;
			case milafeteDataModelPackage.USER__SUPERVISOR:
				setSupervisor((User)null);
				return;
			case milafeteDataModelPackage.USER__BASKET_LIST:
				getBasketList().clear();
				return;
			case milafeteDataModelPackage.USER__INSTITUTION:
				setInstitution((Institution)null);
				return;
			case milafeteDataModelPackage.USER__ACTION_LIST:
				getActionList().clear();
				return;
			case milafeteDataModelPackage.USER__STATUS:
				setStatus(STATUS_EDEFAULT);
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
			case milafeteDataModelPackage.USER__MATRICULE:
				return MATRICULE_EDEFAULT == null ? matricule != null : !MATRICULE_EDEFAULT.equals(matricule);
			case milafeteDataModelPackage.USER__USER_NAME:
				return USER_NAME_EDEFAULT == null ? userName != null : !USER_NAME_EDEFAULT.equals(userName);
			case milafeteDataModelPackage.USER__FIRST_NAME:
				return FIRST_NAME_EDEFAULT == null ? firstName != null : !FIRST_NAME_EDEFAULT.equals(firstName);
			case milafeteDataModelPackage.USER__LAST_NAME:
				return LAST_NAME_EDEFAULT == null ? lastName != null : !LAST_NAME_EDEFAULT.equals(lastName);
			case milafeteDataModelPackage.USER__EMAIL:
				return EMAIL_EDEFAULT == null ? email != null : !EMAIL_EDEFAULT.equals(email);
			case milafeteDataModelPackage.USER__PHONE_NUMBER:
				return PHONE_NUMBER_EDEFAULT == null ? phoneNumber != null : !PHONE_NUMBER_EDEFAULT.equals(phoneNumber);
			case milafeteDataModelPackage.USER__PICTURE_FILENAME:
				return PICTURE_FILENAME_EDEFAULT == null ? pictureFilename != null : !PICTURE_FILENAME_EDEFAULT.equals(pictureFilename);
			case milafeteDataModelPackage.USER__SUPERVISOR:
				return supervisor != null;
			case milafeteDataModelPackage.USER__BASKET_LIST:
				return basketList != null && !basketList.isEmpty();
			case milafeteDataModelPackage.USER__INSTITUTION:
				return institution != null;
			case milafeteDataModelPackage.USER__ACTION_LIST:
				return actionList != null && !actionList.isEmpty();
			case milafeteDataModelPackage.USER__STATUS:
				return status != STATUS_EDEFAULT;
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
			case milafeteDataModelPackage.USER___ADD_BASKET_ELEMENT__BASKET:
				addBasketElement((Basket)arguments.get(0));
				return null;
			case milafeteDataModelPackage.USER___BASKET_ELEMENT_AT__INT:
				return basketElementAt((Integer)arguments.get(0));
			case milafeteDataModelPackage.USER___ADD_ACTION_ELEMENT__IACTION:
				addActionElement((IAction)arguments.get(0));
				return null;
			case milafeteDataModelPackage.USER___ACTION_ELEMENT_AT__INT:
				return actionElementAt((Integer)arguments.get(0));
			case milafeteDataModelPackage.USER___IS_ADMINISTRATOR:
				return isAdministrator();
			case milafeteDataModelPackage.USER___IS_AGENT:
				return isAgent();
			case milafeteDataModelPackage.USER___AUTHENTIFICATION__STRING:
				return authentification((String)arguments.get(0));
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
		result.append(" (matricule: ");
		result.append(matricule);
		result.append(", userName: ");
		result.append(userName);
		result.append(", firstName: ");
		result.append(firstName);
		result.append(", lastName: ");
		result.append(lastName);
		result.append(", email: ");
		result.append(email);
		result.append(", phoneNumber: ");
		result.append(phoneNumber);
		result.append(", pictureFilename: ");
		result.append(pictureFilename);
		result.append(", status: ");
		result.append(status);
		result.append(')');
		return result.toString();
	}

} //UserImpl
