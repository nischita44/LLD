package FilteringProducts;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args){
        // Initialize the products
        List<Products> products = new ArrayList<>();
        products.add(new Products("Laptop", "Electronics", 1200.00));
        products.add(new Products("Smartphone", "Electronics", 800.00));
        products.add(new Products("Shoes", "Fashion", 50.00));
        products.add(new Products("T-Shirt", "Fashion", 20.00));
        products.add(new Products("Headphones", "Electronics", 100.00));

        // Using Specification Pattern
        Specification<Products> electronicsCategory = new CategorySpecification("Electronics");
        Specification<Products> priceRange = new PriceSpecification(100.00, 1000.00);
        Specification<Products> combinedSpec = new AndSpecification<>(electronicsCategory, priceRange);

        List<Products> filteredProd = new ArrayList<>();
        for(Products p: products){
            if(combinedSpec.isSatisfied(p)){
                filteredProd.add(p);
            }
        }
        System.out.println("Filtered Products:");
        for(Products fp: filteredProd){
            System.out.println(fp);
        }

    }
}
