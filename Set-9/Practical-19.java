package set;

import java.util.*;

public class GenericSort {

    public static <T extends Comparable<T>> void sortList(List<T> list) {
        Collections.sort(list);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();

        System.out.print("Enter number of integers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter number: ");
            numbers.add(sc.nextInt());
        }

        ArrayList<String> names = new ArrayList<>();

        System.out.print("\nEnter number of names: ");
        int m = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < m; i++) {
            System.out.print("Enter name: ");
            names.add(sc.nextLine());
        }

        System.out.println("\nBefore Sorting:");
        System.out.println("Numbers: " + numbers);
        System.out.println("Names: " + names);

        sortList(numbers);
        sortList(names);

        System.out.println("\nAfter Sorting:");
        System.out.println("Numbers: " + numbers);
        System.out.println("Names: " + names);

        sc.close();
    }
}
