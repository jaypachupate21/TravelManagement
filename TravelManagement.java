package TravelManagement;
import java.util.*;
public class TravelManagement {
	public static void  main(String args[])
	{

		Scanner s = new Scanner(System.in);
		int choice;
		Ride r = new Ride();
		System.out.println("Welcome to our Travels");
		System.out.println("Do you want ride");
		System.out.println("1.Yes");
		System.out.println("2.No");
		choice=s.nextInt();
		switch (choice) {

		// Case
		case 1:
			r.getdata();
			r.selectride();
			break;

			// Case
		case 2:
			System.out.println("Thank you Visit Again......");
			break;

			// Default case
		default:
			System.out.println("Invalid choice");
		}

	}
}
