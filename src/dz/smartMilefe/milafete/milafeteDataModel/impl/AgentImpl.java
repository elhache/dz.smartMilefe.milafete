/**
 */
package dz.smartMilefe.milafete.milafeteDataModel.impl;

import dz.smartMilefe.milafete.milafeteDataModel.Agent;
import dz.smartMilefe.milafete.milafeteDataModel.AgentType;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.impl.AgentImpl#getAgentType <em>Agent Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AgentImpl extends UserImpl implements Agent {
	/**
	 * The default value of the '{@link #getAgentType() <em>Agent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentType()
	 * @generated
	 * @ordered
	 */
	protected static final AgentType AGENT_TYPE_EDEFAULT = AgentType.AGENT_REGULIER;
	/**
	 * The cached value of the '{@link #getAgentType() <em>Agent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAgentType()
	 * @generated
	 * @ordered
	 */
	protected AgentType agentType = AGENT_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AgentImpl() {
		super();
	}

	@Override
	public boolean isAgent() {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return milafeteDataModelPackage.Literals.AGENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AgentType getAgentType() {
		return agentType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAgentType(AgentType newAgentType) {
		AgentType oldAgentType = agentType;
		agentType = newAgentType == null ? AGENT_TYPE_EDEFAULT : newAgentType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, milafeteDataModelPackage.AGENT__AGENT_TYPE, oldAgentType, agentType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case milafeteDataModelPackage.AGENT__AGENT_TYPE:
				return getAgentType();
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
			case milafeteDataModelPackage.AGENT__AGENT_TYPE:
				setAgentType((AgentType)newValue);
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
			case milafeteDataModelPackage.AGENT__AGENT_TYPE:
				setAgentType(AGENT_TYPE_EDEFAULT);
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
			case milafeteDataModelPackage.AGENT__AGENT_TYPE:
				return agentType != AGENT_TYPE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (agentType: ");
		result.append(agentType);
		result.append(')');
		return result.toString();
	}

} //AgentImpl
