package UnixFileSearch;

public interface Specification<File> {

    boolean isSpecifiedBy(File file);
}
