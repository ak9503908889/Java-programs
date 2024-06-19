package LogicalPrograms;

import java.util.Scanner;

public class AcceptUserInput {

	public static void main(String[] args) {
	
		// Create object of scanner class and paas input system.in
		
		System.out.println("Enter first Number");
				
		Scanner sc =new Scanner(System.in);  // System.in is a standard input stream		
		int a = sc.nextInt();
		
		System.out.println("Enter Second number ");
		int b =sc.nextInt();
		
		System.out.println("Addition of two number is == "+(a+b));
				
	}

}
