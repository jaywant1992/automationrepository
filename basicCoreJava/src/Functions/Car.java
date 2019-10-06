package Functions;

public class Car {

	
	String colour;
	static int wheels;
	String brand;
	String model;
	
		
	public void powerSteering()
	{
		System.out.println("All "+wheels+" wheels support power steering");
	}

	public void lookAndFeel()
	{
		System.out.println(brand+" has "+colour+" colour in "+model+" cars");
	}
}
