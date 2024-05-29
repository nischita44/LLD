package UnixFileSearch;

public class SizeSpecification implements Specification<File> {
private long minSize;
private long maxSize;

public SizeSpecification(long minSize, long maxSize) {
        this.minSize = minSize;
        this.maxSize = maxSize;
        }

    @Override
    public boolean isSpecifiedBy(File file) {
        return file.getSize() >= minSize && file.getSize() <= maxSize;
    }
}
