package set;

class University {

    static int totalStudents;
    static String universityName;

    static {
        universityName = "GTU";
        totalStudents = 0;
        System.out.println("Static Block Executed");
    }

    {
        System.out.println("Instance Block Executed");
    }

    
    University() {
        totalStudents++;
        System.out.println("Constructor Executed");
    }

    static int getTotalStudents() {
        return totalStudents;
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println("Main Method Started");

        University u1 = new University();
        University u2 = new University();

        System.out.println("University Name: " + University.universityName);
        System.out.println("Total Students: " + University.getTotalStudents());
    }
}
