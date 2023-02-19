package by.tms.antonfedoseev.homework13;

import java.util.Arrays;

public class IntList {


    protected int[] fieldList;

    public IntList () {
        fieldList = new int[] {};
    }
    public IntList (int[] arr) {
        fieldList = arr;
    }
    public String toString (int [] arr) {

        return Arrays.toString(arr);
    }

    public int get (int index) {
        if (index >= fieldList.length || index < 0) {
            throw new IllegalArgumentException("Not existent index!");
        }
        return fieldList[index];
    }

    public int set (int index, int element) {
        int[] arr = new int[fieldList.length];
        System.arraycopy(fieldList, 0, arr, 0,fieldList.length);
        arr[index] = element;
        return fieldList[index];
    }
    public int size () {
        return fieldList.length;
    }

    public void add (int element) {
        int[] addElementArray = Arrays.copyOf(fieldList, fieldList.length + 1);
        addElementArray [addElementArray.length - 1] = element;
        System.out.println(Arrays.toString(addElementArray));
    }
    public int remove (int index) {
        int[] arr = new int[fieldList.length - 1];
        System.arraycopy(fieldList,0,arr,0,index);
        System.arraycopy(fieldList, index + 1, arr, index, fieldList.length - index -1);
        int removeElement = fieldList[index];
        System.out.println(Arrays.toString(fieldList));
        System.out.println(Arrays.toString(arr));
        System.out.println(removeElement);
        return removeElement ;
    }
//    public IntList subList (int startIndexInclusive, int endIndexExclusive) {
//
//    }




}
