package UnixFileSearch;

import UnixFileSearch.File;

public class ExtensionSpecification implements Specification<File>{

    String extension;

    public ExtensionSpecification(String extension){
        this.extension = extension;
    }
    @Override
    public boolean isSpecifiedBy(File file) {
        return file.getExtension().equals(extension);
    }
}
