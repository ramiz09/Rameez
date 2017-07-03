package carapplication;

import java.time.LocalDate;
import java.util.Scanner;

public class MercedesBenz {
	
	 
	 private static int count1  = 9;
	 private static int count2 = 11;
	 private static int count3 = 23;
	 private static int count4 = 3;
	 
	 public void carDesc(){
		 System.out.println("\nMercedesBenz section\n");
	 }
	 
	 
	 public static void fetchData(){
	 
	       Car[] ArrayOfCars = new Car[3];
	       ArrayOfCars[0] = new Car("Mercedes Benz A Class","Mercedes Benz","Hatchback","Custom",2400000,"Petrol",3,1200,5,"Automatic",30,15,50,40);
	       ArrayOfCars[1] = new Car("Mercedes Benz B Class","Mercedes Benz","MPV","Red",4400000,"Petrol-Diesel",4,1100,6,"Automatic",31,14,52,41);
	       ArrayOfCars[2] = new Car("Mercedes Benz C Class","Mercedes Benz","Sedan","Black",2500000,"Petrol",4,1300,5,"Automatic",32,16,55,45);
	       
	       System.out.println("You get these cars under this brand!");
	       for (Car e : ArrayOfCars){
	    	   System.out.println("NameofCar: " + e.getCarName()  + ", CarBrand: " + e.getCarBrand() + ", CarType: " + e.getCarType() + ", EngineType: " + e.getEngineType() +", color: " + e.getCarColor() +	", Price: " + e.getCarPrice() 
	   	    + ", Cylinder: " + e.getCylinderType() + ", Displacement: " + e.getDisplacement() + "cc"
	   	    + ", Transmission: " + e.getTransmission() + ", Mode: " + e.getMode()
	   	    + ", HorsePower: " + e.getHorsePower() + "hp" + ", FuelTankCap: " + e.getFuelTankCap() + "litres" + ", Wheelbase: " + e.getWheelBase() + "mm" + ", TrackDistance: " + e.getTrackDistance()+ "mm");
	   	    System.out.println('\n');
			}
	       
	       System.out.println("Make a choice among them!!");
	       System.out.println("1->A Class\n2->B Class\n3->C Class\n");
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
	   	   	      LocalDate deliverydate = date.plusDays(68);
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
	   	   	      LocalDate deliverydate = date.plusDays(50);
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
	   	   	      LocalDate deliverydate = date.plusDays(97);
	   	   	      System.out.println("Delivery of the car will be on: " + deliverydate);
	   	   	
	    	  }
	    	   
	    	   else
	    		   System.out.println("Sorry!! car not available");
	    	   
	       }
	       
	    	   
	       else if(choice == 4){
	    	   int temp = check4();
	    	   if(temp > 0){
	    		  changeCount4();
	    		  System.out.println("Your booking is done\n");
	    		  LocalDate date = LocalDate.now();
	   	   	      System.out.println("You have booked your car on: " + date.now());
	   	   	      LocalDate deliverydate = date.plusDays(49);
	   	   	      System.out.println("Delivery of the car will be on: " + deliverydate);
	   	   	
	    	  }
	    	   
	    	   else
	    		   System.out.println("Sorry!! car not available");
	    	   
	       }
	    
	       
	             
	 
	 }  //function close
	 
	 
	 
	 
	 public static int check1(){ 
		 
		 return count1;
	 }
	 
	 
	 public static int check2(){ 
		 
		 return count2;
 
	 }
	 
	 
	 public static int check3(){ 
		 
		 return count3;
 
	 }
	 
	 
 public static int check4(){ 
		 
		 return count4;
 
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
	 
	 public static void changeCount4(){
		 count4--;
	 }
	 
	 

}   //class close







