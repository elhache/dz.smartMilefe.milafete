/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Vector;

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

import dz.smartMilefe.milafete.exception.BadParameterException;
import dz.smartMilefe.milafete.milafeteDataModel.Administrator;
import dz.smartMilefe.milafete.milafeteDataModel.Agent;
import dz.smartMilefe.milafete.milafeteDataModel.AgentType;
import dz.smartMilefe.milafete.milafeteDataModel.Institution;
import dz.smartMilefe.milafete.milafeteDataModel.User;
import dz.smartMilefe.milafete.milafeteDataModel.UserManagement;
import dz.smartMilefe.milafete.milafeteDataModel.UserStatus;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelFactory;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>User Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserManagementImpl#getUserList <em>User List</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserManagementImpl#getConnectedUser <em>Connected User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class UserManagementImpl extends MinimalEObjectImpl.Container implements UserManagement {
	/**
	 * The cached value of the '{@link #getUserList() <em>User List</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserList()
	 * @generated
	 * @ordered
	 */
	protected EList<User> userList;

	/**
	 * The cached value of the '{@link #getConnectedUser() <em>Connected User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnectedUser()
	 * @generated
	 * @ordered
	 */
	protected User connectedUser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	protected UserManagementImpl() {
		super();
		userList = new BasicEList<User>() ; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return milafeteDataModelPackage.Literals.USER_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<User> getUserList() {
		if (userList == null) {
			userList = new EObjectContainmentEList<User>(User.class, this, milafeteDataModelPackage.USER_MANAGEMENT__USER_LIST);
		}
		return userList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User getConnectedUser() {
		if (connectedUser != null && connectedUser.eIsProxy()) {
			InternalEObject oldConnectedUser = (InternalEObject)connectedUser;
			connectedUser = (User)eResolveProxy(oldConnectedUser);
			if (connectedUser != oldConnectedUser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, milafeteDataModelPackage.USER_MANAGEMENT__CONNECTED_USER, oldConnectedUser, connectedUser));
			}
		}
		return connectedUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public User basicGetConnectedUser() {
		return connectedUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnectedUser(User newConnectedUser) {
		User oldConnectedUser = connectedUser;
		connectedUser = newConnectedUser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.USER_MANAGEMENT__CONNECTED_USER, oldConnectedUser, connectedUser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public void addUserElement(User _user) {
		userList.add(_user); 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public User userElementAt(int ind) {
		User res = null ; 
		if (ind >=0 && ind <userList.size()) {
			res = userList.get(ind); 
		}
		return res ; 
		
	}

/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Vector<User> searchByUsername(String _userName) {
		Vector<User> res = new Vector<User>() ;  
		String username = _userName.trim().toLowerCase() ;
		
		for (User oneUser: userList) {
			String oneUserName = oneUser.getLastName().toLowerCase() ;
			if (oneUserName.startsWith(_userName)) {
				res.add(oneUser);
			}
		}
		return res ; 
	}

	//	/**
//	 * <!-- begin-user-doc -->
//	 * <!-- end-user-doc -->
//	 * @generated NOT 
//	 */
//	public User searchByUsername(String _userName) {
//		User res = null ;
//		String userName = _userName.trim() ; 
//		for (User oneUser: userList) {
//			if (oneUser.getUserName().equalsIgnoreCase(userName)){
//				res = oneUser ; 
//				break ; 
//			}
//		}
//		return res ; 
//	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public Vector<User> searchByLastname(String _lastname) {
		Vector<User> res = new Vector<User>() ; 		
		String lastname = _lastname.trim().toLowerCase() ; 
		for (User oneUser: userList) {
			String oneLastName = oneUser.getLastName().toLowerCase() ;
			if (oneLastName.startsWith(lastname)) {
				res.add(oneUser);
			}
		}
		return res ; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initializeUserList(Institution _institution) {
		// Here, we create fake users ... needed for testing

		milafeteDataModelFactory factory = milafeteDataModelFactory.eINSTANCE;
		
		Administrator admin = factory.createAdministrator() ;
		admin.setMatricule("MATUSER001");
		admin.setUserName("admin");
		admin.setFirstName("admin");
		admin.setLastName("Admin");
		admin.setPhoneNumber("5146661234");
		admin.setEmail("admin@milafete.dz.com");
		admin.setInstitution(_institution);
		admin.setStatus(UserStatus.ACTIVE);
		userList.add(admin) ; 
		
		Agent suAgent = factory.createAgent() ; 
		suAgent.setMatricule("MATUSER002");
		suAgent.setUserName("su");
		suAgent.setFirstName("su");
		suAgent.setLastName("Supervisor");
		suAgent.setPhoneNumber("5146661234");
		suAgent.setEmail("su@milafete.dz.com");
		suAgent.setInstitution(_institution);
		suAgent.setAgentType(AgentType.AGENT_PREVILEGE);
		suAgent.setStatus(UserStatus.ACTIVE);
		userList.add(suAgent); 
		
		Agent oneAgent = factory.createAgent() ; 
		oneAgent.setMatricule("MATUSER003");
		oneAgent.setUserName("a");
		oneAgent.setFirstName("Ali");
		oneAgent.setLastName("Kacem");
		oneAgent.setPhoneNumber("5149991234");
		oneAgent.setEmail("a@milafete.dz.com");
		oneAgent.setInstitution(_institution);
		oneAgent.setSupervisor(suAgent);
		oneAgent.setAgentType(AgentType.AGENT_REGULIER);
		oneAgent.setStatus(UserStatus.ACTIVE);
		userList.add(oneAgent) ; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initialization() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void removeUser(int ind) throws BadParameterException {
		if (ind>=0 && ind <userList.size()) {
			userList.remove(ind); 
		} else {
			
			BadParameterException ex = new BadParameterException(); 
			
			throw ex;  
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * Returns A user defined by _userName, 
	 * null if not exist
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public User searchOneUsername(String _userName) {
		User res = null ;
		String userName = _userName.trim() ; 
		for (User oneUser: userList) {
			if (oneUser.getUserName().equalsIgnoreCase(userName)){
				res = oneUser ; 
				break ; 
			}
		}
		return res ; 		
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case milafeteDataModelPackage.USER_MANAGEMENT__USER_LIST:
				return ((InternalEList<?>)getUserList()).basicRemove(otherEnd, msgs);
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
			case milafeteDataModelPackage.USER_MANAGEMENT__USER_LIST:
				return getUserList();
			case milafeteDataModelPackage.USER_MANAGEMENT__CONNECTED_USER:
				if (resolve) return getConnectedUser();
				return basicGetConnectedUser();
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
			case milafeteDataModelPackage.USER_MANAGEMENT__USER_LIST:
				getUserList().clear();
				getUserList().addAll((Collection<? extends User>)newValue);
				return;
			case milafeteDataModelPackage.USER_MANAGEMENT__CONNECTED_USER:
				setConnectedUser((User)newValue);
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
			case milafeteDataModelPackage.USER_MANAGEMENT__USER_LIST:
				getUserList().clear();
				return;
			case milafeteDataModelPackage.USER_MANAGEMENT__CONNECTED_USER:
				setConnectedUser((User)null);
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
			case milafeteDataModelPackage.USER_MANAGEMENT__USER_LIST:
				return userList != null && !userList.isEmpty();
			case milafeteDataModelPackage.USER_MANAGEMENT__CONNECTED_USER:
				return connectedUser != null;
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
			case milafeteDataModelPackage.USER_MANAGEMENT___ADD_USER_ELEMENT__USER:
				addUserElement((User)arguments.get(0));
				return null;
			case milafeteDataModelPackage.USER_MANAGEMENT___USER_ELEMENT_AT__INT:
				return userElementAt((Integer)arguments.get(0));
			case milafeteDataModelPackage.USER_MANAGEMENT___SEARCH_BY_USERNAME__STRING:
				return searchByUsername((String)arguments.get(0));
			case milafeteDataModelPackage.USER_MANAGEMENT___SEARCH_BY_LASTNAME__STRING:
				return searchByLastname((String)arguments.get(0));
			case milafeteDataModelPackage.USER_MANAGEMENT___INITIALIZE_USER_LIST__INSTITUTION:
				initializeUserList((Institution)arguments.get(0));
				return null;
			case milafeteDataModelPackage.USER_MANAGEMENT___INITIALIZATION:
				initialization();
				return null;
			case milafeteDataModelPackage.USER_MANAGEMENT___REMOVE_USER__INT:
				try {
					removeUser((Integer)arguments.get(0));
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case milafeteDataModelPackage.USER_MANAGEMENT___SEARCH_ONE_USERNAME__STRING:
				return searchOneUsername((String)arguments.get(0));
		}
		return super.eInvoke(operationID, arguments);
	}

} //UserManagementImpl
