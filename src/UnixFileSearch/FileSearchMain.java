package UnixFileSearch;

import SocialNetworkConnection.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class FileSearchMain {

    public static void main(String[] args){
        List<File> files = new ArrayList<>();
        File file1 = new File("report", "txt", 2000);
        File file2 = new File("image", "jpg", 5000);
        File file3 = new File("video", "mp4", 15000);
        File file4 = new File("document", "doc", 3000);

        // lets add these files to the directory
        Directory directory = new Directory("root");
        directory.addFile(file1);
        directory.addFile(file2);
        directory.addFile(file3);
        directory.addFile(file4);

        Directory subDir = new Directory("subDir");
        File file5 = new File("notes", "txt", 1000);
        subDir.addFile(file5);
        directory.addSubDirectory(subDir);



        //call the criteria
        Specification<File> spec = new AndSpecification<>(
                new ExtensionSpecification("txt"),
                new SizeSpecification(500, 2500)
        );

        List<File> filteredFiles = search(directory, spec);

        for(File filteredRes: filteredFiles){
            System.out.println(filteredRes);
        }



    }

    public static List<File> search(Directory directory, Specification<File> spec){
        List<File> result = new ArrayList<>();
        result = searchDirectory(directory, spec, result);
        return result;

    }

    public static List<File> searchDirectory(Directory directory, Specification<File> spec, List<File> res){

        for(File file: directory.getFiles()){
            if(spec.isSpecifiedBy(file)){
                res.add(file);
            }
        }
        //for this we need to make dfs call over files
        for (Directory subDirectory : directory.getSubDirectories()) {
            searchDirectory(subDirectory, spec, res);
        }

        return res;
    }



}
