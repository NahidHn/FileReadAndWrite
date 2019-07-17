package filereadandwrite;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


public class Student_list {
    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 Show all student");
        System.out.println("Press 2 Count number of students");
        System.out.println("Press 3 for Add student");
        System.out.println("Press 4 Find student");
        System.out.println("Press 5 for Random student");
        System.out.println("Enter between 1-5 :");

        int a = scanner.nextInt();

        switch (a) {
            case (1): {

                Show_Student.main();

                break;
            }
            case (2): {


                int Total_student = Totoal_Student.main();

                System.out.println("Number of lines in the Files:" + Total_student);

                break;
            }
            case (3): {

                Add_Student.main();

                break;
            }

            case (4): {

                FileSearch.main();

                break;
            }


            case (5): {

               //String Random_name = RandomNumberGenerator.main();

             //  System.out.println("Random Student is:"+ Random_name);

                break;
            }

        }
    }
}
