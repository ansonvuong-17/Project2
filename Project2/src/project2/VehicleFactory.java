/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project2;

/**
 *
 * @author Administrator
 */
public class VehicleFactory {
	//variables to hold our object properties
	private String name;
	private String phone;
	private int nbrVehicles =0;
	private int nbrTanks =0;
	private double manufactureCost =0;
	private double fuelTanksCost =0;
	private double subtotal =0;
	private double tax =0;
	private double total = 0;

	//constants to hold our pricing properties
	private final double VEHICLE_PRICE = 500.19;
	private final double FUELCELL_PRICE = 2.15;
	
	//you have to create a constant and store the tax rate in it
	
	
	public VehicleFactory(String aName, String aPhone, int aNbrVehicles, int aNbrTanks){
		//add necessary code in here
	
	}
	
	//Add methods to perform your calculations here
	//for example you have to calculate the manufacturing cost and store it in manufactureCost
	public void calcManufacturingCost(){
		
	}
	
	//for example you have to calculate the fuel tanks cost and store it in fuelTankCost
	public void calcFuelTankCost(){
		
	}
	
	//add method to calculate the subtotal and store it in subtotal
	public void calcSubtotal(){
		
	}
	
	//add method to calculate the tax and store it in tax
	public void calcTax(){
		
	}
	
	//add method to calculate the total and store it in total
	public void calcTotal(){
		
	}
	
	//Add a method to return a summary for this object here
	public String getSummary(){
		//you have to build your summary and store it in the summary variable
		
		return null;
	}
}
