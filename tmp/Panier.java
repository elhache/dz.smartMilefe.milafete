package dz.madania.milafete.userManagement;

import java.util.Vector;


/**
 *  Manage Dossiers 
 *  
 * @author alikacem
 *
 */
@Deprecated
public class Panier {
	
	private Vector<Dossier> dossierList = new Vector<Dossier>() ; 

	
	public Vector<Dossier> getDossierList() {
		return dossierList;
	}


	/**
	 * 
	 */
	void initFakePanier() {
		int nbreDossier = 8; 
		int nbreDocu = 3 ; 
		String label ;
		Dossier newDossier ;
		Document newDocu ; 
		String docuLabel; 
		// String path = "E:/alikacem14/EnterpriseArchiPrj/ModelingLuna/workspace/dz.madania.milafete/documentScan/" ;
		String path = "E:/alikacem14/EnterpriseArchiPrj/ModelingLuna/workspace/dz.madania.milafete/documentScan/" ; 
		// String path = "C:/alikacem/luna/workspace/dz.madania.milafete/documentScan/" ;
		for (int i=1 ; i<=nbreDossier ; i++) {
			label = "DossierMat_00" + i ; 
			newDossier = new Dossier(label) ;
			for (int j=1 ; j<= nbreDocu ; j++) {
				docuLabel = "Etudiant"+ i + "-"+j ; 
				newDocu = new Document(docuLabel , docuLabel+".pdf", path, "pdf" ,newDossier); 
				newDossier.addDocument(newDocu);
			}
			
			dossierList.add(newDossier); 
		}
	}
	
	
	
}
