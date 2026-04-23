package set;

public class pr27 {
    public static void main(String args[]) {

        FileWriter fw = null;
        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            fw = new FileWriter("students.txt");
            bw = new BufferedWriter(fw);

            bw.write("1 Ravi 85\n");
            bw.write("2 Priya 90\n");
            bw.write("3 Amit 78\n");

            System.out.println("Data written to file.\n");

            bw.close(); 
            br = new BufferedReader(new FileReader("students.txt"));

            String line;
            System.out.println("Student Records:");

            while((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch(IOException e) {
            System.out.println("Error: " + e);
        } finally {
            try {
                if(bw != null) bw.close();
                if(br != null) br.close();
            } catch(IOException e) {
                System.out.println("Error closing file: " + e);
            }
        }
    }
}
