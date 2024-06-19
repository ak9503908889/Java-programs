package LogicalPrograms;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Remove_Allspecialcharater_intoString
{ public static void main(String[]args)
{
    String str= "Amit@123*?@";

    //use approach for replace all()method
    String plainstr= str.replaceAll("[^a-zA-Z0-9]","");
    System.out.println(plainstr);
}


}
