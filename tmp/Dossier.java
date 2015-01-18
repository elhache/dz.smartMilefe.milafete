package dz.madania.milafete.userManagement;

import java.util.Vector;


/**
 * Models a file (dossier) which is a set of documents 
 * and associated data 
 * 
 * @author alikacem
 *
 */
@Deprecated
public class Dossier {
	
	private String label ; 
	private Vector<Document> documentList = new Vector<Document>() ;
	
	// Vector
	public Dossier(String _label) {
		label = _label ;
	}
	
	public String getLabel() {
		return label;
	}

	/**
	 * 
	 * @param documentFile
	 */
	public void addDocument(Document document) {
		documentList.add(document); 
	}
	
	/**
	 *     
	 * @return
	 */
	public Vector<Document> getDocumentList() {
		return documentList ; 
	}
}
