package dz.smartMilefe.milafete.mainGUI;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import swing2swt.layout.BorderLayout;
import dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement;
import dz.smartMilefe.milafete.milafeteDataModel.User;

/**
 * 
 * @author alikacem
 *
 */
public class ConnectionWindow extends Shell {
	 
	
	private Text text;
	private Text text_1;

	
	private IMainAppWindow mainAppWindow ;

	
	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			ConnectionWindow shell = new ConnectionWindow(display);
			shell.open();
			shell.layout();
			while (!shell.isDisposed()) {
				if (!display.readAndDispatch()) {
					display.sleep();
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	public IMainAppWindow getMainAppWindow() {
		return mainAppWindow;
	}


	public void setMainAppWindow(IMainAppWindow mainAppWindow) {
		this.mainAppWindow = mainAppWindow;
	}


	/**
	 * Create the shell.
	 * @wbp.parser.constructor
	 */
	public ConnectionWindow(Shell parent, IMainAppWindow _mainAppWindow) {
		super(parent, SWT.NONE) ;
		mainAppWindow = _mainAppWindow ; 
		setLayout(new BorderLayout(0, 0));
		
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(BorderLayout.CENTER);
		composite.setLayout(new GridLayout(2, false));
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Label lblUtilisateur = new Label(composite, SWT.NONE);
		lblUtilisateur.setText("Utilisateur");
		
		text = new Text(composite, SWT.BORDER);
		text.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Label lblMotDePasse = new Label(composite, SWT.NONE);
		GridData gd_lblMotDePasse = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_lblMotDePasse.widthHint = 86;
		lblMotDePasse.setLayoutData(gd_lblMotDePasse);
		lblMotDePasse.setText("Mot de Passe");
		
		text_1 = new Text(composite, SWT.BORDER | SWT.PASSWORD);
		text_1.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		new Label(composite, SWT.NONE);
		
		Composite composite_1 = new Composite(this, SWT.NONE);
		composite_1.setLayoutData(BorderLayout.SOUTH);
		composite_1.setLayout(new GridLayout(15, false));
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		new Label(composite_1, SWT.NONE);
		
		Button btnNewButton_1 = new Button(composite_1, SWT.NONE);
		GridData gd_btnNewButton_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnNewButton_1.widthHint = 72;
		btnNewButton_1.setLayoutData(gd_btnNewButton_1);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				// Connection callback
				connectCallback() ; 
			}
		});
		btnNewButton_1.setText("Connect");
		
		Button btnNewButton = new Button(composite_1, SWT.NONE);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				quitCallback() ;
			}
		});
		GridData gd_btnNewButton = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnNewButton.widthHint = 59;
		btnNewButton.setLayoutData(gd_btnNewButton);
		btnNewButton.setText("Quit");
		createContents();
		
	
	}
	
	/**
	 * Clear Filds 
	 */
	private void clearConnectionWindow() {
		if (text!=null) text.setText("");
		if (text_1 != null) text_1.setText("");
	}

	public void skipConnection(String user, String pwd) {
		activateApplication(retreiveUserNew( user , pwd) ) ; 
	}
	
	/**
	 * Create the shell.
	 * @param display
	 */
	public ConnectionWindow(Display display) {
		super(display, SWT.TITLE);
		setLayout(new GridLayout(1, false));
		createContents();
	}

	/**
	 * Create contents of the shell.
	 */
	protected void createContents() {
		setText("Connection");
		setSize(450, 300);

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	
	
	/**
	 * Process connect click  
	 */
	private void connectCallback() {
		User userDescrip = null ; 
		String user = text.getText().trim() ; 
		String pwd = text_1.getText().trim();
		// boolean userOk = false ; 
		boolean error = false ; 
		String msgError= "" ;
		
		if (user.length() != 0 && pwd.length() != 0) {
			userDescrip = retreiveUserNew(user , pwd) ; 
		} else {
			msgError = "Champs Vide. Recommencez !" ; 
			error= true ;
		}
		
		if (!error) {
			if (userDescrip != null) {
				activateApplication(userDescrip) ; 
				this.dispose(); 
			} else {
				error = true ; 
				msgError = "Utilisateur non existant.\nErreur dans le nom de l'utilisateur ou dans le mot de passe !" ; 
			}
		}
		if (error) {
			MessageBox mb = new MessageBox(this,  SWT.ICON_INFORMATION);
		    mb.setMessage(msgError) ; 
		    mb.open();
		    clearConnectionWindow() ; 
			
		}
	}
	
	/**
	 * called for a click on quit button. Terminate the application  
	 */
	private void quitCallback() {
		// terminate the application 
		mainAppWindow.terminate();
	}
		
	private User retreiveUserNew(String userName , String pwd) {
		// mainAppWindow.get
		ApplicationDataManagement appDataManagmnt = mainAppWindow.getApplicationDataManagement() ;
		User user = appDataManagmnt.getUserManagement().searchOneUsername(userName);
		if (user != null) {
			if (!user.authentification(pwd)) user = null ;  
		}
		return user ;
	}
	
	private void activateApplication(User userDescrip) {
		this.dispose();
		mainAppWindow.activateApplication(userDescrip);
		
		// mainAppWindow.getShellMilafeteWindow().setEnabled(true);
		// Depending on the user Type, I do ... 
	}
	
	
}
