package by.tms.antonfedoseev;

import by.tms.antonfedoseev.homework13.list.IntArrayList;
import by.tms.antonfedoseev.homework13.list.IntLinkedList;
import by.tms.antonfedoseev.homework13.list.IntListIndexIterator;

import java.util.Scanner;

public class HomeWork18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntLinkedList list = new IntLinkedList();
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
                }
                case 2 -> {
                    System.out.print("Enter new element: ");
                    int element = sc.nextInt();
                    list.add(element);
                    System.out.println(list);
                }
                case 3 -> {
                    System.out.print("Enter index of element: ");
                    int index = sc.nextInt();
                    System.out.print("Enter element: ");
                    int element = sc.nextInt();
                    System.out.print("Element [" + list.set(index, element) + "]" + "\n");
                }
                case 4 -> {
                    System.out.println(list.size());
                }
                case 5 -> {
                    System.out.print("Enter index of element: ");
                    int index = sc.nextInt();
                    System.out.println(list.get(index));
                }
                case 6 -> {
                    System.out.print("Enter index of element to remove");
                    int index = sc.nextInt();
                    System.out.println("Element [" + list.remove(index) + "] was removed");
                    System.out.println(list);
                }
                case 7 -> {
                    System.out.print("Enter element: ");
                    int element = sc.nextInt();
                    System.out.println(list.lastIndexOf(element));
                }
                case 8 -> {
                    IntArrayList listForIndexIterator = new IntArrayList(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10});
                    IntListIndexIterator arrayIterator = new IntListIndexIterator(listForIndexIterator);
                    while (arrayIterator.hasNext()) {
                        Integer index = arrayIterator.next();
                        System.out.println(index.toString());
                    }

                }
                case 0 -> {
                    return;
                }
            }
        } while (true);
    }
}
