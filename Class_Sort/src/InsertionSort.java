import java.util.ArrayList;

public class InsertionSort {
    // fastest but more memory intensive


    /** The InsertionSort sorts by repeatedly inserting a new element
     into a sorted sub list until the whole list is sorted */

    /** an array literal */
    private int[] numbers = { 72, 4, 37, 83, 9, 43, 17, 28, 7, 1, 55, 61 };
    /** A Truck ArrayList */
    private ArrayList<Truck> trucks = new ArrayList<Truck>();

    public void addTruck(String make, double cost){
        trucks.add(new Truck(make, cost));
    }

    public void printArray(){
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
        System.out.println();
    }

    public void printTrucks(){
        for(int i = 0; i < trucks.size(); i++) {
            System.out.println(trucks.get(i).toString());
        }
    }

    public void insertionSort() {
        /** This sort doesn't require a variable before
         the outer for loop */
        for (int outerLoop = 1; outerLoop < numbers.length; outerLoop++) {

            /** key keeps track of the value at the location of the
             outer loops loop control variable */
            int key = numbers[outerLoop]; // 1.

            /** index keeps track of the location just behind the key */
            int index = outerLoop - 1;

            /** the inner while loop makes sure the loop stays within
             the bounds (indexes) of the array AND it compares
             the key value to the previous value in the array */
            while ( (index > -1) && ( numbers[index] > key ) ) {
                /** if it is in the bounds of the array AND
                 the value at the index is greater than the key value
                 move the value at the index forward a cell */
                numbers[index+1] = numbers[index]; // 2.

                index--;
                /** this moves the index back to see if the key
                 needs to be moved back more (toward the front/start
                 of the array) */
            }
            numbers[index+1] = key; // 3. places the key value in its correct location

            /** Notice the difference in the swap, It is still a three-way swap,
             but it doesn't place the key until any/all other values are moved */
        }
    }





    /** showing how to sort a Truck Object array */

    public void insertionSort2() {
        for (int outerLoop = 1; outerLoop < trucks.size(); outerLoop++) {
            Truck key = trucks.get(outerLoop); // 1. the data type is now Truck as that
            // is the type of Object to be sorted
            int index = outerLoop - 1;
            while ( (index > -1) && ( trucks.get(index).getCost() < key.getCost() ) ) {
                // notice above we are getting the cost of a Truck to compare
                trucks.set(index+1, trucks.get(index)); // 2.
                index--;
            }
            trucks.set(index+1, key); // 3. places the key Object in its correct location
        }
    }

}