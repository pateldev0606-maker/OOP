package set;

public class CramersRule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double a, b, c, d, e, f;
        double D, Dx, Dy, x, y;

        System.out.println("For equations:");
        System.out.println("ax + by = e");
        System.out.println("cx + dy = f");

        System.out.print("Enter value of a: ");
        a = sc.nextDouble();

        System.out.print("Enter value of b: ");
        b = sc.nextDouble();

        System.out.print("Enter value of c: ");
        c = sc.nextDouble();

        System.out.print("Enter value of d: ");
        d = sc.nextDouble();

        System.out.print("Enter value of e: ");
        e = sc.nextDouble();

        System.out.print("Enter value of f: ");
        f = sc.nextDouble();

        D = (a * d) - (b * c);
        Dx = (e * d) - (b * f);
        Dy = (a * f) - (e * c);

        if (D == 0) {
            System.out.println("The system has no unique solution because D = 0.");
        } else {
            x = Dx / D;
            y = Dy / D;

            System.out.println("\nSolution:");
            System.out.println("x = " + x);
            System.out.println("y = " + y);
        }
    }
}
