import java.util.Scanner;

public class IT24610819Lab3Q1B {
        public static void main (String [] args) {
		
        Scanner input = new Scanner(System.in) ;
        
        System.out.print("Enter the price of 1Kg of rice:");
        double priceperKg = input.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy:");	
		double quantity = input.nextDouble();
		
        double totalAmount = priceperKg * quantity;
		double discount = totalAmount * 0.10;
		
		double finalAmount = totalAmount - discount;

        System.out.println("Total amount with 10% discount: " +finalAmount);

        input.close();
    	}
}