import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class CP4Driver {
    public static void main(String[] args) throws IOException {

        System.out.println("\tWelcome to the Charities of America data");
        System.out.println();

        File file = new File( "OrgList.txt" );
        Scanner scanFile = new Scanner( file );

        // read through text file to get the number of organizations
        int count = 0;
        while( scanFile.hasNextLine() ) {
            scanFile.nextLine();
            count++;
        }
        scanFile.close();

        scanFile = new Scanner( file );
        Charity[] charity = new Charity[count]; //create NonProfits array
        //reads the text files and adds the data to a NonProfits array
        int index = 0;
        while( scanFile.hasNextLine() )
        {
            String line = scanFile.nextLine();
            String[] tokens1 = line.trim().split( "," );
            charity[index] = new Charity(tokens1[0],tokens1[1]);
            index++;
        }
        scanFile.close();

        File file2 = new File( "CharityList.txt" );
        Scanner scanFile2 = new Scanner( file2 );

        while( scanFile2.hasNextLine() )
        {
            String line = scanFile2.nextLine();
            String[] tokens = line.trim().split( "," );
            for(Charity chars : charity) {
                if (chars.getGroupAcronym().equals(tokens[3])) {
                    chars.addDonors(tokens[0], tokens[1], Double.parseDouble(tokens[2]));
                }
            }


        }
        scanFile2.close();

        //Merge Sort the data and print
        for( int j = 0; j < charity.length; j++ )
        {
            charity[j].calculateTCharityScale();
            charity[j].sort();
            charity[j].printData();
        }

        //Output which group the teams qualify for each award
        System.out.println( "\tAwards list for Donation scale:\n");
        System.out.println("The 'Golden Goose Giver' award goes to:");
        for( int i = 0; i < charity.length; i++ )
        {
            charity[i].award1();
        }
        System.out.println();
        System.out.println("The 'Feels Great to Give' award goes to:");
        for( int i = 0; i < charity.length; i++ )
        {
            charity[i].award2();
        }

        System.out.println();
        System.out.println("The 'Happy to Help' award goes to:");
        for( int i = 0; i < charity.length; i++ )
        {
            charity[i].award3();
        }

        System.out.println();
        System.out.println("The 'Something’s Better than Nothing' award goes to:");
        for( int i = 0; i < charity.length; i++ )
        {
            charity[i].award4();
        }
        System.out.println();
        //calls the printWrite method to print all Donor/Charity data to a text file
        new PrintWriter("Donations.txt");
        for (Charity value : charity) {
            value.printWrite();
        }
        System.out.println( "The data has also been saved to the text file 'Donations'.  Good bye!" );
    }
}
