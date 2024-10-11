package entity;

public class Customer 
{
    private int cust_Id;
    
    private String name;

	public Customer( String name) 
	{
		super();
		this.cust_Id = 00;
		this.name = name;
	}

	

	public int getCust_Id() {
		return cust_Id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Customer [cust_Id=" + cust_Id + ", name=" + name + "]";
	}
	
    
    
    
}