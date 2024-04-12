
public class BubbleSort {

    /** The BubbleSort sorts by starting at the beginning of a list
     and moving a large value toward the end of the list, when it
     encounters a larger value it begins moving that value to
     the end of the list. When it reaches the end of the list,
     it starts over at the front moving large values to the end
     of the list */

    /** an array literal */
    private int[] numbers = { 72, 4, 37, 83, 9, 43, 17, 28, 7, 1, 55, 61 };
    private Truck[] trucks = new Truck[5]; /** a Truck array*/
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
        System.out.println();
    }

    public void printTrucks(){
        for(int i = 0; i < trucks.length; i++) {
            System.out.println(trucks[i].toString());
        }
    }

    public void bubbleSort() {

        int tempValue = 0; // a temporary variable for the swap later

        /** the outer loop that begins at the first index */
        for(int outerLoop = 0; outerLoop < numbers.length; outerLoop++){

            /** the inner loop that begins at the second index */
            for(int innerLoop = 1; innerLoop < (numbers.length - outerLoop); innerLoop++){

                /** test the value of previous cell against the current cell */
                if(numbers[innerLoop-1] > numbers[innerLoop]){
                    /** if the previous value was larger swap the position of the
                     two values this bubbles the larger value up or toward the end
                     of the array.
                     The next three statements are a classic 3 way position swap
                     1. store/move the previous value into the temp variable */
                    tempValue = numbers[innerLoop-1];
                    /** 2. store the current value (at innerLoop index) in the
                     previous cell */
                    numbers[innerLoop-1] = numbers[innerLoop];
                    /** 3. move the value from the temp variable to the current cell */
                    numbers[innerLoop] = tempValue;
                } // ends the if
            } // ends the inner loop
        } // ends the outer loop
    }



    // showing how to sort a Truck Object ArrayList

    public void bubbleSort2() {

        Truck tempValue; /** a temporary Truck Object for the swap later
         It can't be a double or int or String, It has to be the same Object
         type we want to swap/move around */

        for(int outerLoop = 0; outerLoop < trucks.length; outerLoop++){
            for(int innerLoop = 1; innerLoop < (trucks.length - outerLoop); innerLoop++){
                /** test the value of previous cell to the current cell */
                if(trucks[innerLoop-1].getCost() > trucks[innerLoop].getCost()){
                    /** if the previous Cost was larger swap the position of the two
                     values this bubbles the Truck with the highest cost up or toward
                     the end of the array.
                     3 way position swap */
                    tempValue = trucks[innerLoop-1]; // 1.
                    trucks[innerLoop-1] = trucks[innerLoop]; // 2.
                    trucks[innerLoop] = tempValue; // 3.
                } // ends the if
            } // ends the inner loop
        } // ends the outer loop
    }
}