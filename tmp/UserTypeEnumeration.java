package dz.madania.milafete.userManagement;

import java.util.List;
import java.util.Arrays;
import java.util.Collections;

import dz.madania.milafete.utilities.IEnumerator;

/**
 * 
 * @author alikacem
 * @date 
 * @version
 *
 */
public enum UserTypeEnumeration implements IEnumerator {
	ADMINISTRATOR ( 0 , "ADMINISTRATOR" , "ADMINISTRATOR"), 
	SUPERUSER (1 , "SUPERUSER" , "SUPERUSER") , 
	USER (2 , "USER"  , "USER"); 
	
	
	public static final int ADMINISTRATOR_VALUE = 0;
	public static final int SUPERUSER_VALUE = 1;
	public static final int USER_VALUE = 2;
	
	private static final UserTypeEnumeration[] VALUES_ARRAY = new UserTypeEnumeration[] {
						ADMINISTRATOR,
						SUPERUSER,
						USER };
	
	public static final List<UserTypeEnumeration> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	private final int value;
	private final String name;
	private final String literal;
	
	/**
	 * 
	 * @param value
	 * @param name
	 * @param literal
	 */
	private UserTypeEnumeration(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}
	 
	@Override
	public String getName() {
		return name;
	}

	@Override
	public int getValue() {
		return value ;
	}

	@Override
	public String getLiteral() {
		return literal;
	}

	/**
	 * 
	 * @param name
	 * @return
	 */
	public static UserTypeEnumeration getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UserTypeEnumeration result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return literal;
	}
	
}
