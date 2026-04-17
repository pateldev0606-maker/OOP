package set;

import java.io.*;
import java.util.Date;

public class FileOperations {

    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Usage:");
            System.out.println("Copy: java FileOperations copy source.txt dest.txt");
            System.out.println("Delete: java FileOperations delete filename.txt");
            System.out.println("Rename: java FileOperations rename oldname.txt newname.txt");
            return;
        }

        String command = args[0];

        try {
            if (command.equalsIgnoreCase("copy")) {

                if (args.length != 3) {
                    System.out.println("Invalid arguments for copy.");
                    return;
                }

                File source = new File(args[1]);
                File dest = new File(args[2]);

                FileInputStream fis = new FileInputStream(source);
                FileOutputStream fos = new FileOutputStream(dest);

                int data;
                while ((data = fis.read()) != -1) {
                    fos.write(data);
                }

                fis.close();
                fos.close();

                System.out.println("File copied successfully.");
                printProperties(dest);

            } else if (command.equalsIgnoreCase("delete")) {

                File file = new File(args[1]);

                if (file.delete()) {
                    System.out.println("File deleted successfully.");
                } else {
                    System.out.println("File deletion failed.");
                }

            } else if (command.equalsIgnoreCase("rename")) {

                if (args.length != 3) {
                    System.out.println("Invalid arguments for rename.");
                    return;
                }

                File oldFile = new File(args[1]);
                File newFile = new File(args[2]);

                if (oldFile.renameTo(newFile)) {
                    System.out.println("File renamed successfully.");
                    printProperties(newFile);
                } else {
                    System.out.println("Rename failed.");
                }

            } else {
                System.out.println("Invalid command.");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("IO Error: " + e.getMessage());
        }
    }

    public static void printProperties(File file) {

        System.out.println("\n--- File Properties ---");
        System.out.println("File Name: " + file.getName());
        System.out.println("Absolute Path: " + file.getAbsolutePath());
        System.out.println("File Size: " + file.length() + " bytes");
        System.out.println("Readable: " + file.canRead());
        System.out.println("Writable: " + file.canWrite());
        System.out.println("Last Modified: " + new Date(file.lastModified()));
    }
}
