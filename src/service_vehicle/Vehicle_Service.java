
package service_vehicle;
import java.util.ArrayList;
import java.util.List;

import entity.*;


public class Vehicle_Service {
	
	    private List<Rental> rentals;

	    public Vehicle_Service() {
	        this.rentals = new ArrayList<>();
	    }

	    public void addRental(Rental rental) {
	        rentals.add(rental);
	    }

	    public void displayAllRentals() {
	        System.out.println("\n--- All Rentals ---");
	        for (Rental rental : rentals) {
	            rental.displayRentalDetails();
	        }
	    }

	    public void saveAllRentalsToFile(Rental filename) {
	        for (Rental rental : rentals) {
	            rental.saveRentalToFile(filename);
	        }
	    }
	}

