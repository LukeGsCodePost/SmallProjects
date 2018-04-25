import java.util.Scanner;


public class guess {
private int number = 5;

private boolean found;

	public guess() {
		this.number = (int) (Math.random()*5);
		System.out.println(this.number);
		this.found = false;
		
		
	}// end of constructor
public boolean  guessing(int guess){
	System.out.println("Please");
	if (guess == this.number){
		this.found = true;
		
		System.out.print("Number guessed correctly");
	}else {
		System.out.println("Incorrect number please try again");
	}
  
		return found;
		
	}// end of guessing method
	
	
	public static void main(String[] args){
		guess g = new guess();
		Scanner input = new Scanner(System.in);
        for(int i = 0; i<5 && !g.found(); i++){
			System.out.print("Please enter a number");
			int guess = input.nextInt();
			g.guessing(guess);
			
		} 
	}// end of main method
	
	private boolean found() {
		
		return found;
	} // a found method had to be constructed to return found. 
}// end of class
