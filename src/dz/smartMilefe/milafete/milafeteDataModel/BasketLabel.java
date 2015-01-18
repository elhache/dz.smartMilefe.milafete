/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Basket Label</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getBasketLabel()
 * @model
 * @generated
 */
public enum BasketLabel implements Enumerator {
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
	 * The '<em><b>PROCESSED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROCESSED_VALUE
	 * @generated
	 * @ordered
	 */
	PROCESSED(1, "PROCESSED", "PROCESSED"),

	/**
	 * The '<em><b>INCOMPLETE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #INCOMPLETE_VALUE
	 * @generated
	 * @ordered
	 */
	INCOMPLETE(2, "INCOMPLETE", "INCOMPLETE"),

	/**
	 * The '<em><b>REJECTED</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECTED_VALUE
	 * @generated
	 * @ordered
	 */
	REJECTED(3, "REJECTED", "REJECTED"),

	/**
	 * The '<em><b>To SUPERVISOR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_SUPERVISOR_VALUE
	 * @generated
	 * @ordered
	 */
	TO_SUPERVISOR(4, "ToSUPERVISOR", "ToSUPERVISOR"),

	/**
	 * The '<em><b>To PROCESS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TO_PROCESS_VALUE
	 * @generated
	 * @ordered
	 */
	TO_PROCESS(5, "ToPROCESS", "ToPROCESS"),

	/**
	 * The '<em><b>CONFIDENTIAL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIAL_VALUE
	 * @generated
	 * @ordered
	 */
	CONFIDENTIAL(6, "CONFIDENTIAL", "CONFIDENTIAL");

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
	 * The '<em><b>PROCESSED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PROCESSED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROCESSED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PROCESSED_VALUE = 1;

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
	public static final int INCOMPLETE_VALUE = 2;

	/**
	 * The '<em><b>REJECTED</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>REJECTED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECTED
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int REJECTED_VALUE = 3;

	/**
	 * The '<em><b>To SUPERVISOR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To SUPERVISOR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_SUPERVISOR
	 * @model name="ToSUPERVISOR"
	 * @generated
	 * @ordered
	 */
	public static final int TO_SUPERVISOR_VALUE = 4;

	/**
	 * The '<em><b>To PROCESS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>To PROCESS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TO_PROCESS
	 * @model name="ToPROCESS"
	 * @generated
	 * @ordered
	 */
	public static final int TO_PROCESS_VALUE = 5;

	/**
	 * The '<em><b>CONFIDENTIAL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CONFIDENTIAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONFIDENTIAL
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int CONFIDENTIAL_VALUE = 6;

	/**
	 * An array of all the '<em><b>Basket Label</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BasketLabel[] VALUES_ARRAY =
		new BasketLabel[] {
			INDEFINED,
			PROCESSED,
			INCOMPLETE,
			REJECTED,
			TO_SUPERVISOR,
			TO_PROCESS,
			CONFIDENTIAL,
		};

	/**
	 * A public read-only list of all the '<em><b>Basket Label</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BasketLabel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Basket Label</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasketLabel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasketLabel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basket Label</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasketLabel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasketLabel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basket Label</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasketLabel get(int value) {
		switch (value) {
			case INDEFINED_VALUE: return INDEFINED;
			case PROCESSED_VALUE: return PROCESSED;
			case INCOMPLETE_VALUE: return INCOMPLETE;
			case REJECTED_VALUE: return REJECTED;
			case TO_SUPERVISOR_VALUE: return TO_SUPERVISOR;
			case TO_PROCESS_VALUE: return TO_PROCESS;
			case CONFIDENTIAL_VALUE: return CONFIDENTIAL;
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
	private BasketLabel(int value, String name, String literal) {
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
	
} //BasketLabel
