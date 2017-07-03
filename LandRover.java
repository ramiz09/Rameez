package carapplication;

import java.time.LocalDate;
import java.util.Scanner;

public class LandRover extends CarDescription {
	
	 
	 
	 private static int count1 = 2;
	 private static int count2 = 21;
	 private static int count3 = 39;
	 
	 
	 public void carDesc(){
		 System.out.println("\nLandRover section\n");
	 }
	
	 
      public static void fetchData(){
	 
	       Car[] ArrayOfCars = new Car[3];
	       ArrayOfCars[0] = new Car("Range Rover Evoque","LandRover","SUV","Red",4200000,"Petrol",4,1400,5,"Automatic",35,12,52,41);
	       ArrayOfCars[1] = new Car("Range Rover Defender","LandRover","MUV","Custom Color",6000000,"Petrol",3,1300,5,"Manual",31,15,41,42);
	       ArrayOfCars[2] = new Car("Range Rover Classic","LandRover","SUV","Black",5500000,"Petrol",3,1100,6,"Automatic",29,13,46,38);
	       
	       
	       System.out.println("You get these cars under this brand!");
	       for (Car e : ArrayOfCars){
	    	   System.out.println("NameofCar: " + e.getCarName()  + ", CarBrand: " + e.getCarBrand() + ", CarType: " + e.getCarType() + ", EngineType: " + e.getEngineType() +", color: " + e.getCarColor() +	", Price: " + e.getCarPrice() 
	   	       + ", Cylinder: " + e.getCylinderType() + ", Displacement: " + e.getDisplacement() + "cc"
	   	       + ", Transmission: " + e.getTransmission() + ", Mode: " + e.getMode()
	   	       + ", HorsePower: " + e.getHorsePower() + "hp" + ", FuelTankCap: " + e.getFuelTankCap() + "litres" + ", Wheelbase: " + e.getWheelBase() + "mm" + ", TrackDistance: " + e.getTrackDistance()+ "mm");
	   	       System.out.println('\n');
			}
	       
	       System.out.println("Make a choice among them!!");
	       System.out.println("1->Evoque\n2->Defender\n3->Classic\n");
	       Scanner input = new Scanner(System.in);
	       
	       
	       int choice = input.nextInt();
	       System.out.println("wait a minute,need to check the availability");
	       if(choice == 1){
	    	  int temp = check1();
	    	  if(temp > 0){
	    		  changeCount1();
	    		  System.out.println("Your booking is done\n");
	    		  LocalDate date = LocalDate.now();
	   	   	      System.out.println("You have booked your car on: " + date.now());
	   	   	      LocalDate deliverydate = date.plusDays(110);
	   	   	      System.out.println("Delivery of the car will be on: " + deliverydate);
	   	   	
	   	       
	    	  }
	    	  
	    	  else
	    		   System.out.println("Sorry!! car not available");
	    	   
	    	   
	       }

	       else if(choice == 2){
	    	   int temp = check2();
	    	   if(temp > 0){
	    		  changeCount2();
	    		  System.out.println("Your booking is done\n");
	    		  LocalDate date = LocalDate.now();
	   	   	      System.out.println("You have booked your car on: " + date.now());
	   	   	      LocalDate deliverydate = date.plusDays(120);
	   	   	      System.out.println("Delivery of the car will be on: " + deliverydate);
	   	   	
	   	       
	    	  }
	    	   
	    	   else
	    		   System.out.println("Sorry!! car not available");
	    	   
	    	   
	       }
	    	   
	       else if(choice == 3){
	    	   int temp = check3();
	    	   if(temp > 0){
	    		  changeCount3();
	    		  System.out.println("Your booking is done\n");
	    		  LocalDate date = LocalDate.now();
	   	   	      System.out.println("You have booked your car on: " + date.now());
	   	   	      LocalDate deliverydate = date.plusDays(140);
	   	   	      System.out.println("Delivery of the car will be on: " + deliverydate);
	   	   	
	   	       
	    	  }
	    	   
	    	   else
	    		   System.out.println("Sorry!! car not available");
	    	   
	    	   
	      }
	       
	    	   
	      
      }   //function close
	    
	      
	 
	 
	
	 public static int check1(){ 
		 
		 return count1;
	 }
	 
	 
	 public static int check2(){ 
		 
		 return count2;
 
	 }
	 
	 
	 public static int check3(){ 
		 
		 return count3;
 
	 }	
	 
	 
		 
	 public static void changeCount1(){
		 count1--;
	 }
	 
	 
	 public static void changeCount2(){
		 count2--;
	 }
	 
	 
	 public static void changeCount3(){
		 count3--;
	 }
	 
	 


}     //class close










