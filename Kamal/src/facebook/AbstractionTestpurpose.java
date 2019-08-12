package facebook;

public class AbstractionTestpurpose {

	public static void main(String[] args) {
		
		Bank ba =new Bank();//partial abstraction
		ba.credit();
		ba.debit();
		ba.loan();
		ba.funds(); //object ba get variables from Bank funds is in Bank so it displayed
		
		
		HdfcBank bb=new Bank();//dynamic polymorphosm
		bb.credit();
		bb.debit();
		bb.loan();
		//bb.funds();  //the object bb get variables from Hdfcbank only (funds is not in HdfcBank) so it will not display
		

	}

}
