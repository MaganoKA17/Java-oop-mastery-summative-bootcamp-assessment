package oopmastery;

import java.util.ArrayList;
import java.util.List;

public class Question10_ShoppingCart {

    private List<Question10_Product> products;

    public Question10_ShoppingCart() {
        // TODO:
        // Create the product list
        products = new ArrayList<>();
    }

    public void addProduct(
            Question10_Product product
    ) {
        // TODO:
        // Add the product to the cart
        products.add(product);
    }

    public double totalPrice() {
        // TODO:
        // Calculate and return
        // the total value of all products

        for (Object product : products){
            double total = 0;
            total += product.getPrice;
        }
        return total;
    }
}