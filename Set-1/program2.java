import java.util.Scanner;

public class AddOneToEachDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;
        System.out.print("Enter a five-digit number: ");
        num = sc.nextInt();

        if (num >= 10000 && num <= 99999) {
            int d1 = num / 10000;          
            int d2 = (num / 1000) % 10;    
            int d3 = (num / 100) % 10;     
            int d4 = (num / 10) % 10;      
            int d5 = num % 10;             

            d1 = (d1 + 1) % 10;
            d2 = (d2 + 1) % 10;
            d3 = (d3 + 1) % 10;
            d4 = (d4 + 1) % 10;
            d5 = (d5 + 1) % 10;

            int newNum = d1 * 10000 + d2 * 1000 + d3 * 100 + d4 * 10 + d5;

            System.out.println("New number = " + newNum);
        } else {
            System.out.println("Please enter exactly a five-digit number.");
        }

        sc.close();
    }
}
