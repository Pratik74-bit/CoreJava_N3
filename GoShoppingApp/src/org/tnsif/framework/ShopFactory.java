package org.tnsif.framework;

public abstract class ShopFactory {
	
	public abstract PrimeAccount getNewPrimeAcc(int accNo, String accnm, float charges, boolean isPrime);
	public abstract NormalAccount getNewNormalAcc(int accNo, String accnm, float charges, float deliveryCharges);
}