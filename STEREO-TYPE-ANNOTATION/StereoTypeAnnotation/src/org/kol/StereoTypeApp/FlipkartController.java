package org.kol.StereoTypeApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FlipkartController {
	
	@Autowired
	private Furniture furnitures;
	
	@Autowired
	private Electronics electronic;
	
	@Autowired
	private Cosmetics cosmectic;
	
	
	public Furniture getFurnitures() {
		return furnitures;
	}
	public void setFurnitures(Furniture furnitures) {
		this.furnitures = furnitures;
	}
	public Electronics getElectronic() {
		return electronic;
	}
	public void setElectronic(Electronics electronic) {
		this.electronic = electronic;
	}
	public Cosmetics getCosmectic() {
		return cosmectic;
	}
	public void setCosmectic(Cosmetics cosmectic) {
		this.cosmectic = cosmectic;
	}
	
	public void purchase() {
		
		furnitures.sofa();
		electronic.Mobile();
		cosmectic.Lipsticks();
	}
	

}
