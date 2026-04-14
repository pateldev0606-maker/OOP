package set;

class Rectangle {
    double width;
    double height;

  double getArea() {
        return width * height;
    }

    double getPerimeter() {
        return 2 * (width + height);
    }
}

public class Rearea {
    public static void main(String[] args) {

        Rectangle r1 = new Rectangle();
        r1.width = 4;
        r1.height = 40;

        Rectangle r2 = new Rectangle();
        r2.width = 3.5;
        r2.height = 35.9;

        System.out.println("Rectangle 1:");
        System.out.println("Width: " + r1.width);
        System.out.println("Height: " + r1.height);
        System.out.println("Area: " + r1.getArea());
        System.out.println("Perimeter: " + r1.getPerimeter());

        System.out.println("\nRectangle 2:");
        System.out.println("Width: " + r2.width);
        System.out.println("Height: " + r2.height);
        System.out.println("Area: " + r2.getArea());
        System.out.println("Perimeter: " + r2.getPerimeter());

        if (r1.getArea() > r2.getArea()) {
            System.out.println("\nRectangle 1 has larger area");
        } else if (r2.getArea() > r1.getArea()) {
            System.out.println("\nRectangle 2 has larger area");
        } else {
            System.out.println("\nBoth rectangles have equal area");
        }
    }
}
