package ex1;

import utils.*;

import java.io.*;
import java.util.List;
import java.util.Properties;

public class Main {

    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            String rootPath = Thread.currentThread().getContextClassLoader().getResource("").getPath();
            properties.load(new FileInputStream(new File(rootPath + "configuration.properties")));
            String pathIn = properties.get("PATH_IN").toString();
            String pathOut = properties.get("PATH_OUT").toString();
            pathIn = FileUtils.getAbsoluteFilePath(FileUtils.getAbsoluteFilePath(FileUtils.getProjectPath() + pathIn));
            writeFileList(FileLister.listFiles(pathIn, SortOrder.ASC), rootPath + pathOut);
        } catch (IOException e) {
            new Print("Path don't exist");
            throw new RuntimeException(e);
        }
    }

    public static void writeFileList(List<File> files, String outPath) {
        try {
            PrintStream printStream = new PrintStream(outPath);
            FilePrint.printFiles(files, printStream, 0);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}