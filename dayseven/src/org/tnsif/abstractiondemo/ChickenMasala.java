package org.tnsif.abstractiondemo;

public class ChickenMasala extends Menu {

	/* Implement all the Abstract methods otherwise you will get error*/
	@Override
	void recipe() {
		System.out.println("ChickenMasala ");
		
	}

	@Override
	void foodtype() {
		System.out.println("Food Type is NonVeg");
		
	}
	

}


