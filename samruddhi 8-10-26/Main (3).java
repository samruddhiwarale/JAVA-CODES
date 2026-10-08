class student {
   String name;
   int age;
   student (String name,int age)
   {
      this.name = name;
      this.age = age;
   }
   void display()
   {
      System.out.println ("Name:"+ name+"Age:"+ age);
   }
}
 public class Main {
    public static void main(String[] args){
       student s1 = new student ("samruddhi",30);
       student s2 = s1;
       System.out.println ("before change");
       s1.display();
       s2.display();

       s2. name="sneha";
       s2. age= 22;
       System.out.println("\n After s1=null:");
       s2.display();
    }
 }
