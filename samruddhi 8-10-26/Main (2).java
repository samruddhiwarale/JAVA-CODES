 class Student {
    String name;
    int marks;
  void setName(String name) {
      this.name = name;
    }
void setMarks(int marks) {
        if (marks >= 0 && marks <= 100) {
   this.marks = marks;
       }
   else
        {
System.out.println("Invalid marks");
        }
    }
  String getName() {
   return this.name;
    }
  int getMarks() {
        return this.marks;
    }
}
     class Main {
 public static void   main(String[] args) {
        Student s1 = new Student();
     s1.setName("Samruddhi");
     s1.setMarks(99);
System.out.println("Name: "+ s1.getName());
        System.out.println("Marks: " + s1.getMarks());
     s1.setMarks(150);
 }
}
