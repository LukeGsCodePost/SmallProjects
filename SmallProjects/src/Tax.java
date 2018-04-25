import java.util.Scanner;


public class Tax {
	
	private int salary;
	private double tax;
	
	public Tax( int salary) {
		this.salary=salary;
		
		
		
	}//end of constructor
	public double calculation() {
		
		if (this.salary > 0 && this.salary < 15000){
			System.out.print("No tax to be applied to the combined salary");
		}
		
		else if (this.salary >= 15000  && this.salary < 19999){

			double taxToBeApplied = salary * 0.1;
			tax = salary - taxToBeApplied;
			System.out.print("Your tax rate of 10% =" + "  " + taxToBeApplied + " " + "Your gross salary =" +" " + tax);
		}
	
		else if (this.salary >= 20000  && this.salary <= 29999){

			double taxToBeApplied = salary * 0.2;
			tax = salary - taxToBeApplied;
			
			System.out.print("Your tax rate of 20% =" + "  " + taxToBeApplied + " " + "Your gross salary =" +" " + tax);
			
		}
		else if(this.salary > 29999){

			double taxToBeApplied = salary * 0.3;
			tax = salary - taxToBeApplied;
			System.out.print("Your tax rate of 30% =" + "  " + taxToBeApplied + " " + "Your gross salary =" +" " + tax);
		}
	
		return tax;
		

	}//end of method
		public static void main(String[] args)
		{
	    System.out.println("Please enter the first salary");
		Scanner scn = new Scanner(System.in);
	    int x = scn.nextInt();
	    System.out.println("Please enter the second salary");
	    int  y = scn.nextInt();
		int c = x + y;
		Tax t = new Tax(c);
		
		
		t.calculation();
}//end of main
}//end of class