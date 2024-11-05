package main;

import java.io.File;

public class FilePath {
    public String getPath(String fileName) {
        try {
            File objFile = new File(fileName);
            return objFile.getAbsolutePath();
        } catch (Exception e) {
            return e.toString();
        }
    }
}
