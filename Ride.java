package TravelManagement;
import java.util.*;
public class Ride {
	
	String pp,dest;
	 float dist,price;
	 int ch,aa,a;
 void getdata()
{
	 
	 Scanner s = new Scanner(System.in);
	System.out.println("Enter the pickup point");
	pp=s.nextLine();
	System.out.println("Enter the Destination point");
	dest=s.nextLine();
	do {
	System.out.println("Enter the distance between them in km");
	dist=s.nextInt();

	if(dist<=0)
	{
		System.out.println("Distance is invalid Please enter again");
		a=1;
	}
	else {
		break;
	}
	 }while(a==1);
	 
		
}
 void price(int amt)
 {
	 Scanner s = new Scanner(System.in);
	 price=amt*dist;
	 System.out.println("Your fare is"+price);
	 System.out.println("Do you want to confirm your ride");
	 System.out.println("1.Yes");
	 System.out.println("2.No");
	 aa=s.nextInt();
	 confirmation(aa);
 }
 void selectride()
 {
	 Scanner s = new Scanner(System.in);
	 System.out.println("Select Ride");
	 System.out.println("1.Bike...Rs:5 per km");
	 System.out.println("2.Auto...Rs:10 per km");
	 System.out.println("3.Car...Rs:15 per km");
	 System.out.println("4.Premium Car...Rs:50 per km");
	 ch=s.nextInt();
	 switch (ch) {

	// Case
	case 1:
		price(5);
	    break;

	// Case
	case 2:
		price(10);
	    break;
	case 3:
		price(15);
	    break;
	case 4:
		price(50);
	    break;


	// Default case
	default:
	    System.out.println("Invalid choice");
	}
 }
 void confirmation(int a)
 {
	 if(a==1)
	 {
		 System.out.println("Your order is confirmed!!!");
	 }
	 else
	 {
		 System.out.println("Your order is Canceled");
		 System.out.println("Thank you Visit Again......");
	 }
 }

}
