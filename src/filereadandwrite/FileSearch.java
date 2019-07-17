package filereadandwrite;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileSearch {

        public static void parseFile(String fileName, String searchStr) throws FileNotFoundException {
            Scanner scan = new Scanner(new File(fileName));
            int c =0;
            while (scan.hasNext()) {
                String line = scan.nextLine();
                if (line.equalsIgnoreCase(searchStr)) {
                    System.out.println("Found:"+ line);
                    c++;
                }

            }
            if(c==0)
            {
                System.out.println("Data not found!");
            }

    }


    public static void main() throws FileNotFoundException {
        FileSearch fileSearch = new FileSearch();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the String");
        System.out.println("enter your number: ");
        String searchStr = input.nextLine();
        fileSearch.parseFile("Student_list.txt", searchStr);
    }

}
