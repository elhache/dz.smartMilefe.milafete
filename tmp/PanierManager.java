package dz.madania.milafete.userManagement;

import java.util.Hashtable;


/**
 * Manage set of paniers 
 * 
 * @author alikacem
 *
 */
public class PanierManager {
	public static final String PANIER_TOPROCESS = "ToProcess"; 
	Hashtable<String, Panier> panierTab = new Hashtable<String, Panier>() ; 
	

	public PanierManager() {
		populateFakePanier() ; 
	}
	/**
	 * Used for testing purpose
	 */
	private void populateFakePanier() {
		Panier toProcessPanier = new Panier() ; 
		toProcessPanier.initFakePanier();
		panierTab.put(PANIER_TOPROCESS, toProcessPanier);
	}
	
	/**
	 * 
	 * @param identifiant
	 * @return
	 */
	public Panier searchPanier(String identifiant) {
		return panierTab.get(identifiant) ; 
	}

}
