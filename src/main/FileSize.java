package main;

import java.io.File;

public class FileSize {
    public Long getSize(String fileName) {
        try {
            File objFile = new File(fileName);
            Long size = objFile.length();
            return size;
        } catch(Exception e) {
            System.out.println("Error " + e.getMessage());
            return -1l;
        }
    }
}
