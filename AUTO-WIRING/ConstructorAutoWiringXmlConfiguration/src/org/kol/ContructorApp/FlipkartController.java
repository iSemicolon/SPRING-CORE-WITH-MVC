package org.kol.ContructorApp;

public class FlipkartController {
	
	private Electronics ec;
	private Furniture fc;
	private Cosmetics cs;
	
	
	
	
	
	public FlipkartController(Electronics ec, Furniture fc, Cosmetics cs) {
		super();
		this.ec = ec;
		this.fc = fc;
		this.cs = cs;
	}





	public void purchase() {
		
		ec.mobile();
		fc.sofa();
		cs.lipsticks();
		
	}

}
