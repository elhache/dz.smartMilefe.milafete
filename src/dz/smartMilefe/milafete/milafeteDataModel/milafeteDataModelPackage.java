/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelFactory
 * @model kind="package"
 * @generated
 */
public interface milafeteDataModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "milafeteDataModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/milafeteEMFmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "milafeteDataModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	milafeteDataModelPackage eINSTANCE = dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 0;

	/**
	 * The feature id for the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__MATRICULE = 0;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__USER_NAME = 1;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__FIRST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__LAST_NAME = 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__EMAIL = 4;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PHONE_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Picture Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__PICTURE_FILENAME = 6;

	/**
	 * The feature id for the '<em><b>Supervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__SUPERVISOR = 7;

	/**
	 * The feature id for the '<em><b>Basket List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__BASKET_LIST = 8;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__INSTITUTION = 9;

	/**
	 * The feature id for the '<em><b>Action List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__ACTION_LIST = 10;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER__STATUS = 11;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 12;

	/**
	 * The operation id for the '<em>Add Basket Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ADD_BASKET_ELEMENT__BASKET = 0;

	/**
	 * The operation id for the '<em>Basket Element At</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___BASKET_ELEMENT_AT__INT = 1;

	/**
	 * The operation id for the '<em>Add Action Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ADD_ACTION_ELEMENT__IACTION = 2;

	/**
	 * The operation id for the '<em>Action Element At</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___ACTION_ELEMENT_AT__INT = 3;

	/**
	 * The operation id for the '<em>Is Administrator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___IS_ADMINISTRATOR = 4;

	/**
	 * The operation id for the '<em>Is Agent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___IS_AGENT = 5;

	/**
	 * The operation id for the '<em>Authentification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___AUTHENTIFICATION__STRING = 6;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 7;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.AgentImpl <em>Agent</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.AgentImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getAgent()
	 * @generated
	 */
	int AGENT = 1;

	/**
	 * The feature id for the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__MATRICULE = USER__MATRICULE;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__USER_NAME = USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__FIRST_NAME = USER__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__LAST_NAME = USER__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PHONE_NUMBER = USER__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Picture Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__PICTURE_FILENAME = USER__PICTURE_FILENAME;

	/**
	 * The feature id for the '<em><b>Supervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__SUPERVISOR = USER__SUPERVISOR;

	/**
	 * The feature id for the '<em><b>Basket List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__BASKET_LIST = USER__BASKET_LIST;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__INSTITUTION = USER__INSTITUTION;

	/**
	 * The feature id for the '<em><b>Action List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__ACTION_LIST = USER__ACTION_LIST;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__STATUS = USER__STATUS;

	/**
	 * The feature id for the '<em><b>Agent Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT__AGENT_TYPE = USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_FEATURE_COUNT = USER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Add Basket Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___ADD_BASKET_ELEMENT__BASKET = USER___ADD_BASKET_ELEMENT__BASKET;

	/**
	 * The operation id for the '<em>Basket Element At</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___BASKET_ELEMENT_AT__INT = USER___BASKET_ELEMENT_AT__INT;

	/**
	 * The operation id for the '<em>Add Action Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___ADD_ACTION_ELEMENT__IACTION = USER___ADD_ACTION_ELEMENT__IACTION;

	/**
	 * The operation id for the '<em>Action Element At</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___ACTION_ELEMENT_AT__INT = USER___ACTION_ELEMENT_AT__INT;

	/**
	 * The operation id for the '<em>Is Administrator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___IS_ADMINISTRATOR = USER___IS_ADMINISTRATOR;

	/**
	 * The operation id for the '<em>Is Agent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___IS_AGENT = USER___IS_AGENT;

	/**
	 * The operation id for the '<em>Authentification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT___AUTHENTIFICATION__STRING = USER___AUTHENTIFICATION__STRING;

	/**
	 * The number of operations of the '<em>Agent</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGENT_OPERATION_COUNT = USER_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.AdministratorImpl <em>Administrator</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.AdministratorImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getAdministrator()
	 * @generated
	 */
	int ADMINISTRATOR = 2;

	/**
	 * The feature id for the '<em><b>Matricule</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__MATRICULE = USER__MATRICULE;

	/**
	 * The feature id for the '<em><b>User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__USER_NAME = USER__USER_NAME;

	/**
	 * The feature id for the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__FIRST_NAME = USER__FIRST_NAME;

	/**
	 * The feature id for the '<em><b>Last Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__LAST_NAME = USER__LAST_NAME;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__EMAIL = USER__EMAIL;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__PHONE_NUMBER = USER__PHONE_NUMBER;

	/**
	 * The feature id for the '<em><b>Picture Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__PICTURE_FILENAME = USER__PICTURE_FILENAME;

	/**
	 * The feature id for the '<em><b>Supervisor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__SUPERVISOR = USER__SUPERVISOR;

	/**
	 * The feature id for the '<em><b>Basket List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__BASKET_LIST = USER__BASKET_LIST;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__INSTITUTION = USER__INSTITUTION;

	/**
	 * The feature id for the '<em><b>Action List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__ACTION_LIST = USER__ACTION_LIST;

	/**
	 * The feature id for the '<em><b>Status</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR__STATUS = USER__STATUS;

	/**
	 * The number of structural features of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_FEATURE_COUNT = USER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Basket Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___ADD_BASKET_ELEMENT__BASKET = USER___ADD_BASKET_ELEMENT__BASKET;

	/**
	 * The operation id for the '<em>Basket Element At</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___BASKET_ELEMENT_AT__INT = USER___BASKET_ELEMENT_AT__INT;

	/**
	 * The operation id for the '<em>Add Action Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___ADD_ACTION_ELEMENT__IACTION = USER___ADD_ACTION_ELEMENT__IACTION;

	/**
	 * The operation id for the '<em>Action Element At</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___ACTION_ELEMENT_AT__INT = USER___ACTION_ELEMENT_AT__INT;

	/**
	 * The operation id for the '<em>Is Administrator</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___IS_ADMINISTRATOR = USER___IS_ADMINISTRATOR;

	/**
	 * The operation id for the '<em>Is Agent</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___IS_AGENT = USER___IS_AGENT;

	/**
	 * The operation id for the '<em>Authentification</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR___AUTHENTIFICATION__STRING = USER___AUTHENTIFICATION__STRING;

	/**
	 * The number of operations of the '<em>Administrator</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMINISTRATOR_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketImpl <em>Basket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.BasketImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBasket()
	 * @generated
	 */
	int BASKET = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET__ID = 0;

	/**
	 * The feature id for the '<em><b>Dossier List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET__DOSSIER_LIST = 1;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET__CATEGORY = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET__NAME = 3;

	/**
	 * The feature id for the '<em><b>Action List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET__ACTION_LIST = 4;

	/**
	 * The feature id for the '<em><b>Owner User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET__OWNER_USER = 5;

	/**
	 * The number of structural features of the '<em>Basket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Add Dossier Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET___ADD_DOSSIER_ELEMENT__DOSSIER = 0;

	/**
	 * The operation id for the '<em>Dossier Element At</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET___DOSSIER_ELEMENT_AT__INT = 1;

	/**
	 * The operation id for the '<em>Add Action Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET___ADD_ACTION_ELEMENT__ACTIONBASKET = 2;

	/**
	 * The operation id for the '<em>Action Element At</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET___ACTION_ELEMENT_AT__INT = 3;

	/**
	 * The number of operations of the '<em>Basket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketRegularImpl <em>Basket Regular</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.BasketRegularImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBasketRegular()
	 * @generated
	 */
	int BASKET_REGULAR = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_REGULAR__ID = BASKET__ID;

	/**
	 * The feature id for the '<em><b>Dossier List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_REGULAR__DOSSIER_LIST = BASKET__DOSSIER_LIST;

	/**
	 * The feature id for the '<em><b>Category</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_REGULAR__CATEGORY = BASKET__CATEGORY;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_REGULAR__NAME = BASKET__NAME;

	/**
	 * The feature id for the '<em><b>Action List</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_REGULAR__ACTION_LIST = BASKET__ACTION_LIST;

	/**
	 * The feature id for the '<em><b>Owner User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_REGULAR__OWNER_USER = BASKET__OWNER_USER;

	/**
	 * The number of structural features of the '<em>Basket Regular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_REGULAR_FEATURE_COUNT = BASKET_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Add Dossier Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_REGULAR___ADD_DOSSIER_ELEMENT__DOSSIER = BASKET___ADD_DOSSIER_ELEMENT__DOSSIER;

	/**
	 * The operation id for the '<em>Dossier Element At</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_REGULAR___DOSSIER_ELEMENT_AT__INT = BASKET___DOSSIER_ELEMENT_AT__INT;

	/**
	 * The operation id for the '<em>Add Action Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_REGULAR___ADD_ACTION_ELEMENT__ACTIONBASKET = BASKET___ADD_ACTION_ELEMENT__ACTIONBASKET;

	/**
	 * The operation id for the '<em>Action Element At</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_REGULAR___ACTION_ELEMENT_AT__INT = BASKET___ACTION_ELEMENT_AT__INT;

	/**
	 * The number of operations of the '<em>Basket Regular</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_REGULAR_OPERATION_COUNT = BASKET_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.InstitutionImpl <em>Institution</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.InstitutionImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getInstitution()
	 * @generated
	 */
	int INSTITUTION = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION__ID = 0;

	/**
	 * The feature id for the '<em><b>Identification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION__IDENTIFICATION = 1;

	/**
	 * The feature id for the '<em><b>Adresse</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION__ADRESSE = 2;

	/**
	 * The feature id for the '<em><b>Phone Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION__PHONE_NUMBER = 3;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION__EMAIL = 4;

	/**
	 * The number of structural features of the '<em>Institution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Institution</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSTITUTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierImpl <em>Dossier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.DossierImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getDossier()
	 * @generated
	 */
	int DOSSIER = 6;

	/**
	 * The feature id for the '<em><b>Item List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__ITEM_LIST = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__ID = 1;

	/**
	 * The feature id for the '<em><b>Date Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__DATE_CREATION = 2;

	/**
	 * The feature id for the '<em><b>Lieu Creation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__LIEU_CREATION_ID = 3;

	/**
	 * The feature id for the '<em><b>Lieu Residence ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__LIEU_RESIDENCE_ID = 4;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__LABEL = 5;

	/**
	 * The number of structural features of the '<em>Dossier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_FEATURE_COUNT = 6;

	/**
	 * The operation id for the '<em>Add Item Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER___ADD_ITEM_ELEMENT__DOSSIERITEM = 0;

	/**
	 * The operation id for the '<em>Item Element At</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER___ITEM_ELEMENT_AT__INT = 1;

	/**
	 * The number of operations of the '<em>Dossier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierItemImpl <em>Dossier Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.DossierItemImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getDossierItem()
	 * @generated
	 */
	int DOSSIER_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_ITEM__ID = 0;

	/**
	 * The feature id for the '<em><b>Dossier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_ITEM__DOSSIER = 1;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_ITEM__LABEL = 2;

	/**
	 * The number of structural features of the '<em>Dossier Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_ITEM_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Is Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_ITEM___IS_DOCUMENT = 0;

	/**
	 * The operation id for the '<em>Is Dossier Section</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_ITEM___IS_DOSSIER_SECTION = 1;

	/**
	 * The number of operations of the '<em>Dossier Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_ITEM_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DocumentImpl <em>Document</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.DocumentImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getDocument()
	 * @generated
	 */
	int DOCUMENT = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__ID = DOSSIER_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Dossier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOSSIER = DOSSIER_ITEM__DOSSIER;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__LABEL = DOSSIER_ITEM__LABEL;

	/**
	 * The feature id for the '<em><b>Date Creation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DATE_CREATION = DOSSIER_ITEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Lieu Creation ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__LIEU_CREATION_ID = DOSSIER_ITEM_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Document Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT_TYPE = DOSSIER_ITEM_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Document Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT_FORMAT = DOSSIER_ITEM_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Document Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT_PATH = DOSSIER_ITEM_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Document Filename</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT__DOCUMENT_FILENAME = DOSSIER_ITEM_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_FEATURE_COUNT = DOSSIER_ITEM_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Is Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___IS_DOCUMENT = DOSSIER_ITEM___IS_DOCUMENT;

	/**
	 * The operation id for the '<em>Is Dossier Section</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___IS_DOSSIER_SECTION = DOSSIER_ITEM___IS_DOSSIER_SECTION;

	/**
	 * The operation id for the '<em>Absolute Filename</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT___ABSOLUTE_FILENAME = DOSSIER_ITEM_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Document</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_OPERATION_COUNT = DOSSIER_ITEM_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierSectionImpl <em>Dossier Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.DossierSectionImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getDossierSection()
	 * @generated
	 */
	int DOSSIER_SECTION = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_SECTION__ID = DOSSIER_ITEM__ID;

	/**
	 * The feature id for the '<em><b>Dossier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_SECTION__DOSSIER = DOSSIER_ITEM__DOSSIER;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_SECTION__LABEL = DOSSIER_ITEM__LABEL;

	/**
	 * The feature id for the '<em><b>Item List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_SECTION__ITEM_LIST = DOSSIER_ITEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dossier Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_SECTION_FEATURE_COUNT = DOSSIER_ITEM_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Is Document</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_SECTION___IS_DOCUMENT = DOSSIER_ITEM___IS_DOCUMENT;

	/**
	 * The operation id for the '<em>Is Dossier Section</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_SECTION___IS_DOSSIER_SECTION = DOSSIER_ITEM___IS_DOSSIER_SECTION;

	/**
	 * The number of operations of the '<em>Dossier Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_SECTION_OPERATION_COUNT = DOSSIER_ITEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserManagementImpl <em>User Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.UserManagementImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getUserManagement()
	 * @generated
	 */
	int USER_MANAGEMENT = 10;

	/**
	 * The feature id for the '<em><b>User List</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT__USER_LIST = 0;

	/**
	 * The feature id for the '<em><b>Connected User</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT__CONNECTED_USER = 1;

	/**
	 * The number of structural features of the '<em>User Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Add User Element</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT___ADD_USER_ELEMENT__USER = 0;

	/**
	 * The operation id for the '<em>User Element At</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT___USER_ELEMENT_AT__INT = 1;

	/**
	 * The operation id for the '<em>Search By Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT___SEARCH_BY_USERNAME__STRING = 2;

	/**
	 * The operation id for the '<em>Search By Lastname</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT___SEARCH_BY_LASTNAME__STRING = 3;

	/**
	 * The operation id for the '<em>Initialize User List</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT___INITIALIZE_USER_LIST__INSTITUTION = 4;

	/**
	 * The operation id for the '<em>Initialization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT___INITIALIZATION = 5;

	/**
	 * The operation id for the '<em>Remove User</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT___REMOVE_USER__INT = 6;

	/**
	 * The operation id for the '<em>Search One Username</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT___SEARCH_ONE_USERNAME__STRING = 7;

	/**
	 * The number of operations of the '<em>User Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_MANAGEMENT_OPERATION_COUNT = 8;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.IAction <em>IAction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.IAction
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getIAction()
	 * @generated
	 */
	int IACTION = 12;

	/**
	 * The number of structural features of the '<em>IAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>IAction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.ActionImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 11;

	/**
	 * The feature id for the '<em><b>Action Categoy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__ACTION_CATEGOY = IACTION_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = IACTION_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = IACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ActionBasketImpl <em>Action Basket</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.ActionBasketImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getActionBasket()
	 * @generated
	 */
	int ACTION_BASKET = 13;

	/**
	 * The feature id for the '<em><b>Action Categoy</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASKET__ACTION_CATEGOY = ACTION__ACTION_CATEGOY;

	/**
	 * The feature id for the '<em><b>From Basket Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASKET__FROM_BASKET_ACTION = ACTION_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Into Basket Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASKET__INTO_BASKET_ACTION = ACTION_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action Basket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASKET_FEATURE_COUNT = ACTION_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action Basket</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_BASKET_OPERATION_COUNT = ACTION_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ActionManagementImpl <em>Action Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.ActionManagementImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getActionManagement()
	 * @generated
	 */
	int ACTION_MANAGEMENT = 14;

	/**
	 * The feature id for the '<em><b>All Action Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MANAGEMENT__ALL_ACTION_CATEGORIES = 0;

	/**
	 * The number of structural features of the '<em>Action Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MANAGEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Initialize Action Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MANAGEMENT___INITIALIZE_ACTION_CATEGORIES = 0;

	/**
	 * The number of operations of the '<em>Action Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_MANAGEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketManagementImpl <em>Basket Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.BasketManagementImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBasketManagement()
	 * @generated
	 */
	int BASKET_MANAGEMENT = 15;

	/**
	 * The feature id for the '<em><b>All Basket Categories</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_MANAGEMENT__ALL_BASKET_CATEGORIES = 0;

	/**
	 * The number of structural features of the '<em>Basket Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_MANAGEMENT_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Initialize Basket Categories</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_MANAGEMENT___INITIALIZE_BASKET_CATEGORIES = 0;

	/**
	 * The number of operations of the '<em>Basket Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_MANAGEMENT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketCategoryImpl <em>Basket Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.BasketCategoryImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBasketCategory()
	 * @generated
	 */
	int BASKET_CATEGORY = 16;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_CATEGORY__LABEL = 0;

	/**
	 * The number of structural features of the '<em>Basket Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_CATEGORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Basket Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BASKET_CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ApplicationDataManagementImpl <em>Application Data Management</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.ApplicationDataManagementImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getApplicationDataManagement()
	 * @generated
	 */
	int APPLICATION_DATA_MANAGEMENT = 17;

	/**
	 * The feature id for the '<em><b>User Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_MANAGEMENT__USER_MANAGEMENT = 0;

	/**
	 * The feature id for the '<em><b>Basket Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_MANAGEMENT__BASKET_MANAGEMENT = 1;

	/**
	 * The feature id for the '<em><b>Action Management</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_MANAGEMENT__ACTION_MANAGEMENT = 2;

	/**
	 * The feature id for the '<em><b>Institution</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_MANAGEMENT__INSTITUTION = 3;

	/**
	 * The number of structural features of the '<em>Application Data Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_MANAGEMENT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Initialization</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_MANAGEMENT___INITIALIZATION = 0;

	/**
	 * The operation id for the '<em>Create One App Data Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_MANAGEMENT___CREATE_ONE_APP_DATA_CONFIG = 1;

	/**
	 * The number of operations of the '<em>Application Data Management</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int APPLICATION_DATA_MANAGEMENT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ActionCategoryImpl <em>Action Category</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.ActionCategoryImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getActionCategory()
	 * @generated
	 */
	int ACTION_CATEGORY = 18;

	/**
	 * The feature id for the '<em><b>Action Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY__ACTION_LABEL = 0;

	/**
	 * The number of structural features of the '<em>Action Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Category</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_CATEGORY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BadParameterExceptionImpl <em>Bad Parameter Exception</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.BadParameterExceptionImpl
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBadParameterException()
	 * @generated
	 */
	int BAD_PARAMETER_EXCEPTION = 19;

	/**
	 * The number of structural features of the '<em>Bad Parameter Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAD_PARAMETER_EXCEPTION_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Bad Parameter Exception</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BAD_PARAMETER_EXCEPTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.AgentType <em>Agent Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.AgentType
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getAgentType()
	 * @generated
	 */
	int AGENT_TYPE = 20;


	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.DocumentType <em>Document Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DocumentType
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getDocumentType()
	 * @generated
	 */
	int DOCUMENT_TYPE = 21;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.DocumentFormat <em>Document Format</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DocumentFormat
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getDocumentFormat()
	 * @generated
	 */
	int DOCUMENT_FORMAT = 22;


	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionLabel <em>Action Label</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionLabel
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getActionLabel()
	 * @generated
	 */
	int ACTION_LABEL = 23;


	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.BasketLabel <em>Basket Label</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketLabel
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBasketLabel()
	 * @generated
	 */
	int BASKET_LABEL = 24;

	/**
	 * The meta object id for the '{@link dz.smartMilefe.milafete.milafeteDataModel.UserStatus <em>User Status</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserStatus
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getUserStatus()
	 * @generated
	 */
	int USER_STATUS = 25;

	/**
	 * The meta object id for the '<em>Vector Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.util.Vector
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getVectorType()
	 * @generated
	 */
	int VECTOR_TYPE = 26;


	/**
	 * The meta object id for the '<em>BP Exception Data Type</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see dz.smartMilefe.milafete.exception.BadParameterException
	 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBPExceptionDataType()
	 * @generated
	 */
	int BP_EXCEPTION_DATA_TYPE = 27;


	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.User#getMatricule <em>Matricule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Matricule</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#getMatricule()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Matricule();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.User#getUserName <em>User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>User Name</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#getUserName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_UserName();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.User#getFirstName <em>First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>First Name</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#getFirstName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_FirstName();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.User#getLastName <em>Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Last Name</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#getLastName()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_LastName();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.User#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#getEmail()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Email();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.User#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#getPhoneNumber()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_PhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.User#getPictureFilename <em>Picture Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Picture Filename</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#getPictureFilename()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_PictureFilename();

	/**
	 * Returns the meta object for the reference '{@link dz.smartMilefe.milafete.milafeteDataModel.User#getSupervisor <em>Supervisor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Supervisor</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#getSupervisor()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Supervisor();

	/**
	 * Returns the meta object for the reference list '{@link dz.smartMilefe.milafete.milafeteDataModel.User#getBasketList <em>Basket List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Basket List</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#getBasketList()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_BasketList();

	/**
	 * Returns the meta object for the reference '{@link dz.smartMilefe.milafete.milafeteDataModel.User#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Institution</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#getInstitution()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_Institution();

	/**
	 * Returns the meta object for the reference list '{@link dz.smartMilefe.milafete.milafeteDataModel.User#getActionList <em>Action List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action List</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#getActionList()
	 * @see #getUser()
	 * @generated
	 */
	EReference getUser_ActionList();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.User#getStatus <em>Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Status</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#getStatus()
	 * @see #getUser()
	 * @generated
	 */
	EAttribute getUser_Status();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.User#addBasketElement(dz.smartMilefe.milafete.milafeteDataModel.Basket) <em>Add Basket Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Basket Element</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#addBasketElement(dz.smartMilefe.milafete.milafeteDataModel.Basket)
	 * @generated
	 */
	EOperation getUser__AddBasketElement__Basket();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.User#basketElementAt(int) <em>Basket Element At</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Basket Element At</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#basketElementAt(int)
	 * @generated
	 */
	EOperation getUser__BasketElementAt__int();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.User#addActionElement(dz.smartMilefe.milafete.milafeteDataModel.IAction) <em>Add Action Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Action Element</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#addActionElement(dz.smartMilefe.milafete.milafeteDataModel.IAction)
	 * @generated
	 */
	EOperation getUser__AddActionElement__IAction();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.User#actionElementAt(int) <em>Action Element At</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action Element At</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#actionElementAt(int)
	 * @generated
	 */
	EOperation getUser__ActionElementAt__int();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.User#isAdministrator() <em>Is Administrator</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Administrator</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#isAdministrator()
	 * @generated
	 */
	EOperation getUser__IsAdministrator();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.User#isAgent() <em>Is Agent</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Agent</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#isAgent()
	 * @generated
	 */
	EOperation getUser__IsAgent();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.User#authentification(java.lang.String) <em>Authentification</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Authentification</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.User#authentification(java.lang.String)
	 * @generated
	 */
	EOperation getUser__Authentification__String();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.Agent <em>Agent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Agent</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Agent
	 * @generated
	 */
	EClass getAgent();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Agent#getAgentType <em>Agent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Agent Type</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Agent#getAgentType()
	 * @see #getAgent()
	 * @generated
	 */
	EAttribute getAgent_AgentType();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.Administrator <em>Administrator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Administrator</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Administrator
	 * @generated
	 */
	EClass getAdministrator();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket <em>Basket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basket</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Basket
	 * @generated
	 */
	EClass getBasket();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Basket#getId()
	 * @see #getBasket()
	 * @generated
	 */
	EAttribute getBasket_Id();

	/**
	 * Returns the meta object for the reference list '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getDossierList <em>Dossier List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Dossier List</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Basket#getDossierList()
	 * @see #getBasket()
	 * @generated
	 */
	EReference getBasket_DossierList();

	/**
	 * Returns the meta object for the reference '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getCategory <em>Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Category</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Basket#getCategory()
	 * @see #getBasket()
	 * @generated
	 */
	EReference getBasket_Category();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Basket#getName()
	 * @see #getBasket()
	 * @generated
	 */
	EAttribute getBasket_Name();

	/**
	 * Returns the meta object for the reference list '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getActionList <em>Action List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Action List</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Basket#getActionList()
	 * @see #getBasket()
	 * @generated
	 */
	EReference getBasket_ActionList();

	/**
	 * Returns the meta object for the reference '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#getOwnerUser <em>Owner User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Owner User</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Basket#getOwnerUser()
	 * @see #getBasket()
	 * @generated
	 */
	EReference getBasket_OwnerUser();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#addDossierElement(dz.smartMilefe.milafete.milafeteDataModel.Dossier) <em>Add Dossier Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Dossier Element</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Basket#addDossierElement(dz.smartMilefe.milafete.milafeteDataModel.Dossier)
	 * @generated
	 */
	EOperation getBasket__AddDossierElement__Dossier();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#dossierElementAt(int) <em>Dossier Element At</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Dossier Element At</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Basket#dossierElementAt(int)
	 * @generated
	 */
	EOperation getBasket__DossierElementAt__int();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#addActionElement(dz.smartMilefe.milafete.milafeteDataModel.ActionBasket) <em>Add Action Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Action Element</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Basket#addActionElement(dz.smartMilefe.milafete.milafeteDataModel.ActionBasket)
	 * @generated
	 */
	EOperation getBasket__AddActionElement__ActionBasket();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.Basket#actionElementAt(int) <em>Action Element At</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Action Element At</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Basket#actionElementAt(int)
	 * @generated
	 */
	EOperation getBasket__ActionElementAt__int();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.BasketRegular <em>Basket Regular</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basket Regular</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketRegular
	 * @generated
	 */
	EClass getBasketRegular();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.Institution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Institution</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Institution
	 * @generated
	 */
	EClass getInstitution();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Institution#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Institution#getId()
	 * @see #getInstitution()
	 * @generated
	 */
	EAttribute getInstitution_Id();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Institution#getIdentification <em>Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Identification</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Institution#getIdentification()
	 * @see #getInstitution()
	 * @generated
	 */
	EAttribute getInstitution_Identification();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Institution#getAdresse <em>Adresse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Adresse</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Institution#getAdresse()
	 * @see #getInstitution()
	 * @generated
	 */
	EAttribute getInstitution_Adresse();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Institution#getPhoneNumber <em>Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Phone Number</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Institution#getPhoneNumber()
	 * @see #getInstitution()
	 * @generated
	 */
	EAttribute getInstitution_PhoneNumber();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Institution#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Institution#getEmail()
	 * @see #getInstitution()
	 * @generated
	 */
	EAttribute getInstitution_Email();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier <em>Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dossier</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Dossier
	 * @generated
	 */
	EClass getDossier();

	/**
	 * Returns the meta object for the containment reference list '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getItemList <em>Item List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item List</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Dossier#getItemList()
	 * @see #getDossier()
	 * @generated
	 */
	EReference getDossier_ItemList();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Dossier#getId()
	 * @see #getDossier()
	 * @generated
	 */
	EAttribute getDossier_Id();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getDateCreation <em>Date Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Creation</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Dossier#getDateCreation()
	 * @see #getDossier()
	 * @generated
	 */
	EAttribute getDossier_DateCreation();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getLieuCreationID <em>Lieu Creation ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lieu Creation ID</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Dossier#getLieuCreationID()
	 * @see #getDossier()
	 * @generated
	 */
	EAttribute getDossier_LieuCreationID();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getLieuResidenceID <em>Lieu Residence ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lieu Residence ID</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Dossier#getLieuResidenceID()
	 * @see #getDossier()
	 * @generated
	 */
	EAttribute getDossier_LieuResidenceID();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Dossier#getLabel()
	 * @see #getDossier()
	 * @generated
	 */
	EAttribute getDossier_Label();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#addItemElement(dz.smartMilefe.milafete.milafeteDataModel.DossierItem) <em>Add Item Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add Item Element</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Dossier#addItemElement(dz.smartMilefe.milafete.milafeteDataModel.DossierItem)
	 * @generated
	 */
	EOperation getDossier__AddItemElement__DossierItem();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.Dossier#itemElementAt(int) <em>Item Element At</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Item Element At</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Dossier#itemElementAt(int)
	 * @generated
	 */
	EOperation getDossier__ItemElementAt__int();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem <em>Dossier Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dossier Item</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DossierItem
	 * @generated
	 */
	EClass getDossierItem();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DossierItem#getId()
	 * @see #getDossierItem()
	 * @generated
	 */
	EAttribute getDossierItem_Id();

	/**
	 * Returns the meta object for the reference '{@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem#getDossier <em>Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dossier</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DossierItem#getDossier()
	 * @see #getDossierItem()
	 * @generated
	 */
	EReference getDossierItem_Dossier();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DossierItem#getLabel()
	 * @see #getDossierItem()
	 * @generated
	 */
	EAttribute getDossierItem_Label();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem#isDocument() <em>Is Document</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Document</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DossierItem#isDocument()
	 * @generated
	 */
	EOperation getDossierItem__IsDocument();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.DossierItem#isDossierSection() <em>Is Dossier Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Is Dossier Section</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DossierItem#isDossierSection()
	 * @generated
	 */
	EOperation getDossierItem__IsDossierSection();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.Document <em>Document</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Document
	 * @generated
	 */
	EClass getDocument();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDateCreation <em>Date Creation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date Creation</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Document#getDateCreation()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_DateCreation();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getLieuCreationID <em>Lieu Creation ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lieu Creation ID</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Document#getLieuCreationID()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_LieuCreationID();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Type</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentType()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_DocumentType();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentFormat <em>Document Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Format</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentFormat()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_DocumentFormat();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentPath <em>Document Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Path</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentPath()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_DocumentPath();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentFilename <em>Document Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Document Filename</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Document#getDocumentFilename()
	 * @see #getDocument()
	 * @generated
	 */
	EAttribute getDocument_DocumentFilename();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.Document#absoluteFilename() <em>Absolute Filename</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Absolute Filename</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Document#absoluteFilename()
	 * @generated
	 */
	EOperation getDocument__AbsoluteFilename();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.DossierSection <em>Dossier Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dossier Section</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DossierSection
	 * @generated
	 */
	EClass getDossierSection();

	/**
	 * Returns the meta object for the containment reference list '{@link dz.smartMilefe.milafete.milafeteDataModel.DossierSection#getItemList <em>Item List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Item List</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DossierSection#getItemList()
	 * @see #getDossierSection()
	 * @generated
	 */
	EReference getDossierSection_ItemList();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement <em>User Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Management</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserManagement
	 * @generated
	 */
	EClass getUserManagement();

	/**
	 * Returns the meta object for the containment reference list '{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement#getUserList <em>User List</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>User List</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserManagement#getUserList()
	 * @see #getUserManagement()
	 * @generated
	 */
	EReference getUserManagement_UserList();

	/**
	 * Returns the meta object for the reference '{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement#getConnectedUser <em>Connected User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connected User</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserManagement#getConnectedUser()
	 * @see #getUserManagement()
	 * @generated
	 */
	EReference getUserManagement_ConnectedUser();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement#addUserElement(dz.smartMilefe.milafete.milafeteDataModel.User) <em>Add User Element</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Add User Element</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserManagement#addUserElement(dz.smartMilefe.milafete.milafeteDataModel.User)
	 * @generated
	 */
	EOperation getUserManagement__AddUserElement__User();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement#userElementAt(int) <em>User Element At</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>User Element At</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserManagement#userElementAt(int)
	 * @generated
	 */
	EOperation getUserManagement__UserElementAt__int();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement#searchByUsername(java.lang.String) <em>Search By Username</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search By Username</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserManagement#searchByUsername(java.lang.String)
	 * @generated
	 */
	EOperation getUserManagement__SearchByUsername__String();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement#searchByLastname(java.lang.String) <em>Search By Lastname</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search By Lastname</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserManagement#searchByLastname(java.lang.String)
	 * @generated
	 */
	EOperation getUserManagement__SearchByLastname__String();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement#initializeUserList(dz.smartMilefe.milafete.milafeteDataModel.Institution) <em>Initialize User List</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize User List</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserManagement#initializeUserList(dz.smartMilefe.milafete.milafeteDataModel.Institution)
	 * @generated
	 */
	EOperation getUserManagement__InitializeUserList__Institution();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement#initialization() <em>Initialization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialization</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserManagement#initialization()
	 * @generated
	 */
	EOperation getUserManagement__Initialization();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement#removeUser(int) <em>Remove User</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Remove User</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserManagement#removeUser(int)
	 * @generated
	 */
	EOperation getUserManagement__RemoveUser__int();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.UserManagement#searchOneUsername(java.lang.String) <em>Search One Username</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Search One Username</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserManagement#searchOneUsername(java.lang.String)
	 * @generated
	 */
	EOperation getUserManagement__SearchOneUsername__String();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the reference '{@link dz.smartMilefe.milafete.milafeteDataModel.Action#getActionCategoy <em>Action Categoy</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action Categoy</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.Action#getActionCategoy()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_ActionCategoy();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.IAction <em>IAction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>IAction</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.IAction
	 * @generated
	 */
	EClass getIAction();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionBasket <em>Action Basket</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Basket</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionBasket
	 * @generated
	 */
	EClass getActionBasket();

	/**
	 * Returns the meta object for the reference '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionBasket#getFromBasketAction <em>From Basket Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From Basket Action</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionBasket#getFromBasketAction()
	 * @see #getActionBasket()
	 * @generated
	 */
	EReference getActionBasket_FromBasketAction();

	/**
	 * Returns the meta object for the reference '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionBasket#getIntoBasketAction <em>Into Basket Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Into Basket Action</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionBasket#getIntoBasketAction()
	 * @see #getActionBasket()
	 * @generated
	 */
	EReference getActionBasket_IntoBasketAction();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionManagement <em>Action Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Management</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionManagement
	 * @generated
	 */
	EClass getActionManagement();

	/**
	 * Returns the meta object for the reference list '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionManagement#getAllActionCategories <em>All Action Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Action Categories</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionManagement#getAllActionCategories()
	 * @see #getActionManagement()
	 * @generated
	 */
	EReference getActionManagement_AllActionCategories();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionManagement#initializeActionCategories() <em>Initialize Action Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize Action Categories</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionManagement#initializeActionCategories()
	 * @generated
	 */
	EOperation getActionManagement__InitializeActionCategories();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.BasketManagement <em>Basket Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basket Management</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketManagement
	 * @generated
	 */
	EClass getBasketManagement();

	/**
	 * Returns the meta object for the reference list '{@link dz.smartMilefe.milafete.milafeteDataModel.BasketManagement#getAllBasketCategories <em>All Basket Categories</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>All Basket Categories</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketManagement#getAllBasketCategories()
	 * @see #getBasketManagement()
	 * @generated
	 */
	EReference getBasketManagement_AllBasketCategories();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.BasketManagement#initializeBasketCategories() <em>Initialize Basket Categories</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialize Basket Categories</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketManagement#initializeBasketCategories()
	 * @generated
	 */
	EOperation getBasketManagement__InitializeBasketCategories();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.BasketCategory <em>Basket Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Basket Category</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketCategory
	 * @generated
	 */
	EClass getBasketCategory();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.BasketCategory#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketCategory#getLabel()
	 * @see #getBasketCategory()
	 * @generated
	 */
	EAttribute getBasketCategory_Label();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement <em>Application Data Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application Data Management</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement
	 * @generated
	 */
	EClass getApplicationDataManagement();

	/**
	 * Returns the meta object for the containment reference '{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getUserManagement <em>User Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>User Management</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getUserManagement()
	 * @see #getApplicationDataManagement()
	 * @generated
	 */
	EReference getApplicationDataManagement_UserManagement();

	/**
	 * Returns the meta object for the containment reference '{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getBasketManagement <em>Basket Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Basket Management</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getBasketManagement()
	 * @see #getApplicationDataManagement()
	 * @generated
	 */
	EReference getApplicationDataManagement_BasketManagement();

	/**
	 * Returns the meta object for the containment reference '{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getActionManagement <em>Action Management</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Management</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getActionManagement()
	 * @see #getApplicationDataManagement()
	 * @generated
	 */
	EReference getApplicationDataManagement_ActionManagement();

	/**
	 * Returns the meta object for the reference '{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getInstitution <em>Institution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Institution</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#getInstitution()
	 * @see #getApplicationDataManagement()
	 * @generated
	 */
	EReference getApplicationDataManagement_Institution();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#initialization() <em>Initialization</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Initialization</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#initialization()
	 * @generated
	 */
	EOperation getApplicationDataManagement__Initialization();

	/**
	 * Returns the meta object for the '{@link dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#createOneAppDataConfig() <em>Create One App Data Config</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create One App Data Config</em>' operation.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement#createOneAppDataConfig()
	 * @generated
	 */
	EOperation getApplicationDataManagement__CreateOneAppDataConfig();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionCategory <em>Action Category</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Category</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionCategory
	 * @generated
	 */
	EClass getActionCategory();

	/**
	 * Returns the meta object for the attribute '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionCategory#getActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Label</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionCategory#getActionLabel()
	 * @see #getActionCategory()
	 * @generated
	 */
	EAttribute getActionCategory_ActionLabel();

	/**
	 * Returns the meta object for class '{@link dz.smartMilefe.milafete.milafeteDataModel.BadParameterException <em>Bad Parameter Exception</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Bad Parameter Exception</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BadParameterException
	 * @generated
	 */
	EClass getBadParameterException();

	/**
	 * Returns the meta object for enum '{@link dz.smartMilefe.milafete.milafeteDataModel.AgentType <em>Agent Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Agent Type</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.AgentType
	 * @generated
	 */
	EEnum getAgentType();

	/**
	 * Returns the meta object for enum '{@link dz.smartMilefe.milafete.milafeteDataModel.DocumentType <em>Document Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Type</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DocumentType
	 * @generated
	 */
	EEnum getDocumentType();

	/**
	 * Returns the meta object for enum '{@link dz.smartMilefe.milafete.milafeteDataModel.DocumentFormat <em>Document Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Document Format</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.DocumentFormat
	 * @generated
	 */
	EEnum getDocumentFormat();

	/**
	 * Returns the meta object for enum '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionLabel <em>Action Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Label</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionLabel
	 * @generated
	 */
	EEnum getActionLabel();

	/**
	 * Returns the meta object for enum '{@link dz.smartMilefe.milafete.milafeteDataModel.BasketLabel <em>Basket Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Basket Label</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketLabel
	 * @generated
	 */
	EEnum getBasketLabel();

	/**
	 * Returns the meta object for enum '{@link dz.smartMilefe.milafete.milafeteDataModel.UserStatus <em>User Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>User Status</em>'.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.UserStatus
	 * @generated
	 */
	EEnum getUserStatus();

	/**
	 * Returns the meta object for data type '{@link java.util.Vector <em>Vector Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Vector Type</em>'.
	 * @see java.util.Vector
	 * @model instanceClass="java.util.Vector"
	 * @generated
	 */
	EDataType getVectorType();

	/**
	 * Returns the meta object for data type '{@link dz.smartMilefe.milafete.exception.BadParameterException <em>BP Exception Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>BP Exception Data Type</em>'.
	 * @see dz.smartMilefe.milafete.exception.BadParameterException
	 * @model instanceClass="dz.smartMilefe.milafete.exception.BadParameterException"
	 * @generated
	 */
	EDataType getBPExceptionDataType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	milafeteDataModelFactory getmilafeteDataModelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.UserImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Matricule</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__MATRICULE = eINSTANCE.getUser_Matricule();

		/**
		 * The meta object literal for the '<em><b>User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__USER_NAME = eINSTANCE.getUser_UserName();

		/**
		 * The meta object literal for the '<em><b>First Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__FIRST_NAME = eINSTANCE.getUser_FirstName();

		/**
		 * The meta object literal for the '<em><b>Last Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__LAST_NAME = eINSTANCE.getUser_LastName();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__EMAIL = eINSTANCE.getUser_Email();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PHONE_NUMBER = eINSTANCE.getUser_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Picture Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__PICTURE_FILENAME = eINSTANCE.getUser_PictureFilename();

		/**
		 * The meta object literal for the '<em><b>Supervisor</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__SUPERVISOR = eINSTANCE.getUser_Supervisor();

		/**
		 * The meta object literal for the '<em><b>Basket List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__BASKET_LIST = eINSTANCE.getUser_BasketList();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__INSTITUTION = eINSTANCE.getUser_Institution();

		/**
		 * The meta object literal for the '<em><b>Action List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER__ACTION_LIST = eINSTANCE.getUser_ActionList();

		/**
		 * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute USER__STATUS = eINSTANCE.getUser_Status();

		/**
		 * The meta object literal for the '<em><b>Add Basket Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___ADD_BASKET_ELEMENT__BASKET = eINSTANCE.getUser__AddBasketElement__Basket();

		/**
		 * The meta object literal for the '<em><b>Basket Element At</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___BASKET_ELEMENT_AT__INT = eINSTANCE.getUser__BasketElementAt__int();

		/**
		 * The meta object literal for the '<em><b>Add Action Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___ADD_ACTION_ELEMENT__IACTION = eINSTANCE.getUser__AddActionElement__IAction();

		/**
		 * The meta object literal for the '<em><b>Action Element At</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___ACTION_ELEMENT_AT__INT = eINSTANCE.getUser__ActionElementAt__int();

		/**
		 * The meta object literal for the '<em><b>Is Administrator</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___IS_ADMINISTRATOR = eINSTANCE.getUser__IsAdministrator();

		/**
		 * The meta object literal for the '<em><b>Is Agent</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___IS_AGENT = eINSTANCE.getUser__IsAgent();

		/**
		 * The meta object literal for the '<em><b>Authentification</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___AUTHENTIFICATION__STRING = eINSTANCE.getUser__Authentification__String();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.AgentImpl <em>Agent</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.AgentImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getAgent()
		 * @generated
		 */
		EClass AGENT = eINSTANCE.getAgent();

		/**
		 * The meta object literal for the '<em><b>Agent Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AGENT__AGENT_TYPE = eINSTANCE.getAgent_AgentType();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.AdministratorImpl <em>Administrator</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.AdministratorImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getAdministrator()
		 * @generated
		 */
		EClass ADMINISTRATOR = eINSTANCE.getAdministrator();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketImpl <em>Basket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.BasketImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBasket()
		 * @generated
		 */
		EClass BASKET = eINSTANCE.getBasket();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASKET__ID = eINSTANCE.getBasket_Id();

		/**
		 * The meta object literal for the '<em><b>Dossier List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASKET__DOSSIER_LIST = eINSTANCE.getBasket_DossierList();

		/**
		 * The meta object literal for the '<em><b>Category</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASKET__CATEGORY = eINSTANCE.getBasket_Category();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASKET__NAME = eINSTANCE.getBasket_Name();

		/**
		 * The meta object literal for the '<em><b>Action List</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASKET__ACTION_LIST = eINSTANCE.getBasket_ActionList();

		/**
		 * The meta object literal for the '<em><b>Owner User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASKET__OWNER_USER = eINSTANCE.getBasket_OwnerUser();

		/**
		 * The meta object literal for the '<em><b>Add Dossier Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASKET___ADD_DOSSIER_ELEMENT__DOSSIER = eINSTANCE.getBasket__AddDossierElement__Dossier();

		/**
		 * The meta object literal for the '<em><b>Dossier Element At</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASKET___DOSSIER_ELEMENT_AT__INT = eINSTANCE.getBasket__DossierElementAt__int();

		/**
		 * The meta object literal for the '<em><b>Add Action Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASKET___ADD_ACTION_ELEMENT__ACTIONBASKET = eINSTANCE.getBasket__AddActionElement__ActionBasket();

		/**
		 * The meta object literal for the '<em><b>Action Element At</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASKET___ACTION_ELEMENT_AT__INT = eINSTANCE.getBasket__ActionElementAt__int();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketRegularImpl <em>Basket Regular</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.BasketRegularImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBasketRegular()
		 * @generated
		 */
		EClass BASKET_REGULAR = eINSTANCE.getBasketRegular();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.InstitutionImpl <em>Institution</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.InstitutionImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getInstitution()
		 * @generated
		 */
		EClass INSTITUTION = eINSTANCE.getInstitution();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTITUTION__ID = eINSTANCE.getInstitution_Id();

		/**
		 * The meta object literal for the '<em><b>Identification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTITUTION__IDENTIFICATION = eINSTANCE.getInstitution_Identification();

		/**
		 * The meta object literal for the '<em><b>Adresse</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTITUTION__ADRESSE = eINSTANCE.getInstitution_Adresse();

		/**
		 * The meta object literal for the '<em><b>Phone Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTITUTION__PHONE_NUMBER = eINSTANCE.getInstitution_PhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSTITUTION__EMAIL = eINSTANCE.getInstitution_Email();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierImpl <em>Dossier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.DossierImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getDossier()
		 * @generated
		 */
		EClass DOSSIER = eINSTANCE.getDossier();

		/**
		 * The meta object literal for the '<em><b>Item List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSSIER__ITEM_LIST = eINSTANCE.getDossier_ItemList();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOSSIER__ID = eINSTANCE.getDossier_Id();

		/**
		 * The meta object literal for the '<em><b>Date Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOSSIER__DATE_CREATION = eINSTANCE.getDossier_DateCreation();

		/**
		 * The meta object literal for the '<em><b>Lieu Creation ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOSSIER__LIEU_CREATION_ID = eINSTANCE.getDossier_LieuCreationID();

		/**
		 * The meta object literal for the '<em><b>Lieu Residence ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOSSIER__LIEU_RESIDENCE_ID = eINSTANCE.getDossier_LieuResidenceID();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOSSIER__LABEL = eINSTANCE.getDossier_Label();

		/**
		 * The meta object literal for the '<em><b>Add Item Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOSSIER___ADD_ITEM_ELEMENT__DOSSIERITEM = eINSTANCE.getDossier__AddItemElement__DossierItem();

		/**
		 * The meta object literal for the '<em><b>Item Element At</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOSSIER___ITEM_ELEMENT_AT__INT = eINSTANCE.getDossier__ItemElementAt__int();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierItemImpl <em>Dossier Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.DossierItemImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getDossierItem()
		 * @generated
		 */
		EClass DOSSIER_ITEM = eINSTANCE.getDossierItem();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOSSIER_ITEM__ID = eINSTANCE.getDossierItem_Id();

		/**
		 * The meta object literal for the '<em><b>Dossier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSSIER_ITEM__DOSSIER = eINSTANCE.getDossierItem_Dossier();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOSSIER_ITEM__LABEL = eINSTANCE.getDossierItem_Label();

		/**
		 * The meta object literal for the '<em><b>Is Document</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOSSIER_ITEM___IS_DOCUMENT = eINSTANCE.getDossierItem__IsDocument();

		/**
		 * The meta object literal for the '<em><b>Is Dossier Section</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOSSIER_ITEM___IS_DOSSIER_SECTION = eINSTANCE.getDossierItem__IsDossierSection();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DocumentImpl <em>Document</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.DocumentImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getDocument()
		 * @generated
		 */
		EClass DOCUMENT = eINSTANCE.getDocument();

		/**
		 * The meta object literal for the '<em><b>Date Creation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DATE_CREATION = eINSTANCE.getDocument_DateCreation();

		/**
		 * The meta object literal for the '<em><b>Lieu Creation ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__LIEU_CREATION_ID = eINSTANCE.getDocument_LieuCreationID();

		/**
		 * The meta object literal for the '<em><b>Document Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DOCUMENT_TYPE = eINSTANCE.getDocument_DocumentType();

		/**
		 * The meta object literal for the '<em><b>Document Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DOCUMENT_FORMAT = eINSTANCE.getDocument_DocumentFormat();

		/**
		 * The meta object literal for the '<em><b>Document Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DOCUMENT_PATH = eINSTANCE.getDocument_DocumentPath();

		/**
		 * The meta object literal for the '<em><b>Document Filename</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT__DOCUMENT_FILENAME = eINSTANCE.getDocument_DocumentFilename();

		/**
		 * The meta object literal for the '<em><b>Absolute Filename</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOCUMENT___ABSOLUTE_FILENAME = eINSTANCE.getDocument__AbsoluteFilename();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.DossierSectionImpl <em>Dossier Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.DossierSectionImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getDossierSection()
		 * @generated
		 */
		EClass DOSSIER_SECTION = eINSTANCE.getDossierSection();

		/**
		 * The meta object literal for the '<em><b>Item List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSSIER_SECTION__ITEM_LIST = eINSTANCE.getDossierSection_ItemList();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.UserManagementImpl <em>User Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.UserManagementImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getUserManagement()
		 * @generated
		 */
		EClass USER_MANAGEMENT = eINSTANCE.getUserManagement();

		/**
		 * The meta object literal for the '<em><b>User List</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_MANAGEMENT__USER_LIST = eINSTANCE.getUserManagement_UserList();

		/**
		 * The meta object literal for the '<em><b>Connected User</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference USER_MANAGEMENT__CONNECTED_USER = eINSTANCE.getUserManagement_ConnectedUser();

		/**
		 * The meta object literal for the '<em><b>Add User Element</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_MANAGEMENT___ADD_USER_ELEMENT__USER = eINSTANCE.getUserManagement__AddUserElement__User();

		/**
		 * The meta object literal for the '<em><b>User Element At</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_MANAGEMENT___USER_ELEMENT_AT__INT = eINSTANCE.getUserManagement__UserElementAt__int();

		/**
		 * The meta object literal for the '<em><b>Search By Username</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_MANAGEMENT___SEARCH_BY_USERNAME__STRING = eINSTANCE.getUserManagement__SearchByUsername__String();

		/**
		 * The meta object literal for the '<em><b>Search By Lastname</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_MANAGEMENT___SEARCH_BY_LASTNAME__STRING = eINSTANCE.getUserManagement__SearchByLastname__String();

		/**
		 * The meta object literal for the '<em><b>Initialize User List</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_MANAGEMENT___INITIALIZE_USER_LIST__INSTITUTION = eINSTANCE.getUserManagement__InitializeUserList__Institution();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_MANAGEMENT___INITIALIZATION = eINSTANCE.getUserManagement__Initialization();

		/**
		 * The meta object literal for the '<em><b>Remove User</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_MANAGEMENT___REMOVE_USER__INT = eINSTANCE.getUserManagement__RemoveUser__int();

		/**
		 * The meta object literal for the '<em><b>Search One Username</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER_MANAGEMENT___SEARCH_ONE_USERNAME__STRING = eINSTANCE.getUserManagement__SearchOneUsername__String();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.ActionImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Action Categoy</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__ACTION_CATEGOY = eINSTANCE.getAction_ActionCategoy();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.IAction <em>IAction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.IAction
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getIAction()
		 * @generated
		 */
		EClass IACTION = eINSTANCE.getIAction();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ActionBasketImpl <em>Action Basket</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.ActionBasketImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getActionBasket()
		 * @generated
		 */
		EClass ACTION_BASKET = eINSTANCE.getActionBasket();

		/**
		 * The meta object literal for the '<em><b>From Basket Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BASKET__FROM_BASKET_ACTION = eINSTANCE.getActionBasket_FromBasketAction();

		/**
		 * The meta object literal for the '<em><b>Into Basket Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_BASKET__INTO_BASKET_ACTION = eINSTANCE.getActionBasket_IntoBasketAction();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ActionManagementImpl <em>Action Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.ActionManagementImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getActionManagement()
		 * @generated
		 */
		EClass ACTION_MANAGEMENT = eINSTANCE.getActionManagement();

		/**
		 * The meta object literal for the '<em><b>All Action Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_MANAGEMENT__ALL_ACTION_CATEGORIES = eINSTANCE.getActionManagement_AllActionCategories();

		/**
		 * The meta object literal for the '<em><b>Initialize Action Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ACTION_MANAGEMENT___INITIALIZE_ACTION_CATEGORIES = eINSTANCE.getActionManagement__InitializeActionCategories();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketManagementImpl <em>Basket Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.BasketManagementImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBasketManagement()
		 * @generated
		 */
		EClass BASKET_MANAGEMENT = eINSTANCE.getBasketManagement();

		/**
		 * The meta object literal for the '<em><b>All Basket Categories</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BASKET_MANAGEMENT__ALL_BASKET_CATEGORIES = eINSTANCE.getBasketManagement_AllBasketCategories();

		/**
		 * The meta object literal for the '<em><b>Initialize Basket Categories</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation BASKET_MANAGEMENT___INITIALIZE_BASKET_CATEGORIES = eINSTANCE.getBasketManagement__InitializeBasketCategories();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketCategoryImpl <em>Basket Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.BasketCategoryImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBasketCategory()
		 * @generated
		 */
		EClass BASKET_CATEGORY = eINSTANCE.getBasketCategory();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BASKET_CATEGORY__LABEL = eINSTANCE.getBasketCategory_Label();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ApplicationDataManagementImpl <em>Application Data Management</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.ApplicationDataManagementImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getApplicationDataManagement()
		 * @generated
		 */
		EClass APPLICATION_DATA_MANAGEMENT = eINSTANCE.getApplicationDataManagement();

		/**
		 * The meta object literal for the '<em><b>User Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_DATA_MANAGEMENT__USER_MANAGEMENT = eINSTANCE.getApplicationDataManagement_UserManagement();

		/**
		 * The meta object literal for the '<em><b>Basket Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_DATA_MANAGEMENT__BASKET_MANAGEMENT = eINSTANCE.getApplicationDataManagement_BasketManagement();

		/**
		 * The meta object literal for the '<em><b>Action Management</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_DATA_MANAGEMENT__ACTION_MANAGEMENT = eINSTANCE.getApplicationDataManagement_ActionManagement();

		/**
		 * The meta object literal for the '<em><b>Institution</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference APPLICATION_DATA_MANAGEMENT__INSTITUTION = eINSTANCE.getApplicationDataManagement_Institution();

		/**
		 * The meta object literal for the '<em><b>Initialization</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION_DATA_MANAGEMENT___INITIALIZATION = eINSTANCE.getApplicationDataManagement__Initialization();

		/**
		 * The meta object literal for the '<em><b>Create One App Data Config</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation APPLICATION_DATA_MANAGEMENT___CREATE_ONE_APP_DATA_CONFIG = eINSTANCE.getApplicationDataManagement__CreateOneAppDataConfig();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ActionCategoryImpl <em>Action Category</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.ActionCategoryImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getActionCategory()
		 * @generated
		 */
		EClass ACTION_CATEGORY = eINSTANCE.getActionCategory();

		/**
		 * The meta object literal for the '<em><b>Action Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_CATEGORY__ACTION_LABEL = eINSTANCE.getActionCategory_ActionLabel();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BadParameterExceptionImpl <em>Bad Parameter Exception</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.BadParameterExceptionImpl
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBadParameterException()
		 * @generated
		 */
		EClass BAD_PARAMETER_EXCEPTION = eINSTANCE.getBadParameterException();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.AgentType <em>Agent Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.AgentType
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getAgentType()
		 * @generated
		 */
		EEnum AGENT_TYPE = eINSTANCE.getAgentType();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.DocumentType <em>Document Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.DocumentType
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getDocumentType()
		 * @generated
		 */
		EEnum DOCUMENT_TYPE = eINSTANCE.getDocumentType();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.DocumentFormat <em>Document Format</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.DocumentFormat
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getDocumentFormat()
		 * @generated
		 */
		EEnum DOCUMENT_FORMAT = eINSTANCE.getDocumentFormat();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.ActionLabel <em>Action Label</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.ActionLabel
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getActionLabel()
		 * @generated
		 */
		EEnum ACTION_LABEL = eINSTANCE.getActionLabel();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.BasketLabel <em>Basket Label</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.BasketLabel
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBasketLabel()
		 * @generated
		 */
		EEnum BASKET_LABEL = eINSTANCE.getBasketLabel();

		/**
		 * The meta object literal for the '{@link dz.smartMilefe.milafete.milafeteDataModel.UserStatus <em>User Status</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.milafeteDataModel.UserStatus
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getUserStatus()
		 * @generated
		 */
		EEnum USER_STATUS = eINSTANCE.getUserStatus();

		/**
		 * The meta object literal for the '<em>Vector Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.util.Vector
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getVectorType()
		 * @generated
		 */
		EDataType VECTOR_TYPE = eINSTANCE.getVectorType();

		/**
		 * The meta object literal for the '<em>BP Exception Data Type</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see dz.smartMilefe.milafete.exception.BadParameterException
		 * @see dz.smartMilefe.milafete.milafeteDataModel.impl.milafeteDataModelPackageImpl#getBPExceptionDataType()
		 * @generated
		 */
		EDataType BP_EXCEPTION_DATA_TYPE = eINSTANCE.getBPExceptionDataType();

	}

} //milafeteDataModelPackage
