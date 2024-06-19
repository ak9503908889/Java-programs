package LogicalPrograms;

public class Countcharacteroccurance {

	public static void main(String[] args) {
		
		//find out e char
		String Str ="Hello good morning hello evening";

		int TotalCount = Str.length();
		System.out.println(TotalCount);  //32
		
		
		int Total_countAfteremoving =Str.replace("g", "").length(); //29
		
		
		int count =TotalCount-Total_countAfteremoving;  //32-29
		System.out.println("Number of occurance of g is :"+count);
		
	}

}
