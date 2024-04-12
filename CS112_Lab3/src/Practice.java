import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;
import java.util.StringJoiner;

public class Practice {
    private Random rand =  new Random();
    private ArrayList<Integer> intArray = new ArrayList<Integer>();
    private ArrayList<String> StringArray = new ArrayList<String>();
    private int[][] D2Array = new int[7][11];
    private DecimalFormat D3 = new DecimalFormat("0.###");
    private int xCounter = 0;
    private int yCounter = 0;

    public void addToIntArray(int times){
        for (int i = 0; i < times; i++) {
            intArray.add(rand.nextInt(35, 95));
        }
        System.out.println("The Int List is now at "+intArray.size()+" Elements");
    }

    public void printIntArrayList(){
        for (int i = 0; i < intArray.size(); i++) {
            System.out.println("Element: "+i+" Int: "+intArray.get(i));
        }
    }
    public void intArrayListChange(){
        intArray.remove(12);
        intArray.remove(9);
        intArray.remove(5);
        intArray.remove(3);
        intArray.set(6,70);
        intArray.set(2,99);
        System.out.println("Int ArrayList now has "+intArray.size()+" Elements");
    }

    public void enchancedForLoopPrintInt(){
        for (int i : intArray){
            System.out.println(i);
        }
    }
    public void addToStringArray(String insert){
        StringArray.add(insert);
    }
    public void printStringArrayList(){
        for (int i = 0; i < StringArray.size(); i++) {
            System.out.println("Element: "+i+" String: "+StringArray.get(i));
        }
    }
    public void printStringArrayListReversed(){
        for (int i = StringArray.size()-1; i != -1; i--) {
            System.out.println("Element: "+i+" String: "+StringArray.get(i));
        }
    }
    public void qurkyStringPrint(){
        for (String s : StringArray){
            System.out.println("the First letter is "+s.charAt(0)+" and is "+s.toCharArray().length+" Chars long");
        }
    }
    public void printEvenInt(){
        for (int i : intArray){
            if(i % 2 == 0){
                System.out.println(i);
            }
        }
    }
    public void insert2DArray(){
        for(int rows = 0; rows < D2Array.length; rows++) { // 0 1 2
            for (int cols = 0; cols < D2Array[rows].length; cols++) { //0 1 2 3
                D2Array[rows][cols] = rand.nextInt(25,85);
            }

        }
    }
    public void PrintGrid2DArray(){
        for(int rows = 0; rows < D2Array.length; rows++) { // 0 1 2
            for(int cols = 0; cols < D2Array[rows].length; cols++) { //0 1 2 3
                System.out.printf("[%d] ",D2Array[rows][cols]);
            }
            System.out.println();
        }
    }
    public void PrintGrid2DArrayinverse(){
        for(int cols = 0; cols < D2Array[0].length; cols++) {
            for(int rows = 0; rows < D2Array.length; rows++) {
                System.out.printf("[%d] ",D2Array[rows][cols]);
            }
            System.out.println();
        }
    }

    public void printFormated(double num){
        System.out.println(D3.format(num));
        System.out.printf("%.3f",num);
        System.out.println();
        System.out.printf("%.2f",num);

    }

    public void last(String o, String t, String tr){
        System.out.printf("%5s\n%5s\n%5s",o,t,tr);
        System.out.printf("%-5s\n%-5s\n%-5s",o,t,tr);
        System.out.println(String.format("%5s\n%5s\n%5s",o,t,tr));
        System.out.println(String.format("%-5s\n%-5s\n%-5s",o,t,tr));
    }

}
