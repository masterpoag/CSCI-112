public class SelectionSort {
    // slower but less memory intensive


    /** The SelectionSort sorts by searching the entire list for the
     smallest value in the list, when it reaches the end of the list,
     it moves the value to the front of the list. It shifts forward
     a space in the list and then repeats the process by finding
     the next smallest value and moving it. */

    /** an array literal */
    private int[] numbers = { 72, 4, 37, 83, 9, 43, 17, 28, 7, 1, 55, 61 };
    /** a Truck array */
    private Truck[] trucks = new Truck[5];
    private int index = 0;


    public void addTruck(String make, double cost){
        trucks[index] = new Truck(make, cost);
        index++;
    }

    public void printArray(){
        for(int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();

    }

    public void printTrucks(){
        for(int i = 0; i < trucks.length; i++) {
            System.out.println(trucks[i].toString());
            /** you don't have to explicitly call a toString method
             for the toString method to be called */
//            System.out.println(trucks[i]);
        }
        System.out.println();
    }


    public void selectionSort() {
        /** first declare the variables you will need to move values around
         outside the loops, so they can be used in the loops */
        int indexOfSmallestValue;	// The book has minIndex
        int smallestValue;		// the book has minValue

        for(int outerControl = 0; outerControl < numbers.length - 1; outerControl++) {
            indexOfSmallestValue = outerControl; // start with the first index
            smallestValue = numbers[outerControl]; // start with the first value

            for(int innerControl = outerControl + 1; innerControl < numbers.length; innerControl++) {
                /** test the current smallest value against the next value in the array
                 if it is a smaller value, it becomes the new smallestValue
                 and keep up with the new index of the smallest value */
                if( numbers[innerControl] < smallestValue) {
                    smallestValue = numbers[innerControl]; // keeps track of the smallest value
                    indexOfSmallestValue = innerControl;
                } // ends the if
            } // ends the inner for loop

            /** swap the values in the array */
            numbers[indexOfSmallestValue] = numbers[outerControl];
            /** move the larger value further down the array */
            numbers[outerControl] = smallestValue;
            /** place the smallest value toward the front of the array */

        } // ends the outer for loop
    } // ends the method







    /** This method is to show you how to sort an Object array
     It will sort the array based on a Trucks cost */

    public void selectionSort2() {
        /** variables */
        int indexOfSmallestTruckCost;	// an index is always an integer
        Truck smallestTruckCost;		// We need to keep track of a Truck not just a cost
        /** Remember the array stores Objects that have 2 attributes
         (a String and a double), so we need an Object to store an Object */
        for(int outerControl = 0; outerControl < trucks.length - 1; outerControl++) {

            indexOfSmallestTruckCost = outerControl; // start with the first index
            smallestTruckCost = trucks[outerControl]; // get a Truck Object

            for(int innerControl = outerControl + 1; innerControl < trucks.length; innerControl++) {
                /** test the current smallest value against the next value in the array */

                /** comparing the cost of two Truck Objects */
                if( trucks[innerControl].getCost() < smallestTruckCost.getCost()) {
                    smallestTruckCost = trucks[innerControl]; // 1. keep up with the Truck with the lowest cost
                    indexOfSmallestTruckCost = innerControl; // and the index
                } // ends the if
            } // ends the inner for loop

            /** swap the Objects in the array */
            trucks[indexOfSmallestTruckCost] = trucks[outerControl]; // 2.
            /** move the larger costing Truck further down the array */
            trucks[outerControl] = smallestTruckCost; // 3.
            /** place the smallest costing Truck Object toward the front of the array */

        } // ends the outer for loop
    } // ends the method
}