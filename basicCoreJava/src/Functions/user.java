package Functions;

public class user {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car car1 = new Car();
		car1.brand = "Maruti";
		car1.wheels = 6;
		car1.colour = "red";
		car1.model = "Sedan";
		car1.powerSteering();
		car1.lookAndFeel();

		Car car2 = new Car();
		//car2.brand = "Honda";
		//car2.wheels = 6;
		car2.colour = "Blue";
		car2.model = "SUV";
		car2.powerSteering();
		car2.lookAndFeel();
	}

}
