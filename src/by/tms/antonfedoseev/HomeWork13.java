package by.tms.antonfedoseev;

import by.tms.antonfedoseev.homework13.list.IntList;

import java.util.Scanner;

public class HomeWork13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        IntList list = new IntList(new int[]{1, 9, 3, 6, 5, 4, 7, 8, 2, 10});
        do {
            System.out.println("\n" + """
                    1. toString()
                    2. get()
                    3. set()
                    4. size()
                    5. add()
                    6. remove()
                    7. subList (start, end)
                    8. subList (start)
                    9. lastIndexOf ()
                    10. sort ()
                    0. Exit
                    """);
            System.out.print("Enter task: ");
            int number = scanner.nextInt();

            switch (number) {
                case 1 -> System.out.println("Array number: " + list.toString());
                case 2 -> {
                    System.out.println("Enter index number: ");
                    int index = scanner.nextInt();
                    System.out.println("Number: " + list.get(index));
                }
                case 3 -> {
                    System.out.println("Enter index: ");
                    int index = scanner.nextInt();
                    System.out.println("Enter set element: ");
                    int element = scanner.nextInt();
                    int elementDelete = list.set(index, element);
                    System.out.println("List: " + list);
                    System.out.println("Delete element: " + elementDelete);
                }
                case 4 -> {
                    System.out.println("List size: " + list.size());
                }
                case 5 -> {
                    System.out.println("Enter add element: ");
                    int element = scanner.nextInt();
                    list.add(element);
                    System.out.println("List: " + list);
                }
                case 6 -> {
                    System.out.println("Enter element index to remove: ");
                    int index = scanner.nextInt();
                    int dellElement = list.remove(index);
                    System.out.println("Current list: " + list);
                    System.out.println("Delete element: " + dellElement);
                }
                case 7 -> {
                    System.out.println("Enter start index: ");
                    int indexStart = scanner.nextInt();
                    System.out.println("Enter end index: ");
                    int indexEnd = scanner.nextInt();
                    System.out.println("New list: " + list.subList(indexStart, indexEnd));
                }
                case 8 -> {
                    System.out.println("Enter start index: ");
                    int index = scanner.nextInt();
                    System.out.println("New list: " + list.subList(index));
                }
                case 9 -> {
                    System.out.println("Enter element: ");
                    int element = scanner.nextInt();
                    System.out.println(list.lastIndexOf(element));
                }
                case 10 -> {
                    System.out.println("Sorting: " + list);
                    list.sort();
                    System.out.println("After sorting: " + list);
                }
                case 0 -> {
                    System.exit(0);
                    return;
                }
                default -> System.out.println("Enter task again: ");
            }
        } while (true);
    }
}
