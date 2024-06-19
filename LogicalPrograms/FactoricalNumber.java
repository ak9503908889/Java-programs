package LogicalPrograms;

public class FactoricalNumber {

	public static void main(String[] args) {
		
		//Example =  6*5*4*3*2*1   == 120
		
		int num = 15 ;
		int factorial =1;
		
		for(int i=1 ;i<=num ;i++) { 
//			1 = 1*2 
//			2 = 2*3
			factorial =factorial*i;			
		}
		
		System.out.println("Factorial of number is :"+factorial);
		

	}

}
