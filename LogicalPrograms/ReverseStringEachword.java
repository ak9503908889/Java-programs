package LogicalPrograms;

public class ReverseStringEachword {

	public static void main(String[] args) {
           
		String  Str = "Welcome to java and selenium";
		
		//exp :       emocleW ot avaj dna muineles  
		
		String RevString  ="";
		
		String [] Words = Str.split(" ");
		
		for(String W : Words) {   // Welcome
			
			String ReverseWord ="";
			
			for(int i=W.length()-1;i>=0;i--) {
				
				ReverseWord =ReverseWord+W.charAt(i);
			}
			RevString=RevString+ReverseWord+" ";
		}
		System.out.println(RevString);
	}

}
