import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SearchAndManipulate {
    private ArrayList<Student> students = new ArrayList<Student>();

    private StringBuilder sBuilder1 = new StringBuilder();

    // TODO create an addStudent method that adds a Student to the classes ArrayList

    public void addStudent(String name,String major, int grade){
        students.add(new Student(name,major,grade));
    }

    private void sort(){
        for (int outerLoop = 1; outerLoop < students.size(); outerLoop++) {
            Student key = students.get(outerLoop);
            int index = outerLoop - 1;
            while ( (index > -1) && ( students.get(index).getGrade() < key.getGrade() ) ) {
                students.set(index+1, students.get(index));
                index--;
            }
            students.set(index+1, key);
        }
        Collections.reverse(students);
    }

    // TODO add a binary search method that searches through the class ArrayList
    public int binarySearch(double value) {
        sort();
        int firstIndex = 0;
        int index = students.size();
        int lastIndex = index - 1;
        int middleIndex;
        int position = -1;
        boolean found = false;

        while(!found && firstIndex <= lastIndex) {
            middleIndex = (firstIndex + lastIndex)/2;

            if(students.get(middleIndex).getGrade() == value) {
                found = true;
                position = middleIndex;
            }
            else if(students.get(middleIndex).getGrade() > value) {
                lastIndex = middleIndex - 1;
            }
            else {
                firstIndex = middleIndex + 1;
            }
        } // ends the while loop
        return position; // returns the index where the value was found or -1
    }


    // TODO create a getStudent method to get a single Student from the class ArrayList
    public Student getStudent(int index){
        return students.get(index);
    }


    // TODO create a method that converts a phrase into Pig Latin
    public String convertPhrase(String phrase){
        ArrayList<String> finalList = new ArrayList<String>();
        String[] wordlist = phrase.split(" ");
        for(String word : wordlist) {
            sBuilder1 = new StringBuilder();
            String newphrase = word.toUpperCase();
            char t = newphrase.charAt(0);
            System.out.println(t);
            sBuilder1.append(newphrase);
            if (t != 'A' && t != 'E' && t != 'I' && t != 'O' && t != 'U' && t != 'Y') {
                sBuilder1.delete(0, 1);
                sBuilder1.append(t);
            }
            sBuilder1.append("AY");
        finalList.add(sBuilder1.toString());
        }
        return finalList.toString().replace("[","").replace("]","").replace(",","");
    }

}
