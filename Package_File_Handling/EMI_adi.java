package Package_File_Handling;

// import java.io.BufferedReader;
// import java.io.File;
// import java.io.FileNotFoundException;
// import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EMI_adi {
    public String id;
    public int Policy_Number;
    public int amount;
    public int pre;
    public int total;

    public void Pay_Emi() {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the candidate ID number:");
            id = sc.nextLine();

            System.out.println("Enter the Policy number:");
            Policy_Number = sc.nextInt();

            System.out.println("Enter the previous amount:");
                pre=sc.nextInt();
                
            System.out.println("Enter the new amount:");
                int nw=sc.nextInt();
                total=pre+nw;
        
        SearchFile obj = new SearchFile();
        int pos = obj.search(id);
        if (pos > -1) {
            System.out.println("candidate already exists............");
            return;
        } else {
            if (Policy_Number == 1) {

                    // Instantiating the Scanner class to read the file
                    // Scanner sc;
                    // try {
                    //     sc = new Scanner(new File("Insurance1.txt"));
                    // } catch (FileNotFoundException e1) {
                    //     
                    //     e1.printStackTrace();
                    // }

                    // instantiating the StringBuffer class
                    StringBuffer buffer = new StringBuffer();

                    // Reading lines of the file and appending them to StringBuffer
                    // Scanner sc=new Scanner(System.in);
                    while (sc.hasNextLine()) {
                        buffer.append(sc.nextLine() + System.lineSeparator());
                    }

                    String fileContents = buffer.toString();
                    System.out.println("Contents of the file: " + fileContents);

                    // closing the Scanner object
                    // sc3.close();

                    String oldLine = String.valueOf(pre);
                    String newLine = String.valueOf(total);

                    // Replacing the old line with new line
                    fileContents = fileContents.replace(oldLine, newLine);

                    try (FileWriter writer = new FileWriter("Insurance1.txt")) {
                        System.out.println("");
                        System.out.println("new data: " + fileContents);
                        writer.append(fileContents);
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }

            if (Policy_Number == 2) {
                // try (Scanner sc1 = new Scanner(System.in)) {
                    // System.out.println("Enter your previous amount you had.....");
                    // int pre = sc.nextInt();
                    // System.out.println("Enter the additional amount you have paid.....");
                    // int am = sc.nextInt();
                    // int total = pre + am;
                // }

                    // instantiating the StringBuffer class
                    StringBuffer buffer = new StringBuffer();

                    // Reading lines of the file and appending them to StringBuffer
                    // Scanner sc=new Scanner(System.in);
                    while (sc.hasNextLine()) {
                        buffer.append(sc.nextLine() + System.lineSeparator());
                    }

                    String fileContents = buffer.toString();
                    System.out.println("Contents of the file: " + fileContents);

                    // closing the Scanner object
                    // sc3.close();

                    String oldLine = String.valueOf(pre);
                    String newLine = String.valueOf(total);

                    // Replacing the old line with new line
                    fileContents = fileContents.replaceAll(oldLine, newLine);

                    try (FileWriter writer = new FileWriter("Insurance2.txt")) {
                        System.out.println("");
                        System.out.println("new data: " + fileContents);
                        writer.append(fileContents);
                        writer.flush();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
