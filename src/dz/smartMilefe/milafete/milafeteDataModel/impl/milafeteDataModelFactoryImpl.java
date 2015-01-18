/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.impl;

import dz.smartMilefe.milafete.milafeteDataModel.*;

import java.util.Vector;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class milafeteDataModelFactoryImpl extends EFactoryImpl implements milafeteDataModelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static milafeteDataModelFactory init() {
		try {
			milafeteDataModelFactory themilafeteDataModelFactory = (milafeteDataModelFactory)EPackage.Registry.INSTANCE.getEFactory(milafeteDataModelPackage.eNS_URI);
			if (themilafeteDataModelFactory != null) {
				return themilafeteDataModelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new milafeteDataModelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public milafeteDataModelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case milafeteDataModelPackage.AGENT: return createAgent();
			case milafeteDataModelPackage.ADMINISTRATOR: return createAdministrator();
			case milafeteDataModelPackage.BASKET_REGULAR: return createBasketRegular();
			case milafeteDataModelPackage.INSTITUTION: return createInstitution();
			case milafeteDataModelPackage.DOSSIER: return createDossier();
			case milafeteDataModelPackage.DOCUMENT: return createDocument();
			case milafeteDataModelPackage.DOSSIER_SECTION: return createDossierSection();
			case milafeteDataModelPackage.USER_MANAGEMENT: return createUserManagement();
			case milafeteDataModelPackage.ACTION: return createAction();
			case milafeteDataModelPackage.ACTION_BASKET: return createActionBasket();
			case milafeteDataModelPackage.ACTION_MANAGEMENT: return createActionManagement();
			case milafeteDataModelPackage.BASKET_MANAGEMENT: return createBasketManagement();
			case milafeteDataModelPackage.BASKET_CATEGORY: return createBasketCategory();
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT: return createApplicationDataManagement();
			case milafeteDataModelPackage.ACTION_CATEGORY: return createActionCategory();
			case milafeteDataModelPackage.BAD_PARAMETER_EXCEPTION: return createBadParameterException();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case milafeteDataModelPackage.AGENT_TYPE:
				return createAgentTypeFromString(eDataType, initialValue);
			case milafeteDataModelPackage.DOCUMENT_TYPE:
				return createDocumentTypeFromString(eDataType, initialValue);
			case milafeteDataModelPackage.DOCUMENT_FORMAT:
				return createDocumentFormatFromString(eDataType, initialValue);
			case milafeteDataModelPackage.ACTION_LABEL:
				return createActionLabelFromString(eDataType, initialValue);
			case milafeteDataModelPackage.BASKET_LABEL:
				return createBasketLabelFromString(eDataType, initialValue);
			case milafeteDataModelPackage.USER_STATUS:
				return createUserStatusFromString(eDataType, initialValue);
			case milafeteDataModelPackage.VECTOR_TYPE:
				return createVectorTypeFromString(eDataType, initialValue);
			case milafeteDataModelPackage.BP_EXCEPTION_DATA_TYPE:
				return createBPExceptionDataTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case milafeteDataModelPackage.AGENT_TYPE:
				return convertAgentTypeToString(eDataType, instanceValue);
			case milafeteDataModelPackage.DOCUMENT_TYPE:
				return convertDocumentTypeToString(eDataType, instanceValue);
			case milafeteDataModelPackage.DOCUMENT_FORMAT:
				return convertDocumentFormatToString(eDataType, instanceValue);
			case milafeteDataModelPackage.ACTION_LABEL:
				return convertActionLabelToString(eDataType, instanceValue);
			case milafeteDataModelPackage.BASKET_LABEL:
				return convertBasketLabelToString(eDataType, instanceValue);
			case milafeteDataModelPackage.USER_STATUS:
				return convertUserStatusToString(eDataType, instanceValue);
			case milafeteDataModelPackage.VECTOR_TYPE:
				return convertVectorTypeToString(eDataType, instanceValue);
			case milafeteDataModelPackage.BP_EXCEPTION_DATA_TYPE:
				return convertBPExceptionDataTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Agent createAgent() {
		AgentImpl agent = new AgentImpl();
		return agent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Administrator createAdministrator() {
		AdministratorImpl administrator = new AdministratorImpl();
		return administrator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasketRegular createBasketRegular() {
		BasketRegularImpl basketRegular = new BasketRegularImpl();
		return basketRegular;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Institution createInstitution() {
		InstitutionImpl institution = new InstitutionImpl();
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dossier createDossier() {
		DossierImpl dossier = new DossierImpl();
		return dossier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Document createDocument() {
		DocumentImpl document = new DocumentImpl();
		return document;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DossierSection createDossierSection() {
		DossierSectionImpl dossierSection = new DossierSectionImpl();
		return dossierSection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserManagement createUserManagement() {
		UserManagementImpl userManagement = new UserManagementImpl();
		return userManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionBasket createActionBasket() {
		ActionBasketImpl actionBasket = new ActionBasketImpl();
		return actionBasket;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionManagement createActionManagement() {
		ActionManagementImpl actionManagement = new ActionManagementImpl();
		return actionManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasketManagement createBasketManagement() {
		BasketManagementImpl basketManagement = new BasketManagementImpl();
		return basketManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasketCategory createBasketCategory() {
		BasketCategoryImpl basketCategory = new BasketCategoryImpl();
		return basketCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationDataManagement createApplicationDataManagement() {
		ApplicationDataManagementImpl applicationDataManagement = new ApplicationDataManagementImpl();
		return applicationDataManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionCategory createActionCategory() {
		ActionCategoryImpl actionCategory = new ActionCategoryImpl();
		return actionCategory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BadParameterException createBadParameterException() {
		BadParameterExceptionImpl badParameterException = new BadParameterExceptionImpl();
		return badParameterException;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentType createAgentTypeFromString(EDataType eDataType, String initialValue) {
		AgentType result = AgentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAgentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentType createDocumentTypeFromString(EDataType eDataType, String initialValue) {
		DocumentType result = DocumentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentFormat createDocumentFormatFromString(EDataType eDataType, String initialValue) {
		DocumentFormat result = DocumentFormat.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDocumentFormatToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionLabel createActionLabelFromString(EDataType eDataType, String initialValue) {
		ActionLabel result = ActionLabel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertActionLabelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasketLabel createBasketLabelFromString(EDataType eDataType, String initialValue) {
		BasketLabel result = BasketLabel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasketLabelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserStatus createUserStatusFromString(EDataType eDataType, String initialValue) {
		UserStatus result = UserStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUserStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vector createVectorTypeFromString(EDataType eDataType, String initialValue) {
		return (Vector)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVectorTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public dz.smartMilefe.milafete.exception.BadParameterException createBPExceptionDataTypeFromString(EDataType eDataType, String initialValue) {
		return (dz.smartMilefe.milafete.exception.BadParameterException)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBPExceptionDataTypeToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public milafeteDataModelPackage getmilafeteDataModelPackage() {
		return (milafeteDataModelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static milafeteDataModelPackage getPackage() {
		return milafeteDataModelPackage.eINSTANCE;
	}

} //milafeteDataModelFactoryImpl
