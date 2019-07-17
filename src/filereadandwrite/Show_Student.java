package filereadandwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Show_Student {
    public static void main() {
        try {
            BufferedReader in = new BufferedReader(new FileReader("Student_list.txt"));
            String str;

            while ((str = in.readLine()) != null) {
                System.out.println(str);
            }
            //System.out.println(str);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
