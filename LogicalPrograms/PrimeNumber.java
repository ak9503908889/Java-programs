package LogicalPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
	
//Prime no - PM is number that is greater than 1 and divided by 1 or itself only
		
	//	example : 2,3,5,13,17
		
		
       System.out.println("Enter a number");
       
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();

      int i;
      for(i=2 ; i<num; i++)    //5 	  
    	  if(num%i==0)   //5%2 ==0
    		  break;
    	  if(i==num)    //
    		  System.out.println("Prime Number");
    	  else
    		  System.out.println("Not prime number");
      
     
	}

}
