package Week1.day2;

public class library {
	
	public String addbook (String booktitle) {
		System.out.println("Book added successfully");
		return (booktitle);
		
	}
	public void issuebook() {
		System.out.println("book issued successfully");
	}

	public static void main(String[] args) {
		library book=new library();
		String booktitle= book.addbook("English");
		System.out.println(booktitle);
		book.issuebook();
		
         

	}

}
