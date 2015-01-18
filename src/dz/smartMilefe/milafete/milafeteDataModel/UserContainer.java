/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>User Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.UserContainer#getUserList <em>User List</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getUserContainer()
 * @model
 * @generated
 */
public interface UserContainer extends EObject {
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
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getUserContainer_UserList()
	 * @model containment="true"
	 * @generated
	 */
	EList<User> getUserList();

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
	 * @model
	 * @generated
	 */
	User searchByUsername(String _userName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model dataType="dz.madania.milafete.milafeteDataModel.VectorType"
	 * @generated
	 */
	java.util.Vector searchByLastname(String _lastname);

} // UserContainer
