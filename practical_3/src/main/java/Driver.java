import java.lang.reflect.Array;
import java.util.ArrayList;

public class Driver {
    public static void main(String[] args) {
        ArrayList<Aircraft> s = new ArrayList<>();
        s.add(new Aircraft("Mil", "jet", 100.00));
        s.add(new Boeing("Mil", "jet", 100.00,1,2,3));
        s.add(new jet("Mil","jet",100,2,5.5,.9));
        s.add(new cargo("Mil", "jet", 100.00,1,2,3));
        for (Aircraft a  : s){
            a.printCraft();
        }

    }
}
