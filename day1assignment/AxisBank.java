package week3.day1assignment;

public class AxisBank extends BankInfo {

	public void deposits() {

		System.out.println("Deposit is 50%");

	}

	public static void main(String[] args) {

		AxisBank axis = new AxisBank();

		axis.deposits();
	}

}
