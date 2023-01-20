package FileExplorer;

import java.io.*;

public class Delete {
    
    public static void delete(String path){
        File file = new File(path);
        if(file.exists()){
            if(file.isFile()){
                file.delete();
                System.out.println("file deleted...");
            }
            else{
                deleteFolder(file);
                System.out.println("folder deleted...");
            }
        }
        else{
            System.out.println("this file doesn't exist...");
        }
    }
    
    public static void deleteFolder(File f){
        File[] files = f.listFiles();
        if(files != null){
            for(File i: files){
                deleteFolder(i);
            }
        }
        f.delete();
    }

}
