package dz.smartMilefe.milafete.utilities;


/**
 * 
 * 
 * @author alikacem
 *
 */
public interface IEnumerator {
	  /**
	   * Returns the name of the enumerator.
	   * @return the name.
	   */
	  String getName();

	  /**
	   * Returns the <code>int</code>value of the enumerator.
	   * @return the value.
	   */
	  int getValue();
	  
	  /**
	   * Returns the literal value of the enumerator.
	   * @return the literal.
	   */
	  String getLiteral();

}
