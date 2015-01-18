/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import dz.smartMilefe.milafete.milafeteDataModel.ActionCategory;
import dz.smartMilefe.milafete.milafeteDataModel.ActionLabel;
import dz.smartMilefe.milafete.milafeteDataModel.ActionManagement;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelFactory;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.ActionManagementImpl#getAllActionCategories <em>All Action Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ActionManagementImpl extends MinimalEObjectImpl.Container implements ActionManagement {
	/**
	 * The cached value of the '{@link #getAllActionCategories() <em>All Action Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllActionCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<ActionCategory> allActionCategories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	protected ActionManagementImpl() {
		super();
		allActionCategories = new BasicEList<ActionCategory>() ; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return milafeteDataModelPackage.Literals.ACTION_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ActionCategory> getAllActionCategories() {
		if (allActionCategories == null) {
			allActionCategories = new EObjectResolvingEList<ActionCategory>(ActionCategory.class, this, milafeteDataModelPackage.ACTION_MANAGEMENT__ALL_ACTION_CATEGORIES);
		}
		return allActionCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT 
	 */
	public void initializeActionCategories() {
		
		milafeteDataModelFactory factory = milafeteDataModelFactory.eINSTANCE;
		ActionCategory oneActionCat = null; 
		
		ActionLabel[] actionLabels = ActionLabel.values();
		for (ActionLabel oneActLabel : actionLabels) {
			oneActionCat = factory.createActionCategory();  
			oneActionCat.setActionLabel(oneActLabel);
			allActionCategories.add(oneActionCat);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case milafeteDataModelPackage.ACTION_MANAGEMENT__ALL_ACTION_CATEGORIES:
				return getAllActionCategories();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case milafeteDataModelPackage.ACTION_MANAGEMENT__ALL_ACTION_CATEGORIES:
				getAllActionCategories().clear();
				getAllActionCategories().addAll((Collection<? extends ActionCategory>)newValue);
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
			case milafeteDataModelPackage.ACTION_MANAGEMENT__ALL_ACTION_CATEGORIES:
				getAllActionCategories().clear();
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
			case milafeteDataModelPackage.ACTION_MANAGEMENT__ALL_ACTION_CATEGORIES:
				return allActionCategories != null && !allActionCategories.isEmpty();
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
			case milafeteDataModelPackage.ACTION_MANAGEMENT___INITIALIZE_ACTION_CATEGORIES:
				initializeActionCategories();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //ActionManagementImpl
