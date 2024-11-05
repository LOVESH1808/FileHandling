package main;

import java.io.File;

public class create_newFile {
     public String create(String file_name) {
        try {
            File obj = new File(file_name);
            if(!obj.exists()) {
                if(obj.createNewFile()) {
                    return "File created";
                } else {
                    return "File creation failed";
                }
            } else {
                return "File name already exists";
            }
        } catch (Exception e) {
            return "Error "  + e.toString();
        }
    }
}
