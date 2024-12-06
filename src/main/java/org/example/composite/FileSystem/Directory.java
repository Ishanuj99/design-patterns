package org.example.composite.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String directoryName;
    List<FileSystem> fileSystemList;

    public Directory(String directoryName) {
        this.directoryName = directoryName;
        this.fileSystemList = new ArrayList<>();
    }

    void add(FileSystem fileSystem){
        this.fileSystemList.add(fileSystem);
    }
    public void ls(){
        System.out.println("Directory name: "+ directoryName);
        for(FileSystem fileSystem: fileSystemList){
            fileSystem.ls();
        }
    }
}
