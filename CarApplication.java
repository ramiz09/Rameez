package carapplication;

import java.util.Scanner;


public class CarApplication {
	
	public static void main(String[] args){
		
		int selection;
	
		System.out.println("Presently, we have these brands available, you can shop from them!!");
		
     do{
		
		System.out.println("1->Maruti-Suzuki\n2->Mercedes-Benz\n3->Audi4\n4->Land Rover\n");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		switch(choice){
		
		case 1:
			MarutiSuzuki obj = new MarutiSuzuki();
			obj.carDesc();
			MarutiSuzuki.fetchData();
			break;
		
		case 2:
			MercedesBenz obj1 = new MercedesBenz();
			obj1.carDesc();
			MercedesBenz.fetchData();
			break;
			
		case 3:
			Audi obj2 = new Audi();
			obj2.carDesc();
			Audi.fetchData();
			break;
			
		case 4:
			LandRover obj3 = new LandRover();
			obj3.carDesc();
			LandRover.fetchData();
			break;
			
			
		}  //switch close
		
		System.out.println("\nDo you want to purchase another car\n");
		System.out.println("1->Yes\n2->No\n");
	    selection = input.nextInt();
		
		
		
     } while(selection ==1); //do-while close
     
     
     
        System.exit(0);
     
     
	

		
		
	}  //main function close
	


}  // class close

	
    
    

