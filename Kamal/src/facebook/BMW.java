package facebook;

public class BMW implements Car{

	@Override
	public void start() {
	System.out.println("Bmw--Started");		
	}

	@Override
	public void stop() {
    System.out.println("Bmw--stopped");
		
	}

	@Override
	public void refuel() {
	System.out.println("Bmw--refueled");
		
	}
	//BMW class has its own method also ,this car will never share the variable to anybody
	
	public void TheftSafety(){
		System.out.println("BMW--very safety");
		System.out.println("car is valid assret");
		
	}

	
}
