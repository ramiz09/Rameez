package carapplication;

import java.time.LocalDate;
import java.util.Scanner;

public class Audi {
	
	 
	 private static int count1 = 8;
	 private static int count2 = 2;
	 private static int count3 = 5;
	 
	 public void carDesc(){
		 System.out.println("\nAudi section\n");
	 }
	 
	 
	 
     public static void fetchData(){
	 
	       Car[] ArrayOfCars = new Car[3];
	       ArrayOfCars[0] = new Car("Audi A3","Audi","Sedan","Custom Color",3300000,"Petrol",4,2100,5,"Manual",30,15,50,40);
	       ArrayOfCars[1] = new Car("Audi A4","Audi","SUV","Red",3400000,"Petrol",3,1900,5,"Automatic",40,19,51,42);
	       ArrayOfCars[2] = new Car("Audi A4 cabriolet","Audi","Coupe","Custom Color",4400000,"Petrol",3,2200,6,"Automatic",33,18,51,49);
	       
	       System.out.println("You get these cars under this brand!");
	       for (Car e : ArrayOfCars){
	    	   System.out.println("NameofCar: " + e.getCarName()  + ", CarBrand: " + e.getCarBrand() + ", CarType: " + e.getCarType() + ", EngineType: " + e.getEngineType() +", color: " + e.getCarColor() +	", Price: " + e.getCarPrice() 
	   	       + ", Cylinder: " + e.getCylinderType() + ", Displacement: " + e.getDisplacement() + "cc"
	   	       + ", Transmission: " + e.getTransmission() + ", Mode: " + e.getMode()
	   	       + ", HorsePower: " + e.getHorsePower() + "hp" + ", FuelTankCap: " + e.getFuelTankCap() + "litres" + ", Wheelbase: " + e.getWheelBase() + "mm" + ", TrackDistance: " + e.getTrackDistance()+ "mm");
	   	       System.out.println('\n');
			}
	       
	       System.out.println("Make a choice among them!!");
	       System.out.println("1->A3\n2->A4\n3->A4 cabriolet\n");
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
	   	   	      LocalDate deliverydate = date.plusDays(86);
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
	   	   	      LocalDate deliverydate = date.plusDays(70);
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
	   	   	      LocalDate deliverydate = date.plusDays(60);
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
	 
	 
	 
	 public static void changeCount1(){
		 count1--;
	 }
	 
	 
	 public static void changeCount2(){
		 count2--;
	 }
	 
	 
	 public static void changeCount3(){
		 count3--;
	 }
	 
	 

 
}    //class close







