package FilteringProducts;

public interface Specification<T> {
    boolean isSatisfied(T item);
}
