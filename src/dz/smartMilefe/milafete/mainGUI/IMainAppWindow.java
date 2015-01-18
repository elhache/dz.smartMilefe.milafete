package dz.smartMilefe.milafete.mainGUI;

import org.eclipse.swt.widgets.Shell;

import dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement;
import dz.smartMilefe.milafete.milafeteDataModel.User;


/**
 * 
 * @author alikacem
 *
 */
public interface IMainAppWindow {

	public void terminate();
	public ApplicationDataManagement getApplicationDataManagement() ; 
	public Shell getShellMilafeteWindow() ; 
	public void activateApplication(User userDescrip); 

	
}
	