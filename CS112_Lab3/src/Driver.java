import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Driver {
    public static void main(String[] args) {
        Practice test = new Practice();
        test.addToIntArray(15);
        test.printIntArrayList();
        test.intArrayListChange();
        test.enchancedForLoopPrintInt();
    // Part 2
        test.addToStringArray("The");
        test.addToStringArray(" Time");
        test.addToStringArray(" and");
        test.addToStringArray(" Tide");
        test.addToStringArray(" waits");
        test.addToStringArray(" for");
        test.addToStringArray(" no");
        test.addToStringArray(" one");
        test.printStringArrayList();
        test.printStringArrayListReversed();
        // part 3
        test.qurkyStringPrint();
        test.printEvenInt();
        // part 4
        test.insert2DArray();
        test.PrintGrid2DArray();
        test.PrintGrid2DArrayinverse();
        //part 5
        test.printFormated(76530420.638092);
        //part 6
        test.last("one","two","three");


    }
}
