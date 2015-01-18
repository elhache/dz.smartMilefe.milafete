package dz.smartMilefe.milafete.mainGUI;

import org.eclipse.swt.widgets.Button;

import dz.smartMilefe.milafete.milafeteDataModel.Basket;

/**
 * Holds data for Basket Visualization
 * @author alikacem
 *
 */
public class BasketVue {
	private String name ; 
	private String iconFilename ; 
	private Basket modelBasket ; 
	private Button basketControl ;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getIconFilename() {
		return iconFilename;
	}
	public void setIconFilename(String iconFilename) {
		this.iconFilename = iconFilename;
	}
	public Basket getModelBasket() {
		return modelBasket;
	}
	public void setModelBasket(Basket modelBasket) {
		this.modelBasket = modelBasket;
	}
	public Button getBasketControl() {
		return basketControl;
	}
	public void setBasketControl(Button basketControl) {
		this.basketControl = basketControl;
	} 
	
	

	
}
