/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Agent Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getAgentType()
 * @model
 * @generated
 */
public enum AgentType implements Enumerator {
	/**
	 * The '<em><b>AGENT REGULIER</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGENT_REGULIER_VALUE
	 * @generated
	 * @ordered
	 */
	AGENT_REGULIER(1, "AGENT_REGULIER", "AGENT_REGULIER"),

	/**
	 * The '<em><b>AGENT PREVILEGE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AGENT_PREVILEGE_VALUE
	 * @generated
	 * @ordered
	 */
	AGENT_PREVILEGE(2, "AGENT_PREVILEGE", "AGENT_PREVILEGE");

	/**
	 * The '<em><b>AGENT REGULIER</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AGENT REGULIER</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGENT_REGULIER
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGENT_REGULIER_VALUE = 1;

	/**
	 * The '<em><b>AGENT PREVILEGE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>AGENT PREVILEGE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AGENT_PREVILEGE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int AGENT_PREVILEGE_VALUE = 2;

	/**
	 * An array of all the '<em><b>Agent Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AgentType[] VALUES_ARRAY =
		new AgentType[] {
			AGENT_REGULIER,
			AGENT_PREVILEGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Agent Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AgentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Agent Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AgentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AgentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Agent Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AgentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AgentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Agent Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AgentType get(int value) {
		switch (value) {
			case AGENT_REGULIER_VALUE: return AGENT_REGULIER;
			case AGENT_PREVILEGE_VALUE: return AGENT_PREVILEGE;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AgentType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //AgentType
