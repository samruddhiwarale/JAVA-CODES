class Student {
    String name;
    int marks;
    }
class StudentFactory {
  Student CreateStu(Student s) {
        s.name="sam";
        s.marks=95;
        return s;
    }
}
 public class Main {
    public static void main(String[] args) {
   StudentFactory f1= new StudentFactory();
        Student s1=new Student();
     s1=f1.CreateStu(s1);
System.out.println("The name is= " + s1.name);
System.out.println("The marks are= " + s1.marks);
    }
}
