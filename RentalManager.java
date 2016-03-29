import java.io.*;
import java.util.*;

public class RentalManager {
	
	public ArrayList<RentalItem> rentalItems;
	public ArrayList<Receipt> receiptHistory;
	
	public RentalManager(){
		rentalItems = new ArrayList<RentalItem>();
		receiptHistory = new ArrayList<Receipt>();
	}
	
	public void loadItems(String filename){ // takes a filename and adds the items to the RentalItems
		try {
			//System.out.println("reading file " + file);
			BufferedReader infile = new BufferedReader( new FileReader( file ) );
			while ( infile.ready() ) {	//while the file is open
				String temp = infile.readLine();	//read the line in the file
				String[] a = temp.split("," , 4);	//splits the string at the commas into 4 pieces
				double basePrice = Double.parseDouble(a[2]);
				double hourRate = Double.parseDouble(a[3]);
				rentalItems.add(RentalItem(a[0],a[1],basePrice,hourRate)); // adds a rental item to the ArrayList
				//System.out.println(a[0] + " " + a[1] + " " + a[2] + " " + a[3] + " " );
			}
		}
		catch(Exception e)		{
				System.out.println();
		}
	}
	
	public ArrayList getAvailableItems(){
		ArrayList<RentalItem> AvailableItems;
		for(RentalItem item : rentalItems){	// I think this works otherwise use x = 0 to size
			if(item.Available()){
				AvailableItems.add(item);
			}
		}
		return AvailableItems;
	}
	
	public ArrayList getAllItems(){
		return rentalItems;
	}
	
	public void removeAllItems(){
		rentalItems.clear();
	}
	
	public void addReceipt(Receipt rec){
		receiptHistory.add(rec);
	}
	
	public double computeTotalIncome(){
		
	}
	
	public void printReceipt(Receipt rec){
		System.out.println(rec);
	}
}