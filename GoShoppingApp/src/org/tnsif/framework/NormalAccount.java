package org.tnsif.framework;

public abstract class NormalAccount extends ShopAccount {
	
	private final float deliveryCharges;
	
	public NormalAccount(int accNo, String accnm, float charges, float deliveryChargers) {
		super(accNo, accnm, charges);
		this.deliveryCharges = deliveryChargers;
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "NormalAccount [deliveryChargers=" + deliveryCharges + "]";
	}
	
	public void bookProduct(float charges) 
	{
		System.out.println("Acc No: "+this.getAccNo()+" "+ "Acc Name: "+this.getAccnm()+
				" "+"Delivery charges: "+(this.getCharges()+this.deliveryCharges));
	}
	

}
