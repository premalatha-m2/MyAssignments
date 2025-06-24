package Week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		int Input=121;
	    int output=0;
	    for(int i=Input;i>0;i/=10) {
	    	int rem =i%10;
	    	output=output*10+rem;
	    	if (Input == output) {
	            System.out.println(Input+","+output + " is a palindrome number.");
	        } else {
	            System.out.println(Input+","+output + " is not a palindrome number.");

	    }

	}
}
}