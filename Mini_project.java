import java.util.Scanner;

import Package_File_Handling.*;

class Mini_project {
    public static int choice;
    public static void main(String[] args) {
        CreateFile obj1 = new CreateFile();
        Profile_WriteFile obj2 = new Profile_WriteFile();
        // Claim_Insurance obj3=new Claim_Insurance();
        // EMI obj3=new EMI();
        // Test obj4=new Test();
        System.out.println("####################Welcome to IIITN Health Insurance ####################");
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Enter the choice:-1.NewFile 2.NewCandidate_Account 3.Claim Insurance");
            choice = sc.nextInt();
            switch (choice) {
                case 1: {
                    obj1.create();
                    break;
                }
                case 2: {
                    obj2.write();
                    break;
                }
                case 3:{
                  System.out.println("Run the Claim_Insurance.java File");
                  break;
                }
            }
        }
    }
}