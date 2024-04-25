
public class MainProgram {

    public static void main(String[] args) {
        // write your test code here
        int[] array = {3, 1, 5, 99, 3, 12};
    }

    public static int smallest(int[] array) {
        int small = array[0];
        for (int num : array) {
            if (num < small) {
                small = num;
            }
        }
        return small;
    }

    public static int indexOfSmallest(int[] array) {
        // write your code here
        int j = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[j]) {
                j = i;
            }
        }
        return j;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        // write your code here
        int j = startIndex;
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < table[j]) {
                j = i;
            }
        }
        return j;
    }

    public static void swap(int[] array, int index1, int index2) {
        // write your code here
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void sort(int[] array) {
        int startIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int smallestID = indexOfSmallestFrom(array, startIndex);
            swap(array, startIndex, smallestID);
            startIndex++;
        }
    }
}
