package entity;

public class Vehicle
{
   private int vehicle_ID;
   private String vehicle_type;

   
   
   public Vehicle( String vehicle_type) {
	super();
	this.vehicle_ID = 0000;
	this.vehicle_type = vehicle_type;
}


public int getVehicle_ID() 
   {
	return vehicle_ID;
   }
  
   
   public String getVehicle_type() 
  {
	return vehicle_type;
  } 
   
   
   public void isAvailable(int vehicle_ID)
   {
	   
	if(vehicle_ID<=0)
	{
		System.out.println("vehicle is not present");
	}
	else
	{   
		vehicle_ID =vehicle_ID+4;
	
	}
	
	
	
	
	   
   }


@Override
public String toString() {
	return "Vehicle [vehicle_ID=" + vehicle_ID + ", vehicle_type=" + vehicle_type + "]";
}



   
}
