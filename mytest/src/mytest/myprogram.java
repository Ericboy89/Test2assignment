package mytest;
import java.util.*;
public class myprogram {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
   int num; 
   boolean validinput= false; 
   
   
   while (!validinput) {
	   System.out.print("Enter a a number ");
	   if (scan.hasNextInt()) {
		   num= scan.nextInt();
		   validinput= true;
	   }
	   else {
		   System.out.println("Invalid input. Please enter a valid number.");
           scan.next();  
	   }
   }
scan.close();
}
}
