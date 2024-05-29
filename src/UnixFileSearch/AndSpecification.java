package UnixFileSearch;
import UnixFileSearch.File;

class AndSpecification<File> implements Specification<File> {
    private Specification<File> first;
    private Specification<File> second;

    public AndSpecification(Specification<File> first, Specification<File> second) {
        this.first = first;
        this.second = second;
    }


    @Override
    public boolean isSpecifiedBy(File file) {
        return first.isSpecifiedBy(file) && second.isSpecifiedBy(file);
    }
}
