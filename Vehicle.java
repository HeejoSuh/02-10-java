/****************************************************************************
 * * Created by: Heejo Suh
 * Created on: Mar 2018
 * Created for: learning
 * 
 * This class is a 'blueprint' for a stack
 * 
 * 
 *
 ****************************************************************************/

import java.util.ArrayList;
import java.util.EmptyStackException;

//****************************************************************************

public class Vehicle {
	//This is the class definition for a vehicle

	
	
	/*
	 * NOTE
	 * 
	 * public-----------
	 * The class/variable/method is accessible and available to 
	 * all the other objects in the system.
	 * 
	 * private-----------
	 * The class/variable/method is accessible and available within 
	 * this class only. Used for “background” work inside of the class
	 * 
	 * protected--------
	 * Any code inside of the class can see them, but no outside object can use them. 
	 * BUT CAN RETURN?
	 * 
	 */

	//--------------------------------------------------------
	
	
	//all the values are protected so you can't change them directly
	
	protected String _licensePlateNumber;
	protected String _colour;
	protected int _numberOfDoors;
	protected int _numberOfTires = 4;
	//start at rest, always have speed limit
	protected double _speed = 0;
	protected double _maximumSpeed = 300;

	//private fields(read-only)
	//private String plateFormat = "[A-Z0-9]*"; //format only includes (A to Z) and (0 to 9)
	/*
	 					* other formatting method:
	 * Matcher m = Pattern.compile("[A-Z][A-Z]([A-Z]|\\d)\\d\\d").matcher(input);
	if (m.find()) {
    	VALID
	} else {
    	NOT VALID
	}
	 */
	


	//--------------------------------------------------------

	//Java doesn't allow optional parameters with default values in constructors/methods
	//so have to write twice.
	//public Vehicle() throws Exception {
		//Constructor for vehicle class
		//this("ABCD123", "White"); //can just use 'this' since know it's in correct format
	//}
	
	public Vehicle(String plate, String colour) {
		//Constructor for vehicle class

		this.setLicensePlate(plate);
		//setColour(colour);
		this._colour = colour;
	}		
	//--------------------------------------------------------
	//getter 

	//-------------//LICENSE PLATE
	protected String getLicensePlate() { 
		//returns the license plate number
		return _licensePlateNumber;
	}

	//-------------//COLOUR
	protected String getColour() { 
		//returns the colour
		return _colour;
	}
	//-------------//DOORS
	protected int getNumberOfDoors() { 
		//returns the number of doors
		return _numberOfDoors;
	}
	//-------------//SPEED
	protected Double getSpeed() { 
		//returns the speed
		return _speed;
		
				
	}
	
	//-------------//ALL
	protected String All() { 
		//returns the basic info status about the vehicle

		return ("License plate:"+_licensePlateNumber +"\nColour:"+_colour +"\nNumber of doors:"+_numberOfDoors+"\nSpeed:"+_speed+"km/h"+"\nMaximum Speed:"+_maximumSpeed+"km/h");
	}

	//--------------------------------------------------------
	//setter 
	
	//-------------//LICENSE PLATE
	protected void setLicensePlate(String newPlate){ 
		//sets the license plate number
		
		//if(newPlate.length() == 7 && newPlate.matches(plateFormat)) {
			//check if correct format was used
			_licensePlateNumber = newPlate;
		//} else {
			//error
			//throw new UnavailablePlateException(); 
		//}
	}
	//-------------//COLOUR
	protected void setColour(String newColour) { 
		//sets the colour
		_colour = newColour;
	}
	//-------------//DOORS
	protected void setNumberOfDoors(int newDoorCount) { 
		//sets the number of doors
		_numberOfDoors = newDoorCount;
	}

	//----------------------- ACCELERATE
	protected void Accelerate(double accelerateAmount) {
		//Accelerate the speed by input
		if ((_speed + accelerateAmount) <= _maximumSpeed){
			//if not over max limit
			_speed =+ accelerateAmount;
		} else {
			//set it to max
			_speed = _maximumSpeed;
		}
	}
	//----------------------- BREAK
	protected void Decelerate(double decelerateAmount) {
		//Decelerate the speed by input
		if ((_speed - decelerateAmount) >= 0){
			//if not negative
			_speed = _speed- decelerateAmount;
		} else {
			//set it to 0
			_speed = 0;
		}
	}

	//--------------------------------------------------------
}//closing for class