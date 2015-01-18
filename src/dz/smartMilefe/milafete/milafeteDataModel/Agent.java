/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Agent</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link dz.smartMilefe.milafete.milafeteDataModel.Agent#getAgentType <em>Agent Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getAgent()
 * @model
 * @generated
 */
public interface Agent extends User {

	/**
	 * Returns the value of the '<em><b>Agent Type</b></em>' attribute.
	 * The literals are from the enumeration {@link dz.smartMilefe.milafete.milafeteDataModel.AgentType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Agent Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Agent Type</em>' attribute.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.AgentType
	 * @see #setAgentType(AgentType)
	 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getAgent_AgentType()
	 * @model
	 * @generated
	 */
	AgentType getAgentType();

	/**
	 * Sets the value of the '{@link dz.smartMilefe.milafete.milafeteDataModel.Agent#getAgentType <em>Agent Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Agent Type</em>' attribute.
	 * @see dz.smartMilefe.milafete.milafeteDataModel.AgentType
	 * @see #getAgentType()
	 * @generated
	 */
	void setAgentType(AgentType value);
} // Agent
