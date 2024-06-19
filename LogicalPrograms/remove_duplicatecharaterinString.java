package LogicalPrograms;

public class remove_duplicatecharaterinString
{public static void main(String[]args){
    String str ="aamittkalee";

    //approach 1
    StringBuilder sb1=new StringBuilder(); //string builder class use here
    str.chars().distinct().forEach(c -> sb1.append((char)c));  //lambada function use here
    System.out.println(sb1);
}
}
