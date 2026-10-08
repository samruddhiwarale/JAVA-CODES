 class Shop {
  String Component;
    double price;
}
public class Main {
    public static void main(String[] args)
  {
    Shop p1= new Shop ();
     p1. Component="laptop";
    p1.price = 50000;
   Shop  p2=p1;
    p2.price = 45000;
   System.out.println(p1.price);
   System.out.println(p2.price);
    }
}
