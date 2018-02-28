package car_payment_code;

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

