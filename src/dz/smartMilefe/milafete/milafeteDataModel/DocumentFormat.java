/**
 */
package dz.smartMilefe.milafete.milafeteDataModel;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Document Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelPackage#getDocumentFormat()
 * @model
 * @generated
 */
public enum DocumentFormat implements Enumerator {
	/**
	 * The '<em><b>PDF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PDF_VALUE
	 * @generated
	 * @ordered
	 */
	PDF(1, "PDF", "PDF"),

	/**
	 * The '<em><b>JPG</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #JPG_VALUE
	 * @generated
	 * @ordered
	 */
	JPG(2, "JPG", "JPG"),

	/**
	 * The '<em><b>GIF</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GIF_VALUE
	 * @generated
	 * @ordered
	 */
	GIF(3, "GIF", "GIF");

	/**
	 * The '<em><b>PDF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PDF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PDF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int PDF_VALUE = 1;

	/**
	 * The '<em><b>JPG</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JPG</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #JPG
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int JPG_VALUE = 2;

	/**
	 * The '<em><b>GIF</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>GIF</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GIF
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int GIF_VALUE = 3;

	/**
	 * An array of all the '<em><b>Document Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DocumentFormat[] VALUES_ARRAY =
		new DocumentFormat[] {
			PDF,
			JPG,
			GIF,
		};

	/**
	 * A public read-only list of all the '<em><b>Document Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DocumentFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Document Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocumentFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocumentFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DocumentFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Document Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocumentFormat get(int value) {
		switch (value) {
			case PDF_VALUE: return PDF;
			case JPG_VALUE: return JPG;
			case GIF_VALUE: return GIF;
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
	private DocumentFormat(int value, String name, String literal) {
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
	
} //DocumentFormat
