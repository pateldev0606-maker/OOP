package set;

import java.util.Scanner;

class Volume {

    double calculateVolume(double side) {
        return side * side * side;
    }

    double calculateVolume(double length, double width, double height) {
        return length * width * height;
    }

    double calculateVolume(int radius) {
        return (4.0 / 3) * Math.PI * radius * radius * radius;
    }
}

public class Mainvolume {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Volume v = new Volume();

        System.out.print("Enter side of cube: ");
        double side = sc.nextDouble();

        System.out.print("Enter length: ");
        double l = sc.nextDouble();
      System.out.print("Enter width: ");
        double w = sc.nextDouble();
      System.out.print("Enter height: ");
        double h = sc.nextDouble();

        System.out.print("Enter radius of sphere: ");
        int r = sc.nextInt();

        System.out.println("Volume of Cube: " + v.calculateVolume(side));
        System.out.println("Volume of Rectangular Cube: " + v.calculateVolume(l, w, h));
        System.out.println("Volume of Sphere: " + v.calculateVolume(r));
    }
}
