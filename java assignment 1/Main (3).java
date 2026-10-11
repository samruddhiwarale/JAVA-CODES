import java.util.Scanner;
public class Main 
   {
static void primeFactorization(int   number)
    {
System.out.print("Prime   factorization:");
  if (number==1) 
  {
System.out.println("1 has no prime factors.");
       return;
     }
 boolean first =true;
for (int factor=2; factor<=              number/factor;factor++) 
    {
 int count=0;
 while (number%factor == 0) 
 {
  count++;
   number=number/factor;
 }
  if (count > 0)
    {
 if (!first)
    {
System.out.print("x");
   }
System.out.print(factor+"^" + count);
     first=false;
 }
  }
 if (number>1)
 {
     if (!first)
    {
 System.out.print("x");
     }
System.out.print(number+"^1");
         }
   System.out.println();
      }
public static void main(String[] args) {
    Scanner sc=new  Scanner(System.in);
 System.out.print("Number: ");
  if (!sc.hasNextInt()) {
System.out.println("Invalid input. Please enter a positive integer.");
      sc.close();
      return;
  }
  int number=sc.nextInt();
  if (number<1)
  {
System.out.println("Invalid input. Number must be at least 1.");
  }
      else
  {
primeFactorization(number);
     }
     sc.close();
    }
}
