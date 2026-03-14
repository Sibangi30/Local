package Local;

import java.io.*;
import java.util.Scanner;

public class Filehandling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Roll No: ");
            int rollNo = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Subject: ");
            String subject = sc.nextLine();

            System.out.print("Enter Marks: ");
            int marks = sc.nextInt();
            sc.nextLine(); 
            
            System.out.print("Enter the name of existing file: ");
            String fileName = sc.nextLine();
            FileWriter fw = new FileWriter(fileName, true); 
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            pw.println("Roll No: " + rollNo);
            pw.println("Name: " + name);
            pw.println("Subject: " + subject);
            pw.println("Marks: " + marks);
            pw.close();
            bw.close();
            fw.close();

            System.out.println("\nStudent details written successfully!");
            System.out.println("\nFile Content");
            FileReader fr = new FileReader(fileName);
            BufferedReader br = new BufferedReader(fr);

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();
            fr.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }

        sc.close();
    }
}

