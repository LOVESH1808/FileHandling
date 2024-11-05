package main;

import java.io.File;
import java.io.FileInputStream;
import java.util.Scanner;

public class ReadLineByLine {
    public void read(String fileName) {
        try {
//            to check whether file exists or not
            File obj = new File(fileName);
            if(!obj.exists()) {
                System.out.println("File not found");
                return;
            }

//            Reading the file
            FileInputStream FI = new FileInputStream(fileName);
            Scanner sc = new Scanner(FI);
            while(sc.hasNext()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
