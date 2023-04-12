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
	//added the Tax Rate constant
    private final double TAX_RATE = 0.0825;

    public VehicleFactory(String aName, String aPhone, int aNbrVehicles, int aNbrTanks){
        name = aName;
        phone = aPhone;
        nbrVehicles = aNbrVehicles;
        nbrTanks = aNbrTanks;

        calcManufacturingCost();
        calcFuelTankCost();
        calcSubtotal();
        calcTax();
        calcTotal();
    }

    public void calcManufacturingCost(){
        manufactureCost = nbrVehicles * VEHICLE_PRICE;
    }

    public void calcFuelTankCost(){
        fuelTanksCost = nbrTanks * FUELCELL_PRICE;
    }

    public void calcSubtotal(){
        subtotal = manufactureCost + fuelTanksCost;
    }

    public void calcTax(){
        tax = subtotal * TAX_RATE;
    }

    public void calcTotal(){
        total = subtotal + tax;
    }

    public String getSummary(){
        String summary = "Vehicle Factory Summary\n";
        summary += "-----------------------\n";
        summary += "Name: " + name + "\n";
        summary += "Phone: " + phone + "\n";
        summary += "Number of Vehicles: " + nbrVehicles + "\n";
        summary += "Number of Fuel Tanks: " + nbrTanks + "\n";
        summary += "Manufacturing Cost: $" + String.format("%.2f", manufactureCost) + "\n";
        summary += "Fuel Tank Cost: $" + String.format("%.2f", fuelTanksCost) + "\n";
        summary += "Subtotal: $" + String.format("%.2f", subtotal) + "\n";
        summary += "Tax: $" + String.format("%.2f", tax) + "\n";
        summary += "Total: $" + String.format("%.2f", total) + "\n";
        return summary;
    }
}
