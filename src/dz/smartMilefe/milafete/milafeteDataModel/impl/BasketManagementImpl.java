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

import dz.smartMilefe.milafete.milafeteDataModel.BasketCategory;
import dz.smartMilefe.milafete.milafeteDataModel.BasketLabel;
import dz.smartMilefe.milafete.milafeteDataModel.BasketManagement;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelFactory;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Basket Management</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.BasketManagementImpl#getAllBasketCategories <em>All Basket Categories</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BasketManagementImpl extends MinimalEObjectImpl.Container implements BasketManagement {
	/**
	 * The cached value of the '{@link #getAllBasketCategories() <em>All Basket Categories</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAllBasketCategories()
	 * @generated
	 * @ordered
	 */
	protected EList<BasketCategory> allBasketCategories;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	protected BasketManagementImpl() {
		super();
		allBasketCategories = new BasicEList<BasketCategory>() ; 
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return milafeteDataModelPackage.Literals.BASKET_MANAGEMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasketCategory> getAllBasketCategories() {
		if (allBasketCategories == null) {
			allBasketCategories = new EObjectResolvingEList<BasketCategory>(BasketCategory.class, this, milafeteDataModelPackage.BASKET_MANAGEMENT__ALL_BASKET_CATEGORIES);
		}
		return allBasketCategories;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public void initializeBasketCategories() {
		milafeteDataModelFactory factory = milafeteDataModelFactory.eINSTANCE;
		BasketCategory oneBasketCat = null ;
		BasketLabel[] allBasketLabels= BasketLabel.values() ;
		
		for (BasketLabel oneBaskLabel : allBasketLabels) {
			oneBasketCat = factory.createBasketCategory();
			oneBasketCat.setLabel(oneBaskLabel);
			allBasketCategories.add(oneBasketCat);
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
			case milafeteDataModelPackage.BASKET_MANAGEMENT__ALL_BASKET_CATEGORIES:
				return getAllBasketCategories();
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
			case milafeteDataModelPackage.BASKET_MANAGEMENT__ALL_BASKET_CATEGORIES:
				getAllBasketCategories().clear();
				getAllBasketCategories().addAll((Collection<? extends BasketCategory>)newValue);
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
			case milafeteDataModelPackage.BASKET_MANAGEMENT__ALL_BASKET_CATEGORIES:
				getAllBasketCategories().clear();
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
			case milafeteDataModelPackage.BASKET_MANAGEMENT__ALL_BASKET_CATEGORIES:
				return allBasketCategories != null && !allBasketCategories.isEmpty();
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
			case milafeteDataModelPackage.BASKET_MANAGEMENT___INITIALIZE_BASKET_CATEGORIES:
				initializeBasketCategories();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //BasketManagementImpl
