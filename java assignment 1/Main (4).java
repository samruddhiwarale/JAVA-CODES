import java.util.Scanner;
public class Main {
static int calculateGCD(int a, int b) 
  {
while (b!=0) 
    {
  int remainder= a%b;
     a=b;
     b=remainder;
 }
     return a;
  }
static long calculateLCM(int a, int b) 
    {
int gcd=calculateGCD(a,b);
  return ((long)a/gcd)*b;
}
public static void main(String[] args) 
   {
Scanner sc=new Scanner(System.in);
System.out.print("First number:");
  if (! sc.hasNextInt())
     {
System.out.println("Invalid input. Please enter positive integers.");
    sc.close();
    return;
 }
 int first =sc.nextInt();
   System.out.print("Second number:");
   if (!sc.hasNextInt()) 
   {
System.out.println("Invalid input. Please enter positive integers.");
      sc.close();
       return;
   }
  int second=sc.nextInt();
 if (first <=0||second<=0) 
  {
System.out.println("Invalid input. Numbers must be positive.");
    }
    else 
      {
int gcd=calculateGCD(first, second);
 long lcm = calculateLCM(first, second);
System.out.println("GCD:"+gcd);
System.out.println("LCM:"+lcm);
    }
  sc.close();
    }
}
