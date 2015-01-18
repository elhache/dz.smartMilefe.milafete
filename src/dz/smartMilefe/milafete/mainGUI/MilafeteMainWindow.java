package dz.smartMilefe.milafete.mainGUI;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.MenuItem;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.ToolBar;
import org.eclipse.swt.widgets.ToolItem;

import swing2swt.layout.BorderLayout;
import dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement;
import dz.smartMilefe.milafete.milafeteDataModel.User;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelFactory;

/**
 * Class implementing the Main  window of the Application 
 * @author alikacem
 *
 */

public class MilafeteMainWindow implements IMainAppWindow {
// file://C:/alikacem/luna/workspace/dz.madania.milafete/documentScan/
//file://C:\alikacem\luna\workspace\dz.madania.milafete\documentScan\Etudiant1-1.pdf
	
	public static final boolean SKIPConnection = true ;
	private ApplicationDataManagement applicationDataManagement ; 
	protected Shell shellMilafeteWindow;
	private Menu mainMenuBar ; 
	private Composite centralComposite; 
	private UserDataVue userDataVue ; 
	
	private UserBasketPanel userBasketPanel ; 
	
	
	public void initialization() {
		userBasketPanel = null ; 
	}

	public ApplicationDataManagement getApplicationDataManagement() {
		return applicationDataManagement;
	}

	public void setApplicationDataManagement(
			ApplicationDataManagement applicationDataManagement) {
		this.applicationDataManagement = applicationDataManagement;
	}

	public Shell getShellMilafeteWindow() {
		return shellMilafeteWindow;
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		// shellMilafeteWindow.setLocation(200, 200);
		shellMilafeteWindow.open();
		shellMilafeteWindow.layout();
		createConnectionWindow() ; 
		while (!shellMilafeteWindow.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}
	
	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		Display display = Display.getDefault();
		shellMilafeteWindow = new Shell();
		shellMilafeteWindow.setEnabled(false);
		shellMilafeteWindow.setSize(800, 650);
		shellMilafeteWindow.setLocation(200, 200);
		shellMilafeteWindow.setText("Milafete Software - Madania 2014 (c)");
		shellMilafeteWindow.setLayout(new BorderLayout(0, 0));
		
		mainMenuBar = new Menu(shellMilafeteWindow, SWT.BAR);
		shellMilafeteWindow.setMenuBar(mainMenuBar);
		
		noConnexionMenu() ; 
		
		ToolBar toolBar = new ToolBar(shellMilafeteWindow, SWT.BORDER | SWT.WRAP | SWT.RIGHT);
		toolBar.setEnabled(true);
		toolBar.setLayoutData(BorderLayout.NORTH);
		
		ToolItem tltmNewItem = new ToolItem(toolBar, SWT.PUSH);
		// tltmNewItem.setImage(ResourceManager.getPluginImage("dz.madania.milafete.mainFstGui", "icon/NewPrj.png"));
		// tltmNewItem.setText("icone1");
		Image imageBtn1 = new Image(display, "icon/NewPrj.png");
		tltmNewItem.setImage(imageBtn1); 
		
		// tltmNewItem.setDisabledImage(ResourceManager.getPluginImage("dz.madania.milafete.mainFstGui", "icon/NewPrj.png"));
		tltmNewItem.setEnabled(true);
		
		ToolItem tltmNewItem_1 = new ToolItem(toolBar, SWT.NONE);
		Image imageBtn2 = new Image(display, "icon/CodeGen.png");
		tltmNewItem_1.setImage(imageBtn2); 
		tltmNewItem_1.setEnabled(true);
		// tltmNewItem_1.setText("New Item");
		
		ToolItem tltmNewItem_2 = new ToolItem(toolBar, SWT.NONE);
		Image imageBtn3 = new Image(display, "icon/TestGen.png");
		tltmNewItem_2.setImage(imageBtn3); 
		tltmNewItem_2.setEnabled(true);
		// tltmNewItem_2.setText("New Item");
		
		centralComposite = new Composite(shellMilafeteWindow, SWT.NONE);
		centralComposite.setLayoutData(BorderLayout.CENTER);
		centralComposite.setLayout(new BorderLayout(5, 5));

	}

	/**
	 * 
	 */
	private void noConnexionMenu() {
		
		MenuItem mntmDeconexion = new MenuItem(mainMenuBar, SWT.NONE);
		mntmDeconexion.setText("Deconnexion");
		
		MenuItem mntmQuit = new MenuItem(mainMenuBar, SWT.NONE);
		mntmQuit.setText("Quit");
		
	}
	
	/**
	 * Create contents of the window.
	 */
	private void createContents4Administrator() {
		
		MenuItem mntmUtilisateur = new MenuItem(mainMenuBar, SWT.CASCADE);
		mntmUtilisateur.setText("Utilisateur");
		
		Menu menu_1 = new Menu(mntmUtilisateur);
		mntmUtilisateur.setMenu(menu_1);
		
		MenuItem mntmNouveau = new MenuItem(menu_1, SWT.NONE);
		mntmNouveau.setText("Nouveau");
		
		MenuItem mntmProfile = new MenuItem(menu_1, SWT.NONE);
		mntmProfile.setText("Profile");
		
		MenuItem mntmDroitsDacces = new MenuItem(mainMenuBar, SWT.CASCADE);
		mntmDroitsDacces.setText("Droits D'acces");
		
		Menu menu_2 = new Menu(mntmDroitsDacces);
		mntmDroitsDacces.setMenu(menu_2);
		
		MenuItem mntmDroits = new MenuItem(menu_2, SWT.NONE);
		mntmDroits.setText("Droits");
		
		MenuItem mntmQuit = new MenuItem(mainMenuBar, SWT.NONE);
		mntmQuit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				terminate() ; 
			}
		});
		mntmQuit.setText("Quit");

	}
	
	/**
	 * Create contents of the window.
	 */
	private void createContents4User() {
		
		// Panier Option
		MenuItem mntmPanier = new MenuItem(mainMenuBar, SWT.NONE);
		mntmPanier.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				doMesPaniers() ; 
			}
		});
		mntmPanier.setText("Mes Paniers");

		
		// Profile Option
		MenuItem mntmMyProfile = new MenuItem(mainMenuBar, SWT.NONE);
		mntmMyProfile.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				doMonProfile() ; 
			}
		});
		mntmMyProfile.setText("Mon Profile");

		
		// Deconnexion Option
		MenuItem mntmDeconnect = new MenuItem(mainMenuBar, SWT.NONE);
		mntmDeconnect.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				deconnexion() ; 
			}
		});
		mntmDeconnect.setText("Deconnexion");

		
		// Quit Option
		MenuItem mntmQuit = new MenuItem(mainMenuBar, SWT.NONE);
		mntmQuit.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				terminate() ; 
			}
		});
		
		mntmQuit.setText("Quit");

	}

	/**
	 * 
	 */
	private void createConnectionWindow() {
		// Display display = Display.getDefault();
		ConnectionWindow connectWindow = new ConnectionWindow(shellMilafeteWindow , this);
		connectWindow.setLocation(350, 350);
		connectWindow.open();
		connectWindow.layout();
		
		if (SKIPConnection) {
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				e.printStackTrace();
			}
			connectWindow.skipConnection("a" , "a"); 
		}
		
	}


	private boolean switchToMesPaniers() {
		boolean res = false ;
		if (userBasketPanel == null) {
			res = true ; 
			// ADD HERE:
			//	Set to NULL other references to Panels 
			
		}
		return res;
	}
    /**
     * Display the panel when Mes Paniers menu Item is selected ...
     * 
     */
	private void doMesPaniers() {
		
		if (!switchToMesPaniers()) return ; 
		userBasketPanel = new UserBasketPanel(centralComposite,  SWT.NONE , applicationDataManagement , userDataVue) ;
		userBasketPanel.setLayoutData(BorderLayout.CENTER);
		// userPanel.setSize(700, 600);
		userBasketPanel.layout();
		userBasketPanel.pack();
		shellMilafeteWindow.setSize(1000, 850);
		
		centralComposite.layout();
		shellMilafeteWindow.layout();
	}
	
	private void doMonProfile() {
		System.err.println ("MilafeteMainWindow::doMonProfile(). NOT IMPLEMENTED !");
		
	}

	/**
	 * 
	 */
	private void deconnexion() {
		System.err.println ("MilafeteMainWindow::deconnexion(). NOT IMPLEMENTED !");
		
	}

	@Override
	public void terminate() {
		Display display = Display.getDefault();
		display.dispose(); 
	}

	/**
	 * 
	 */
	public void activateApplication(User userDescrip) {
		shellMilafeteWindow.setEnabled(true);
		// UserTypeEnumeration uType= null ; // userDescrip.getUserType() ;
		
		applicationDataManagement.getUserManagement().setConnectedUser(userDescrip);
		mainMenuBar.dispose(); 
		mainMenuBar = new Menu(shellMilafeteWindow, SWT.BAR);
		shellMilafeteWindow.setMenuBar(mainMenuBar);

		userDataVue = new UserDataVue(userDescrip) ; 
		
        if (userDescrip.isAdministrator()) {
        	createContents4Administrator(); 
        } else 
        if (userDescrip.isAgent()) {
			createContents4User() ;         	
        } else {
        	System.err.println ("MilafeteMainWindow::activateApplication(). Agent Type not expected !") ;
        }
	}

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			milafeteDataModelFactory factory = milafeteDataModelFactory.eINSTANCE;
			ApplicationDataManagement appDataManagement = factory.createApplicationDataManagement() ; 
			appDataManagement.createOneAppDataConfig();
			// ApplicationDataHolder mainApplicationData = new ApplicationDataHolder() ; 
			
			MilafeteMainWindow window = new MilafeteMainWindow();
			// window.setMainApplicationData(mainApplicationData);
			window.setApplicationDataManagement(appDataManagement);
			window.open();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

