package UnixFileSearch;

import java.util.ArrayList;
import java.util.List;

public class Directory {

    public void setName(String name) {
        this.name = name;
    }

    String name;
    private List<File> files;

    public String getName() {
        return name;
    }

    public List<File> getFiles() {
        return files;
    }

    public List<Directory> getSubDirectories() {
        return subDirectories;
    }

    private List<Directory> subDirectories;


    public Directory(String name) {
        this.name = name;
        this.files = new ArrayList<>();
        this.subDirectories = new ArrayList<>();
    }

    public void addFile(File file) {
        files.add(file);
    }

    public void addSubDirectory(Directory subDirectory) {
        subDirectories.add(subDirectory);
    }


}
