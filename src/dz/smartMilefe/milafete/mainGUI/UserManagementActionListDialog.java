package dz.smartMilefe.milafete.mainGUI;

import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Dialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.Shell;

import dz.smartMilefe.milafete.milafeteDataModel.ActionCategory;

public class UserManagementActionListDialog extends Dialog {

	protected Object result;
	protected Shell shell;
	EList<ActionCategory> allActionCategories;
	List listActions;

	/**
	 * Create the dialog.
	 * @param parent
	 * @param style
	 */
	public UserManagementActionListDialog(Shell parent, int style, EList<ActionCategory> allActionCategories) {
		super(parent, style);
		setText("Actions Categories");
		this.allActionCategories = allActionCategories;
	}

	/**
	 * Open the dialog.
	 * @return the result
	 */
	public Object open() {
		createContents();
		shell.open();
		shell.layout();
		Display display = getParent().getDisplay();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
		return result;
	}

	/**
	 * Create contents of the dialog.
	 */
	private void createContents() {
		shell = new Shell(getParent(), getStyle());
		shell.setSize(288, 483);
		shell.setText(getText());
		shell.setLayout(new FormLayout());
		
		listActions = new List(shell, SWT.BORDER | SWT.V_SCROLL);
		FormData fd_listActions = new FormData();
		fd_listActions.top = new FormAttachment(0, 10);
		fd_listActions.right = new FormAttachment(0, 273);
		fd_listActions.left = new FormAttachment(0, 13);
		listActions.setLayoutData(fd_listActions);
		
		Button buttonAddAction = new Button(shell, SWT.NONE);
		fd_listActions.bottom = new FormAttachment(buttonAddAction, -6);
		buttonAddAction.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addActionCategory();
			}
		});
		FormData fd_buttonAddAction = new FormData();
		fd_buttonAddAction.bottom = new FormAttachment(100, -10);
		fd_buttonAddAction.left = new FormAttachment(0, 10);
		buttonAddAction.setLayoutData(fd_buttonAddAction);
		buttonAddAction.setText("Add Action");
		
		Button buttonCancel = new Button(shell, SWT.NONE);
		buttonCancel.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				cancel();
			}
		});
		FormData fd_buttonCancel = new FormData();
		fd_buttonCancel.top = new FormAttachment(buttonAddAction, 0, SWT.TOP);
		fd_buttonCancel.right = new FormAttachment(100, -10);
		fd_buttonCancel.left = new FormAttachment(0, 200);
		buttonCancel.setLayoutData(fd_buttonCancel);
		buttonCancel.setText("Cancel");
		
		fillListActions();
	}
	
	private void fillListActions(){
		for (ActionCategory actionCategory : allActionCategories) {
			listActions.add(actionCategory.getActionLabel().getName());
		}
	}
	
	/**
	 * add category event
	 */
	private void addActionCategory(){
		result = listActions.getSelectionIndex();
		shell.close();
	}
	
	/**
	 * cancel event
	 */
	private void cancel(){
		result = -1;
		shell.close();
	}

}
