import java.util.Scanner;
class Student 
  {
    private String name;
    private int rollNumber;
    private int mark1,mark2,  mark3, mark4,mark5;
    Student(String name, int rollNumber,int mark1,int mark2,
int mark3,int mark4, int mark5)
    {
    this.name = name;
this.rollNumber=  rollNumber;
setMarks(mark1,mark2,mark3,mark4, mark5);
 }
public void setMarks(int mark1, int mark2, int mark3,
   int mark4, int mark5)
      {
if  (mark1< 0 || mark1 >100||
mark2 < 0|| mark2 > 100||  mark3 < 0 || mark3 > 100 ||
mark4< 0|| mark4 > 100  ||
mark5 <  0 ||  mark5 > 100) 
   {
   throw new IllegalArgumentException("Marks must be between 0 and 100.");
    }
      this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
        this.mark5 = mark5;
}
 public String getName() 
      {
        return name;
    }
  public int getRollNumber()
      {
  return rollNumber;
      }
  public int calculateTotal () 
      {
 return mark1+mark2+mark3+mark4+ mark5;
    }
    public double calculatePercentage() 
      {
return calculateTotal() / 5.0;
    }
public String calculateResult () 
      {
if (mark1 >=40 && mark2 >= 40 &&
 mark3 >= 40 && mark4 >=40 &&
     mark5 >= 40) 
     {
  return"PASS";
        }
 return" FAIL";
    }
 public void displayResult(){
System.out.println("Student Name: "+ getName());
System.out.println("Roll Number:" +getRollNumber());
System.out.println("Total Marks:" +calculateTotal() + " /500");
System.out.println("Percentage:"+ calculatePercentage() + "%");
System.out.println("Result:"+ calculateResult()) ;
    }
}
public class Main {
public static void main(String[] args) {
   Scanner sc = new   Scanner(System.in);
     try 
 {
System.out.print("Name:");String name=sc.nextLine();
System.out.print("Roll Number:");
   int rollNumber = sc.nextInt();
  System.out.println("Enter marks for five subjects:");
    int mark1 = sc.nextInt();
    int mark2 = sc.nextInt();
    int mark3 = sc.nextInt();
    int mark4 = sc.nextInt();
    int mark5 = sc.nextInt();
Student student = new Student(name,rollNumber,mark1, mark2,mark3,mark4,mark5);
     System.out.println();
    student.displayResult();
  } 
catch (IllegalArgumentException e) 
         {
System.out.println("Invalid input: " + e.getMessage());
        }
     catch (java.util.InputMismatchException e) 
  {
System.out.println("Invalid input. Please enter correct data types.");
     } finally 
         {
    sc.close();
        }
    }
}
