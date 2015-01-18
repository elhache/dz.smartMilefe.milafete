/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import dz.smartMilefe.milafete.exception.BadParameterException;

import java.util.Vector;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement#getUserList <em>User List</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement#getConnectedUser <em>Connected User</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getUserManagement()
 * @model
 * @generated
 */
public interface UserManagement extends EObject {
	/**
	 * Returns the value of the '<em><b>User List</b></em>' containment reference list.
	 * The list contents are of type {@link dz.smartMilefe.milafete.milafeteDataModel.User}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>User List</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>User List</em>' containment reference list.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getUserManagement_UserList()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUserList();

	/**
	 * Returns the value of the '<em><b>Connected User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connected User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connected User</em>' reference.
	 * @see #setConnectedUser(User)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getUserManagement_ConnectedUser()
	 * @model
	 * @generated
	 */
	User getConnectedUser();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement#getConnectedUser <em>Connected User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Connected User</em>' reference.
	 * @see #getConnectedUser()
	 * @generated
	 */
	void setConnectedUser(User value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addUserElement(User _user);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	User userElementAt(int ind);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="dz.smartMilefe.milafete.milafeteDataModel.VectorType"
	 * @generated
	 */
	Vector searchByUsername(String _userName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="dz.smartMilefe.milafete.milafeteDataModel.VectorType"
	 * @generated
	 */
	Vector searchByLastname(String _lastname);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initializeUserList(Institution _institution);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initialization();

	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model exceptions="dz.smartMilefe.milafete.milafeteDataModel.BPExceptionDataType"
	 * @generated
	 */
	void removeUser(int ind) throws BadParameterException;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	User searchOneUsername(String _userName);

} // UserManagement
