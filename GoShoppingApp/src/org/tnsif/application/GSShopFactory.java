package org.tnsif.application;

import org.tnsif.framework.NormalAccount;
import org.tnsif.framework.PrimeAccount;
import org.tnsif.framework.ShopFactory;

public class GSShopFactory extends ShopFactory {

	@Override
	public PrimeAccount getNewPrimeAcc(int accNo, String accnm, float charges, boolean isPrime) {
		GSPrimeAccount p = new GSPrimeAccount(accNo,accnm,charges,isPrime);
		return p;
	}

	@Override
	public NormalAccount getNewNormalAcc(int accNo, String accnm, float charges, float deliveryCharges) {
		GSNormalAccount n = new GSNormalAccount(accNo,accnm,charges,deliveryCharges);
		return n; 
	}

}
