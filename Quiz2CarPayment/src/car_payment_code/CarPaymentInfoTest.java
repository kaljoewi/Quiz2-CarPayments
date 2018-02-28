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
