package by.tms.antonfedoseev.homework13.list;
import java.util.Arrays;
public class IntList {
    private int[] intArray;

    public IntList() {
        intArray = new int[0];
    }

    public IntList(int[] arr) {
        intArray = Arrays.copyOf(arr, arr.length);
    }

    public String toString() {
        return Arrays.toString(intArray);
    }

    public int get(int index) {
        if (index >= intArray.length || index < 0) {
            throw new IllegalArgumentException("Not existent index!");
        }
        return intArray[index];
    }
    public int set(int index, int element) {
        if (index > intArray.length || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        int pastElement = intArray[index];
        intArray[index] = element;
        return pastElement;
    }
    public int size() {
        return intArray.length;
    }

    public void add(int element) {
        int[] addElementArray = Arrays.copyOf(intArray, intArray.length + 1);
        addElementArray[addElementArray.length - 1] = element;
        intArray = addElementArray;
    }

    public int remove(int index) {
        if (index > intArray.length || index < 0) {
            throw new IllegalArgumentException("Index out of bounds");
        }
        int[] arr = new int[intArray.length - 1];
        System.arraycopy(intArray, 0, arr, 0, index);
        System.arraycopy(intArray, index + 1, arr, index, intArray.length - index - 1);
        int removeElement = intArray[index];
        intArray = arr;
        return removeElement;
    }

    public IntList subList(int startIndexInclusive) {
        return subList(startIndexInclusive, intArray.length);
    }

    public IntList subList(int startIndexInclusive, int endIndexExclusive) {
        if (startIndexInclusive < 0 || endIndexExclusive > intArray.length || startIndexInclusive > endIndexExclusive) {
            throw new IllegalArgumentException("Not existent index!");
        }
        IntList newList = new IntList(Arrays.copyOfRange(intArray, startIndexInclusive, endIndexExclusive));
        return newList;
    }
    public int lastIndexOf(int element) {
        for (int i = intArray.length - 1; i > -1; i--) {
            if (intArray[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public void sort() {
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = 0; j < intArray.length - 1 - i; j++) {
                if (intArray[j] > intArray[j + 1]) {
                    int swap = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = swap;
                }
            }
        }
    }
}
