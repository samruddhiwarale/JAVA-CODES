class Product {
 private String productName;
  private int productId;
    private double unitPrice;
    private int quantity;
    Product(String productName, int productId, double unitPrice, int quantity)
    {
 this.productName=productName;
 this.productId=productId;
    if (unitPrice > 0) 
    {
 this.unitPrice=unitPrice;
        } else {
     throw new IllegalArgumentException("Invalid price");
        }
    if (quantity > 0) 
    {
 this.quantity=quantity;
        } else {
     throw new IllegalArgumentException("Invalid quantity");
        }
    }
    double calculateSubtotal() 
    {
 return unitPrice * quantity;
    }
    double calculateDiscount()
    {
              double subtotal= calculateSubtotal();
if (subtotal >= 10000) 
{
return subtotal * 15 / 100;
        }
 else if (subtotal >= 5000) {  return subtotal * 10 / 100;
        }
 else if (subtotal >= 1000) {
return subtotal * 5 / 100;
        } else
       {
    return 0;
        }
    }
    double calculateFinalBill() 
    {
 return calculateSubtotal()- calculateDiscount();
    }
    void display(){
System.out.println("Product Name: "+productName);
System.out.println("Product ID:"+ productId);
System.out.println("Subtotal:"+ calculateSubtotal());
System.out.println("Discount:"+ calculateDiscount());
System.out.println("Final Bill:"+ calculateFinalBill());
    }
}
 public class Main {
public static void main(String[] args) {
    Product p1=new Product("Keyboard",501,2000,3);
        p1.display();
    }
}
