package LogicalPrograms;

public class SwappingTwoNumberWithoutThirdvar {

	public static void main(String[] args) {
		
	int a=10 ,b=20;
		
		System.out.println("Before Swapping values :"+a+" "+b);
		
         a=a+b ;      //30
         b=a-b;      //10 
         a=a-b;      //20   
		
		System.out.println("After Swapping values :"+a+" "+b);
		
	}

}
