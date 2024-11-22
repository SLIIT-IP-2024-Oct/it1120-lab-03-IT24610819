import java.util.Scanner;

public class IT24610819Lab3Q2 {
       public static void main (String [] args ) {
		      Scanner input = new Scanner(System.in);
			  System.out.print("Enter the monthly salary: ");
			  double salary = input.nextDouble();
			  System.out.print("Enter the number of OT hours: ");
			  double OTHours = input.nextDouble();
			  System.out.print("Enter the OT hourly rate: ");
			  double OTHourlyRate = input.nextDouble();
			  double TotalSalary = salary + (OTHours * OTHourlyRate);
			  System.out.println("The total salary including OT is: "+TotalSalary);
	    }
}		