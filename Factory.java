package oop1;

import Bike
class Factory{
	//creating two object(two intances)
	public static void main(String[]args) {
		Bike pulsar=new Bike("Abc123gf69", "Red");
		Bike bullet=new Bike("BHJ678gf786","Green");
		
		//setting remaining properties
		pulsar.setOwnerName("Akhilesh");
		pulsar.setBikenumber("TS2456");
		
		
		
		bullet.setOwnerName(Anup);
		bullet.setBikenumber("WB65753");
		
		
		//performing operation 
		pulsar.start();
		bullet.move();
		pulsar.strop(); 
		
	}	
}