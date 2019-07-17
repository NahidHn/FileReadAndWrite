package filereadandwrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomNumberGenerator {

    public static void main(String... args) throws IOException {

        Random randomGenerator = new Random();

        int n = Totoal_Student.main();
        System.out.println(n);
        int randomInt = randomGenerator.nextInt(n) + 1;

        ArrayList<String> data = new ArrayList<String>();
        
        File f1 = new File("Student_list.txt");      //Creation of File Descriptor for input file
        FileReader fr = new FileReader(f1);
        try {                                           //Intializing linecount as zero
                                                        //Creation of File Reader object
            BufferedReader br = new BufferedReader(fr);    //Creation of File Reader object
         
            while (br.readLine() != null)                   //Reading Content from the file line by line
            {
               data.add(br.readLine());
          
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            fr.close();
        }

        
        System.out.println(randomInt);

        // String name = array[randomInt-1];
        // System.out.println(name);
        String a = data.get(randomInt).toString();
        System.out.println(a);

        

        
        //  return name;

    }
}
