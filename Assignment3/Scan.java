
//Daniil Radevich|ID:19426|Introduction to Programming|Wroclaw Business Academy
// Assignment 3
import java.io.*;
import java.util.Scanner;

public class Scan {
    private String fileName, outputFileName;
    private Scanner file;
    private Scanner scan = new Scanner(System.in);

    public void InputFileName() throws IOException {// asking for a input file name
        try {
            System.out.println("Enter the input file name");
            String name = scan.nextLine();
            if (new File(name).exists())
                this.fileName = name;
            else {
                System.out.println("This input file does not exist, try one more time");
                InputFileName();
            }
        } catch (IOException e) { // Exception if the out file and the entered name do not match
            System.out.println("Can't the find the file with this name, try one more time");
            InputFileName();
        }
    }

    public void OutputFileName() throws IOException {// asking for a output file name
        try {
            System.out.println("Enter the output file name");
            String name = scan.nextLine();
            if (new File(name).exists())
                this.outputFileName = name;
            else {
                System.out.println("This output file does not exist, try one more time");
                OutputFileName();
            }
        } catch (IOException e) { // Exception if the out file and the entered name do not match
            System.out.println("Can't the find the file with this name, try one more time");
            OutputFileName();
        }
    }

    public void ReadFileScan() throws FileNotFoundException {// reading the file
        try {
            this.file = new Scanner(new File(fileName));
        } catch (FileNotFoundException e) {
            System.out.println("Can't find the file with the name \"" + fileName + "\"");// Exception if the input file
                                                                                         // does not exist
        }
    }

    public void OutputFilePrint() throws IOException, NumberFormatException {// computing and outputting the file
        try (PrintWriter outFile = new PrintWriter(outputFileName)) {
            double gpa;
            while (this.file.hasNextLine()) {
                String student[] = this.file.nextLine().split(" ");
                int hours = Integer.parseInt(student[1]);
                double points = Double.parseDouble(student[2]);
                gpa = points / hours;
                String out = student[0] + " " + student[1] + " " + gpa;
                if (hours <= 30) {
                    if (gpa < 1.5) {
                        outFile.println(out);
                        continue;
                    }
                } else if (hours <= 60) {
                    if (gpa < 1.7) {
                        outFile.println(out);
                        continue;
                    }
                } else if (gpa < 2) {
                    outFile.println(out);
                }
            }
        } catch (IOException e) {
            System.out.println("Output file does not exist");// Exception if the output file does not exist
        } catch (NumberFormatException e) {
            System.out.println("The format is wrong");// Exception if the data types have some kind of mistakes
        }
    }

}
