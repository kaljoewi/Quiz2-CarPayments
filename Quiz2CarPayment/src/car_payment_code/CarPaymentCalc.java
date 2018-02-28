package car_payment_code;

import java.util.Scanner;

public class CarPaymentCalc {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the cost of the car: ");
		double cost = input.nextDouble();
		
		System.out.println("Enter the down payment: ");
		double down = input.nextDouble();
		
		System.out.println("Enter the length of loan (in months): ");
		double term = input.nextDouble();
		
		System.out.println("Enter the interest rate of loan: ");
		double interest = input.nextDouble();
		
		CarPaymentInfo car = new CarPaymentInfo(cost, term, down, interest);
		
		System.out.printf("The monthly payments are: %.2f", car.MonthlyPay());
		System.out.printf("\nThe total interest paid is: %.2f", car.TotalOnInterest());
		input.close();
	}

}
