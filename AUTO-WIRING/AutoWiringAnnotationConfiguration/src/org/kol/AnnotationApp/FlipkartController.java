package org.kol.AnnotationApp;

import org.springframework.beans.factory.annotation.Autowired;

public class FlipkartController {
	
	@Autowired
	private Electronics ec;
	@Autowired
	private Furniture fc;
	@Autowired
	private Cosmetics cs;
	
	
	public Electronics getEc() {
		return ec;
	}
	public void setEc(Electronics ec) {
		this.ec = ec;
	}
	public Furniture getFc() {
		return fc;
	}
	public void setFc(Furniture fc) {
		this.fc = fc;
	}
	public Cosmetics getCs() {
		return cs;
	}
	public void setCs(Cosmetics cs) {
		this.cs = cs;
	}
	
	
	public void purchase() {
		
		ec.mobile();
		fc.sofa();
		cs.lipsticks();
		
	}

}
