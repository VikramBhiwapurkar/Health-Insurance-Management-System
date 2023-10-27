package Package_File_Handling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class SearchFile {
    public int pos;
    public int linecount;
    //Name exist or not
    public int search(String para1){
        try (Scanner sc = new Scanner(System.in)) {
            try {
                String line="";
                BufferedReader bReader = new BufferedReader(new FileReader("Candidate_Profile.txt"));
                try {
                    while((line=bReader.readLine())!=null){
                        pos=line.indexOf(para1);
                    }
                    bReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return pos;
    }

    public int line(String TextFile){
        try (Scanner sc = new Scanner(System.in)) {
            try {
                BufferedReader bReader = new BufferedReader(new FileReader(TextFile));
                try {
                    String line="";
                    while((line=bReader.readLine())!=null){
                        linecount++;
                    }
                    bReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        return linecount;
    }
}
