import java.util.ArrayList;
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        // write your test code here

        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static int smallest(int[] array){
        int smallest = array[0];
        for (Integer i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static int indexOfSmallest(int[] array){
        int smallest = smallest(array);
        int smallestIndex = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest == array[i]) {
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int numOfItemsAfterStartIndex = table.length - startIndex;
        int[] newTable = new int[numOfItemsAfterStartIndex];
        int newTableIndex = 0;

        for (int i = startIndex; i < table.length; i++) {
            newTable[newTableIndex] = table[i];
            newTableIndex++;
        }
        return indexOfSmallest(newTable) + startIndex;
    }

    public static void swap(int[] array, int index1, int index2) {
        int numberIndex1 = array[index1];
        int numberIndex2 = array[index2];

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberIndex1) {
                array[index1] = numberIndex2;
                array[index2] = numberIndex1;
            }
        }
    }

    public static void sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array));
            int smallestIndexFrom = indexOfSmallestFrom(array, i);
            swap(array, i, smallestIndexFrom);
        }
    }
}
