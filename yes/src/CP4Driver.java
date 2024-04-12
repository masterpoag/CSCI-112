import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Scanner;

public class CP4Driver {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        // Intro message
        System.out.println("This program calculates student’s averages from input files.\n" +
                "It will grades per student and return the average grade for each student.\n" +
                "It will also create a file for you with each student's name and average.\n");
        // There are 10 grades per student to be calculated
        System.out.println("Enter the number of grades to calculate the students average");
        int number = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter the name of the file to write the data to along with .txt as the extension");
        String fileName = scanner.nextLine();

        File studentFile = new File("C:\\Users\\colby\\IdeaProjects\\yes\\Students.txt");
        Scanner studentScan = new Scanner(studentFile);

        File test = new File("C:\\Users\\colby\\IdeaProjects\\yes\\Grades.txt");


        // array to store the data from student file
        String[] students = new String[1];

        int count = -1;
        while (studentScan.hasNextLine()) {
            // get the first line only
            if (count == -1) {
                int length = Integer.parseInt(studentScan.nextLine());
                count++;
                students = new String[length];
            } else { // get all the other lines
                students[count] = studentScan.nextLine();
                count++;
            }
        }


        // array to store the data from grade file
        int[] grades = new int[1];
        Scanner test2 = new Scanner(test);
        count = -1;
        while(test2.hasNextLine()) {
            // get the first line only
            if (count == -1) {
                int length = test2.nextInt();
                count++;
                grades = new int[length];
            } else { // get all the other lines
                assert false;
                grades[count] = test2.nextInt();
                count++;
            }
        }


            int[] averages = calcAverages(grades, students.length, number);

            printDataToScreen(students, averages);


            printDataToTextFile(students, averages, fileName);



        System.out.println("Thank you for using our Average calculator!\n" +
                "Good-bye.\n");
        test2.close();
        studentScan.close();
        // TODO create the three methods called in the main method below


    }

    private static void printDataToScreen(String[] students, int[] averages) {
        int index = 0;
        for(String student : students){
            System.out.println("The student "+student+" average was "+ averages[index]);
            index++;
        }
    }
    private static void printDataToTextFile(String[] students, int[] averages, String filename) throws FileNotFoundException {
        PrintWriter output = new PrintWriter(filename);
        int index = 0;
        for(String student : students){
            output.println("The student "+student+" average was "+ averages[index]);
            index++;
        }
        output.close();
    }
    private static int[] calcAverages(int[] grades, int length, int num){
        int[] f = new int[length]; // averages to return
        for (int i = 0; i < length; i++) { // goes to all the students
            int average = 0;
            for (int j = (i * num); j < num+(i*num); j++) {
                average += grades[j];
            }
            f[i]=average = average / num;

            }
        return f;
    }
}

