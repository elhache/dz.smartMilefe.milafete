package dz.madania.milafete.userManagement;


/**
 * Models a User of the application 
 * 
 * @author alikacem
 *
 */
public class UserInSystem {
	private String matricule ; 
	private String userName ; // name used for connection  
	private String lastName ;
	private UserTypeEnumeration userType ; // Type of the user 
	
	
	public UserInSystem(String _matricule , String _username , String _lastName , UserTypeEnumeration _userType )  {
		matricule = _matricule ; 
		userName = _username ;
		lastName = _lastName ; 
		userType = _userType ; 
	}
	
	public String getMatricule() {
		return matricule;
	}
	
	/**
	 * 
	 * @return
	 */
	public UserTypeEnumeration getUserType() {
		return userType;
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		UserTypeEnumeration re = UserTypeEnumeration.ADMINISTRATOR ; 
		System.out.println ("Name : " + re.getName() ); 
		System.out.println ("Literal : " + re.getLiteral()) ; 
		System.out.println ("Value : " + re.getValue() ); 

		UserTypeEnumeration rep = UserTypeEnumeration.SUPERUSER ;
		if (re.getValue() == rep.getValue()) {
			System.out.println ("Equal Value  : " + re.getName() );
		} else {
			System.out.println ("NOT Equal Value  : " + re.getName() );
		}

	}
}
