package dz.madania.milafete.mainGUI;

import dz.madania.milafete.userManagement.PanierManager;
import dz.madania.milafete.userManagement.UserInSystem;
import dz.madania.milafete.userManagement.UserManager;

@Deprecated
public class ApplicationDataHolder {
	
	private UserManager userManager ; 
	private PanierManager panierManager ;
	
	
	public ApplicationDataHolder() {
		userManager = new UserManager() ; 
		panierManager = new PanierManager(); 
	}


	public PanierManager getPanierManager() {
		return panierManager;
	}


	public UserManager getUserManager() {
		return userManager;
	}
	
	public UserInSystem retreiveUser(String userName) {
		return userManager.searchUser(userName); 
	}
	
}
