package set;

import java.util.*;

public class pr31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> playlist = new LinkedList<>();

        for (int i = 0; i < 5; i++) {
            playlist.add(sc.nextLine());
        }

        System.out.println("Playlist:");
        for (String song : playlist) {
            System.out.println(song);
        }

        playlist.removeFirst();
        System.out.println("After playing first song:");
        for (String song : playlist) {
            System.out.println(song);
        }

        playlist.removeLast();
        System.out.println("After skipping last song:");
        for (String song : playlist) {
            System.out.println(song);
        }
    }
}
