package dz.madania.milafete.userManagement;

import java.util.Hashtable;


/**
 * Manage Users of the system  
 * @author alikacem
 *
 */
@Deprecated
public class UserManager {
	
	private Hashtable<String, UserInSystem> userList ;
	
	public UserManager() {
		userList = new Hashtable<String, UserInSystem>() ; 
		initUsers() ; 
	}
	
	/**
	 * Temporary method to create users 
	 */
	private void initUsers() {
		UserInSystem oneUser = null ;
		
		oneUser = new UserInSystem("MAT001", "admin", "Administrator" , UserTypeEnumeration.ADMINISTRATOR) ;
		userList.put("admin", oneUser) ;
		
		oneUser = new UserInSystem("MAT002", "elhachemi", "kacem" , UserTypeEnumeration.SUPERUSER) ;
		userList.put("elhachemi", oneUser) ;

		//oneUser = new UserInSystem("MAT002", "lh", "kacem" , UserTypeEnumeration.SUPERUSER) ;
		//userList.put("lh", oneUser) ;

		oneUser = new UserInSystem("MAT002", "qa", "kacem" , UserTypeEnumeration.SUPERUSER) ;
		userList.put("qa", oneUser) ;

	}
	
	
	/**
	 * Returns UserInSystem Object corresponding to the given username
	 * 		returns Null if not found, or username null
	 * @param userName : userName user to connect into the system
	 * @return
	 */
	public UserInSystem searchUser(String userName) {
		UserInSystem res = null ;
		if (userName != null) {
			res = userList.get(userName.toLowerCase().trim()) ;
		}
		return res ; 
	}
	/**
	 * 
	 */
	

}
