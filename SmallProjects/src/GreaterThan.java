import java.util.Scanner;


public class GreaterThan {
	private static int a;
	private static int b;
// the ints were made static so they can be passed into the scanner in the main method
	
	public GreaterThan(int a, int b) {
		this.a=a;
		this.b=b;

	}// end of constructor
	
	public void  greaterthan() {
		
		
		if (this.a>0 && this.a>b) {
		
			System.out.println(1);
		}// if the input is greater than zero and if the first input is greater than the second 1 will be returned
		
		else if(this.b>a){
			System.out.println(0);
		}
		// the second input is greater than the second 0 will be returned
	}// end of method
		
		public static void main(String[] args)
		{
			System.out.println("Please enter the first number");
			Scanner scn = new Scanner(System.in);
			
		    a = scn.nextInt();
		    
		    System.out.println("Please enter the second number");
		    
		    b = scn.nextInt();
		    GreaterThan t = new GreaterThan(a, b);
			
			
			t.greaterthan();
		
		
		}// end of main
	
	

}// end of class
