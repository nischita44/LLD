package UnixFileSearch;

class NameSpecification implements Specification<File> {
    private String name;

    public NameSpecification(String name) {
        this.name = name;
    }

    @Override
    public boolean isSpecifiedBy(File file) {
        return file.getName().contains(name);
    }
}
