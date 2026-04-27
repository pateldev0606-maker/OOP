package set;

import java.io.*;

public class pr27 {
    public static void main(String[] args) {

        FileWriter fw = null;
        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");
            bw = new BufferedWriter(fw);

            bw.write("101, John, 85");
            bw.newLine();
            bw.write("102, Alice, 90");
            bw.newLine();
            bw.write("103, Bob, 78");
            bw.newLine();

            System.out.println("Student records written successfully.\n");

            bw.close();

            br = new BufferedReader(new FileReader("students.txt"));
            String line;

            System.out.println("Student Records:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        } finally {
            try {
                if (bw != null) bw.close();
                if (fw != null) fw.close();
                if (br != null) br.close();
            } catch (IOException e) {
                System.out.println("Error closing file: " + e.getMessage());
            }
        }
    }
}
