package entity;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Rental {
  
	 private Customer customer;
	 private Vehicle vehicle;

	 private int renatl_ID;
	 private int rental_Days;
	
	 
	 public Rental(Customer customer, Vehicle vehicle, int rental_Days) {
		super();
		this.customer = customer;
		this.vehicle=vehicle;
	
		this.renatl_ID = 00;
		this.rental_Days = rental_Days;
	}


	public int getRental_Days() {
		return rental_Days;
	}
	
	
	public void saveRentalToFile(Rental rental) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("C:\\Users\\CDAC\\Desktop\\Vehicle_File.txt", true))) {
            writer.write(customer.toString());
            writer.newLine();
            writer.write(vehicle.toString());
            writer.newLine();
            writer.write("Rental Days: " + rental_Days);
            writer.newLine();
             writer.write("-------------------------");
            writer.newLine();
            System.out.println("Rental vehicle saved to file succesfully : " );
        } catch (IOException e) {
            System.out.println("Error saving rental: " + e.getMessage());
        }
    }

    public void displayRentalDetails() {
        System.out.println("Rental Details:");
        System.out.println(customer.toString());
        System.out.println(vehicle.toString());
        System.out.println("Rental Days: " + rental_Days);
       
}

	
	

	
	@Override
	public String toString() {
		return "Rental [customer=" + customer + ", vehicle=" + vehicle +", renatl_ID=" + renatl_ID
				+ ", rental_Days=" + rental_Days + "]";
	}
	

	
	 
	 
	 
}
