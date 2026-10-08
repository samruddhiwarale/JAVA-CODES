class Student {
   String name;
    int marks;
   void setName(String name) 
  {
     this.name=name;
    }
void setMarks(int marks) {
      this.marks = marks;
    }
   String getName() {
       return name;
    } 
  int getMarks() {
      return marks;
    }
 public static void main(String[] args) {
     Student s1= new Student();
   s1.setName("samruddhi");
     s1.setMarks(87);
  System.out.println("Student Name= " + s1.getName());
    System.out.println("Student marks= " + s1.getMarks());
    }
}
 
