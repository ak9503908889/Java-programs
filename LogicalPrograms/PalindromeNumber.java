package LogicalPrograms;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		
		// 1221   1231  
		int Originalnumber,i,sum,rem;
		System.out.println("Enter a number");
		
		Scanner sc = new Scanner(System.in);
		int num =   sc.nextInt();   
		
		Originalnumber = num;
	        //121==121
		
		//    o; 121>0;            12>0  1
		for(sum=0;num>0;num=num/10) {
			
			rem =num%10;   //1 2 1
			sum =sum*10+rem;  //10+2  ==120 +1 ==121
		}
		if(sum==Originalnumber)
			System.out.println(Originalnumber+" :Is a palindroem number ");
		else
			System.out.println(Originalnumber+": Is not a palindrome number");
	}

}
