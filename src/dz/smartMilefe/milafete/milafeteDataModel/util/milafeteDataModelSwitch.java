/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.util;

import dz.smartMilefe.milafete.milafeteDataModel.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage
 * @generated
 */
public class milafeteDataModelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static milafeteDataModelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public milafeteDataModelSwitch() {
		if (modelPackage == null) {
			modelPackage = milafeteDataModelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case milafeteDataModelPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.AGENT: {
				Agent agent = (Agent)theEObject;
				T result = caseAgent(agent);
				if (result == null) result = caseUser(agent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.ADMINISTRATOR: {
				Administrator administrator = (Administrator)theEObject;
				T result = caseAdministrator(administrator);
				if (result == null) result = caseUser(administrator);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.BASKET: {
				Basket basket = (Basket)theEObject;
				T result = caseBasket(basket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.BASKET_REGULAR: {
				BasketRegular basketRegular = (BasketRegular)theEObject;
				T result = caseBasketRegular(basketRegular);
				if (result == null) result = caseBasket(basketRegular);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.INSTITUTION: {
				Institution institution = (Institution)theEObject;
				T result = caseInstitution(institution);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.DOSSIER: {
				Dossier dossier = (Dossier)theEObject;
				T result = caseDossier(dossier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.DOSSIER_ITEM: {
				DossierItem dossierItem = (DossierItem)theEObject;
				T result = caseDossierItem(dossierItem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.DOCUMENT: {
				Document document = (Document)theEObject;
				T result = caseDocument(document);
				if (result == null) result = caseDossierItem(document);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.DOSSIER_SECTION: {
				DossierSection dossierSection = (DossierSection)theEObject;
				T result = caseDossierSection(dossierSection);
				if (result == null) result = caseDossierItem(dossierSection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.USER_MANAGEMENT: {
				UserManagement userManagement = (UserManagement)theEObject;
				T result = caseUserManagement(userManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = caseIAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.IACTION: {
				IAction iAction = (IAction)theEObject;
				T result = caseIAction(iAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.ACTION_BASKET: {
				ActionBasket actionBasket = (ActionBasket)theEObject;
				T result = caseActionBasket(actionBasket);
				if (result == null) result = caseAction(actionBasket);
				if (result == null) result = caseIAction(actionBasket);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.ACTION_MANAGEMENT: {
				ActionManagement actionManagement = (ActionManagement)theEObject;
				T result = caseActionManagement(actionManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.BASKET_MANAGEMENT: {
				BasketManagement basketManagement = (BasketManagement)theEObject;
				T result = caseBasketManagement(basketManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.BASKET_CATEGORY: {
				BasketCategory basketCategory = (BasketCategory)theEObject;
				T result = caseBasketCategory(basketCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT: {
				ApplicationDataManagement applicationDataManagement = (ApplicationDataManagement)theEObject;
				T result = caseApplicationDataManagement(applicationDataManagement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.ACTION_CATEGORY: {
				ActionCategory actionCategory = (ActionCategory)theEObject;
				T result = caseActionCategory(actionCategory);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case milafeteDataModelPackage.BAD_PARAMETER_EXCEPTION: {
				BadParameterException badParameterException = (BadParameterException)theEObject;
				T result = caseBadParameterException(badParameterException);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Agent</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAgent(Agent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Administrator</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Administrator</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdministrator(Administrator object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasket(Basket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basket Regular</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basket Regular</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasketRegular(BasketRegular object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Institution</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Institution</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInstitution(Institution object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dossier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dossier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDossier(Dossier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dossier Item</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dossier Item</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDossierItem(DossierItem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocument(Document object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dossier Section</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dossier Section</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDossierSection(DossierSection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserManagement(UserManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>IAction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>IAction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseIAction(IAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Basket</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Basket</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionBasket(ActionBasket object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionManagement(ActionManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basket Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basket Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasketManagement(BasketManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Basket Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Basket Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBasketCategory(BasketCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application Data Management</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application Data Management</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseApplicationDataManagement(ApplicationDataManagement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Category</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Category</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionCategory(ActionCategory object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bad Parameter Exception</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bad Parameter Exception</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBadParameterException(BadParameterException object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //milafeteDataModelSwitch
