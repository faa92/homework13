package by.tms.antonfedoseev.homework13.list;
import java.util.Arrays;
public class IntList {
    private int[] fieldList;
    public IntList() {
    }
    public IntList(int[] arr) {
        fieldList = Arrays.copyOf(arr, arr.length);
    }

    public String toString() {
        return Arrays.toString(fieldList);
    }

    public int get(int index) {
        if (index >= fieldList.length || index < 0) {
            throw new IllegalArgumentException("Not existent index!");
        }
        return fieldList[index];
    }
    public int set(int index, int element) {
        int[] arr = new int[fieldList.length];
        System.arraycopy(fieldList, 0, arr, 0, fieldList.length);
        arr[index] = element;
        return fieldList[index];
    }
    public int size() {
        return fieldList.length;
    }

    public void add(int element) {
        int[] addElementArray = Arrays.copyOf(fieldList, fieldList.length + 1);
        addElementArray[addElementArray.length - 1] = element;
        fieldList = addElementArray;
    }

    public int remove(int index) {
        int[] arr = new int[fieldList.length - 1];
        System.arraycopy(fieldList, 0, arr, 0, index);
        System.arraycopy(fieldList, index + 1, arr, index, fieldList.length - index - 1);
        int removeElement = fieldList[index];
        fieldList = arr;
        return removeElement;
    }

    public IntList subList(int startIndexInclusive) {
        if (startIndexInclusive < 0 || startIndexInclusive > fieldList.length) {
            throw new IllegalArgumentException("Not existent start index!");
        }
        IntList newIntList = new IntList(new int[0]);
        for (int i = startIndexInclusive; i < fieldList.length; i++) {
            newIntList.add(fieldList[i]);
        }
        return newIntList;
    }

    public IntList subList(int startIndexInclusive, int endIndexExclusive) {
        if (startIndexInclusive < 0 || endIndexExclusive > fieldList.length || startIndexInclusive > endIndexExclusive) {
            throw new IllegalArgumentException("Not existent index!");
        }
        IntList newList = new IntList(new int[0]);
        for (int i = startIndexInclusive; i < endIndexExclusive; i++) {
            newList.add(fieldList[i]);
        }
        return newList;
    }
    public int lastIndexOf(int element) {
        if (fieldList.length == 0 || fieldList == null) {
            throw new IllegalArgumentException("Object is empty");
        }
        for (int i = fieldList.length - 1; i > 0; i--) {
            if (fieldList[i] == element) {
                return i;
            }
        }
        return -1;
    }
    public void sort() {
        if (fieldList.length == 0 || fieldList == null) {
            throw new IllegalArgumentException("Object is empty");
        }
        for (int i = 0; i < fieldList.length - 1; i++) {
            for (int j = 0; j < fieldList.length - 1 - i; j++) {
                if (fieldList[j] > fieldList[j + 1]) {
                    int swap = fieldList[j];
                    fieldList[j] = fieldList[j + 1];
                    fieldList[j + 1] = swap;
                }
            }
        }
    }
}
