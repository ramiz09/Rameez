package carapplication;

import java.time.LocalDate;
import java.util.Scanner;

public class MarutiSuzuki {
	
	 
	 
	 private static int count1 = 0;
	 private static int count2 = 21;
	 private static int count3 = 31;
	 
	 
	 public void carDesc(){
		 System.out.println("\nMaruti-Suzuki section\n");
	 }
	 
	 
	 public static void fetchData(){
	 
	       Car[] ArrayOfCars = new Car[3];
	       ArrayOfCars[0] = new Car("Swift","Maruti-Suzuki","Hatchback","Red",400000,"Petrol",3,1200,5,"Manual",30,15,52,43);
	       ArrayOfCars[1] = new Car("Vitara-Brezza","Maruti-Suzuki","SUV","White",800000,"Diesel",3,1250,5,"Manual",30,13,51,42);
	       ArrayOfCars[2] = new Car("Ertiga","Maruti-Suzuki","MUV","Red",600000,"Petrol-Diesel",3,1209,5,"Automatic",33,11,55,41);
	       
	       
	       System.out.println("You get these cars under this brand!");
	       for (Car e : ArrayOfCars){
	    	   System.out.println("NameofCar: " + e.getCarName()  + ", CarBrand: " + e.getCarBrand() + ", CarType: " + e.getCarType() + ", EngineType: " + e.getEngineType() +", color: " + e.getCarColor() +	", Price: " + e.getCarPrice() 
	   	    + ", Cylinder: " + e.getCylinderType() + ", Displacement: " + e.getDisplacement() + "cc"
	   	    + ", Transmission: " + e.getTransmission() + ", Mode: " + e.getMode()
	   	    + ", HorsePower: " + e.getHorsePower() + "hp" + ", FuelTankCap: " + e.getFuelTankCap() + "litres" + ", Wheelbase: " + e.getWheelBase() + "mm" + ", TrackDistance: " + e.getTrackDistance()+ "mm");
	   	    System.out.println('\n');
			}
	       
	       System.out.println("Make a choice among them!!");
	       System.out.println("1->Swift\n2->Vitara-Brezza\n3->Ertiga\n");
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
	   	   	      LocalDate deliverydate = date.plusDays(20);
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
	   	   	      LocalDate deliverydate = date.plusDays(30);
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
	   	   	      LocalDate deliverydate = date.plusDays(55);
	   	   	      System.out.println("Delivery of the car will be on: " + deliverydate);
	   	   	
	    	  }
	    	   
	    	   else
	    		   System.out.println("Sorry!! car not available");
	    	   
	       }
	    
	       
	       
	      
	 
	 }  // function close
	 
	 
		 
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
	 
	 
 
}  //class close







