package org.tnsif.polymorphismdemo;

public class Smartphone {
	
	private int resolution;
	private String slottype;
	
	public void display(int resolution) {
		System.out.println("Resolution is "+ resolution);
		
	}
	
	public void display(int resolution, String slotype) {
		System.out.println("Resolution is "+ resolution);
		System.out.println("slottype is "+ slotype);
		
	}

	public int getResolution() {
		return resolution;
	}

	public void setResolution(int resolution) {
		this.resolution = resolution;
	}

	public String getSlottype() {
		return slottype;
	}

	public void setSlottype(String slottype) {
		this.slottype = slottype;
	}
	
	

}
