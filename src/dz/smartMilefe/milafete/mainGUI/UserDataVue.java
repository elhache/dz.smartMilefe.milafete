package dz.smartMilefe.milafete.mainGUI;

import java.util.Vector;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Widget;

import dz.smartMilefe.milafete.milafeteDataModel.Basket;
import dz.smartMilefe.milafete.milafeteDataModel.User;

/**
 * Holds data related to the user's vue.
 * 
 * @author alikacem
 *
 */
public class UserDataVue {

	public static String[] basketIconFilenameTab = {
		"icon/Folder-Adobe-Bridge-01-icon.png",
		"icon/Folder-Adobe-Dream-icon.png",
		"icon/Folder-Adobe-Flash-01-icon.png",
		"icon/Folder-Adobe-In-Design-01-icon.png",
		"icon/Folder-Adobe-In-Design-01-icon.png",
		"icon/Folder-Adobe-In-Design-01-icon.png",
		"icon/Folder-Adobe-In-Design-01-icon.png",
		"icon/Folder-Adobe-In-Design-01-icon.png",
		"icon/Folder-Adobe-In-Design-01-icon.png",
		"icon/Folder-Adobe-In-Design-01-icon.png"
	};
	
	private UserBasketPanel userBasketPanel ; 
	private User modelUser ; 
	// private Button[] buttonTab ; 
	private BasketVue[] basketVueTab; // new Vector<BasketVue>() ; 
	
	private int selectedBasketVueInd=-1 ; // indice of the Selected Basket on the GUI
	public UserDataVue(User _modelUser) {
		modelUser = _modelUser ;
	}
	
	public void initialization() {
		// buttonTab = null ; 
		basketVueTab = null ; 
		selectedBasketVueInd = -1 ; 
	}
	
	public void setUserBasketPanel(UserBasketPanel userBasketPanel) {
		this.userBasketPanel = userBasketPanel;
	}



	public int nbreOfBaskets() {
		int res = 0 ;
		if (modelUser != null) {
			res = modelUser.getBasketList().size();
		}
		return res ;
	}
	public User getModelUser() {
		return modelUser;
	}

	/**
	 * Creates Button corresponding to Baskets 
	 * @param composite
	 */
	public void prepareBasket(Composite composite) {
		Display display = Display.getDefault();
		int nbBasket = modelUser.getBasketList().size();
		// buttonTab = new Button[nbBasket];
		basketVueTab = new BasketVue[nbBasket];
		BasketVue oneBasketVue ;
		int nbIcons =basketIconFilenameTab.length ;
		int iconInd = 0; 
		for (int i=0 ; i<nbBasket ; i++) {
			Basket oneBasket = modelUser.basketElementAt(i) ;
			iconInd = i ;  
			oneBasketVue = new BasketVue() ; 
			
		    if (iconInd >= nbIcons) iconInd = nbIcons -1 ; 
			Button oneButton = new Button(composite, SWT.NONE);
			Image imageBtnTab = new Image(display, basketIconFilenameTab[iconInd]) ;
			oneButton.setImage(imageBtnTab);
			
			GridData gd_buttonTab = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
			gd_buttonTab.widthHint = 90;
			gd_buttonTab.heightHint = 75;
			oneButton.setLayoutData(gd_buttonTab);
			oneButton.setData(oneBasket.getName());
			
			oneBasketVue.setBasketControl(oneButton);
			oneBasketVue.setIconFilename(basketIconFilenameTab[iconInd]);
			oneBasketVue.setModelBasket(oneBasket);
			oneBasketVue.setName(oneBasket.getName());
			
			basketVueTab[i] = oneBasketVue ; 
			
			oneButton.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					processClickOnBasket(e) ; 
				}
			});
		}
	}
	/**
	 * Process a click on a Basket. Identify which basket (clicked on) and display contents  
	 * @param e
	 */
	private void processClickOnBasket(SelectionEvent e){
		Widget widget = e.widget ; 
		int nbBaskets=basketVueTab.length;
		BasketVue oneBasketVue = null; 
		int selectedBask = -1 ; 
		for (int i=0 ; i<nbBaskets ; i++) {
			oneBasketVue = basketVueTab[i] ; 
			if (widget == oneBasketVue.getBasketControl()) {
				selectedBask = i ; 
				break ; 
			}
		}
		if (selectedBask != -1 && selectedBask != selectedBasketVueInd) {
			System.out.println("\tIndice : " + (selectedBask+1) ) ;	
			// Remove Previous Tree  
			userBasketPanel.processBasketSelection(basketVueTab[selectedBask]); 
			selectedBasketVueInd = selectedBask ;
		}
	}
	
	
}
