package babyitemssubscriber;

import babyitemspublisher.BabyItemsPublish;
import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

public class Activator implements BundleActivator {

	ServiceReference serviceReference;
	char babyitem_name;
	int babyitem_type; 
	int quantity;
	int total;
	float amount;
	String conclution = "";
	String yes;
	
	
	public void start(BundleContext Context) throws Exception {
		//Activator.context = bundleContext;
		serviceReference = Context.getServiceReference(BabyItemsPublish.class.getName());
		BabyItemsPublish servicePublish = (BabyItemsPublish) Context.getService(serviceReference);
		
		System.out.println(" ");
		System.out.println(" ********** ODEL SHOP **********");
		System.out.println(" ");
		System.out.println("This is Baby Items Subscriber \n");
		

		System.out.println("Do You Want To Order a Baby Items ? If Yes, Press y/Y");
		System.out.print("Answer: ");
		Scanner inputs = new Scanner(System.in);
	    yes=inputs.next();
	    
	    System.out.println("");
	    
	    do {
		  	  
	    	 System.out.println(" --- BABY ITEMS ORDER SERVICE --- \n");			  			     
	    	 
			 System.out.println("Baby Clothing Set   Rs. 750.00  -> Press 1");
			 System.out.println("Baby Rompers  Set   Rs. 500.00  -> Press 2");
			 System.out.println("Baby Sweaters Set   Rs. 600.00  -> Press 3");
			 System.out.println("Diaper Covers Set   Rs.1250.00  -> Press 4");
			 System.out.println("Unisex Baby Apparel Rs. 450.00  -> Press 5");
			 System.out.println("Baby Shampoo Bottle Rs. 550.00  -> Press 6");
			
			 System.out.println("");
			 
			 System.out.print("Enter the Number of Item Name: ");
			 int babyitem_type = inputs.nextInt();
			 
		     System.out.println("");
		     
		     System.out.println("Enter the Quantity of Items : ");
		     int quantity = inputs.nextInt();
		     
		     System.out.println("");
		     System.out.println("**************  Baby Item Invoice  ***********");
		     
		     System.out.println("");
		     System.out.println("     Item              Unit Price         Qty");
		     System.out.println("_____________________________________________");
		     System.out.println("");
		     
		     
		     switch(babyitem_type) {
		     case 1:
		    	 total = 750 * quantity;
		    	 conclution = "    Baby Clothing     Rs. 750.00          "+quantity+"\n";
		    	 System.out.println(conclution);
		    	 System.out.println("Your Total Amount is "+total+".Rs");
		    	 break;
		    	 
		     case 2:
		    	 total =  500 * quantity;
		     	 conclution = "    Baby Rompers  Set     Rs. 500.00          "+quantity+"\n";
		    	 System.out.println("Your Total Amount is "+total+".Rs");	
		    	 break;
		     case 3:
		    	 total =  600 * quantity;
		    	 conclution = "    Baby Sweaters Set     Rs. 600.00          "+quantity+"\n";
		    	 System.out.println("Your Total Amount is "+total+".Rs");
		    	 break;
		    	 
		     case 4:
		    	 total =  1250 * quantity;
		    	 conclution = "    Diaper Covers Set     Rs. 1250.00          "+quantity+"\n";
		    	 System.out.println("Your Total Amount is "+total+".Rs");
		    	 break;
		    	 
		     case 5:
		    	 total =  450 * quantity;
		    	 conclution = "   Unisex Baby Apparel     Rs. 450.00         "+quantity+"\n";
		    	 System.out.println("Your Total Amount is "+total+".Rs");
		    	 break;
		    	 
		     case 6:
		    	 total =  550 * quantity;
		    	 conclution = "   Baby Shampoo Bottle      Rs. 550.00        "+quantity+"\n";
		    	 System.out.println("Your Total Amount is "+total+".Rs");
		    	 break;
		    	 
		     default:
		    	 System.out.println("Invalid amount!!!");
		    	 
		    	  
		     }

		     
		     servicePublish.CalculateAmount(babyitem_name, babyitem_type, quantity, amount);
			 
			 System.out.println("*****Do you want to order Baby Items Again ? *****");
			 System.out.print("Answer: ");
			 yes = inputs.next();
		} while (yes.equals("y")|| yes.equals("Y"));
		 
	        System.out.println("");
	        System.out.println(".......THANK YOU FOR YOUR CHOICE.....!!!");
	        System.out.println("");
		    System.out.println(" _________ODEL SHOP_________ ");
		    System.out.println(" ODEL SHOP , No12/1/1,New Kandy Road, Malabe");
				
			}

	public void stop(BundleContext Context) throws Exception {
		Context.ungetService(serviceReference);
	}

}
