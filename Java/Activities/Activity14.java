package Test;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

public class Activity14 {

    public static void main(String[] args) throws IOException {
        try{
            File file = new File("C:/Users/01750V744/Downloads/Sample.txt");
            boolean fStatus = file.createNewFile();
            if(fStatus) {
                System.out.println("File created successfully!");
            } else {
                System.out.println("File already exists at this path.");
            }

            //get the file Object
            File fileUtil = FileUtils.getFile("C:/Users/01750V744/Downloads/Sample.txt");
            //Read file
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil, "UTF8"));

            //Create directory
            File destDir = new File("resources");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file, destDir);

            //Get file from new directory
            File newFile = FileUtils.getFile(destDir, "Sample.txt");
            //Read data from file
            String newFileData = FileUtils.readFileToString(newFile, "UTF8");

            System.out.println("Data in new file: " + newFileData);
        }

        catch (IOException error){
            System.out.println(error);
        }

    }
}
