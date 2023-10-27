
import java.io.File;
// import java.util.Scanner;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;

// C:\\Users\\nimes\\Desktop\\Delete_Perticular.txt

public class Claim_Insurance {

    static void removeRecord(String filepath, String removeTerm, int PositionOfTerm, String delimiter) {
        int position = PositionOfTerm - 1;
        String tempFile = "temp.txt";
        File oldFile = new File(filepath);
        File newFile = new File(tempFile);
        String currentLine = "";
        String data[];

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);
            while ((currentLine = br.readLine()) != null) {
                data = currentLine.split(",");
                if ((data[position].equalsIgnoreCase(removeTerm))) {

                    continue;
                }
                pw.println(currentLine);

            }
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();
            oldFile.delete();
            File dump = new File(filepath);
            newFile.renameTo(dump);

        } catch (Exception e) {
            System.out.println(e + " exception occured");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String filepath = "Candidate_Profile.txt";
        System.out.print("Enter the Insurance ID of user who want to claim the Insurance: ");
        String id = sc.nextLine();
        removeRecord(filepath, id, 1, ",");
        // System.out.println("Records are updated successfully...");
        // sc.close();

        System.out.println("Enter the policy number:");
        int number=sc.nextInt();

        if(number==1){
            // deleting from Insurance 1.txt
            String filepath1 = "Insurance1.txt";
            // System.out.print("Enter the Insurance ID of user who want to claim the Insurance: ");
            // String id = sc.nextLine();
            removeRecord(filepath1, id, 1, ",");
            // System.out.println("Records are updated successfully...");
            // sc.close();
        }
        else if(number==2){
            //deleting from Insurance 2.txt
            String filepath2 = "Insurance2.txt";
        // System.out.print("Enter the Insurance ID of user who want to claim the Insurance: ");
        // String id = sc.nextLine();
        removeRecord(filepath2, id, 1, ",");
        // System.out.println("Records are updated successfully...");
        // sc.close();
        }
        sc.close();
        System.out.println("Records are updated successfully...");
    }

}
