package LogicalPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
//	1234 
//	153  = 1^3 +5^3+3^3  = 153  1+125+27 = 153
//    123  = 1+8+27 = 36
    
    
    int p ,sum ,rem;
    System.out.println("Enter a number");
	Scanner sc = new Scanner(System.in);
	int num =   sc.nextInt();   
	
	//153    
	p=num;     //p=153
	
	     //   153>0   true 15>0  1>0   0>0  -false
	for(sum=0;num>0;num=num/10) {   // 15  1 
	  
		rem = num%10;  //153%10   == 3 5 1
		sum = sum+rem*rem*rem;  // 153 =0+27+125+1
	}
	
	if(sum==p)
		System.out.println("Armstrog Number");
	else
		System.out.println("Not armstrong number");
	}
	}


