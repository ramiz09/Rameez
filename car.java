package carapplication;

class Car{
	
	private String carName;
	private String carBrand;
	private String carType;
	private String color;
	private double price;
	private String engine;
	private int cylinder;
	private float displacement;
	private int transmission;
	private String mode;
	private float  horsePower;
	private float fuelTankCap;
	private float wheelbase;
	private float trackDistance;

	public Car(String aCarName, String aCarbrand, String aCarType,String aColor,double aPrice, String aEngine , int aCylinder,  float aDisplacement ,int aTransmission , String aMode, float aHorsePower, float aFuelTank , float aWheelBase, float aTrackDistance){
	carName = aCarName;
	carBrand = aCarbrand;
	carType = aCarType;
	color = aColor;
	price = aPrice;
    engine = aEngine;
	cylinder = aCylinder;
	displacement = aDisplacement;
	transmission = aTransmission;
    mode = aMode;
    horsePower = aHorsePower;
    fuelTankCap = aFuelTank;
    wheelbase = aWheelBase;
    trackDistance = aTrackDistance ;
	
	}  //function close
	
	
	public String getCarName(){
	return carName;
	}
	
	
	public String getCarBrand(){
	return carBrand;
	}
	
	
	public String getEngineType(){
		return engine;
	}
	
	
	public String getCarType(){
		return carType;
	}
	
	
	public String getCarColor(){
		return color;
	}
	
	
	public int getCylinderType(){
		return cylinder;
	}
	
	
	public float getDisplacement(){
		return displacement;
	}
	
	
	public int getTransmission(){
		return transmission;
	}
	
	
	public String getMode(){
		return mode;
	}
	
	
	public float getHorsePower(){
		return horsePower;
	}
	
	
	public float getFuelTankCap(){
		return fuelTankCap;
	}
	
	
	public float getWheelBase(){
		return wheelbase;
	}
	
	
	public float getTrackDistance(){
		return trackDistance;
	}
	
	
	public double getCarPrice(){
		return price;
	}
	
	
    

}  //class close
    

    

