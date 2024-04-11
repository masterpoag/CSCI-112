import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CS111_CP3 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to the password verification");
        System.out.println("What is your name");
        String name = scanner.nextLine();
        System.out.println("What is the file name and extension (format file.ext)");
        Scanner file = new Scanner(new File("./%s".formatted(scanner.nextLine())));
        while(file.hasNextLine()){
            String s= file.nextLine();
            String out;
            if(passwordCheck(s)){
                out = "\u001B[32mValid\u001B[37m";
            }else {
                out = "\u001B[31mInvalid\u001B[37m";
            }
            System.out.printf("password: %s verification: %s\n",s,out);
        }
        file.close();
        System.out.println(name+" Goodbye I hoped this helped.");

    }

    private static boolean passwordCheck(String s) {
        if(varLength(s)) if(varNumber(s)) return varSymbol(s);
        return false;
    }

    private static boolean varSymbol(String s) {
        for(int i = 0; i != s.length(); i++){
            char c = s.charAt(i);
            if(!Character.isLetter(c)) if(!Character.isDigit(c)) if(!Character.isWhitespace(c)) return false;
        }
        return true;
    }

    private static boolean varNumber(String s) {
    boolean test = false;
        for(int i = 0; i != s.length(); i++){
            if(Character.isDigit(s.charAt(i))){
               test = true;
             }
        }
        return test;
    }

    private static boolean varLength(String s) {
        return s.length() >= 9;
    }
}
