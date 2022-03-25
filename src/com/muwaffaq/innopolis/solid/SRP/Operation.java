package com.muwaffaq.innopolis.solid.SRP;
import com.muwaffaq.innopolis.solid.SRP.correct.Product;

public class Operation{
  void addToCart(Product product) {
        products.add(product);
    }

    void removeFromCart(Product product) {
        products.remove(product);
    }

    void applyDiscount(int percentage) {
        totals = totals * percentage;
    }
}  
