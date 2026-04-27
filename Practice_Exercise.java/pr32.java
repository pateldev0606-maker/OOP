package set;

import java.util.*;

public class pr32 {
    public static <T> boolean searchElement(LinkedList<T> list, T element) {
        return list.contains(element);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> rollNumbers = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            rollNumbers.add(sc.nextInt());
        }
        int rollToSearch = sc.nextInt();
        System.out.println(searchElement(rollNumbers, rollToSearch));

        sc.nextLine();

        LinkedList<String> names = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            names.add(sc.nextLine());
        }
        String nameToSearch = sc.nextLine();
        System.out.println(searchElement(names, nameToSearch));
    }
}
