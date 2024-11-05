package test;

import main.FilePath;
import main.FileSize;
import main.ReadLineByLine;
import main.create_newFile;
import org.junit.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;


public class testing {
    @BeforeAll
    @DisplayName("Creating a file")
    public static void createFile() {
        create_newFile obj = new create_newFile();
        obj.create("File.txt");
    }

    @Test
    @DisplayName("File absolute path")
    public void filePath() {
        final String s = "file.txt";
        FilePath obj = new FilePath();
        System.out.println(obj.getPath(s));
    }

    @Test
    @DisplayName("Reading the file line by line")
    public void read_Line() {
        final String s = "file.txt";
        ReadLineByLine obj = new ReadLineByLine();
        obj.read(s);
    }

    @Test
    @DisplayName("Checking File Size")
    public void file_Size()throws InterruptedException {
        final String s = "file.txt";
        FileSize obj = new FileSize();

        // Create a latch with a count of 1
        CountDownLatch latch = new CountDownLatch(1);

        new Thread(() -> {
            try {
                Thread.sleep(50); // Simulate a delay
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                latch.countDown(); // Decrement the latch count to signal completion
            }
        }).start();

        // Wait for the latch
        latch.await();


        System.out.println(obj.getSize(s) + " bytes");
    }
}
