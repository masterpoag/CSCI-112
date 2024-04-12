import java.io.IOException;

public class Lab7Driver {

    public static void main(String[] args) throws IOException {
        System.out.println("Welcome to the number file reader");
        ReadandCalc cal = new ReadandCalc();
        int[] array = cal.populateArray("Data.txt");
        cal.calcValues(array);

    }

}
