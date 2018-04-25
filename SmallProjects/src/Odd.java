import java.util.Scanner;

public class Odd {
	private static int num;

	public Odd(int num) {
		this.num=num;
		
	}//end of constructor
	public void  oddandpositive() {
		
		
		if (this.num>0 && this.num%2==0) {
		
			System.out.println("The number" + " " + this.num +  " " + "is even");
		}
		
		else if (this.num%2!=0){
			System.out.println("The number" + " " + this.num + " " + " is odd");
		}
		
	}//end of method.
		
		public static void main(String[] args)
		{
	    System.out.println("Please enter a number:");
		Scanner input = new Scanner (System.in);
		Odd o = new Odd(num);
		num = input.nextInt();
		o.oddandpositive();
		
		
		}//end of main.
	}//end of class.