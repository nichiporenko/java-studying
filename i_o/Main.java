package i_o;

import java.io.File;
import java.io.FileNotFoundException;


public class Main {
    public static void main(String[] args) {
        FilesExample.getFileAndDirectoryNames(args);
        FilesExample.getFileProperties(new File("i_o/TextFile1.txt"));

        InputOutputStreams.inputStream();
        InputOutputStreams.outputStream();
    }
}
