import java.util.Scanner;
public class Main {
 static int countDigits(int number) {
    int count = 0;
 while (number > 0) {
     count++;
 number = number / 10;
   }
 return count;
}
 static int calculatePower(int base, int exponent) 
    {
 int result = 1;
  for (int i=1; i<=exponent; i++) 
  {
  result=result*base;
 }
  return result ;
    }
 static boolean isArmstrong(int number) 
    {
 int digits = countDigits(number);
     int temp= number;
        int sum = 0 ;
while (temp>0) 
      {
   int digit= temp % 10;
       sum=sum + calculatePower(digit, digits);
  temp =  temp / 10;
 }
return sum==number;
    }
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
 System.out.print("Start: ");
    if (!sc.hasNextInt()) {
    System.out.println("Invalid input. Enter positive integers.");
    sc.close();
    return ;
 }
 int start = sc.nextInt();
System.out.print("End:");
    if (!sc.hasNextInt()) 
    {
System.out.println("Invalid input. Enter positive integers.");
     sc.close();
    return;
        }
 int end = sc.nextInt();
  if (start <= 0||end <= 0 || start > end) 
  {
System.out.println("Invalid range. Enter positive integers with Start <= End.");
     sc.close();
     return;
        }
System.out.print("Armstrong numbers:");
 boolean found = false;
 for (int number = start; number <= end; number++) 
 {
 if (isArmstrong(number)) {
    System.out.print(number + " ");
     found = true;
    }
 }
   if (!found) {
System.out.print  ("None");
   }
   System.out.println();
      sc.close() ;
    }
}
