package filereadandwrite;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Add_Student {
    public static void main() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter data fo add");

        String textToAppend = input.nextLine();

        BufferedWriter writer = new BufferedWriter(
                new FileWriter("Student_list.txt", true)  //Set true for append mode
        );
        writer.newLine();   //Add new line
        writer.write(textToAppend);
        writer.close();
    }
}
