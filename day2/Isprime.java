package Week1.day2;

public class Isprime {

	public static void main(String[] args) {
		  int n=13;
		for (int i=2; i*i<=n;i++) {
			if(n%i==0) {
				System.out.println(i+"It is a not a prime Number");
			}
			else {
				System.out.println(i+"It is a prime Number");
			}
			
		}

	}

}
