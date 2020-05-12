
import java.util.Arrays;

public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }

    public static void sort(int[] array) {
        swap(array, indexOfSmallest(array), 0);
        System.out.println(Arrays.toString(array));
        for (int i = 1; i < array.length;i++) {
            swap(array,indexOfSmallestFrom(array,i),i);
            System.out.println(Arrays.toString(array));
        }
    }

    public static int smallest(int[] array) {
        // write your code here
        int smallest = array[0];
        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static void swap(int[] array, int index1, int index2) {
        int helper = array[index1];
        // write your code here
        array[index1] = array[index2];
        array[index2] = helper;
    }

    public static int indexOfSmallest(int[] array) {
        int smallest = array[0];
        int index = 0;
        for (int i = 0; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }

    public static int indexOfSmallestFrom(int[] array, int indexFrom) {
        int smallest = array[indexFrom];
        int index = indexFrom;
        for (int i = index; i < array.length; i++) {
            if (smallest > array[i]) {
                smallest = array[i];
                index = i;
            }
        }
        return index;
    }
}
