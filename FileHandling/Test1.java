import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) {
        System.out.println("Creating a txt file named Test1");
        File f1 = new File("Test1.txt");

        System.out.println("Writing to File Test1: Hi this is test in file Test1.");
        try{
        FileWriter fw1 = new FileWriter("Test1");
        fw1.write("Hi this is test in file Test1");
        fw1.close();
        System.out.println("Wrote to file.");
        } catch(IOException e){
            System.out.println("An Error Occured.");
            e.printStackTrace();
        }
    }
}