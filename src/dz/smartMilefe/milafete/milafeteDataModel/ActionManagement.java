/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action Management</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.ActionManagement#getAllActionCategories <em>All Action Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getActionManagement()
 * @model
 * @generated
 */
public interface ActionManagement extends EObject {

	/**
	 * Returns the value of the '<em><b>All Action Categories</b></em>' reference list.
	 * The list contents are of type {@link dz.smartMilefe.milafete.milafeteDataModel.ActionCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>All Action Categories</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>All Action Categories</em>' reference list.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getActionManagement_AllActionCategories()
	 * @model
	 * @generated
	 */
	EList<ActionCategory> getAllActionCategories();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void initializeActionCategories();
} // ActionManagement
