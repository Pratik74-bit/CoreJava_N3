package org.tnsif.framework;

public abstract class PrimeAccount extends ShopAccount {

	

	private boolean isPrime;
	private final float deliveryCharges = 0.0f;
	
	public PrimeAccount(int accNo, String accnm, float charges, boolean isPrime) {
		super(accNo, accnm, charges);
		this.isPrime = isPrime;
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges) 
	{
		System.out.println("Acc No: "+this.getAccNo()+" "+ "Acc Name: "+this.getAccnm()+
				" "+"Delivery charges: "+(this.getCharges()+this.deliveryCharges));
	}

	@Override
	public String toString() {
		return "PrimeAccount [isPrime=" + isPrime + ", deliveryCharges=" + deliveryCharges + "]";
	}

	


}
