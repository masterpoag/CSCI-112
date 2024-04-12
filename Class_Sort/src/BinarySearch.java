public class BinarySearch {
    public int binarySearch(int[] numbers, int Value){
        int firstIndex = 0;
        int lastIndex = numbers.length;
        boolean found = false;
        int position = -1;
        int middleIndex = 0;
        while(!found && firstIndex <= lastIndex){
            middleIndex = (firstIndex - lastIndex)/2;
            if(numbers[middleIndex] == Value) {
                found = true;
                position = middleIndex;
            }else if (numbers[middleIndex]> Value){
                lastIndex = middleIndex - 1;
            }else{
                firstIndex = middleIndex + 1;
            }
        }
        
        return middleIndex;
    }
}
