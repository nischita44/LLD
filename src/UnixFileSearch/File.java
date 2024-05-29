package UnixFileSearch;

// this uses BFS - since the files are in level order

public class File {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public long getSize() {
        return size;
    }

    public void setSize(long size) {
        this.size = size;
    }

    private String name;
    private String extension;

    private long size;

    public File(String name, String extension, long size){
        this.name = name;
        this.extension = extension;
        this.size = size;
    }

    @Override
    public String toString() {
        return "c{" +
                "name='" + name + '\'' +
                ", extension='" + extension + '\'' +
                ", size=" + size +
                '}';
    }
}
