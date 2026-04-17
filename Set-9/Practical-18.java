package set;

import java.util.*;

class Box<T> {
    ArrayList<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    void displayItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

public class Addtime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Box<String> nameBox = new Box<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            String name = sc.nextLine();
            nameBox.addItem(name);
        }

        Box<Integer> rollBox = new Box<>();

        System.out.print("Enter number of roll numbers: ");
        int m = sc.nextInt();

        for (int i = 0; i < m; i++) {
            System.out.print("Enter roll number: ");
            int roll = sc.nextInt();
            rollBox.addItem(roll);
        }

        System.out.println("\nNames in Box:");
        nameBox.displayItems();

        System.out.println("\nRoll Numbers in Box:");
        rollBox.displayItems();
    }
}
