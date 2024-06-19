package LogicalPrograms;

public class string_reverse_using_concatination
{ public static void main(String[]args)
{
    String str="AMIT";
    String rev="";
    int len=str.length(); //4 is length of that string
    //after that we use for loop to itrate each charater into string.
    for(int i=len-1;i>=0;i--)
    {
       rev=rev+str.charAt(i);  //TIMA
    }
  System.out.println("Reversed String is :"+rev);
}

}
/* By using String buffre class.
*StringBuffer Sb=new StringBuffer(str);
* System.out.println(sb.reverse());
*
*
*
*
*
* */