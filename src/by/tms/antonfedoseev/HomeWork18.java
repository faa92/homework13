package by.tms.antonfedoseev;

import by.tms.antonfedoseev.homework13.list.IntArrayList;
import by.tms.antonfedoseev.homework13.list.IntLinkedList;

import java.util.Iterator;
import java.util.Scanner;
public class HomeWork18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntLinkedList list = new IntLinkedList();
        IntArrayList arrList = new IntArrayList(new int[0]);
        do {
            System.out.println("""
                                        
                    1. toString
                    2. add element
                    3. set element
                    4. size list
                    5. get element
                    6. remove element
                    7. lastIndexOf list
                    8. HW 20 Index Iterator
                    9. HW 20 Node Iterator
                    0. Exit \n""");
            System.out.print("Choose task: ");
            int task = scanner.nextInt();
            Scanner sc = new Scanner(System.in);
            switch (task) {
                case 1 -> {
                    System.out.println(list);
                    System.out.println(arrList);
                }
                case 2 -> {
                    System.out.print("Enter new element: ");
                    int element = sc.nextInt();
                    list.add(element);
                    System.out.println("linkedList: " + list);
                    arrList.add(element);
                    System.out.println("arrList: " + arrList);
                }
                case 3 -> {
                    System.out.print("Enter index of element: ");
                    int index = sc.nextInt();
                    System.out.print("Enter element: ");
                    int element = sc.nextInt();
                    System.out.print("Element linkedList [" + list.set(index, element) + "]" + "\n");
                    System.out.print("Element arrList [" + arrList.set(index, element) + "]" + "\n");
                }
                case 4 -> {
                    System.out.println("Size linkedList: " + list.size());
                    System.out.println("Size arrList " + arrList.size());
                }
                case 5 -> {
                    System.out.print("Enter index of element: ");
                    int index = sc.nextInt();
                    System.out.println("linkedList: " + list.get(index));
                    System.out.println("arrList: " + arrList.get(index));
                }
                case 6 -> {
                    System.out.print("Enter index of element to remove");
                    int index = sc.nextInt();
                    System.out.println("Element linkedList [" + list.remove(index) + "] was removed");
                    System.out.println("linkedList: " + list);
                    System.out.println("arrList: " + arrList);
                }
                case 7 -> {
                    System.out.print("Enter element: ");
                    int element = sc.nextInt();
                    System.out.println("linkedList: " + list.lastIndexOf(element));
                    System.out.println("arrList: " + arrList.lastIndexOf(element));
                }
                case 8 -> {
                    Iterator<Integer> arrayIterator = arrList.iterator();
                    for (Integer index : arrList) {
                        System.out.println("Element arrList: " + index);
                    }
                }
                case 9 -> {
                    Iterator<Integer> nodeIterator = list.iterator();
                    for (Integer node : list) {
                        System.out.println("Element linkedList: " + node);
                    }
                }
                case 0 -> {
                    return;
                }
            }
        } while (true);
    }
}
