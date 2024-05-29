package FilteringProducts;

public class PriceSpecification implements Specification<Products>{

    double maxPrice;
    double minPrice;

    public PriceSpecification(Double minPrice, Double maxPrice){
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
    }
    @Override
    public boolean isSatisfied(Products item) {
        return item.getPrice() >=minPrice && item.getPrice() <= maxPrice;
    }
}
