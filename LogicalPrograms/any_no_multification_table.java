package LogicalPrograms;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class any_no_multification_table
{ public static void main(String args[]){
    int number;
    System.out.print("enter any no which u want to print table :");
     Scanner sc=new Scanner(System.in);
     number= sc.nextInt();

    for(int i=1;i<=10;i++)
        System.out.println(number+" * " + i + " = " +(number*i));

}
}
