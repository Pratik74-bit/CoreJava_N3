package org.tnsif.framework;

public abstract class ShopAccount {
	private int accNo;
	private String accnm;
	private float charges;
	
	//getters and setters
	public int getAccNo() {
		return accNo;
	}
	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}
	public String getAccnm() {
		return accnm;
	}
	public void setAccnm(String accnm) {
		this.accnm = accnm;
	}
	public float getCharges() {
		return charges;
	}
	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	public ShopAccount(int accNo, String accnm, float charges) {
		super();
		this.accNo = accNo;
		this.accnm = accnm;
		this.charges = charges;
	}
	
	@Override
	public String toString() {
		return "ShopAccount [accNo=" + accNo + ", accnm=" + accnm + ", charges=" + charges + "]";
	}
	
	abstract void bookProduct(float charges);
	
	public void items(float charges) {
		System.out.println(charges);
	}
	
	
	
	
	
	
}
