package edu.pitt.is17.ced62.finalproject;

import java.util.Date;

public class RentalItem {

	private String itemId;
	private String type;
	private double baseFee;
	private double hourPrice;
	private Date rentalStartDate;
	private String clientName;

	final double TAX_RATES = .07;

	//Constructor #1
	public RentalItem (String itemId, String type){


		String validate = type.toLowerCase(); //String that validates type to lowercase

		if(validate.equals("bike")) {
			this.type = "bike";
		}
		else if (validate.equals("kayak")) {
			this.type = "kayak";
		}
		else if (validate.equals("segway")) {
			this.type = "segway";
		}
		else {
			this.type = "bike";
		}

		//attributes not passed as parameters should be set to default values. WHAT DOES THIS MEAN

	}
	//Constructor #2
	public RentalItem(String itemId, String type, double baseFee,double hourPrice){

	}

	 //PART D NEED HELP
	public void Rent(String clientName){
	}

	//PART E DONE
	public boolean available() { 
		if (rentalStartDate == null){		 
			return true;
		}
		else{
			return false;
		}
	}
















	/**
	 * 
	 * Getters & Setters for RentalItem Class
	 * 
	 */
	public String getItemId() {
		return itemId;
	}
	public void setItemId(String itemId) {
		this.itemId = itemId;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getBaseFee() {
		return baseFee;
	}
	public void setBaseFee(double baseFee) {
		this.baseFee = baseFee;
	}
	public double getHourPrice() {
		return hourPrice;
	}
	public void setHourPrice(double hourPrice) {
		this.hourPrice = hourPrice;
	}
	public Date getRentalStartDate() {
		return rentalStartDate;
	}
	public void setRentalStartDate(Date rentalStartDate) {
		this.rentalStartDate = rentalStartDate;
	}
	public String getClientName() {
		return clientName;
	}
	public void setClientName(String clientName) {
		this.clientName = clientName;
	}
	public double getTAX_RATES() {
		return TAX_RATES;
	}

}
