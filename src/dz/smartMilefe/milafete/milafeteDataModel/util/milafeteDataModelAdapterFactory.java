/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.util;

import dz.smartMilefe.milafete.milafeteDataModel.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage
 * @generated
 */
public class milafeteDataModelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static milafeteDataModelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public milafeteDataModelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = milafeteDataModelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected milafeteDataModelSwitch<Adapter> modelSwitch =
		new milafeteDataModelSwitch<Adapter>() {
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseAgent(Agent object) {
				return createAgentAdapter();
			}
			@Override
			public Adapter caseAdministrator(Administrator object) {
				return createAdministratorAdapter();
			}
			@Override
			public Adapter caseBasket(Basket object) {
				return createBasketAdapter();
			}
			@Override
			public Adapter caseBasketRegular(BasketRegular object) {
				return createBasketRegularAdapter();
			}
			@Override
			public Adapter caseInstitution(Institution object) {
				return createInstitutionAdapter();
			}
			@Override
			public Adapter caseDossier(Dossier object) {
				return createDossierAdapter();
			}
			@Override
			public Adapter caseDossierItem(DossierItem object) {
				return createDossierItemAdapter();
			}
			@Override
			public Adapter caseDocument(Document object) {
				return createDocumentAdapter();
			}
			@Override
			public Adapter caseDossierSection(DossierSection object) {
				return createDossierSectionAdapter();
			}
			@Override
			public Adapter caseUserManagement(UserManagement object) {
				return createUserManagementAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseIAction(IAction object) {
				return createIActionAdapter();
			}
			@Override
			public Adapter caseActionBasket(ActionBasket object) {
				return createActionBasketAdapter();
			}
			@Override
			public Adapter caseActionManagement(ActionManagement object) {
				return createActionManagementAdapter();
			}
			@Override
			public Adapter caseBasketManagement(BasketManagement object) {
				return createBasketManagementAdapter();
			}
			@Override
			public Adapter caseBasketCategory(BasketCategory object) {
				return createBasketCategoryAdapter();
			}
			@Override
			public Adapter caseApplicationDataManagement(ApplicationDataManagement object) {
				return createApplicationDataManagementAdapter();
			}
			@Override
			public Adapter caseActionCategory(ActionCategory object) {
				return createActionCategoryAdapter();
			}
			@Override
			public Adapter caseBadParameterException(BadParameterException object) {
				return createBadParameterExceptionAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Agent
	 * @generated
	 */
	public Adapter createAgentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.Administrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Administrator
	 * @generated
	 */
	public Adapter createAdministratorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket <em>Basket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Basket
	 * @generated
	 */
	public Adapter createBasketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.BasketRegular <em>Basket Regular</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketRegular
	 * @generated
	 */
	public Adapter createBasketRegularAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.Institution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Institution
	 * @generated
	 */
	public Adapter createInstitutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier <em>Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Dossier
	 * @generated
	 */
	public Adapter createDossierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem <em>Dossier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DossierItem
	 * @generated
	 */
	public Adapter createDossierItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Document
	 * @generated
	 */
	public Adapter createDocumentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.DossierSection <em>Dossier Section</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DossierSection
	 * @generated
	 */
	public Adapter createDossierSectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement <em>User Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserManagement
	 * @generated
	 */
	public Adapter createUserManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.IAction <em>IAction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.IAction
	 * @generated
	 */
	public Adapter createIActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionBasket <em>Action Basket</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionBasket
	 * @generated
	 */
	public Adapter createActionBasketAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionManagement <em>Action Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionManagement
	 * @generated
	 */
	public Adapter createActionManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.BasketManagement <em>Basket Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketManagement
	 * @generated
	 */
	public Adapter createBasketManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.BasketCategory <em>Basket Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketCategory
	 * @generated
	 */
	public Adapter createBasketCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement <em>Application Data Management</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement
	 * @generated
	 */
	public Adapter createApplicationDataManagementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionCategory <em>Action Category</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionCategory
	 * @generated
	 */
	public Adapter createActionCategoryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link dz.smartMilefe.milafete.milafeteDataModel.BadParameterException <em>Bad Parameter Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BadParameterException
	 * @generated
	 */
	public Adapter createBadParameterExceptionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //milafeteDataModelAdapterFactory
