import java.util.Scanner;
public class main {
    public static void main (String [] args){
        Scanner sc = new Scanner (System.in);
     System.out.println ("enter 10 numbers:");
 for (int i=1; i<=10; i++)
         {
System.out.print("enter number"+i+":");
  int n= sc.nextInt ();
                 if (n>0){
 System.out.println(n+"is positive ");
                 }
                         }
            sc.close();
    }
}
 
