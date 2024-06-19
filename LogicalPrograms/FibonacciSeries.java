package LogicalPrograms;

public class FibonacciSeries {

	public static void main(String[] args) {

	/* In fibonacci series next number is the sum of prevoius two numbers
	 * 
	 * Example 0, 1, 1, 2, 3, 5, 8, 13,21,34,55	
	 */
		
		
    int a=-1,b=1, c;
    
    
    for(int i=1;i<=10;i++) {
    	
    	c=a+b;    // 0= -1+1  1= 1+0  1=0+1 2=1+1  3= 2+1  5
    	System.out.print(" "+c);    
    	   	
    	a=b;      //    a=1
    	b=c;      //    b=2
    }
	}

}
