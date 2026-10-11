import java.util.Scanner;
   public class Main {
static int secondLargest(int number) 
   {
   int  largest = -1 ;
 int secondLargest = -1;
  while (number > 0) {
  int digit = number % 10 ;
  if (digit > largest) { 
    secondLargest = largest;
 largest = digit;
     } 
  else if (digit <  largest && digit  >  secondLargest) 
  {
   secondLargest = digit;
 }
   number=number/10;
     }
  return secondLargest ;
    }
 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
    System.out.print("Number:");   if (!sc.hasNextLong()) 
    {
System.out.println("Invalid input. Please enter a positive integer.");
    sc.close();
     return;
        }
  long input = sc.nextLong();
 if (input <= 0 || input > Integer.MAX_VALUE)
 {
System.out.println("Invalid input. Please enter a positive integer.");
   sc.close();
    return;
        }
 int number=(int) input;
            int result =    secondLargest(number);
 if (result == -1)
   {
     System.out.println("Fewer than two distinct digits exist.");
        } 
    else 
 {
System.out.println("Second-largest distinct digit: " + result);
 }
     sc.close();
}
}
