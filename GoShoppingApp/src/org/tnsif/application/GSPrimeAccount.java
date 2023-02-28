package org.tnsif.application;

import org.tnsif.framework.PrimeAccount;

public class GSPrimeAccount extends PrimeAccount{

	public GSPrimeAccount(int accNo, String accnm, float charges, boolean isPrime) {
		super(accNo, accnm, charges, isPrime);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSPrimeAccount [toString()="+super.toString()+"]";
	}

	
	

	

	

}
