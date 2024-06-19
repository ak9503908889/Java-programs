package LogicalPrograms;

public class LeapYear {

	public static void main(String[] args) {

		
		//2100
		
		int year = 1600;
		
		if(((year % 4 == 0) && (year %100 !=0)) || (year%400 ==0))
			System.out.println("Specified year is a leap year");
		else
			System.out.println("Specified yesr is not a leap yesr");
	}

}
