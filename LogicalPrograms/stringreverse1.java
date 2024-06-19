package LogicalPrograms;

public class stringreverse1
{public static void main (String[]args){
    String str="Amitkale";
    //first convert it into char arry
    char[]charr=str.toCharArray();
    //char [] charr= str.toCharArray();
    for(int i=charr.length-1;i>=0;i--){
        System.out.print(charr[i]);
    }

}
}
