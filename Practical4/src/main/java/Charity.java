import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Charity {
    private String charityName;
    private String charityAcronym; //acronym of the name
    private Donor[] donors;
    private int index; //for keeping up with the donor array


    //empty constructor for the class
    public Charity() {
        charityName = "";
        charityAcronym = "";
        donors = new Donor[200];

    }

    //empty constructor for the class
    public Charity(String charityName, String acronym) {
        this.charityName = charityName;
        charityAcronym = acronym;
        donors = new Donor[200];
        index = 0;

    }

    //setters
    public void setCharityName(String name) {
        charityName = name;
    }


    public void setCharityAcronym(String acronym) {
        charityAcronym = acronym;
    }

    // getters
    public String getCharityName() {
        return charityName;
    }

    public String getGroupAcronym() {
        return charityAcronym;
    }

    public int getIndex() {
        return index;
    }

    public Donor[] getDonorArray() {
        return donors;
    }

    //print method to print the charity and donor data
    public void printData() {
        System.out.println("Charity: " + charityName + " (" + charityAcronym + ")");
        System.out.println(String.format("Their overall charitable score is %.2f%%", calculateTCharityScale()));
        System.out.println("These are the " + index + " Donors of " + charityName + ":");
        for (int i = 0; i < index; i++) {
            System.out.println("\t" + donors[i].toString());
        }
        System.out.println("\n");
    }

    //method for add donor data to the array
    public void addDonors(String name, String town, double time) {
        donors[index] = new Donor(name, town, time);
        index++;

    }

    // method to calculate the overall activity percentage in the champs array
    public double calculateTCharityScale() {
        double sum = 0.0;
        for (int i = 0; i < index; i++) {
            sum += donors[i].getCharityScale();
        }
        return sum / index;
    }

    public void sort() {
        mergeSort(0, index - 1);
    }

    //method1 for the recursive merge sort - mergeSort
    public void mergeSort(int min, int max) {
        if (min < max) {
            int mid = (min + max) / 2;
            mergeSort(min, mid);
            mergeSort(mid + 1, max);
            merge(min, mid, max);
        }
    }

    //method2 of the recursive merge sort
    public void merge(int first, int mid, int last) {
        Donor[] temp = new Donor[donors.length];
        int first1 = first;
        int last1 = mid;
        int first2 = mid + 1;
        int last2 = last;
        int index = first1;

        while (first1 <= last1 && first2 <= last2) {
            if (donors[first1].getCharityScale() > donors[first2].getCharityScale()) {
                temp[index] = donors[first2];
                first2++;
            } else {
                temp[index] = donors[first1];
                first1++;
            }
            index++;
        }
        while (first1 <= last1) {
            temp[index] = donors[first1];
            first1++;
            index++;
        }
        while (first2 <= last2) {
            temp[index] = donors[first2];
            first2++;
            index++;
        }
        for (index = first; index <= last; index++) {
            donors[index] = temp[index];
        }
    }


        //lists the groups qualifying for group #1
        public void award1() {
            if (calculateTCharityScale() >= 3.00) {
                System.out.println("\t" + charityName);
            }
        }

        //lists the groups qualifying for group #2
        public void award2 ()
        {
            if ((calculateTCharityScale() >= 2.00) && (calculateTCharityScale() < 3.00)) {
                System.out.println("\t" + charityName);
            }
        }

        //lists the groups qualifying for group #3
        public void award3 ()
        {
            if ((calculateTCharityScale() >= 1.00) && (calculateTCharityScale() < 2.00)) {
                System.out.println("\t" + charityName);
            }
        }

        //lists the groups qualifying for group #4
        public void award4 ()
        {
            if (calculateTCharityScale() < 1.00) {
                System.out.println("\t" + charityName);
            }
        }

        //method to write all information to a file
        public void printWrite () throws IOException {
            FileWriter file = new FileWriter("Donations.txt", true);
            PrintWriter pw = new PrintWriter(file);

            pw.println("Charity: " + charityName + " (" + charityAcronym + ")");
            pw.println(String.format("Their overall charitable score is %.2f%%", calculateTCharityScale()));
            pw.println("These are the " + index + " Donors of " + charityName + ":");
            for (int i = 0; i != index; i++) {
                pw.println("\t" + donors[i].toString());
            }
            pw.close();

        }
    }

