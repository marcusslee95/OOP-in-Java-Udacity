import java.util.Scanner;
import java.io.File;
public class WordCount {
    public static void main(String[] args) throws Exception {
        //Goal: create a program that take a file and count the # of words in it
        //How? Use a scanner object to count words in the file
        File file = new File("Tale of Two Cities.txt");
        Scanner scanner = new Scanner(file); //once scanner is created it's like scanning the file even w/out a method call


        int wordCount = 0;
        //if you're looking at file already you just want to see the words
        while (scanner.hasNextLine()){
            String lineInFile = scanner.nextLine(); //gives you a line in the file
//            System.out.println(lineInFile.split(" ").length);
            wordCount += lineInFile.split(" ").length;
        }
        System.out.println(wordCount);
    }
}
