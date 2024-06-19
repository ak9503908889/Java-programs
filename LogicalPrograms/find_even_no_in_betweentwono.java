package LogicalPrograms;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class find_even_no_in_betweentwono
{public static void main(String Args[]){

   int n;
    System.out.print("enter any no :");
    Scanner sc =new Scanner(System.in);
    n=sc.nextInt();
//even no
    for(int i = 0; i <= n; i++){
        int reminder = i % 2;
        if(reminder != 0){
            System.out.println(i);

        }

    }

     //odd no
    /*for(int i=1;i<=n;i=i+2){
        System.out.print(i+" ");
    }*/

}
}