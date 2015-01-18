package dz.madania.milafete.userManagement;

/**
 * Models one Document
 * @author alikacem
 *
 */
@Deprecated
public class Document {
	
	private String docuType ;
	private String fileType ; // pdf, jpg, etc. 
	private String docuLabel ; 
	private String docuPath ; // ends with separator
	private String docuFilename ; // simple file name with extension 
	private Dossier dossier ; 
	
	/**
	 * 
	 * @param _label
	 * @param _filename
	 * @param _path
	 * @param _fileType
	 * @param _dossier
	 */
	public Document(String _label , String _filename , String _path, String _fileType, Dossier _dossier) {
		docuLabel = _label ; 
		docuFilename = _filename ; 
		docuPath = _path ; 
		fileType = _fileType; 
		dossier = _dossier; 
	}
	
	
	public String getDocuType() {
		return docuType;
	}


	public void setDocuType(String docuType) {
		this.docuType = docuType;
	}


	public String getFileType() {
		return fileType;
	}


	public String getDocuLabel() {
		return docuLabel;
	}


	public String getDocuPath() {
		return docuPath;
	}


	public String getDocuFilename() {
		return docuFilename;
	}


	public Dossier getDossier() {
		return dossier;
	}


	/**
	 * returns the full name of the file (including path and extension) 
	 * @return
	 */
	public String absoluteFilename(){
		return docuPath + docuFilename ; 
	}

}
