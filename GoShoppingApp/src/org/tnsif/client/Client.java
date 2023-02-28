package org.tnsif.client;

import org.tnsif.application.GSNormalAccount;
import org.tnsif.application.GSPrimeAccount;
import org.tnsif.application.GSShopFactory;
import org.tnsif.framework.ShopFactory;

public class Client {

	public static void main(String[] args) {
		
		ShopFactory f = new GSShopFactory();
		GSPrimeAccount p = new GSPrimeAccount(1234, "Pratik More", 1050f, true);
		GSNormalAccount n = new GSNormalAccount(1134, "Pratik Gosavi", 1050f, 60);
		
		//Prime Account
		System.out.println("Prime Account:");
		System.out.println(p);
		p.bookProduct(p.getCharges());
		
		//Normal Account
		System.out.println("Normal Account:");
		System.out.println(n);
		n.bookProduct(p.getCharges());
		
		f.getNewPrimeAcc(452, "manoj", 450, true);
		
		
		

	}

}
