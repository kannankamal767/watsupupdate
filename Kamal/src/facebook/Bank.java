package facebook;

public class Bank extends HdfcBank{
	
	public void debit(){
		System.out.println("Debit--unlimited");
	//	we create normal method for debit but debit abstract class is in Hdfcbank class it will extends to that class
	}
	public void funds(){
		System.out.println("bank--funds");
	}
	
	
	
	
	

}
