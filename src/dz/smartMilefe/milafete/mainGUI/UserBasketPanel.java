package dz.smartMilefe.milafete.mainGUI;

import java.awt.Frame;
import java.awt.Panel;

import javax.swing.JRootPane;

import org.eclipse.swt.SWT;
import org.eclipse.swt.awt.SWT_AWT;
import org.eclipse.swt.browser.Browser;
import org.eclipse.swt.custom.SashForm;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Event;
import org.eclipse.swt.widgets.Listener;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;
import org.eclipse.wb.swt.SWTResourceManager;

import swing2swt.layout.BorderLayout;
import dz.smartMilefe.milafete.milafeteDataModel.ApplicationDataManagement;
import dz.smartMilefe.milafete.milafeteDataModel.Basket;
import dz.smartMilefe.milafete.milafeteDataModel.Document;
import dz.smartMilefe.milafete.milafeteDataModel.Dossier;
import dz.smartMilefe.milafete.milafeteDataModel.DossierItem;

/**
 * Main panel representing a User's Basket
 * @author alikacem
 *
 */
public class UserBasketPanel extends Composite {
	public static final boolean USING_PDFViewerBean = false ; // if true, PDFViewerBean is used   
	
	// PDFViewerBean pdfViewerBean = new PDFViewerBean();
	
	private UserDataVue userDataVue ; 
	private ApplicationDataManagement applicationDataManagement ;  
	private Browser browser ;
	
	private Tree basketTree = null ; 

	/**
	 * 
	 * @param parent
	 * @param style
	 * @param _applicationDataManagement
	 */
	public UserBasketPanel(Composite parent, int style,  ApplicationDataManagement _applicationDataManagement, UserDataVue _userDataVue ) {
		//	this(parent , style , null) ;

		super(parent, SWT.NONE);

		System.out.println ("Creation Basket Panel"); 
		applicationDataManagement = _applicationDataManagement;
		userDataVue = _userDataVue; 
		userDataVue.setUserBasketPanel(this);
		int nbBaskets= userDataVue.nbreOfBaskets() ;
		setLayout(new BorderLayout(5, 5));
		Display display = Display.getDefault();
		Composite composite = new Composite(this, SWT.NONE);
		composite.setLayoutData(BorderLayout.NORTH);
		composite.setLayout(new GridLayout(nbBaskets, false));

		userDataVue.prepareBasket(composite);

		Composite composite_1 = new Composite(this, SWT.NONE);
		composite_1.setLayoutData(BorderLayout.SOUTH);
		composite_1.setLayout(new GridLayout(1, false));

		final Composite composite_2 = new Composite(this, SWT.NONE);
		composite_2.setLayoutData(BorderLayout.CENTER);
		composite_2.setLayout(new FillLayout(SWT.HORIZONTAL));

		SashForm sashForm = new SashForm(composite_2, SWT.NONE);
		sashForm.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		//sashForm.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		sashForm.setSashWidth(4);

		basketTree = new Tree(sashForm, SWT.BORDER);
		// populateTree(basketTree) ; 
		basketTree.addListener (SWT.Selection , new Listener () {
			@Override
			public void handleEvent (final Event event) {
				ProcessTreeItemSelection(event)  ; 
			}
		});

		Composite composite_3 = new Composite(sashForm, SWT.NONE);
		composite_3.setLayout(new BorderLayout(0, 0));

		Composite composite_4 = new Composite(composite_3, SWT.NONE);
		composite_4.setLayoutData(BorderLayout.SOUTH);
		composite_4.setLayout(new GridLayout(3, false));

		Button btnNewButton = new Button(composite_4, SWT.NONE);
		GridData gd_btnNewButton = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnNewButton.widthHint = 76;
		btnNewButton.setLayoutData(gd_btnNewButton);
		btnNewButton.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		btnNewButton.setText("Validation");

		Button btnNewButton_1 = new Button(composite_4, SWT.NONE);
		btnNewButton_1.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
			}
		});
		GridData gd_btnNewButton_1 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnNewButton_1.widthHint = 79;
		btnNewButton_1.setLayoutData(gd_btnNewButton_1);
		btnNewButton_1.setText("Rejet");

		Button btnNewButton_2 = new Button(composite_4, SWT.NONE);
		btnNewButton_2.setText("Superviseur");

		Composite composite_5 = new Composite(composite_3, SWT.NONE);
		composite_5.setLayoutData(BorderLayout.NORTH);
		composite_5.setLayout(new GridLayout(2, false));

		Button btnNewButton_4 = new Button(composite_5, SWT.NONE);
		GridData gd_btnNewButton_4 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnNewButton_4.widthHint = 26;
		btnNewButton_4.setLayoutData(gd_btnNewButton_4);
		btnNewButton_4.setText("+");

		Button btnNewButton_3 = new Button(composite_5, SWT.NONE);
		GridData gd_btnNewButton_3 = new GridData(SWT.LEFT, SWT.CENTER, false, false, 1, 1);
		gd_btnNewButton_3.widthHint = 28;
		btnNewButton_3.setLayoutData(gd_btnNewButton_3);
		btnNewButton_3.setText("-");

		Composite composite_6 = new Composite(composite_3, SWT.NONE);
		composite_6.setLayoutData(BorderLayout.CENTER);
		composite_6.setLayout(new BorderLayout(0, 0));

		SashForm sashForm_1 = new SashForm(composite_6, SWT.BORDER);
		sashForm_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_GRAY));
		// sashForm_1.setBackground(SWTResourceManager.getColor(SWT.COLOR_WIDGET_LIGHT_SHADOW));
		sashForm_1.setSashWidth(4);
		sashForm_1.setLayoutData(BorderLayout.CENTER);

		Composite composite_7 = new Composite(sashForm_1, SWT.EMBEDDED);
		composite_7.setLayout(new BorderLayout(0, 0));

		//browser = new Browser(composite_7, SWT.BORDER);
		browser = new Browser(composite_7, SWT.NONE); 
		browser.setUrl("") ; // "file:///E:/alikacem14/EnterpriseArchiPrj/ModelingLuna/workspace/dz.madania.milafete.mainFstGui/documentScan/NumerisationArchivesDec2014-V2.pdf");
		browser.setLayoutData(BorderLayout.CENTER);

		if (USING_PDFViewerBean) {
			Frame frame = SWT_AWT.new_Frame(composite_7);

			Panel panel_1 = new Panel();
			frame.add(panel_1);
			panel_1.setLayout(new java.awt.BorderLayout(0, 0));

			JRootPane rootPane = new JRootPane();
			panel_1.add(rootPane);

			java.awt.Container contentPane = rootPane.getContentPane();
			contentPane.setLayout(new java.awt.BorderLayout()) ; 
//			try {
//				pdfViewerBean.loadPDF("documentScan/NumerisationArchivesDec2014-V2.pdf");
//			} catch (PDFException e) {
//				e.printStackTrace(); 
//			}
//
//			contentPane.add(pdfViewerBean , BorderLayout.CENTER) ;
		}

		// frame.get
		Composite composite_8 = new Composite(sashForm_1, SWT.EMBEDDED);

		Frame frame_1 = SWT_AWT.new_Frame(composite_8);

		Panel panel_2 = new Panel();
		frame_1.add(panel_2);
		panel_2.setLayout(new java.awt.BorderLayout(0, 0));

		JRootPane rootPane_1 = new JRootPane();
		panel_2.add(rootPane_1);
		sashForm_1.setWeights(new int[] {406, 208});
		sashForm.setWeights(new int[] {108, 540});

		// --------------
	}
	
	@Override
	protected void checkSubclass() {
		// Disable the check that prevents subclassing of SWT components
	}
		
	/**
	 * 
	 * @param pdfDocu
	 */
	private void openDocument(String pdfDocu) {
		 //PDFViewerBean pdfViewerBean = new PDFViewerBean();PDFViewerBean pdfViewerBean = new PDFViewerBean();
		// bean.loadPDF (pdfDocu);
	}
	
	/**
	 * Display the selected document (click on its corresponding Tree node) in the viewer the 
	 * Click on Tree node. 
	 * 
	 * @param event
	 */
	private void ProcessTreeItemSelection(final Event event) {
		// System.out.println ("\tTree Event Handler "); 
		final TreeItem root = (TreeItem) event.item;
		// System.out.println ("\tTree Event Handler : " + root.getText())  ;
		Object data = root.getData() ;
		
		Document oneDocu = null ; 
		
		if (data instanceof Dossier) {
			Dossier oneDossier = (Dossier)data ;
			int nbDocu = oneDossier.getItemList().size() ;
			if (nbDocu > 0) {
				// oneDocu= 
				DossierItem ido = oneDossier.itemElementAt(0) ;
				if (ido.isDocument()) {
					oneDocu = (Document)ido ; 
				} else {
					System.err.println ("ProcessTreeItemSelection(). Document Type not processes ... ") ; 
				}
			} else {
				System.err.println ("ProcessTreeItemSelection(). Dossier Vide ... " + oneDossier.getId()) ; 				
			}
		} else {
			if (data instanceof Document) {
				oneDocu = (Document)data ; 
			} else {
				System.err.println ("ProcessTreeItemSelection(). Type Not Expected ..." + data.getClass().getName()); 
			}
		}
		
		if (oneDocu != null) {
			String url = "file:///" + oneDocu.absoluteFilename(); 
			browser.setUrl(url); 
		}
//		
//		TreeItem [] items = root.getItems ();
//		for (int i= 0; i<items.length; i++) {
//			if (items [i].getData () != null) return;
//			// items [i].dispose ();
//		}
	}
	
	/**
	 * Display Files (Basket contents) in the Tree Structure 
	 * 
	 * 
	 * @param basketVue
	 */
	public void processBasketSelection(BasketVue basketVue) {
		
		// Remove 
		// Display Tree 
		basketTree.removeAll(); 
		browser.setText("Empty");   
		Basket basket= basketVue.getModelBasket() ;
		// 
		
		int nbDoss = basket.getDossierList().size() ; 
		for (int i=0 ; i<nbDoss ; i++) {
			Dossier oneDossier = basket.dossierElementAt(i) ; 
			
			 TreeItem iItem = new TreeItem(basketTree, 0);
			 iItem.setText("Dossier-" + i);
			 iItem.setData(oneDossier);
			int nbDocument = oneDossier.getItemList().size();
			for (int d=0 ; d< nbDocument ; d++) {
				DossierItem oneItem = oneDossier.itemElementAt(d);
				if (oneItem.isDocument()) {
					Document oneDocu = (Document)oneItem ; 
					TreeItem jItem = new TreeItem(iItem, 0);
					jItem.setText(oneDocu.getDocumentFilename()) ;
					jItem.setData(oneDocu);
					
				} else {
					System.err.println ("UserBasketPanel::processBasketSelection(). Document's type not processed ! " +
								oneItem.getClass().getName());
				}
			} // for d
			
		}		
	}

}
