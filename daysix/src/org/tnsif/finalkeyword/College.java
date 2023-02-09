package org.tnsif.finalkeyword;
//using final keyword to parent class
final class College {
	
	int rollno;
	void print() {
		System.out.println("roll no is "+ rollno);
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	
	
}

//we cannot create child class for the College class because of final keyword
//class Student extends College; will give error