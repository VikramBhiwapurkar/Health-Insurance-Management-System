package Package_File_Handling;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class CreateFile {
    public void create() {
        System.out.println("Enter the name of new Text File:");
        try (Scanner sc = new Scanner(System.in)) {
            String name=sc.nextLine();
            File obj = new File(name);
            try {
                if (obj.createNewFile()) {
                    System.out.println("The file successfully created");
                } else {
                    System.out.println("The file is already created");
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

