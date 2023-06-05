/*
 								Author : Chirag Kuriya
 								DOC    : 5-june
 */

package EclipseProject;


class Product{
    String name;
    double price;
    int quantity ;
    static int totalSold=0;

    public Product(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    public void sell(int quantity){
      if(quantity<=this.quantity){
        this.quantity -= quantity;
            totalSold += quantity;
            System.out.println(quantity + " " + name + " sold.");
      }
      else{
        System.out.println("Insufficient quantity of " + name + " to sell.");
      }
    }
    
    static int getTotalSold(){
        return totalSold;
    }
    /*
      By declaring totalSold as static, there is only one instance of this variable that is shared among 
      all objects of the Product class. It is not tied to any specific instance of the class but is accessible 
      by all instances. This allows us to keep a cumulative count of the total quantity of products sold by all 
      instances of the Product class.
     */
}
public class Q8 {
    public static void main(String[] args) {
        
        Product product1 = new Product("Book", 100, 50);
        Product product2 = new Product("Pen", 10, 100);
        Product product3 = new Product("Notebook", 20, 30);
        product1.sell(20);
        product2.sell(50);
        product3.sell(10);
        int totalSold = Product.getTotalSold();
        System.out.println("Total quantity of products sold: " + totalSold);
    }

}
