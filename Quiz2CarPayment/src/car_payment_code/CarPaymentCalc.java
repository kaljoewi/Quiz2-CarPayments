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

/* package car_payment_code;

import java.lang.Math;

public class CarPaymentInfo {
	private double CarCost;
	private double InterestRate;
	private double DownPay;
	private double LoanTerm;
	
	
	public CarPaymentInfo (double cc, double lt, double dp, double ir) {
		super();
		CarCost = cc;
		InterestRate = ir;
		DownPay = dp;
		LoanTerm = lt;
	}

	public double getCarCost() {
		return CarCost;
	}

	public void setCarCost(double carCost) {
		CarCost = carCost;
	}

	public double getInterestRate() {
		return InterestRate;
	}

	public void setInterestRate(double interestRate) {
		InterestRate = interestRate;
	}

	public double getDownPay() {
		return DownPay;
	}

	public void setDownPay(double downPay) {
		DownPay = downPay;
	}

	public double getLoanTerm() {
		return LoanTerm;
	}

	public void setLoanTerm(double loanTerm) {
		LoanTerm = loanTerm;
	}
	
	
	public double MonthlyPay() {
		double interest  = (1 + (this.InterestRate/12));
		
		double discount = Math.pow(interest, this.LoanTerm);
		
		double denominator = 1 - (1 / discount);
		
		double subresult = ((this.InterestRate/12) / denominator);
		
		return this.CarCost * subresult;
	}
	
	public double TotalOnInterest() {
		double total = 0;
		double amtloaned = this.CarCost - this.DownPay;
		double temp = amtloaned;
		double mpayment = this.MonthlyPay();
		
		for (int i = 0; i < this.LoanTerm; i++) {
			total += temp * (this.InterestRate/12);
			temp = temp - (mpayment - (temp * (this.InterestRate/12)));
		}
		return total;
	}
	
}

package car_payment_code;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CarPaymentInfoTest {

	@Test
	public void MonthlyTest() {
		CarPaymentInfo car = new CarPaymentInfo(35000, 60, 0, .1);
		if(car.MonthlyPay() < 743.65 && car.MonthlyPay() > 743) {
			System.out.println("Works");
		}else {
			System.out.println(car.MonthlyPay());
			fail("Wrong value");
		}
		
		if (car.TotalOnInterest() > 9618 && car.TotalOnInterest() < 9619) {
			System.out.print("Works too");
		}else {
			System.out.println(car.TotalOnInterest());
			fail("Wrong value");
		}
	}
	
	
}
*/