import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lab8 {
	public Scanner scanner = new Scanner(System.in);
	
	public static void main (String[] args) throws FileNotFoundException {
		
		
		// #1. You will read the data from the numbers.txt file to 
		// create and populate a numbers array.
		Scanner file = new Scanner(new File("baseballNumbers.txt"));

		// #1a. Instantiate an integer array named: numbers - length 37
		int[] numbers = new int[37];

		// You will need a File object and a Scanner object
			// remember to include a throws declaration in the method header
		// You will need a variable to keep track of the arrays indexing
		// because the while loop for the file only checks for the end 
			//of the file.

		// #1b. Iterate through the baseballNumbers.txt file 
				// and populate the array with the data
		// #1c. Using the integer array above, iterate through the
		// array and print the numbers

		int index = 0;
		int sum = 0;
		while(file.hasNextLine()){
			int value = Integer.parseInt(file.nextLine());
			sum += value;
			System.out.println(value);
			numbers[index] = value;
			index++;
		}
		// #1d. Sum the values from the numbers array and print the total
		System.out.println("The sum is "+sum);
		file.close();
		

		
		

		// #2 Call the find odd numbers method and pass the numbers array from above
		oddNumbers(numbers);
		
		
		
		
		String[] words = {"baseball", "Ole Miss", "football", 
			"computer science", "stadium", "The Grove", "Oxford", 
			"Mississippi", "Rainy Mondays", "Boure Burgers", "Ajax", "Swayze"};
		
		// #3 Call the print word length method passing the String array
		wordLength(words);
		
		
		
		

		
		// #4 Declare a double array and assign it the method call to the insert
			// values method. There is no argument for the method.

		double[] array = insertArray();

		// #4c Iterate through the double array and print the values
		for(double number : array){
			System.out.println(number);
		}

		
		
	}


	// 2. Create a find odd numbers method that doesn't return any value
	// but receives an integer array
	private static void oddNumbers(int[] numbers) {
		int odds = 0;
		for(int i : numbers){
			if(i % 2 != 0){
				odds++;
				System.out.println(i+" is odd that makes "+odds+" odd numbers");

		}
	}
	}

			


	// 3. Create a print word length method that doesn't return any value
		// but receives a String array
	private static void wordLength(String[] words) {
		for(String word : words){
			System.out.println("The word "+word+" has "+word.length()+" chars");
		}
	}


	// 4.  Create an insert values method that returns a double array
		// #4a Declare a double array of size 20
		// #4b Using the loop control variable insert a double into each cell
			// of the array with a value by multiplying the loop control variable
			// by .282, a previous Ole Miss Baseball's overall batting average
		// return the array.
	public static double[] insertArray(){
		double[] numbers = new double[20];
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = (i * .282);
		}
		return numbers;
	}
}
