/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.impl;

import dz.smartMilefe.milafete.milafeteDataModel.Action;
import dz.smartMilefe.milafete.milafeteDataModel.ActionBasket;
import dz.smartMilefe.milafete.milafeteDataModel.ActionCategory;
import dz.smartMilefe.milafete.milafeteDataModel.ActionLabel;
import dz.smartMilefe.milafete.milafeteDataModel.ActionManagement;
import dz.smartMilefe.milafete.milafeteDataModel.Administrator;
import dz.smartMilefe.milafete.milafeteDataModel.Agent;
import dz.smartMilefe.milafete.milafeteDataModel.AgentType;
import dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement;
import dz.smartMilefe.milafete.milafeteDataModel.BadParameterException;
import dz.smartMilefe.milafete.milafeteDataModel.Basket;
import dz.smartMilefe.milafete.milafeteDataModel.BasketCategory;
import dz.smartMilefe.milafete.milafeteDataModel.BasketLabel;
import dz.smartMilefe.milafete.milafeteDataModel.BasketManagement;
import dz.smartMilefe.milafete.milafeteDataModel.BasketRegular;
import dz.smartMilefe.milafete.milafeteDataModel.Document;
import dz.smartMilefe.milafete.milafeteDataModel.DocumentFormat;
import dz.smartMilefe.milafete.milafeteDataModel.DocumentType;
import dz.smartMilefe.milafete.milafeteDataModel.Dossier;
import dz.smartMilefe.milafete.milafeteDataModel.DossierItem;
import dz.smartMilefe.milafete.milafeteDataModel.DossierSection;
import dz.smartMilefe.milafete.milafeteDataModel.IAction;
import dz.smartMilefe.milafete.milafeteDataModel.Institution;
import dz.smartMilefe.milafete.milafeteDataModel.User;
import dz.smartMilefe.milafete.milafeteDataModel.UserManagement;
import dz.smartMilefe.milafete.milafeteDataModel.UserStatus;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelFactory;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

import java.util.Vector;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class milafeteDataModelPackageImpl extends EPackageImpl implements milafeteDataModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass agentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass administratorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basketRegularEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass institutionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dossierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dossierItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dossierSectionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass iActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionBasketEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basketManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass basketCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass applicationDataManagementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass actionCategoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass badParameterExceptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum agentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum documentFormatEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum actionLabelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basketLabelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum userStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType vectorTypeEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType bpExceptionDataTypeEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private milafeteDataModelPackageImpl() {
		super(eNS_URI, milafeteDataModelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link milafeteDataModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static milafeteDataModelPackage init() {
		if (isInited) return (milafeteDataModelPackage)EPackage.Registry.INSTANCE.getEPackage(milafeteDataModelPackage.eNS_URI);

		// Obtain or create and register package
		milafeteDataModelPackageImpl themilafeteDataModelPackage = (milafeteDataModelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof milafeteDataModelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new milafeteDataModelPackageImpl());

		isInited = true;

		// Create package meta-data objects
		themilafeteDataModelPackage.createPackageContents();

		// Initialize created meta-data
		themilafeteDataModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		themilafeteDataModelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(milafeteDataModelPackage.eNS_URI, themilafeteDataModelPackage);
		return themilafeteDataModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Matricule() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_UserName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_FirstName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_LastName() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Email() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_PhoneNumber() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_PictureFilename() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Supervisor() {
		return (EReference)userEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_BasketList() {
		return (EReference)userEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_Institution() {
		return (EReference)userEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUser_ActionList() {
		return (EReference)userEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUser_Status() {
		return (EAttribute)userEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__AddBasketElement__Basket() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__BasketElementAt__int() {
		return userEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__AddActionElement__IAction() {
		return userEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__ActionElementAt__int() {
		return userEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__IsAdministrator() {
		return userEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__IsAgent() {
		return userEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__Authentification__String() {
		return userEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAgent() {
		return agentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAgent_AgentType() {
		return (EAttribute)agentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdministrator() {
		return administratorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasket() {
		return basketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasket_Id() {
		return (EAttribute)basketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasket_DossierList() {
		return (EReference)basketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasket_Category() {
		return (EReference)basketEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasket_Name() {
		return (EAttribute)basketEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasket_ActionList() {
		return (EReference)basketEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasket_OwnerUser() {
		return (EReference)basketEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBasket__AddDossierElement__Dossier() {
		return basketEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBasket__DossierElementAt__int() {
		return basketEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBasket__AddActionElement__ActionBasket() {
		return basketEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBasket__ActionElementAt__int() {
		return basketEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasketRegular() {
		return basketRegularEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInstitution() {
		return institutionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstitution_Id() {
		return (EAttribute)institutionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstitution_Identification() {
		return (EAttribute)institutionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstitution_Adresse() {
		return (EAttribute)institutionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstitution_PhoneNumber() {
		return (EAttribute)institutionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInstitution_Email() {
		return (EAttribute)institutionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDossier() {
		return dossierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDossier_ItemList() {
		return (EReference)dossierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDossier_Id() {
		return (EAttribute)dossierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDossier_DateCreation() {
		return (EAttribute)dossierEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDossier_LieuCreationID() {
		return (EAttribute)dossierEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDossier_LieuResidenceID() {
		return (EAttribute)dossierEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDossier_Label() {
		return (EAttribute)dossierEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDossier__AddItemElement__DossierItem() {
		return dossierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDossier__ItemElementAt__int() {
		return dossierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDossierItem() {
		return dossierItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDossierItem_Id() {
		return (EAttribute)dossierItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDossierItem_Dossier() {
		return (EReference)dossierItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDossierItem_Label() {
		return (EAttribute)dossierItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDossierItem__IsDocument() {
		return dossierItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDossierItem__IsDossierSection() {
		return dossierItemEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocument() {
		return documentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_DateCreation() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_LieuCreationID() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_DocumentType() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_DocumentFormat() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_DocumentPath() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocument_DocumentFilename() {
		return (EAttribute)documentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDocument__AbsoluteFilename() {
		return documentEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDossierSection() {
		return dossierSectionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDossierSection_ItemList() {
		return (EReference)dossierSectionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserManagement() {
		return userManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserManagement_UserList() {
		return (EReference)userManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserManagement_ConnectedUser() {
		return (EReference)userManagementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserManagement__AddUserElement__User() {
		return userManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserManagement__UserElementAt__int() {
		return userManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserManagement__SearchByUsername__String() {
		return userManagementEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserManagement__SearchByLastname__String() {
		return userManagementEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserManagement__InitializeUserList__Institution() {
		return userManagementEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserManagement__Initialization() {
		return userManagementEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserManagement__RemoveUser__int() {
		return userManagementEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserManagement__SearchOneUsername__String() {
		return userManagementEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAction() {
		return actionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAction_ActionCategoy() {
		return (EReference)actionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIAction() {
		return iActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionBasket() {
		return actionBasketEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBasket_FromBasketAction() {
		return (EReference)actionBasketEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionBasket_IntoBasketAction() {
		return (EReference)actionBasketEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionManagement() {
		return actionManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getActionManagement_AllActionCategories() {
		return (EReference)actionManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getActionManagement__InitializeActionCategories() {
		return actionManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasketManagement() {
		return basketManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBasketManagement_AllBasketCategories() {
		return (EReference)basketManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBasketManagement__InitializeBasketCategories() {
		return basketManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBasketCategory() {
		return basketCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBasketCategory_Label() {
		return (EAttribute)basketCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getApplicationDataManagement() {
		return applicationDataManagementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationDataManagement_UserManagement() {
		return (EReference)applicationDataManagementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationDataManagement_BasketManagement() {
		return (EReference)applicationDataManagementEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationDataManagement_ActionManagement() {
		return (EReference)applicationDataManagementEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getApplicationDataManagement_Institution() {
		return (EReference)applicationDataManagementEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplicationDataManagement__Initialization() {
		return applicationDataManagementEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getApplicationDataManagement__CreateOneAppDataConfig() {
		return applicationDataManagementEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getActionCategory() {
		return actionCategoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getActionCategory_ActionLabel() {
		return (EAttribute)actionCategoryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBadParameterException() {
		return badParameterExceptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAgentType() {
		return agentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentType() {
		return documentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDocumentFormat() {
		return documentFormatEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getActionLabel() {
		return actionLabelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasketLabel() {
		return basketLabelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUserStatus() {
		return userStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getVectorType() {
		return vectorTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getBPExceptionDataType() {
		return bpExceptionDataTypeEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public milafeteDataModelFactory getmilafeteDataModelFactory() {
		return (milafeteDataModelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		userEClass = createEClass(USER);
		createEAttribute(userEClass, USER__MATRICULE);
		createEAttribute(userEClass, USER__USER_NAME);
		createEAttribute(userEClass, USER__FIRST_NAME);
		createEAttribute(userEClass, USER__LAST_NAME);
		createEAttribute(userEClass, USER__EMAIL);
		createEAttribute(userEClass, USER__PHONE_NUMBER);
		createEAttribute(userEClass, USER__PICTURE_FILENAME);
		createEReference(userEClass, USER__SUPERVISOR);
		createEReference(userEClass, USER__BASKET_LIST);
		createEReference(userEClass, USER__INSTITUTION);
		createEReference(userEClass, USER__ACTION_LIST);
		createEAttribute(userEClass, USER__STATUS);
		createEOperation(userEClass, USER___ADD_BASKET_ELEMENT__BASKET);
		createEOperation(userEClass, USER___BASKET_ELEMENT_AT__INT);
		createEOperation(userEClass, USER___ADD_ACTION_ELEMENT__IACTION);
		createEOperation(userEClass, USER___ACTION_ELEMENT_AT__INT);
		createEOperation(userEClass, USER___IS_ADMINISTRATOR);
		createEOperation(userEClass, USER___IS_AGENT);
		createEOperation(userEClass, USER___AUTHENTIFICATION__STRING);

		agentEClass = createEClass(AGENT);
		createEAttribute(agentEClass, AGENT__AGENT_TYPE);

		administratorEClass = createEClass(ADMINISTRATOR);

		basketEClass = createEClass(BASKET);
		createEAttribute(basketEClass, BASKET__ID);
		createEReference(basketEClass, BASKET__DOSSIER_LIST);
		createEReference(basketEClass, BASKET__CATEGORY);
		createEAttribute(basketEClass, BASKET__NAME);
		createEReference(basketEClass, BASKET__ACTION_LIST);
		createEReference(basketEClass, BASKET__OWNER_USER);
		createEOperation(basketEClass, BASKET___ADD_DOSSIER_ELEMENT__DOSSIER);
		createEOperation(basketEClass, BASKET___DOSSIER_ELEMENT_AT__INT);
		createEOperation(basketEClass, BASKET___ADD_ACTION_ELEMENT__ACTIONBASKET);
		createEOperation(basketEClass, BASKET___ACTION_ELEMENT_AT__INT);

		basketRegularEClass = createEClass(BASKET_REGULAR);

		institutionEClass = createEClass(INSTITUTION);
		createEAttribute(institutionEClass, INSTITUTION__ID);
		createEAttribute(institutionEClass, INSTITUTION__IDENTIFICATION);
		createEAttribute(institutionEClass, INSTITUTION__ADRESSE);
		createEAttribute(institutionEClass, INSTITUTION__PHONE_NUMBER);
		createEAttribute(institutionEClass, INSTITUTION__EMAIL);

		dossierEClass = createEClass(DOSSIER);
		createEReference(dossierEClass, DOSSIER__ITEM_LIST);
		createEAttribute(dossierEClass, DOSSIER__ID);
		createEAttribute(dossierEClass, DOSSIER__DATE_CREATION);
		createEAttribute(dossierEClass, DOSSIER__LIEU_CREATION_ID);
		createEAttribute(dossierEClass, DOSSIER__LIEU_RESIDENCE_ID);
		createEAttribute(dossierEClass, DOSSIER__LABEL);
		createEOperation(dossierEClass, DOSSIER___ADD_ITEM_ELEMENT__DOSSIERITEM);
		createEOperation(dossierEClass, DOSSIER___ITEM_ELEMENT_AT__INT);

		dossierItemEClass = createEClass(DOSSIER_ITEM);
		createEAttribute(dossierItemEClass, DOSSIER_ITEM__ID);
		createEReference(dossierItemEClass, DOSSIER_ITEM__DOSSIER);
		createEAttribute(dossierItemEClass, DOSSIER_ITEM__LABEL);
		createEOperation(dossierItemEClass, DOSSIER_ITEM___IS_DOCUMENT);
		createEOperation(dossierItemEClass, DOSSIER_ITEM___IS_DOSSIER_SECTION);

		documentEClass = createEClass(DOCUMENT);
		createEAttribute(documentEClass, DOCUMENT__DATE_CREATION);
		createEAttribute(documentEClass, DOCUMENT__LIEU_CREATION_ID);
		createEAttribute(documentEClass, DOCUMENT__DOCUMENT_TYPE);
		createEAttribute(documentEClass, DOCUMENT__DOCUMENT_FORMAT);
		createEAttribute(documentEClass, DOCUMENT__DOCUMENT_PATH);
		createEAttribute(documentEClass, DOCUMENT__DOCUMENT_FILENAME);
		createEOperation(documentEClass, DOCUMENT___ABSOLUTE_FILENAME);

		dossierSectionEClass = createEClass(DOSSIER_SECTION);
		createEReference(dossierSectionEClass, DOSSIER_SECTION__ITEM_LIST);

		userManagementEClass = createEClass(USER_MANAGEMENT);
		createEReference(userManagementEClass, USER_MANAGEMENT__USER_LIST);
		createEReference(userManagementEClass, USER_MANAGEMENT__CONNECTED_USER);
		createEOperation(userManagementEClass, USER_MANAGEMENT___ADD_USER_ELEMENT__USER);
		createEOperation(userManagementEClass, USER_MANAGEMENT___USER_ELEMENT_AT__INT);
		createEOperation(userManagementEClass, USER_MANAGEMENT___SEARCH_BY_USERNAME__STRING);
		createEOperation(userManagementEClass, USER_MANAGEMENT___SEARCH_BY_LASTNAME__STRING);
		createEOperation(userManagementEClass, USER_MANAGEMENT___INITIALIZE_USER_LIST__INSTITUTION);
		createEOperation(userManagementEClass, USER_MANAGEMENT___INITIALIZATION);
		createEOperation(userManagementEClass, USER_MANAGEMENT___REMOVE_USER__INT);
		createEOperation(userManagementEClass, USER_MANAGEMENT___SEARCH_ONE_USERNAME__STRING);

		actionEClass = createEClass(ACTION);
		createEReference(actionEClass, ACTION__ACTION_CATEGOY);

		iActionEClass = createEClass(IACTION);

		actionBasketEClass = createEClass(ACTION_BASKET);
		createEReference(actionBasketEClass, ACTION_BASKET__FROM_BASKET_ACTION);
		createEReference(actionBasketEClass, ACTION_BASKET__INTO_BASKET_ACTION);

		actionManagementEClass = createEClass(ACTION_MANAGEMENT);
		createEReference(actionManagementEClass, ACTION_MANAGEMENT__ALL_ACTION_CATEGORIES);
		createEOperation(actionManagementEClass, ACTION_MANAGEMENT___INITIALIZE_ACTION_CATEGORIES);

		basketManagementEClass = createEClass(BASKET_MANAGEMENT);
		createEReference(basketManagementEClass, BASKET_MANAGEMENT__ALL_BASKET_CATEGORIES);
		createEOperation(basketManagementEClass, BASKET_MANAGEMENT___INITIALIZE_BASKET_CATEGORIES);

		basketCategoryEClass = createEClass(BASKET_CATEGORY);
		createEAttribute(basketCategoryEClass, BASKET_CATEGORY__LABEL);

		applicationDataManagementEClass = createEClass(APPLICATION_DATA_MANAGEMENT);
		createEReference(applicationDataManagementEClass, APPLICATION_DATA_MANAGEMENT__USER_MANAGEMENT);
		createEReference(applicationDataManagementEClass, APPLICATION_DATA_MANAGEMENT__BASKET_MANAGEMENT);
		createEReference(applicationDataManagementEClass, APPLICATION_DATA_MANAGEMENT__ACTION_MANAGEMENT);
		createEReference(applicationDataManagementEClass, APPLICATION_DATA_MANAGEMENT__INSTITUTION);
		createEOperation(applicationDataManagementEClass, APPLICATION_DATA_MANAGEMENT___INITIALIZATION);
		createEOperation(applicationDataManagementEClass, APPLICATION_DATA_MANAGEMENT___CREATE_ONE_APP_DATA_CONFIG);

		actionCategoryEClass = createEClass(ACTION_CATEGORY);
		createEAttribute(actionCategoryEClass, ACTION_CATEGORY__ACTION_LABEL);

		badParameterExceptionEClass = createEClass(BAD_PARAMETER_EXCEPTION);

		// Create enums
		agentTypeEEnum = createEEnum(AGENT_TYPE);
		documentTypeEEnum = createEEnum(DOCUMENT_TYPE);
		documentFormatEEnum = createEEnum(DOCUMENT_FORMAT);
		actionLabelEEnum = createEEnum(ACTION_LABEL);
		basketLabelEEnum = createEEnum(BASKET_LABEL);
		userStatusEEnum = createEEnum(USER_STATUS);

		// Create data types
		vectorTypeEDataType = createEDataType(VECTOR_TYPE);
		bpExceptionDataTypeEDataType = createEDataType(BP_EXCEPTION_DATA_TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		agentEClass.getESuperTypes().add(this.getUser());
		administratorEClass.getESuperTypes().add(this.getUser());
		basketRegularEClass.getESuperTypes().add(this.getBasket());
		documentEClass.getESuperTypes().add(this.getDossierItem());
		dossierSectionEClass.getESuperTypes().add(this.getDossierItem());
		actionEClass.getESuperTypes().add(this.getIAction());
		actionBasketEClass.getESuperTypes().add(this.getAction());

		// Initialize classes, features, and operations; add parameters
		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUser_Matricule(), ecorePackage.getEString(), "matricule", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_UserName(), ecorePackage.getEString(), "userName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_FirstName(), ecorePackage.getEString(), "firstName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_LastName(), ecorePackage.getEString(), "lastName", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Email(), ecorePackage.getEString(), "email", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_PhoneNumber(), ecorePackage.getEString(), "phoneNumber", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_PictureFilename(), ecorePackage.getEString(), "pictureFilename", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Supervisor(), this.getUser(), null, "supervisor", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_BasketList(), this.getBasket(), null, "basketList", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_Institution(), this.getInstitution(), null, "institution", null, 1, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUser_ActionList(), this.getIAction(), null, "actionList", null, 0, -1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUser_Status(), this.getUserStatus(), "status", null, 0, 1, User.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getUser__AddBasketElement__Basket(), null, "addBasketElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getBasket(), "_basket", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__BasketElementAt__int(), this.getBasket(), "basketElementAt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "ind", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__AddActionElement__IAction(), null, "addActionElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIAction(), "_action", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__ActionElementAt__int(), this.getIAction(), "actionElementAt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "ind", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUser__IsAdministrator(), ecorePackage.getEBoolean(), "isAdministrator", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUser__IsAgent(), ecorePackage.getEBoolean(), "isAgent", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUser__Authentification__String(), ecorePackage.getEBoolean(), "authentification", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "pwd", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(agentEClass, Agent.class, "Agent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAgent_AgentType(), this.getAgentType(), "agentType", null, 0, 1, Agent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(administratorEClass, Administrator.class, "Administrator", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(basketEClass, Basket.class, "Basket", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasket_Id(), ecorePackage.getEString(), "id", null, 1, 1, Basket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasket_DossierList(), this.getDossier(), null, "dossierList", null, 0, -1, Basket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasket_Category(), this.getBasketCategory(), null, "category", null, 1, 1, Basket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBasket_Name(), ecorePackage.getEString(), "name", null, 0, 1, Basket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasket_ActionList(), this.getActionBasket(), null, "actionList", null, 0, -1, Basket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBasket_OwnerUser(), this.getUser(), null, "ownerUser", null, 0, 1, Basket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getBasket__AddDossierElement__Dossier(), null, "addDossierElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDossier(), "_dossier", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBasket__DossierElementAt__int(), this.getDossier(), "dossierElementAt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "ind", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBasket__AddActionElement__ActionBasket(), null, "addActionElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getActionBasket(), "_actionBasket", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getBasket__ActionElementAt__int(), this.getActionBasket(), "actionElementAt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "ind", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(basketRegularEClass, BasketRegular.class, "BasketRegular", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(institutionEClass, Institution.class, "Institution", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInstitution_Id(), ecorePackage.getEString(), "id", null, 1, 1, Institution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstitution_Identification(), ecorePackage.getEString(), "identification", null, 0, 1, Institution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstitution_Adresse(), ecorePackage.getEString(), "adresse", null, 0, 1, Institution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstitution_PhoneNumber(), ecorePackage.getEString(), "phoneNumber", null, 0, 1, Institution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInstitution_Email(), ecorePackage.getEString(), "email", null, 0, 1, Institution.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(dossierEClass, Dossier.class, "Dossier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDossier_ItemList(), this.getDossierItem(), null, "itemList", null, 0, -1, Dossier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDossier_Id(), ecorePackage.getEString(), "id", null, 1, 1, Dossier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDossier_DateCreation(), ecorePackage.getEDate(), "dateCreation", null, 0, 1, Dossier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDossier_LieuCreationID(), ecorePackage.getEString(), "lieuCreationID", null, 0, 1, Dossier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDossier_LieuResidenceID(), ecorePackage.getEString(), "lieuResidenceID", null, 0, 1, Dossier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDossier_Label(), ecorePackage.getEString(), "label", null, 0, 1, Dossier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getDossier__AddItemElement__DossierItem(), null, "addItemElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getDossierItem(), "_itemDossier", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getDossier__ItemElementAt__int(), this.getDossierItem(), "itemElementAt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "_ind", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dossierItemEClass, DossierItem.class, "DossierItem", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDossierItem_Id(), ecorePackage.getEString(), "id", null, 1, 1, DossierItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDossierItem_Dossier(), this.getDossier(), null, "dossier", null, 1, 1, DossierItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDossierItem_Label(), ecorePackage.getEString(), "label", null, 0, 1, DossierItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDossierItem__IsDocument(), ecorePackage.getEBoolean(), "isDocument", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDossierItem__IsDossierSection(), ecorePackage.getEBoolean(), "isDossierSection", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(documentEClass, Document.class, "Document", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocument_DateCreation(), ecorePackage.getEDate(), "dateCreation", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_LieuCreationID(), ecorePackage.getEString(), "lieuCreationID", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_DocumentType(), this.getDocumentType(), "documentType", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_DocumentFormat(), this.getDocumentFormat(), "documentFormat", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_DocumentPath(), ecorePackage.getEString(), "documentPath", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocument_DocumentFilename(), ecorePackage.getEString(), "documentFilename", null, 0, 1, Document.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDocument__AbsoluteFilename(), ecorePackage.getEString(), "absoluteFilename", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dossierSectionEClass, DossierSection.class, "DossierSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDossierSection_ItemList(), this.getDossierItem(), null, "itemList", null, 0, -1, DossierSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userManagementEClass, UserManagement.class, "UserManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUserManagement_UserList(), this.getUser(), null, "userList", null, 0, -1, UserManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUserManagement_ConnectedUser(), this.getUser(), null, "connectedUser", null, 0, 1, UserManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		op = initEOperation(getUserManagement__AddUserElement__User(), null, "addUserElement", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getUser(), "_user", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUserManagement__UserElementAt__int(), this.getUser(), "userElementAt", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "ind", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUserManagement__SearchByUsername__String(), this.getVectorType(), "searchByUsername", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "_userName", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUserManagement__SearchByLastname__String(), this.getVectorType(), "searchByLastname", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "_lastname", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUserManagement__InitializeUserList__Institution(), null, "initializeUserList", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getInstitution(), "_institution", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getUserManagement__Initialization(), null, "initialization", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getUserManagement__RemoveUser__int(), null, "removeUser", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEInt(), "ind", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEException(op, this.getBPExceptionDataType());

		op = initEOperation(getUserManagement__SearchOneUsername__String(), this.getUser(), "searchOneUsername", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "_userName", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionEClass, Action.class, "Action", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAction_ActionCategoy(), this.getActionCategory(), null, "actionCategoy", null, 0, 1, Action.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(iActionEClass, IAction.class, "IAction", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(actionBasketEClass, ActionBasket.class, "ActionBasket", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionBasket_FromBasketAction(), this.getBasket(), null, "fromBasketAction", null, 1, 1, ActionBasket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getActionBasket_IntoBasketAction(), this.getBasket(), null, "intoBasketAction", null, 1, 1, ActionBasket.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(actionManagementEClass, ActionManagement.class, "ActionManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getActionManagement_AllActionCategories(), this.getActionCategory(), null, "allActionCategories", null, 0, -1, ActionManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getActionManagement__InitializeActionCategories(), null, "initializeActionCategories", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(basketManagementEClass, BasketManagement.class, "BasketManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBasketManagement_AllBasketCategories(), this.getBasketCategory(), null, "allBasketCategories", null, 0, -1, BasketManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getBasketManagement__InitializeBasketCategories(), null, "initializeBasketCategories", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(basketCategoryEClass, BasketCategory.class, "BasketCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBasketCategory_Label(), this.getBasketLabel(), "label", null, 0, 1, BasketCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(applicationDataManagementEClass, ApplicationDataManagement.class, "ApplicationDataManagement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getApplicationDataManagement_UserManagement(), this.getUserManagement(), null, "userManagement", null, 0, 1, ApplicationDataManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationDataManagement_BasketManagement(), this.getBasketManagement(), null, "basketManagement", null, 0, 1, ApplicationDataManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationDataManagement_ActionManagement(), this.getActionManagement(), null, "actionManagement", null, 0, 1, ApplicationDataManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getApplicationDataManagement_Institution(), this.getInstitution(), null, "institution", null, 0, 1, ApplicationDataManagement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getApplicationDataManagement__Initialization(), null, "initialization", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getApplicationDataManagement__CreateOneAppDataConfig(), null, "createOneAppDataConfig", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(actionCategoryEClass, ActionCategory.class, "ActionCategory", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getActionCategory_ActionLabel(), this.getActionLabel(), "actionLabel", null, 0, 1, ActionCategory.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(badParameterExceptionEClass, BadParameterException.class, "BadParameterException", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(agentTypeEEnum, AgentType.class, "AgentType");
		addEEnumLiteral(agentTypeEEnum, AgentType.AGENT_REGULIER);
		addEEnumLiteral(agentTypeEEnum, AgentType.AGENT_PREVILEGE);

		initEEnum(documentTypeEEnum, DocumentType.class, "DocumentType");
		addEEnumLiteral(documentTypeEEnum, DocumentType.SCANNED);
		addEEnumLiteral(documentTypeEEnum, DocumentType.GENERATED);
		addEEnumLiteral(documentTypeEEnum, DocumentType.INTERNAL_NOTE);

		initEEnum(documentFormatEEnum, DocumentFormat.class, "DocumentFormat");
		addEEnumLiteral(documentFormatEEnum, DocumentFormat.PDF);
		addEEnumLiteral(documentFormatEEnum, DocumentFormat.JPG);
		addEEnumLiteral(documentFormatEEnum, DocumentFormat.GIF);

		initEEnum(actionLabelEEnum, ActionLabel.class, "ActionLabel");
		addEEnumLiteral(actionLabelEEnum, ActionLabel.INDEFINED);
		addEEnumLiteral(actionLabelEEnum, ActionLabel.COMPLETION);
		addEEnumLiteral(actionLabelEEnum, ActionLabel.SUPERVISOR);
		addEEnumLiteral(actionLabelEEnum, ActionLabel.REJECT);
		addEEnumLiteral(actionLabelEEnum, ActionLabel.INCOMPLETE);

		initEEnum(basketLabelEEnum, BasketLabel.class, "BasketLabel");
		addEEnumLiteral(basketLabelEEnum, BasketLabel.INDEFINED);
		addEEnumLiteral(basketLabelEEnum, BasketLabel.PROCESSED);
		addEEnumLiteral(basketLabelEEnum, BasketLabel.INCOMPLETE);
		addEEnumLiteral(basketLabelEEnum, BasketLabel.REJECTED);
		addEEnumLiteral(basketLabelEEnum, BasketLabel.TO_SUPERVISOR);
		addEEnumLiteral(basketLabelEEnum, BasketLabel.TO_PROCESS);
		addEEnumLiteral(basketLabelEEnum, BasketLabel.CONFIDENTIAL);

		initEEnum(userStatusEEnum, UserStatus.class, "UserStatus");
		addEEnumLiteral(userStatusEEnum, UserStatus.ACTIVE);
		addEEnumLiteral(userStatusEEnum, UserStatus.SUSPENDED);
		addEEnumLiteral(userStatusEEnum, UserStatus.REMOVED);

		// Initialize data types
		initEDataType(vectorTypeEDataType, Vector.class, "VectorType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(bpExceptionDataTypeEDataType, dz.smartMilefe.milafete.exception.BadParameterException.class, "BPExceptionDataType", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //milafeteDataModelPackageImpl
