package set;

import java.util.*;

public class pr29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            marks.add(sc.nextInt());
        }

        for (int m : marks) {
            System.out.println(m);
        }

        System.out.println("Highest: " + Collections.max(marks));
        System.out.println("Lowest: " + Collections.min(marks));
    }
}
