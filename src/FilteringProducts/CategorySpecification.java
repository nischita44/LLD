package FilteringProducts;

// Concrete specification
public class CategorySpecification implements Specification<Products> {

    private String category;

    public CategorySpecification(String category){
        this.category = category;
    }

    @Override
    public boolean isSatisfied(Products item) {
        return item.getCategory().equals(category);
    }
}
