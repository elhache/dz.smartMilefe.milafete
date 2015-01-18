package dz.smartMilefe.milafete.mainGUI;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import swing2swt.layout.BorderLayout;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.Text;

public class MyUserManager extends Composite {

	/**
	 * Create the composite.
	 * @param parent
	 * @param style
	 */
	public MyUserManager(Composite parent, int style) {
		super(parent, style);
		setLayout(new BorderLayout(0, 0));
		
		Button btnNewButton = new Button(this, SWT.NONE);
		btnNewButton.setLayoutData(BorderLayout.SOUTH);
		btnNewButton.setText("New Button");

	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
	public static void main(String args[]) {
		try {
			Display display = Display.getDefault();
			Shell shell = new Shell(display);
			shell.setLayout(new BorderLayout());
			MyUserManager userManager = new MyUserManager(shell , SWT.BORDER) ;
			userManager.setLayoutData(BorderLayout.CENTER);
			//userManager.layout();
			shell.setSize(300, 450);
			
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

}
