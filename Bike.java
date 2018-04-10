/****************************************************************************
 *
 * Created by: Heejo Suh
 * Created on: Apr 2018
 * Created for: learning
 * 
 * This program is a sub-blueprint of 'Vehicle'
 ****************************************************************************/

//Jet is the sub-class of Vehicle
public class Bike extends Vehicle {
	//class for bike
	
	public Bike(String colour){
		 super("", colour);
		//Constructor override
		 _numberOfDoors= 0;
		 _numberOfTires = 2;
		 _maximumSpeed = 20;			
	}
	public Bike(String colour, Double maxSpeed){
		 super("", colour);
		//Constructor override
		 _numberOfDoors= 0;
		 _numberOfTires = 2;
		 _maximumSpeed = maxSpeed;			
	}

	protected String All() {
		return ("Colour:"+_colour +"\nNumber of doors:"+_numberOfDoors+"\nSpeed:"+_speed+"km/h"+"\nMaximum Speed:"+_maximumSpeed+"km/h");
	}
	
}

