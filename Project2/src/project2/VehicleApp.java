/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package project2;
import java.util.Scanner;

/**
 *
 * @author Administrator
 */
public class VehicleApp {

    private static Scanner input;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //System prints for the app (Strings)
        System.out.println("Welcome to the Fueling cell app!");
        System.out.println("Enter your first name: ");
        String firstName = input.nextLine();
        if (firstName.isEmpty()) {
            System.out.println("Please enter your first name.");
            firstName = input.nextLine();
        }
        
        System.out.println("Enter your last name: ");
        String lastName = input.nextLine();
        if (lastName.isEmpty()) {
            System.out.println("Please enter your last name.");
            lastName = input.nextLine();
        }
        
        System.out.println("Enter your phone number: ");
        String phoneNumber = input.nextLine();
        if (phoneNumber.isEmpty()) {
            System.out.println("Please enter your phone number.");
            phoneNumber = input.nextLine();
        }
        
        //System prints for the app (Integers)
        System.out.println("Enter the number of vehicles to be manufactured: ");
        int nbrVehicles = input.nextInt();
        if (nbrVehicles <= 0) {
            System.out.println("Please enter a valid number of vehicles to be manufactured.");
            nbrVehicles = input.nextInt();
        }
        
        System.out.println("Enter the number of fuel tankes to be mounted: ");
        int nbrTanks = input.nextInt();
        if (nbrTanks <= 0) {
            System.out.println("Please enter a valid number of fuel tanks to be mounted.");
            nbrTanks = input.nextInt();
        }
        // create a new instance of the VehicleFactory class
        VehicleFactory factory = new VehicleFactory(firstName + " " + lastName, phoneNumber, nbrVehicles, nbrTanks);

        System.out.println(factory.getSummary());

        
    }
    
}
