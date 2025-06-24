package Week1.day2;

public class Fibonacciseries {

	public static void main(String[] args) {
		int range = 8;
		int a = 0;
		int b = 1;
		System.out.print(a + "," + b + ",");
		for (int i = 0; range >= i; i++) {
			int nextnumber = a + b;
			a = b;
			b = nextnumber;
			System.out.print(nextnumber + ",");

		}

	}

}
