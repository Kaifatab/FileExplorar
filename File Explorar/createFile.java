import java.io.*;

public class createFile {
    public static void main(String[] args) {
        
        File f = new File("E:\\File Explorar\\File0.txt");
        
        try {
            if(f.createNewFile())
            {
                System.out.println("File successfully created...");
            }
            else
            {
                System.out.println("File already exists...");
            }
        } catch (IOException e) {
            System.out.println("Exception handled...");
        }
    }
}
