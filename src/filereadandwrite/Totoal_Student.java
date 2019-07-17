package filereadandwrite;

import java.io.*;

public class Totoal_Student {

    public static int main() throws IOException {
        File f1 = new File("Student_list.txt");      //Creation of File Descriptor for input file
        int linecount = 0;
        FileReader fr = new FileReader(f1);
        try {                                           //Intializing linecount as zero
                                                        //Creation of File Reader object
            BufferedReader br = new BufferedReader(fr);    //Creation of File Reader object
            while (br.readLine() != null)                   //Reading Content from the file line by line
            {
                linecount++;                                 //For each line increment linecount by one
                System.out.println("lines "+linecount);
          
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fr.close();
        }
        //Print the line count
        return linecount;
    }
}
