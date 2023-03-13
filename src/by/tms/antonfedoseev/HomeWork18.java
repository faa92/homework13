package by.tms.antonfedoseev;

import by.tms.antonfedoseev.homework13.list.IntLinkedList;

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
                    0. Exit \n""");
            System.out.print("Choose task: ");
            int task = scanner.nextInt();
            switch (task) {
                case 1 -> {
                    System.out.println(list.toString());
                }
                case 2 -> {
                    System.out.println("Enter new element: ");
                    int element = scanner.nextInt();
                    list.add(element);
                    System.out.println(list.toString());
                }
                case 3 -> {
                    System.out.print("Enter index of element: ");
                    int index = scanner.nextInt();
                    System.out.print("Enter element: ");
                    int element = scanner.nextInt();
                    System.out.println("Element [" + list.set(index, element) + "]");
                }
                case 4 -> {
                    System.out.println(list.size());
                }
                case 5 -> {
                    System.out.println("Enter index of element: ");
                    int index = scanner.nextInt();
                    System.out.println(list.get(index));
                }
                case 6 -> {
                    System.out.println("Enter index of element to remove");
                    int index = scanner.nextInt();
                    System.out.println("Element [" + list.remove(index) + "] was removed");
                    System.out.println(list.toString());
                }
                case 7 -> {
                    System.out.print("Enter element: ");
                    int element = scanner.nextInt();
                    System.out.println(list.lastIndexOf(element));
                }
                case 0 -> {
                    return;
                }
            }
        } while (true);
    }
}
