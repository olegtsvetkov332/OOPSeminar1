import java.util.ArrayList;
import java.util.List;

import Domain.Bottle;
import Domain.HotDrink;
import Domain.Product;
import Services.CoinDispenser;
import Services.Dispaly;
import Services.Holder;
import Services.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Product item1 = new Product(100, 1, "Lays", 1234);
        Product item2 = new Product(110, 2, "Nuts", 1235);
        Product item3 = new Product(120, 3, "Chokolate", 1236);
        Product item4 = new Product(140, 4, "Pepsi", 1237);
        Product item5 = new Product(150, 6, "Coke", 1238);
        Product item6 = new Product(160, 7, "Gum", 1239);
        Product item7 = new Bottle(170, 8, "Cola", 1240, 0.5f);
        Product item8 = new HotDrink(180, 9, "Coffe", 1241, 50);
        Product item9 = new HotDrink(190, 10, "Latte", 1242, 60);
        Product item10 = new HotDrink(200, 11, "Americano", 1243, 70);


        Holder hold = new Holder();
        CoinDispenser coin = new CoinDispenser();
        Dispaly disp = new Dispaly();
        List<Product> listProduct = new ArrayList<>();
          
        listProduct.add(item1);
        listProduct.add(item2);
        listProduct.add(item3);
        listProduct.add(item4);
        listProduct.add(item5);
        listProduct.add(item6);
        listProduct.add(item7);
        listProduct.add(item8);
        listProduct.add(item9);
        listProduct.add(item10);


        VendingMachine vm = new VendingMachine(hold, coin, disp, listProduct);

        for (Product p : vm.getAssort()) {
            System.out.println(p);
            System.out.println("___________________");
        }

    }
}
