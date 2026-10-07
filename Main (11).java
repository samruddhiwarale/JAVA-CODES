import java.util.Scanner;
public class Main {
   public static void main (String []args)
   {
     Scanner sc = new Scanner (System.in);
   System.out.println("enter student name:");
      String name = sc.nextLine();
System.out.println("enter marks of 5 subjects(out of 100):");
   int m1 = sc.nextInt();
   int m2 = sc.nextInt();
   int m3 = sc.nextInt();
    int m4 = sc.nextInt();
    int m5 = sc.nextInt();
    int total = m1+m2+m3+m4+m5;
   float per = total / 5.0f;
  System.out.print("/n student result");
  System.out.println("Name:"+name);
    System.out.println("Total Marks:"+total+"/500");
System.out.println("percentage:"+per+"%");
   if (per >= 80)
   {
 System.out.println("Result: pass, Grade:A");
  }
else if (per >= 70){

System.out.println("Result: pass, Grade:B");
}
else if (per >= 60)
{
    System.out.println("Result:  pass,Grade:C");
     }
 else if (per <= 40)
     {
  System.out.println("Result: Fail");
         }
 else{
    System.out.println("Result: pass,Grade:D");
}
    sc.close();
   }
}
