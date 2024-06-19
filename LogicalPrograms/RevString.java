package LogicalPrograms;

public class RevString {

	public static void main(String[] args) {

		//WAP to reverse a string without using the reverse method.
		
		String S = "Automation java";
		
		int len=S.length();
	
		String rev1="";
		
		for(int i=len-1;i>=0;i--) {

			rev1=rev1+S.charAt(i);
		}		
		System.out.println(rev1);
	}

}
