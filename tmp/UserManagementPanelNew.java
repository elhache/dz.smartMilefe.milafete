package dz.smartMilefe.milafete.mainGUI;

import java.util.Vector;

import org.eclipse.core.databinding.observable.Realm;
import org.eclipse.emf.common.util.EList;
import org.eclipse.jface.databinding.swt.SWTObservables;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FormAttachment;
import org.eclipse.swt.layout.FormData;
import org.eclipse.swt.layout.FormLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.widgets.List;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;

import swing2swt.layout.BorderLayout;
import dz.smartMilefe.milafete.milafeteDataModel.Action;
import dz.smartMilefe.milafete.milafeteDataModel.ActionCategory;
import dz.smartMilefe.milafete.milafeteDataModel.Agent;
import dz.smartMilefe.milafete.milafeteDataModel.AgentType;
import dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement;
import dz.smartMilefe.milafete.milafeteDataModel.Basket;
import dz.smartMilefe.milafete.milafeteDataModel.User;
import dz.smartMilefe.milafete.milafeteDataModel.UserManagement;
import dz.smartMilefe.milafete.milafeteDataModel.milafeteDataModelFactory;

public class UserManagementPanelNew extends Composite {
	private Text txtSearchByName;
	private Text txtMatricule;
	private Text txtUsername;
	private Text txtFirstname;
	private Text txtLastname;
	private Text txtEmail;
	private Text txtPhonenumber;
	private Text txtPicturefilename;
	private List listUsers;
	private Label lblInformations;
	MessageBox messageBox;
	Button btnSearchbyusername;
	Button btnSearchbylastname;
	Button btnSave;
	Combo combo;
	List listActions;
	List listBasket;

	private ApplicationDataManagement applicationDataManagement;

	/**
	 * Create the composite.
	 * 
	 * @param parent
	 * @param style
	 */
	public UserManagementPanelNew(Composite parent, int style,
			ApplicationDataManagement _applicationDataManagement) {
		super(parent, style);
		applicationDataManagement = _applicationDataManagement;
		setLayout(new BorderLayout(0, 0));

		Composite composite_list = new Composite(this, SWT.NONE);
		composite_list.setLayoutData(BorderLayout.WEST);
		composite_list.setLayout(new FormLayout());

		txtSearchByName = new Text(composite_list, SWT.BORDER);
		FormData fd_txtSearchByName = new FormData();
		fd_txtSearchByName.right = new FormAttachment(0, 177);
		fd_txtSearchByName.top = new FormAttachment(0, 5);
		fd_txtSearchByName.left = new FormAttachment(0, 5);
		txtSearchByName.setLayoutData(fd_txtSearchByName);
		txtSearchByName.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				searchUser();
			}
		});
		txtSearchByName.setMessage("Username or Last Name");
		txtSearchByName.setToolTipText("Type user name");

		btnSearchbyusername = new Button(composite_list, SWT.RADIO);
		FormData fd_btnSearchbyusername = new FormData();
		fd_btnSearchbyusername.top = new FormAttachment(0, 31);
		fd_btnSearchbyusername.left = new FormAttachment(0, 5);
		btnSearchbyusername.setLayoutData(fd_btnSearchbyusername);
		btnSearchbyusername.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				searchUser();
			}
		});
		btnSearchbyusername.setToolTipText("Search user by username");
		btnSearchbyusername.setText("Username");

		btnSearchbylastname = new Button(composite_list, SWT.RADIO);
		FormData fd_btnSearchbylastname = new FormData();
		fd_btnSearchbylastname.top = new FormAttachment(btnSearchbyusername, 0,
				SWT.TOP);
		fd_btnSearchbylastname.right = new FormAttachment(100, -10);
		btnSearchbylastname.setLayoutData(fd_btnSearchbylastname);
		btnSearchbylastname.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				searchUser();
			}
		});
		btnSearchbylastname.setToolTipText("Search user by lastname");
		btnSearchbylastname.setText("Lastname");

		Label label = new Label(composite_list, SWT.SEPARATOR | SWT.HORIZONTAL);
		FormData fd_label = new FormData();
		fd_label.top = new FormAttachment(btnSearchbyusername, 6);
		fd_label.right = new FormAttachment(txtSearchByName, 0, SWT.RIGHT);
		fd_label.left = new FormAttachment(0, 5);
		label.setLayoutData(fd_label);

		Label lblUsers = new Label(composite_list, SWT.NONE);
		FormData fd_lblUsers = new FormData();
		fd_lblUsers.top = new FormAttachment(label, 6);
		fd_lblUsers.right = new FormAttachment(100, -62);
		lblUsers.setLayoutData(fd_lblUsers);
		lblUsers.setText("Users List");

		listUsers = new List(composite_list, SWT.BORDER | SWT.H_SCROLL
				| SWT.V_SCROLL);
		FormData fd_listUsers = new FormData();
		fd_listUsers.top = new FormAttachment(lblUsers, 6);
		fd_listUsers.right = new FormAttachment(0, 177);
		fd_listUsers.left = new FormAttachment(0, 5);
		listUsers.setLayoutData(fd_listUsers);
		listUsers.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				retrieveSelectedUser();
			}
		});

		Button btnNewUser = new Button(composite_list, SWT.NONE);
		fd_listUsers.bottom = new FormAttachment(btnNewUser, -6);
		FormData fd_btnNewUser = new FormData();
		fd_btnNewUser.left = new FormAttachment(0, 53);
		fd_btnNewUser.bottom = new FormAttachment(100, -10);
		btnNewUser.setLayoutData(fd_btnNewUser);
		btnNewUser.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addUser();
			}
		});
		btnNewUser.setText("New User");

		Composite composite_permissions = new Composite(this, SWT.NONE);
		composite_permissions.setLayoutData(BorderLayout.EAST);
		composite_permissions.setLayout(new FormLayout());

		Label lblAuthorisations = new Label(composite_permissions, SWT.NONE);
		FormData fd_lblAuthorisations = new FormData();
		fd_lblAuthorisations.top = new FormAttachment(0, 5);
		fd_lblAuthorisations.left = new FormAttachment(0, 5);
		lblAuthorisations.setLayoutData(fd_lblAuthorisations);
		lblAuthorisations.setText("Authorisations");

		Button btnRevoke = new Button(composite_permissions, SWT.NONE);
		FormData fd_btnRevoke = new FormData();
		fd_btnRevoke.top = new FormAttachment(0, 25);
		fd_btnRevoke.left = new FormAttachment(0, 5);
		btnRevoke.setLayoutData(fd_btnRevoke);
		btnRevoke.setText("Revoke");

		Button btnDelete = new Button(composite_permissions, SWT.NONE);
		FormData fd_btnDelete = new FormData();
		fd_btnDelete.right = new FormAttachment(0, 55);
		fd_btnDelete.top = new FormAttachment(0, 55);
		fd_btnDelete.left = new FormAttachment(0, 5);
		btnDelete.setLayoutData(fd_btnDelete);
		btnDelete.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnDelete.setText("Delete");

		Button btnDetails = new Button(composite_permissions, SWT.NONE);
		FormData fd_btnDetails = new FormData();
		fd_btnDetails.right = new FormAttachment(btnRevoke, 0, SWT.RIGHT);
		fd_btnDetails.top = new FormAttachment(0, 85);
		fd_btnDetails.left = new FormAttachment(0, 5);
		btnDetails.setLayoutData(fd_btnDetails);
		btnDetails.setText("Details");

		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(BorderLayout.CENTER);
		composite.setLayout(new GridLayout(1, false));

		Composite composite_details = new Composite(composite, SWT.NONE);
		composite_details.setLayoutData(new GridData(SWT.FILL, SWT.FILL, false,
				false, 1, 1));
		composite_details.setLayout(new FormLayout());

		lblInformations = new Label(composite_details, SWT.NONE);
		FormData fd_lblInformations = new FormData();
		fd_lblInformations.right = new FormAttachment(0, 514);
		fd_lblInformations.top = new FormAttachment(0, 5);
		fd_lblInformations.left = new FormAttachment(0, 98);
		lblInformations.setLayoutData(fd_lblInformations);

		Label lblMatricule = new Label(composite_details, SWT.NONE);
		FormData fd_lblMatricule = new FormData();
		fd_lblMatricule.top = new FormAttachment(0, 28);
		fd_lblMatricule.left = new FormAttachment(0, 43);
		lblMatricule.setLayoutData(fd_lblMatricule);
		lblMatricule.setText("Matricule");

		txtMatricule = new Text(composite_details, SWT.BORDER);
		FormData fd_txtMatricule = new FormData();
		fd_txtMatricule.right = new FormAttachment(0, 514);
		fd_txtMatricule.top = new FormAttachment(0, 25);
		fd_txtMatricule.left = new FormAttachment(0, 98);
		txtMatricule.setLayoutData(fd_txtMatricule);

		Label lblUsername = new Label(composite_details, SWT.NONE);
		FormData fd_lblUsername = new FormData();
		fd_lblUsername.top = new FormAttachment(0, 54);
		fd_lblUsername.left = new FormAttachment(0, 40);
		lblUsername.setLayoutData(fd_lblUsername);
		lblUsername.setText("Username");

		txtUsername = new Text(composite_details, SWT.BORDER);
		FormData fd_txtUsername = new FormData();
		fd_txtUsername.right = new FormAttachment(0, 514);
		fd_txtUsername.top = new FormAttachment(0, 51);
		fd_txtUsername.left = new FormAttachment(0, 98);
		txtUsername.setLayoutData(fd_txtUsername);

		Label lblFirstname = new Label(composite_details, SWT.NONE);
		FormData fd_lblFirstname = new FormData();
		fd_lblFirstname.top = new FormAttachment(0, 80);
		fd_lblFirstname.left = new FormAttachment(0, 36);
		lblFirstname.setLayoutData(fd_lblFirstname);
		lblFirstname.setText("First Name");

		txtFirstname = new Text(composite_details, SWT.BORDER);
		FormData fd_txtFirstname = new FormData();
		fd_txtFirstname.right = new FormAttachment(0, 514);
		fd_txtFirstname.top = new FormAttachment(0, 77);
		fd_txtFirstname.left = new FormAttachment(0, 98);
		txtFirstname.setLayoutData(fd_txtFirstname);

		Label lblLastname = new Label(composite_details, SWT.NONE);
		FormData fd_lblLastname = new FormData();
		fd_lblLastname.top = new FormAttachment(0, 106);
		fd_lblLastname.left = new FormAttachment(0, 37);
		lblLastname.setLayoutData(fd_lblLastname);
		lblLastname.setText("Last Name");

		txtLastname = new Text(composite_details, SWT.BORDER);
		FormData fd_txtLastname = new FormData();
		fd_txtLastname.right = new FormAttachment(0, 514);
		fd_txtLastname.top = new FormAttachment(0, 103);
		fd_txtLastname.left = new FormAttachment(0, 98);
		txtLastname.setLayoutData(fd_txtLastname);

		Label lblEmail = new Label(composite_details, SWT.NONE);
		FormData fd_lblEmail = new FormData();
		fd_lblEmail.top = new FormAttachment(0, 132);
		fd_lblEmail.left = new FormAttachment(0, 64);
		lblEmail.setLayoutData(fd_lblEmail);
		lblEmail.setText("email");

		txtEmail = new Text(composite_details, SWT.BORDER);
		FormData fd_txtEmail = new FormData();
		fd_txtEmail.right = new FormAttachment(0, 514);
		fd_txtEmail.top = new FormAttachment(0, 129);
		fd_txtEmail.left = new FormAttachment(0, 98);
		txtEmail.setLayoutData(fd_txtEmail);

		Label lblPhonenumber = new Label(composite_details, SWT.NONE);
		FormData fd_lblPhonenumber = new FormData();
		fd_lblPhonenumber.top = new FormAttachment(0, 158);
		fd_lblPhonenumber.left = new FormAttachment(0, 12);
		lblPhonenumber.setLayoutData(fd_lblPhonenumber);
		lblPhonenumber.setText("Phone Number");

		txtPhonenumber = new Text(composite_details, SWT.BORDER);
		FormData fd_txtPhonenumber = new FormData();
		fd_txtPhonenumber.right = new FormAttachment(0, 514);
		fd_txtPhonenumber.top = new FormAttachment(0, 155);
		fd_txtPhonenumber.left = new FormAttachment(0, 98);
		txtPhonenumber.setLayoutData(fd_txtPhonenumber);

		Label lblPicturefilename = new Label(composite_details, SWT.NONE);
		FormData fd_lblPicturefilename = new FormData();
		fd_lblPicturefilename.top = new FormAttachment(0, 184);
		fd_lblPicturefilename.left = new FormAttachment(0, 5);
		lblPicturefilename.setLayoutData(fd_lblPicturefilename);
		lblPicturefilename.setText("Picture Filename");

		txtPicturefilename = new Text(composite_details, SWT.BORDER);
		FormData fd_txtPicturefilename = new FormData();
		fd_txtPicturefilename.right = new FormAttachment(0, 514);
		fd_txtPicturefilename.top = new FormAttachment(0, 181);
		fd_txtPicturefilename.left = new FormAttachment(0, 98);
		txtPicturefilename.setLayoutData(fd_txtPicturefilename);

		Label lblAgentType = new Label(composite_details, SWT.NONE);
		FormData fd_lblAgentType = new FormData();
		fd_lblAgentType.top = new FormAttachment(0, 211);
		fd_lblAgentType.left = new FormAttachment(0, 32);
		lblAgentType.setLayoutData(fd_lblAgentType);
		lblAgentType.setText("Agent Type");

		combo = new Combo(composite_details, SWT.READ_ONLY);
		FormData fd_combo = new FormData();
		fd_combo.right = new FormAttachment(0, 514);
		fd_combo.top = new FormAttachment(0, 207);
		fd_combo.left = new FormAttachment(0, 98);
		combo.setLayoutData(fd_combo);
		combo.setItems(new String[] { "Regular", "Privileged", "Administrator" });
		combo.select(0);

		btnSave = new Button(composite_details, SWT.NONE);
		FormData fd_btnSave = new FormData();
		fd_btnSave.top = new FormAttachment(combo, 6);
		fd_btnSave.right = new FormAttachment(lblInformations, 0, SWT.RIGHT);
		fd_btnSave.left = new FormAttachment(0, 475);
		btnSave.setLayoutData(fd_btnSave);
		btnSave.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				saveUser();
			}
		});
		btnSave.setText("Save");

		Button btnClear = new Button(composite_details, SWT.NONE);
		FormData fd_btnClear = new FormData();
		fd_btnClear.top = new FormAttachment(btnSave, 0, SWT.TOP);
		fd_btnClear.right = new FormAttachment(btnSave, -6);
		btnClear.setLayoutData(fd_btnClear);
		btnClear.setToolTipText("Clear all fields");
		btnClear.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				clear();
			}
		});
		btnClear.setText("Clear");

		Composite composite_actions = new Composite(composite, SWT.NONE);
		composite_actions.setLayout(new FormLayout());
		composite_actions.setLayoutData(new GridData(SWT.FILL, SWT.CENTER,
				false, false, 1, 1));
		composite_actions.setBounds(0, 0, 64, 64);

		Label lblAction = new Label(composite_actions, SWT.NONE);
		FormData fd_lblAction = new FormData();
		fd_lblAction.top = new FormAttachment(0, 5);
		fd_lblAction.left = new FormAttachment(0, 117);
		lblAction.setLayoutData(fd_lblAction);
		lblAction.setText("Actions");

		Label lblBasket = new Label(composite_actions, SWT.NONE);
		FormData fd_lblBasket = new FormData();
		fd_lblBasket.top = new FormAttachment(0, 5);
		fd_lblBasket.left = new FormAttachment(0, 372);
		lblBasket.setLayoutData(fd_lblBasket);
		lblBasket.setText("Baskets");

		listActions = new List(composite_actions, SWT.BORDER);
		FormData fd_listActions = new FormData();
		fd_listActions.left = new FormAttachment(0, 5);
		fd_listActions.bottom = new FormAttachment(0, 140);
		fd_listActions.top = new FormAttachment(0, 25);
		listActions.setLayoutData(fd_listActions);

		listBasket = new List(composite_actions, SWT.BORDER);
		fd_listActions.right = new FormAttachment(listBasket, -6);
		FormData fd_listBasket = new FormData();
		fd_listBasket.left = new FormAttachment(0, 261);
		fd_listBasket.right = new FormAttachment(100);
		fd_listBasket.bottom = new FormAttachment(0, 140);
		fd_listBasket.top = new FormAttachment(0, 25);
		listBasket.setLayoutData(fd_listBasket);

		Button btnAddaction = new Button(composite_actions, SWT.NONE);
		FormData fd_btnAddaction = new FormData();
		fd_btnAddaction.right = new FormAttachment(listActions, 100);
		fd_btnAddaction.top = new FormAttachment(listActions, 6);
		fd_btnAddaction.left = new FormAttachment(listActions, 10, SWT.LEFT);
		btnAddaction.setLayoutData(fd_btnAddaction);
		btnAddaction.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				addUserAction(parent, style);
			}
		});
		btnAddaction.setText("AddAction");

		Button btnRemoveaction = new Button(composite_actions, SWT.NONE);
		FormData fd_btnRemoveaction = new FormData();
		fd_btnRemoveaction.top = new FormAttachment(btnAddaction, 0, SWT.TOP);
		fd_btnRemoveaction.left = new FormAttachment(btnAddaction, 52);
		fd_btnRemoveaction.right = new FormAttachment(100, -267);
		btnRemoveaction.setLayoutData(fd_btnRemoveaction);
		btnRemoveaction.setText("RemoveAction");

		Button btnAddBasket = new Button(composite_actions, SWT.NONE);
		FormData fd_btnAddBasket = new FormData();
		fd_btnAddBasket.right = new FormAttachment(listBasket, 100);
		fd_btnAddBasket.top = new FormAttachment(btnAddaction, 0, SWT.TOP);
		fd_btnAddBasket.left = new FormAttachment(listBasket, 10, SWT.LEFT);
		btnAddBasket.setLayoutData(fd_btnAddBasket);
		btnAddBasket.setText("Add Basket");

		Button btnRemoveBasket = new Button(composite_actions, SWT.NONE);
		FormData fd_btnRemoveBasket = new FormData();
		fd_btnRemoveBasket.top = new FormAttachment(listBasket, 6);
		fd_btnRemoveBasket.right = new FormAttachment(100, -10);
		btnRemoveBasket.setLayoutData(fd_btnRemoveBasket);
		btnRemoveBasket.setText("Remove Basket");

		messageBox = new MessageBox((Shell) parent, SWT.ICON_QUESTION | SWT.YES
				| SWT.NO);

		loadUserList();
	}

	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}

	private void loadUserList() {
		UserManagement userManagement= applicationDataManagement.getUserManagement(); 
		int nbUser = userManagement.getUserList().size();
		User oneUser ; 
		for (int i=0 ; i<nbUser ; i++) {
			oneUser = userManagement.userElementAt(i);
			listUsers.add(oneUser.getUserName());
		}
	}

	private void retrieveSelectedUser() {
		User user = getSelectedUser();
		if (user == null)
			return;
		txtMatricule.setText(setEmptyTextIfNull(user.getMatricule()));
		txtUsername.setText(setEmptyTextIfNull(user.getUserName()));
		txtUsername.setEnabled(false);
		txtFirstname.setText(setEmptyTextIfNull(user.getFirstName()));
		txtLastname.setText(setEmptyTextIfNull(user.getLastName()));
		txtEmail.setText(setEmptyTextIfNull(user.getEmail()));
		txtPhonenumber.setText(setEmptyTextIfNull(user.getPhoneNumber()));
		txtPicturefilename.setText(setEmptyTextIfNull(user
				.getPictureFilename()));
		lblInformations.setText("");
		btnSave.setEnabled(true);
		int comboIndex = 0;
		if(user instanceof Agent){
			comboIndex = getComboIndexFromAgentType(combo, (Agent)user);
		}
		combo.select(comboIndex);
		retrieveUserAction();
		retrieveUserBasket();
	}

	private User getSelectedUser() {
		int idxSelectedItem = listUsers.getSelectionIndex();
		String username = null;
		try {
			username = listUsers.getItem(idxSelectedItem);
		} catch (Exception e) {
			System.err.println("error : selection out of bound.");
			return null;
		}
		User user = applicationDataManagement.getUserManagement().searchOneUsername(username);
		return user;
	}

	private void addUser() {
		btnSave.setEnabled(true);
		clear();
		txtUsername.setEnabled(true);
		lblInformations.setText("New user : enter details");
		listUsers.deselectAll();
	}

	private void saveUser() {
		String matricule = txtMatricule.getText().trim();
		String userName = txtUsername.getText().trim();
		String firstName = txtFirstname.getText().trim();
		String lastName = txtLastname.getText().trim();
		String email = txtEmail.getText().trim();
		String phoneNumber = txtPhonenumber.getText().trim();
		String pictureFilename = txtPicturefilename.getText().trim();
		AgentType agentType = getAgentTypeFromComboIndex(combo);
		btnSave.setEnabled(false);
		int selectedItemCount = listUsers.getSelectionCount();
		//add new user
		if (selectedItemCount == 0) {
			if (applicationDataManagement.getUserManagement().searchOneUsername(userName) != null) {
				System.err.println("error: username already exists.");
				lblInformations.setText("error: username already exists.");
				return;
			}
			if (userName.isEmpty()) {
				System.err.println("error: username cannot be empty.");
				lblInformations.setText("error: username cannot be empty.");
				return;
			}
			int confirmation = confirm("Add User", "Confirm add new user.");
			if (confirmation == SWT.YES) {
				System.err.println ("UserManagement::saveUser(). Reimplementer Cette Section") ;
				
				//applicationDataManagement.addUser(matricule, userName,firstName, lastName, email, phoneNumber,
				//		pictureFilename, agentType);
				lblInformations.setText("New user added.");
				listUsers.add(userName);
			}
		} 
		//update user
		else if (selectedItemCount == 1 || userName != null) {
			int confirmation = confirm("Update User",
					"Confirm update user info.");
			if (confirmation == SWT.YES) {
				int idxSelectedItem = listUsers.getSelectionIndex();
				String username = null;
				try {
					username = listUsers.getItem(idxSelectedItem);
				} catch (Exception e) {
					System.err.println("error : selection out of bound.");
					return;
				}
				if (username == null) {
					System.err.println("error: cannot update.");
					return;
				}
				User user = applicationDataManagement.getUserManagement().searchOneUsername(username);
				if (user == null) {
					System.err.println("error: cannot update.");
					return;
				}
				user.setMatricule(matricule);
				user.setFirstName(firstName);
				user.setLastName(lastName);
				user.setEmail(email);
				user.setPhoneNumber(phoneNumber);
				user.setPictureFilename(pictureFilename);
				lblInformations.setText("user information updated.");
				if(user instanceof Agent){
					Agent agent = (Agent) user;
					agent.setAgentType(agentType);
				}
			}
		}
	}
	
	/**
	 * Get the agent from the Agent Type of the combo, by default, returns regular agent.
	 * @param combo
	 * @return AgentType
	 */
	private AgentType getAgentTypeFromComboIndex(Combo combo){
		int comboSelectedIndex = combo.getSelectionIndex();
		if(combo == null || comboSelectedIndex == -1)
			return null;
		AgentType agentType = AgentType.AGENT_REGULIER;
		String[] comboStringItems = combo.getItems();
		String comboStringItem = comboStringItems[comboSelectedIndex];
		if (comboStringItem.equals("Regular")) {
			agentType = AgentType.AGENT_REGULIER;
		}else if(comboStringItem.equals("Privileged")){
			agentType = AgentType.AGENT_PREVILEGE;
		}
		return agentType;
	}
	
	/**
	 * Get the agent from the index of the combo from the current agent;
	 * @param combo, agent
	 * @return integer
	 */
	private int getComboIndexFromAgentType(Combo combo, Agent agent){
		int comboIndex = 0;
		AgentType agentType = agent.getAgentType();
		if(agentType == null)
			return comboIndex;
		String[] comboStringItems = combo.getItems();
		for(int i=0; i<comboStringItems.length; i++){
			if(agentType == AgentType.AGENT_REGULIER){
				if(comboStringItems[i].equals("Regular")){
					comboIndex = i;
				}
			}else if(agentType == AgentType.AGENT_PREVILEGE){
				if(comboStringItems[i].equals("Privileged")){
					comboIndex = i;
				}
			}
		}
		return comboIndex;
	}

	/**
	 * Return an empty String if parameter is null.
	 * 
	 * @param value
	 * @return String
	 */
	private String setEmptyTextIfNull(String stringOrNull) {
		String txt = (stringOrNull != null) ? stringOrNull : "";
		return txt;
	}

	/**
	 * Displays a MessageBox confirmation dialog.
	 * 
	 * @return int, SWT.YES or SWT.NO
	 */
	private int confirm(String title, String message) {
		messageBox.setText(title);
		messageBox.setMessage(message);
		return messageBox.open();
	}

	/**
	 * Clear all input fields
	 */
	private void clear() {
		txtMatricule.setText("");
		txtUsername.setText("");
		txtFirstname.setText("");
		txtLastname.setText("");
		txtEmail.setText("");
		txtPhonenumber.setText("");
		txtPicturefilename.setText("");
		lblInformations.setText("");
	}

	/**
	 * Search for user by criteria: username or last name;
	 */
	private void searchUser() {
		listUsers.removeAll();
		String searchCriteria = txtSearchByName.getText();
		if (btnSearchbyusername.getSelection()) {
			Vector<User> UserByUsername = applicationDataManagement
					.getUserManagement().searchByUsername(searchCriteria);
			if (!UserByUsername.isEmpty()) {
				for (User user : UserByUsername) {
					listUsers.add(user.getUserName());
				}
			}
		} else if (btnSearchbylastname.getSelection()) {
			Vector<User> UserByLastName = applicationDataManagement
					.getUserManagement().searchByLastname(searchCriteria);
			if (!UserByLastName.isEmpty()) {
				for (User user : UserByLastName) {
					listUsers.add(user.getUserName());
				}
			}
		}
	}

	/*
	 * Retrieve selected user's actions. 
	 */
	private void retrieveUserAction() {
		listActions.removeAll();
		User user = getSelectedUser();
		if(user == null){
			System.err.println("no action : no user selected");
			return;
		}
		int userActionSize = user.getActionList().size();
		for(int i=0; i<userActionSize; i++){
			Action action = (Action)user.actionElementAt(i);
			if(action != null){
				listActions.add(action.getActionCategoy().getActionLabel().getName());
			}
		}
	}
	
	private void addUserAction(Composite parent, int style){
		User user = getSelectedUser();
		if (user == null)
			return;
		EList<ActionCategory> allActionCategories = applicationDataManagement
				.getActionManagement().getAllActionCategories();
		UserManagementActionListDialog userManagementActionListDialog = new UserManagementActionListDialog(
				parent.getShell(), style, allActionCategories);
		int actionCategoryIndex = (int) userManagementActionListDialog.open();
		if(actionCategoryIndex != -1){
			ActionCategory selectedActionCategory = allActionCategories
					.get(actionCategoryIndex);
			
			int userActionSize = user.getActionList().size();
			for(int i=0; i<userActionSize; i++){
				Action action = (Action)user.actionElementAt(i);
				System.out.println(action.getActionCategoy());
				if(action != null){
					if(action.getActionCategoy().equals(selectedActionCategory)){
						System.out.println("ahou kayen");					
						return;
					}
				}
			}
			
			milafeteDataModelFactory factory = milafeteDataModelFactory.eINSTANCE;
			Action action = factory.createAction();
			action.setActionCategoy(selectedActionCategory);
			user.addActionElement(action);
		}
		retrieveUserAction();
	}
	
	/*
	 * Retrieve selected user's basket. 
	 */
	private void retrieveUserBasket() {
		listBasket.removeAll();
		User user = getSelectedUser();
		if(user == null){
			System.err.println("no basket : no user selected");
			return;
		}
		int userBasketSize = user.getBasketList().size();
		for(int i=0; i<userBasketSize; i++){
			Basket basket = user.basketElementAt(i);
			if(basket != null){
				listBasket.add(basket.getName());
			}
		}
	}

	/**
	 * Launch the application.
	 * 
	 * @param args
	 */
	public static void main(String args[]) {
		Display display = Display.getDefault();
		Realm.runWithDefault(SWTObservables.getRealm(display), new Runnable() {
			public void run() {
				try {
					milafeteDataModelFactory factory = milafeteDataModelFactory.eINSTANCE;
					ApplicationDataManagement appDataManagement = factory
							.createApplicationDataManagement();
					appDataManagement.createOneAppDataConfig();

					Display display = Display.getDefault();
					Shell shell = new Shell(display);
					shell.setLayout(new BorderLayout());
					new UserManagementPanel(shell, SWT.NONE, appDataManagement);
					shell.pack();
					shell.open();
					// shell.setSize(500, 400);
					while (!shell.isDisposed()) {
						if (!display.readAndDispatch()) {
							display.sleep();
						}
					}
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
