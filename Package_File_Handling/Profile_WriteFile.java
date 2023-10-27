package Package_File_Handling;

import java.util.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileWriter;
public class Profile_WriteFile{
    //Declaring Public Variables
    public String Candidate_Name;
    public String Candidate_Age;
    public String Candidate_Aadhar;
    public String Candidate_Gender;
    public String Applied_Date;
    public String Candidate_Mobile;
    public int Policy_Number;
    public int rupees_paid;
    public void write(){
        try {
                try (Scanner wr = new Scanner(System.in)) {
                    System.out.println("Enter the name of the Candidate");
                    Candidate_Name=wr.nextLine();

                    System.out.println("Enter the Aadhar number of the Candidate");
                    Candidate_Aadhar=wr.nextLine();

                    System.out.println("Enter the age of the Candidate");
                    Candidate_Age=wr.nextLine();

                    System.out.println("Enter the gender of the Candidate");
                    Candidate_Gender=wr.nextLine();

                    System.out.println("Enter the date:");
                    Applied_Date=wr.nextLine();
                    
                    System.out.println("Enter the Mobile number of the Candidate");
                    Candidate_Mobile=wr.nextLine();

                    System.out.println("Enter Policy number:");
                    Policy_Number=wr.nextInt();

                    System.out.println("Enter the amount paid:");
                    rupees_paid=wr.nextInt();
                }

            //Candidate exist or not
            SearchFile inner=new SearchFile();
            int number=inner.search(Candidate_Name);
            if(number>-1){
                System.out.println("The Candidate has already applied for Health Insurance Policy");
                return;
            }

            //For Internal ID updation
            int ID_suffix=(inner.line("Candidate_Profile.txt"))-1;


            FileWriter obj=new FileWriter("Candidate_Profile.txt",true);
            PrintWriter pw=new PrintWriter(obj);
            pw.println();
            pw.print(Policy_Number+"INS"+ID_suffix+",");
            pw.print("               "+Candidate_Name);
            pw.print("               "+Candidate_Aadhar);
            pw.print("          "+Candidate_Age+"/"+Candidate_Gender);
            pw.print("        "+Candidate_Mobile);
            pw.close();


            if(Policy_Number==1){
            FileWriter obj2=new FileWriter("Insurance1.txt",true);
                PrintWriter pw3=new PrintWriter(obj2);
                pw3.println();
                pw3.print(Policy_Number+"INS"+ID_suffix+",");
                pw3.print("               "+Applied_Date);
                pw3.print("               "+rupees_paid);
                pw3.close();
            }

            if(Policy_Number==2){
                FileWriter obj3=new FileWriter("Insurance2.txt",true);
                PrintWriter pw3=new PrintWriter(obj3);
                pw3.println();
                pw3.print(Policy_Number+"INS"+ID_suffix+",");
                pw3.print("               "+Applied_Date);
                pw3.print("               "+rupees_paid);
                pw3.close();
            }
            System.out.println("The profife of student is updated successfully. ");


        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        
    }
}

