package iteratorsanditerables;

import java.util.Iterator;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6);
//
////        for(int i = 0; i < list.size(); i++) {
////            System.out.println(list.get(i));
////        }
//
//        Iterator<Integer> iterator = list.iterator();
//        while(iterator.hasNext()) {
//            System.out.print(iterator.next() + " ");
//        }


        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.addProduct(new Product("iPhone"));
        shoppingCart.addProduct(new Product("ps5"));
        shoppingCart.addProduct(new Product("Harry Potter"));

        for(Product product: shoppingCart) {
            System.out.println(product.name);
        }

        Iterator<Product> productIterator = shoppingCart.iterator();
        while(productIterator.hasNext()) {
            System.out.println(productIterator.next().name);
        }

        Iterator<Product> productIterator2 = shoppingCart.iterator();
        while(productIterator2.hasNext()) {
            System.out.println(productIterator2.next().name);
        }
    }
}
