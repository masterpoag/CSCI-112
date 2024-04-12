import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class CP5Driver {
    Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Welcome to the GPA calculator!");
        System.out.println();

        // TODO create the Student array with a length of 50 and instantiate each cell
        Student[] students = new Student[50];
        for (int s = 0; s < students.length; s++) {
            students[s] = new Student();
        }




        System.out.println("Enter the number of students contained in the file");
        int numStudents = Integer.parseInt(keyboard.nextLine());

        File file = new File("data.txt");
        Scanner scan = new Scanner(file);

        int index = 0;
        while(scan.hasNextLine()){
            String line = scan.nextLine();

            if(line.length() > 6 ){ // a students name
                students[index].setName(line);

                index++;
            }
            else if(line.length() == 6){ // a students id
                students[index].setID(Integer.parseInt(line));

                index++;
            }
            else { // a Students GPA
                students[index].setGPA(Float.parseFloat(line));
                index++;
            }

            if(index == numStudents){
                index = 0;
            }
        }
        scan.close();

        int choice;
        do {
            System.out.println("The choices are:");
            System.out.println("\t1. Print all the data.");
            System.out.println("\t2. Print the average GPA.");
            System.out.println("\t3. Print the student info for the Highest GPA.");
            System.out.println("\t4. Print the student info for the Lowest GPA.");
            System.out.println();
            System.out.println("Enter the number of your choice or -1 to quit");
            choice = Integer.parseInt(keyboard.nextLine());


            if(choice == 1) printAllData(students);
            if(choice == 2) average(students);
            if(choice == 3) HighestGPA(students);
            if(choice == 4) LowestGPA(students);




        } while(choice != -1);


        System.out.println();
        System.out.println("Good-bye and thank you for using the GPA calculator.");

    }

    // TODO create the required Driver methods below
    public static void printAllData(Student[] students){
        for(Student student : students){
            if(student.getName() == null) {
                continue;
            }else System.out.println("Name: "+student.getName()+" ID: "+student.getID()+" GPA: "+String.format("%.2f", student.getGPA()));
        }
    }
    public static void average(Student[] students){
        float averages = 0;
        int deviser = 0;
        for(Student student : students) {
            if (student.getName() == null) {
                continue;
            } else {
                deviser++;
                averages += Float.parseFloat(String.format("%.2f", student.getGPA()));
            }
        }
            System.out.println("Average GPA is "+(averages/deviser));

    }
    public static void HighestGPA(Student[] students){
        float highest = students[0].getGPA();
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName() == null) {
                continue;
            } else {
                if (highest < students[i].getGPA()) {
                    index = i;
                }
                highest = students[i].getGPA();
            }
        }
            System.out.println(students[index].getName() + ", #" + students[index].getID() + ", Had the highest GPA of " + String.format("%.2f", students[index].getGPA()));

    }
    public static void LowestGPA(Student[] students){
        float highest = students[0].getGPA();
        int index = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i].getName() == null) {
                continue;
            } else {
                if (highest > students[i].getGPA()) {
                    index = i;
                }
                highest = students[i].getGPA();
            }
        }
        System.out.println(students[index].getName()+", #"+students[index].getID()+", Had the lowest GPA of "+String.format("%.2f", students[index].getGPA()));


    }



}
