package oop1;

public class Bike {

	String engineNumb;
	String color;
	String ownerNam;
	String bikeNum;
	
	
	Bike(String engineNumber,String color){
		this.engineNumb=engineNumber;
		this.color=color;
	  }
	
	void setOwnerName(String ownerName) {
		this.ownerNam=ownerName;
	}
	void setBikenumber(String bikeNumber) {
		this.bikeNum=bikeNumber;
	}
	
	void start(){
		System.out.println(ownerNam +"bike started");
		
	}
	
	void move(){
		System.out.println(ownerNam +"bike move");
		
	}
	void stop(){
		System.out.println(ownerNam +"bike started");
		
	}
	
}



