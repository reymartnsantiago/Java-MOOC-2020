import java.util.Scanner;
 
public class Store {
 
    private Warehouse store;
    private Scanner reader;
 
    public Store(Warehouse store, Scanner reader) {
        this.store = store;
        this.reader = reader;
    }
 
    public void shop(String customer) {
        ShoppingCart basket = new ShoppingCart();
        System.out.println("Welcome to our shop " + customer);
        System.out.println("below is our sale offers:");
 
        for (String product : this.store.products()) {
            System.out.println(product);
        }
 
        while (true) {
            System.out.print("what do you want to buy (press enter to pay):");
            String product = reader.nextLine();
            if (product.isEmpty()) {
                break;
            }
 
            // here, you write the code to add a product to the shopping basket, if the storehouse is not empty
            // and decreases the storehouse stocks
            // do not touch the rest of the co.de!
            if (this.store.stock(product) > 0) {
                this.store.take(product);
                basket.add(product, this.store.price(product));
            }
 
        }
        System.out.println("your purchases are:");
        basket.print();
        System.out.println("basket price: " + basket.price());
    }
}