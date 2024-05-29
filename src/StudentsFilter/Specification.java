package StudentsFilter;

public interface Specification<T> {

    boolean isSatisfied(T student);
}
