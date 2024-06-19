package LogicalPrograms;

public class remove_allSpaces_inString
{ public static void main(String[]args)
{
    String str= "a m i t k a  l  e";

    String plainstr= str.replaceAll("\\s","");
    System.out.println(plainstr);
}
}
