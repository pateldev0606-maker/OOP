package set;

import java.io.*;

public class pr28 {
    public static void main(String args[]) {
        if(args.length == 0) {
            System.out.println("Please provide file name as command-line argument");
            return;
        }

        int charCount = 0;
        int wordCount = 0;
        int lineCount = 0;

        try {
            FileReader fr = new FileReader(args[0]);
            BufferedReader br = new BufferedReader(fr);

            String line;

            while((line = br.readLine()) != null) {
                lineCount++;

                charCount += line.length();

                String words[] = line.trim().split("\\s+");
                if(line.trim().length() > 0)
                    wordCount += words.length;
            }

            br.close();

            System.out.println("Lines: " + lineCount);
            System.out.println("Words: " + wordCount);
            System.out.println("Characters: " + charCount);

        } catch(Exception e) {
            System.out.println("Error: " + e);
        }
    }
}
