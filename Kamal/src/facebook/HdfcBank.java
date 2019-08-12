package facebook;


public abstract class HdfcBank{
	
	public void loan(){
		System.out.println("Education--loan");
		
	}
	
	public abstract void debit();
	//we only declare a method for abstract method ,we define in bank class
		
	public void credit(){
		System.out.println("business--credit");
		
		
	}

	
	
	
	
	

}
