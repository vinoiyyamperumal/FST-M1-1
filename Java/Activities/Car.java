package Activities;

public class Car {
	
	  int doors;
	 int tyres;
	 String color;
	 String transmission;
	 int make;
	 
	Car( ){

	 this. tyres = 4;
	 this.doors = 4;
}
	

	public void displayCharacteristics() {
		System.out.println(color);
		System.out.println(transmission);
		System.out.println(make);
		System.out.println(tyres);
		System.out.println(doors);
	}
	public void accelarate() {
		System.out.println( " Car is moving forward");
	}
	public void brake() {
		System.out.println("Car has stopped.");
	}
}