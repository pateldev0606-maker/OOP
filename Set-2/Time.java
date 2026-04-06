import java.util.Scanner;

class Time {
    int hours;
    int minutes;
  
    void setTime(int h, int m) {
        hours = h;
        minutes = m;
    }
    void addTime(Time t1, Time t2) {
        minutes = t1.minutes + t2.minutes;
        hours = t1.hours + t2.hours;

        if (minutes >= 60) {
            hours = hours + (minutes / 60);
            minutes = minutes % 60;
        }
    }

    void displayTime() {
        System.out.println(hours + " hours " + minutes + " minutes");
    }
}

public class Time {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();

        int h, m;

        System.out.print("Enter hours for Time 1: ");
        h = sc.nextInt();
        System.out.print("Enter minutes for Time 1: ");
        m = sc.nextInt();
        t1.setTime(h, m);

        System.out.print("Enter hours for Time 2: ");
        h = sc.nextInt();
        System.out.print("Enter minutes for Time 2: ");
        m = sc.nextInt();
        t2.setTime(h, m);

        t3.addTime(t1, t2);

        System.out.println("\nTime 1:");
        t1.displayTime();

        System.out.println("Time 2:");
        t2.displayTime();

        System.out.println("Added Time:");
        t3.displayTime();
    }
}
