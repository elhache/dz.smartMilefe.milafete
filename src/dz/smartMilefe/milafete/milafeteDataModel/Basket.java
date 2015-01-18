/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Basket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getId <em>Id</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getDossierList <em>Dossier List</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getCategory <em>Category</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getName <em>Name</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getActionList <em>Action List</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getOwnerUser <em>Owner User</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getBasket()
 * @model abstract="true"
 * @generated
 */
public interface Basket extends EObject {

	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getBasket_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Dossier List</b></em>' reference list.
	 * The list contents are of type {@link dz.smartMilefe.milafete.milafeteDataModel.Dossier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dossier List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dossier List</em>' reference list.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getBasket_DossierList()
	 * @model
	 * @generated
	 */
	EList<Dossier> getDossierList();

	/**
	 * Returns the value of the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Category</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Category</em>' reference.
	 * @see #setCategory(BasketCategory)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getBasket_Category()
	 * @model required="true"
	 * @generated
	 */
	BasketCategory getCategory();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getCategory <em>Category</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Category</em>' reference.
	 * @see #getCategory()
	 * @generated
	 */
	void setCategory(BasketCategory value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getBasket_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Action List</b></em>' reference list.
	 * The list contents are of type {@link dz.smartMilefe.milafete.milafeteDataModel.ActionBasket}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action List</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action List</em>' reference list.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getBasket_ActionList()
	 * @model
	 * @generated
	 */
	EList<ActionBasket> getActionList();

	/**
	 * Returns the value of the '<em><b>Owner User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Owner User</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner User</em>' reference.
	 * @see #setOwnerUser(User)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getBasket_OwnerUser()
	 * @model
	 * @generated
	 */
	User getOwnerUser();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getOwnerUser <em>Owner User</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner User</em>' reference.
	 * @see #getOwnerUser()
	 * @generated
	 */
	void setOwnerUser(User value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addDossierElement(Dossier _dossier);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	Dossier dossierElementAt(int ind);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void addActionElement(ActionBasket _actionBasket);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	ActionBasket actionElementAt(int ind);
} // Basket
