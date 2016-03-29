package edu.pitt.is17.ced62.finalproject;
/*
 * This simple program test that the core functionalities of the 
 * classes RentalManager, RentalItem and Receipt work.  
 * You have to have the folder "data" and inside the file 
 * "rental_items.txt".
 * Also make sure you change the package name when adding it to 
 * your own assignment project. 
 */
public class Test {

	public static void main(String[] args) {
		RentalManager manager = new RentalManager();
		manager.loadItems("data/rental_items.txt");
		
		RentalItem r = manager.getAvailableItems().get(0);
		r.rent("Julio");
		try{
			Thread.sleep(10000); // pause for 10 seconds
		}catch(Exception e){}
		Receipt receipt = r.returnItem();
		RentalManager.printReceipt(receipt); // a text file should appear inside folder data. Refresh the view of eclipse to see the file.
		manager.addReceipt(receipt);
	
	}

}
