package org.tnsif.application;

import org.tnsif.framework.NormalAccount;

public class GSNormalAccount extends NormalAccount {

	public GSNormalAccount(int accNo, String accnm, float charges, float deliveryChargers) {
		super(accNo, accnm, charges, deliveryChargers);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "GSNormalAccount [toString()="+super.toString()+"]";
	}

	
	

	

}
