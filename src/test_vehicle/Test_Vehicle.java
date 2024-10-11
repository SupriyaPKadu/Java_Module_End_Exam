
package test_vehicle;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import entity.*;
import vehicle_exception.*;
import java.io.IOException;
import service_vehicle.*;

public class Test_Vehicle{
	
	
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Vehicle_Service vehicleservice = new Vehicle_Service();

        try {
            
            System.out.print("Enter How many rentals Day You want: ");
            int numberOfRentals = Integer.parseInt(reader.readLine());

            for (int i = 0; i < numberOfRentals; i++) {
                System.out.println("\n--- Rental " + (i + 1) + " ---");

                
                System.out.print("Enter your name: ");
                String name = reader.readLine();
                
                Customer customer = new Customer( name);

              
                System.out.print("Enter vehicle type: ");
                String vehicle_type = reader.readLine();
              
                Vehicle vehicle = new Vehicle( vehicle_type);

              
                System.out.print("Enter rental days: ");
                int rental_Days = Integer.parseInt(reader.readLine());
              

              
                Rental rental = new Rental(customer, vehicle, rental_Days);
                rental.saveRentalToFile(rental);

                
                rental.displayRentalDetails();
            }

            
           

        } catch (IOException  e) {
            System.out.println("Error: " );
       
    }
}

}