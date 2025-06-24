package Week1.day2;

public class Browser {
     public String launchbrowser(String browsername) {
    	 System.out.println("Browser Launched Successfully");
    	 return browsername;
	}
	public void loadurl() {
		System.out.println("Application url loaded Successfully");
	}
		
	
	public static void main(String[] args) {
		Browser bb =new Browser();
		String browsername= bb.launchbrowser("google");
		System.out.println(browsername);
		 bb.loadurl();

	}

}
