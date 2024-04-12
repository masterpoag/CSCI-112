import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadandCalc implements ReadFile{
    public void calcValues(int[] nums){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many numbers do you want calculated");
        int user = Integer.parseInt(scan.nextLine().strip());
        int index = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if(index < user){
                System.out.println(nums[i]);
                sum += nums[i];
                index++;
            } else if (sum == nums[i]) {
                System.out.println("the sum was "+sum+" and matches "+nums[i]);
                index = 0;
                sum = 0;
            }else {
                System.out.println("The sum was "+sum+" and DOES NOT match "+nums[i]);
                index = 0;
                sum = 0;
            }


        }
        }

    public int[] populateArray(String filename) throws IOException {
        File file = new File(filename);
        Scanner scan = new Scanner(file);
        int count = 0;
        while(scan.hasNextLine()){
            count++;
            scan.nextLine();
        }
        scan.close();
        Scanner scan2 = new Scanner(file);
        int[] temp = new int[count];
        int index = 0;
        while(scan2.hasNextLine()){
            temp[index] = Integer.parseInt(scan2.nextLine().strip());
            index++;
        }
        scan2.close();

        //System.out.println("Found "+count+" lines.");
        return temp;
    }
    public ReadandCalc(){
    }
}
