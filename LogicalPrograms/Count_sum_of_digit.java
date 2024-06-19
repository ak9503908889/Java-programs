package LogicalPrograms;

public class Count_sum_of_digit {

	public static void main(String[] args) {

	//123300;

		int sum, num =12345;

		for(sum=0 ;num>0 ;num=num/10) {

			sum =sum+num%10;
		}
           System.out.println("Sum of digit in a number :"+sum);
	}

}
