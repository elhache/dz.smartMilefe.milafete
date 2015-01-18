/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.rmi.server.UID;
import java.util.Date;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import dz.smartMilefe.milafete.milafeteDataModel.ActionBasket;
import dz.smartMilefe.milafete.milafeteDataModel.ActionCategory;
import dz.smartMilefe.milafete.milafeteDataModel.ActionLabel;
import dz.smartMilefe.milafete.milafeteDataModel.ActionManagement;
import dz.smartMilefe.milafete.milafeteDataModel.Administrator;
import dz.smartMilefe.milafete.milafeteDataModel.Agent;
import dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement;
import dz.smartMilefe.milafete.milafeteDataModel.BasketCategory;
import dz.smartMilefe.milafete.milafeteDataModel.BasketLabel;
import dz.smartMilefe.milafete.milafeteDataModel.BasketManagement;
import dz.smartMilefe.milafete.milafeteDataModel.BasketRegular;
import dz.smartMilefe.milafete.milafeteDataModel.Document;
import dz.smartMilefe.milafete.milafeteDataModel.DocumentFormat;
import dz.smartMilefe.milafete.milafeteDataModel.DocumentType;
import dz.smartMilefe.milafete.milafeteDataModel.Dossier;
import dz.smartMilefe.milafete.milafeteDataModel.Institution;
import dz.smartMilefe.milafete.milafeteDataModel.User;
import dz.smartMilefe.milafete.milafeteDataModel.UserManagement;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelFactory;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Application Data Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ApplicationDataManagementImpl#getUserManagement <em>User Management</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ApplicationDataManagementImpl#getBasketManagement <em>Basket Management</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ApplicationDataManagementImpl#getActionManagement <em>Action Management</em>}</li>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ApplicationDataManagementImpl#getInstitution <em>Institution</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ApplicationDataManagementImpl extends MinimalEObjectImpl.Container implements ApplicationDataManagement {
	/**
	 * The cached value of the '{@link #getUserManagement() <em>User Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserManagement()
	 * @generated
	 * @ordered
	 */
	protected UserManagement userManagement;

	/**
	 * The cached value of the '{@link #getBasketManagement() <em>Basket Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasketManagement()
	 * @generated
	 * @ordered
	 */
	protected BasketManagement basketManagement;

	/**
	 * The cached value of the '{@link #getActionManagement() <em>Action Management</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionManagement()
	 * @generated
	 * @ordered
	 */
	protected ActionManagement actionManagement;

	/**
	 * The cached value of the '{@link #getInstitution() <em>Institution</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInstitution()
	 * @generated
	 * @ordered
	 */
	protected Institution institution;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected ApplicationDataManagementImpl() {
		super();
		milafeteDataModelFactory factory = milafeteDataModelFactory.eINSTANCE;
		actionManagement = factory.createActionManagement() ; 
		basketManagement = factory.createBasketManagement() ;
		userManagement = factory.createUserManagement(); 
		
		actionManagement.initializeActionCategories();
		basketManagement.initializeBasketCategories();
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
	 * Create one Configuration for testing purposes
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 * 
	 */
	public void createOneAppDataConfig() {
		milafeteDataModelFactory factory = milafeteDataModelFactory.eINSTANCE;
		
		institution = factory.createInstitution() ;
		institution.setId("INSTIT_ID_002601");
		institution.setIdentification("Hopital De Médéa");
		institution.setAdresse("Rue de l'hopital, Médéa");
		institution.setPhoneNumber("025562600");
		institution.setEmail("hopitalMedea@medea.dz");
		
		// Create a user, its set of baskets, its Actions, Assign a set of Files (dossier)
		userManagement.initializeUserList(institution);
		
		assignBasketsTMP(); 	
	}

	/**
	 * iunitialise Baskets (For testing)
	 * To be removed  
	 */
	private void assignBasketsTMP() {
		int nbUser = userManagement.getUserList().size(); 
		User oneUser ; 
		for (int i=0 ; i<nbUser ;i++) {
			oneUser = userManagement.userElementAt(i); 
			if (oneUser !=null) {
				if (oneUser.isAdministrator()) {
					assignBasket4AdminTMP((Administrator)oneUser);
				} else 
				if (oneUser.isAgent()){
					if (oneUser.getUserName().equals("a")) assignBasket4AgentTMP((Agent)oneUser) ;
				} else {
					System.err.println ("ApplicationDataManagementImpl::assignBasketsTMP(). User Type not Expected ");
				}
			} else {
				System.err.println ("ApplicationDataManagementImpl::assignBasketsTMP(). User Null for ind : " + i);
			}
		}
	}
	
	private void assignBasket4AgentTMP(Agent agent) {
		// Creation de 4 Baskets to the Agent 
		milafeteDataModelFactory factory = milafeteDataModelFactory.eINSTANCE;
		// BasketRegular oneBasket = null ; 
		BasketCategory basketCate = null ; // factory.createBasketRegular() ;
		
		BasketRegular toprocessBasket  = factory.createBasketRegular() ;
		toprocessBasket.setId("BASKET_ID001");
		toprocessBasket.setName("A Traiter");
		basketCate = factory.createBasketCategory() ; 
		basketCate.setLabel(BasketLabel.TO_PROCESS);
		toprocessBasket.setCategory(basketCate);
		agent.addBasketElement(toprocessBasket);
		toprocessBasket.setOwnerUser(agent);
		initFakePanier(toprocessBasket) ; 
		
		// Set Actions... 
		// assignActionsTOPROCESS(agent , oneBasket); 
		
		BasketRegular processedBasket  = factory.createBasketRegular() ;
		processedBasket.setId("BASKET_ID002");
		processedBasket.setName("Traiter");
		basketCate = factory.createBasketCategory() ; 
		basketCate.setLabel(BasketLabel.PROCESSED);
		processedBasket.setCategory(basketCate);
		agent.addBasketElement(processedBasket);
		processedBasket.setOwnerUser(agent);
		// Set Actions... 
		
		BasketRegular superviBasket = factory.createBasketRegular() ;
		superviBasket.setId("BASKET_ID003");
		superviBasket.setName("Superviseur");
		basketCate = factory.createBasketCategory() ; 
		basketCate.setLabel(BasketLabel.TO_SUPERVISOR);
		superviBasket.setCategory(basketCate);
		agent.addBasketElement(superviBasket);
		superviBasket.setOwnerUser(agent);
		// Set Actions... 
		
		BasketRegular rejectedBasket = factory.createBasketRegular() ;
		rejectedBasket.setId("BASKET_ID004");
		rejectedBasket.setName("Rejeter");
		basketCate = factory.createBasketCategory() ; 
		basketCate.setLabel(BasketLabel.REJECTED);
		rejectedBasket.setCategory(basketCate);
		agent.addBasketElement(rejectedBasket);
		rejectedBasket.setOwnerUser(agent);
		// Set Actions... 
		
		createActionBasket(agent, toprocessBasket , processedBasket, ActionLabel.COMPLETION);  
		createActionBasket(agent, toprocessBasket , rejectedBasket, ActionLabel.REJECT); 	
		createActionBasket(agent , toprocessBasket , superviBasket , ActionLabel.SUPERVISOR);
		
	}
	
	private void createActionBasket(Agent agent , BasketRegular basket , BasketRegular targetBasket , ActionLabel actionLabel) {
		milafeteDataModelFactory factory = milafeteDataModelFactory.eINSTANCE;
		// Actions  
		ActionBasket actionBask = factory.createActionBasket() ; 
		actionBask.setFromBasketAction(basket);
		actionBask.setIntoBasketAction(targetBasket);
		basket.addActionElement(actionBask);
		ActionCategory actCate = factory.createActionCategory(); 
		actCate.setActionLabel(actionLabel);
		actionBask.setActionCategoy(actCate);
		agent.addActionElement(actionBask);
	}
	
	// 
	private void initFakePanier(BasketRegular basket ) {
		milafeteDataModelFactory factory = milafeteDataModelFactory.eINSTANCE;
		int nbreDossier = 8; 
		int nbreDocu = 3 ; 
		String label ;
		Dossier newDossier ;
		Document newDocu ; 
		String docuLabel;
		String docuFilename; 
		// String path = "E:/alikacem14/EnterpriseArchiPrj/ModelingLuna/workspace/dz.madania.milafete/documentScan/" ;
		// String path = "E:/alikacem14/EnterpriseArchiPrj/ModelingLuna/workspace/dz.madania.milafete/documentScan/" ; 
		String path = "C:/alikacem/lunaModeling/workspace/dz.smartMilefe.milafete/documentScan/"; 
		// "C:/alikacem/luna/workspace/dz.madania.milafete/documentScan/" ;
		UID uid ; 
		for (int i=1 ; i<=nbreDossier ; i++) {
			label = "DossierMat_00" + i ; 
			
			newDossier = factory.createDossier();
			uid = new UID() ; 
			newDossier.setId(uid.toString());
			newDossier.setDateCreation(new Date()) ; 
			newDossier.setLieuCreationID("HOSPITAL-ID");
			newDossier.setLieuResidenceID("HOSPITAL-ID");
			newDossier.setLabel(label);
			for (int j=1 ; j<= nbreDocu ; j++) {
				docuLabel = "Etudiant"+ i + "-"+j ; 
				docuFilename = docuLabel + ".pdf"; 
				newDocu = factory.createDocument();
				uid = new UID() ;
				newDocu.setId(uid.toString());
				newDocu.setDateCreation(new Date());
				newDocu.setDocumentFormat(DocumentFormat.PDF);
				newDocu.setDocumentType(DocumentType.SCANNED);
				newDocu.setLieuCreationID("HOSPITAL-ID");
				newDocu.setDossier(newDossier);
				newDocu.setDocumentPath(path);
				newDocu.setDocumentFilename(docuFilename);
				newDocu.setLabel(docuFilename);
				newDossier.addItemElement(newDocu);
			}
			
			basket.addDossierElement(newDossier); 
		}
	}
	
	
	
	private void assignBasket4AdminTMP(Administrator admin) {
		milafeteDataModelFactory factory = milafeteDataModelFactory.eINSTANCE;
		// Creation de 3 Baskets to the 
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return milafeteDataModelPackage.Literals.APPLICATION_DATA_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserManagement getUserManagement() {
		return userManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserManagement(UserManagement newUserManagement, NotificationChain msgs) {
		UserManagement oldUserManagement = userManagement;
		userManagement = newUserManagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__USER_MANAGEMENT, oldUserManagement, newUserManagement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserManagement(UserManagement newUserManagement) {
		if (newUserManagement != userManagement) {
			NotificationChain msgs = null;
			if (userManagement != null)
				msgs = ((InternalEObject)userManagement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__USER_MANAGEMENT, null, msgs);
			if (newUserManagement != null)
				msgs = ((InternalEObject)newUserManagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__USER_MANAGEMENT, null, msgs);
			msgs = basicSetUserManagement(newUserManagement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__USER_MANAGEMENT, newUserManagement, newUserManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasketManagement getBasketManagement() {
		return basketManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBasketManagement(BasketManagement newBasketManagement, NotificationChain msgs) {
		BasketManagement oldBasketManagement = basketManagement;
		basketManagement = newBasketManagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__BASKET_MANAGEMENT, oldBasketManagement, newBasketManagement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBasketManagement(BasketManagement newBasketManagement) {
		if (newBasketManagement != basketManagement) {
			NotificationChain msgs = null;
			if (basketManagement != null)
				msgs = ((InternalEObject)basketManagement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__BASKET_MANAGEMENT, null, msgs);
			if (newBasketManagement != null)
				msgs = ((InternalEObject)newBasketManagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__BASKET_MANAGEMENT, null, msgs);
			msgs = basicSetBasketManagement(newBasketManagement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__BASKET_MANAGEMENT, newBasketManagement, newBasketManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionManagement getActionManagement() {
		return actionManagement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionManagement(ActionManagement newActionManagement, NotificationChain msgs) {
		ActionManagement oldActionManagement = actionManagement;
		actionManagement = newActionManagement;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__ACTION_MANAGEMENT, oldActionManagement, newActionManagement);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionManagement(ActionManagement newActionManagement) {
		if (newActionManagement != actionManagement) {
			NotificationChain msgs = null;
			if (actionManagement != null)
				msgs = ((InternalEObject)actionManagement).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__ACTION_MANAGEMENT, null, msgs);
			if (newActionManagement != null)
				msgs = ((InternalEObject)newActionManagement).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__ACTION_MANAGEMENT, null, msgs);
			msgs = basicSetActionManagement(newActionManagement, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__ACTION_MANAGEMENT, newActionManagement, newActionManagement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Institution getInstitution() {
		if (institution != null && institution.eIsProxy()) {
			InternalEObject oldInstitution = (InternalEObject)institution;
			institution = (Institution)eResolveProxy(oldInstitution);
			if (institution != oldInstitution) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__INSTITUTION, oldInstitution, institution));
			}
		}
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Institution basicGetInstitution() {
		return institution;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstitution(Institution newInstitution) {
		Institution oldInstitution = institution;
		institution = newInstitution;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__INSTITUTION, oldInstitution, institution));
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__USER_MANAGEMENT:
				return basicSetUserManagement(null, msgs);
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__BASKET_MANAGEMENT:
				return basicSetBasketManagement(null, msgs);
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__ACTION_MANAGEMENT:
				return basicSetActionManagement(null, msgs);
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
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__USER_MANAGEMENT:
				return getUserManagement();
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__BASKET_MANAGEMENT:
				return getBasketManagement();
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__ACTION_MANAGEMENT:
				return getActionManagement();
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__INSTITUTION:
				if (resolve) return getInstitution();
				return basicGetInstitution();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__USER_MANAGEMENT:
				setUserManagement((UserManagement)newValue);
				return;
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__BASKET_MANAGEMENT:
				setBasketManagement((BasketManagement)newValue);
				return;
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__ACTION_MANAGEMENT:
				setActionManagement((ActionManagement)newValue);
				return;
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__INSTITUTION:
				setInstitution((Institution)newValue);
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
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__USER_MANAGEMENT:
				setUserManagement((UserManagement)null);
				return;
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__BASKET_MANAGEMENT:
				setBasketManagement((BasketManagement)null);
				return;
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__ACTION_MANAGEMENT:
				setActionManagement((ActionManagement)null);
				return;
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__INSTITUTION:
				setInstitution((Institution)null);
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
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__USER_MANAGEMENT:
				return userManagement != null;
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__BASKET_MANAGEMENT:
				return basketManagement != null;
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__ACTION_MANAGEMENT:
				return actionManagement != null;
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT__INSTITUTION:
				return institution != null;
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
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT___INITIALIZATION:
				initialization();
				return null;
			case milafeteDataModelPackage.APPLICATION_DATA_MANAGEMENT___CREATE_ONE_APP_DATA_CONFIG:
				createOneAppDataConfig();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ApplicationDataManagementImpl
