/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Apr 2018
 * Created for: learning
 * 
 * This program is a sub-blueprint of 'Vehicle'
 ****************************************************************************/

//Jet is the sub-class of Vehicle
public class Truck extends Vehicle {
	//class for truck
	
	public static final double MultiplyBy = 0.4; 

	public Truck(String plate){
		super(plate, "Black"); 
		 _numberOfDoors = 2;
	}
	
	public Truck(String plate, String colour){
		super(plate, colour); 
		 _numberOfDoors = 2;
	}

	protected void Accelerate(double speed) {
		super.Accelerate(speed*MultiplyBy);
	}
	
	protected void Decelerate(double speed) {
		super.Decelerate(speed*MultiplyBy); 
	}
}