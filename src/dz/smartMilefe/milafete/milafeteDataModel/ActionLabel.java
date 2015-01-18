/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Label</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getActionLabel()
 * @model
 * @generated
 */
public enum ActionLabel implements Enumerator {
	/**
	 * The '<em><b>INDEFINED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INDEFINED_VALUE
	 * @generated
	 * @ordered
	 */
	INDEFINED(0, "INDEFINED", "INDEFINED"),

	/**
	 * The '<em><b>COMPLETION</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPLETION_VALUE
	 * @generated
	 * @ordered
	 */
	COMPLETION(1, "COMPLETION", "COMPLETION"),

	/**
	 * The '<em><b>SUPERVISOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUPERVISOR_VALUE
	 * @generated
	 * @ordered
	 */
	SUPERVISOR(2, "SUPERVISOR", "SUPERVISOR"),

	/**
	 * The '<em><b>REJECT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT(3, "REJECT", "REJECT"), /**
	 * The '<em><b>INCOMPLETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCOMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	INCOMPLETE(4, "INCOMPLETE", "INCOMPLETE");

	/**
	 * The '<em><b>INDEFINED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INDEFINED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INDEFINED_VALUE = 0;

	/**
	 * The '<em><b>COMPLETION</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COMPLETION</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPLETION
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int COMPLETION_VALUE = 1;

	/**
	 * The '<em><b>SUPERVISOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>SUPERVISOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUPERVISOR
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int SUPERVISOR_VALUE = 2;

	/**
	 * The '<em><b>REJECT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REJECT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_VALUE = 3;

	/**
	 * The '<em><b>INCOMPLETE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>INCOMPLETE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #INCOMPLETE
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int INCOMPLETE_VALUE = 4;

	/**
	 * An array of all the '<em><b>Action Label</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionLabel[] VALUES_ARRAY =
		new ActionLabel[] {
			INDEFINED,
			COMPLETION,
			SUPERVISOR,
			REJECT,
			INCOMPLETE,
		};

	/**
	 * A public read-only list of all the '<em><b>Action Label</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionLabel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Label</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionLabel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionLabel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Label</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionLabel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionLabel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Label</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionLabel get(int value) {
		switch (value) {
			case INDEFINED_VALUE: return INDEFINED;
			case COMPLETION_VALUE: return COMPLETION;
			case SUPERVISOR_VALUE: return SUPERVISOR;
			case REJECT_VALUE: return REJECT;
			case INCOMPLETE_VALUE: return INCOMPLETE;
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
	private ActionLabel(int value, String name, String literal) {
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
	
} //ActionLabel
