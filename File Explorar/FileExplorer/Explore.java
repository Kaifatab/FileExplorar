package FileExplorer;

import java.io.*;

public class Explore {
    
    public static void exp(String path){
        File f = new File(path);
        if(f.exists()){
            if(f.isDirectory()){
                File[] lists = f.listFiles();
                if(lists.length == 0){
                    System.out.println("the folder is empty...");
                }
                else{
                    for(File i: lists){
                        if(i.isDirectory()){
                            System.out.println(i.getName());
                            expMore(i);
                        }
                        else{
                            System.out.println(i.getName());
                        }
                    }
                }
            }
            else{
                System.out.println("it's a file named "+ f.getName() + "...");
            }
        }
        else{
            System.out.println("this path is not valid...");
        }
    }

    public static void expMore(File f){
        
        File[] files = f.listFiles();
        for(File i: files){
            if(i.isDirectory()){
                System.out.print("--");
                System.out.println(i.getName());
                expMore(i);
            }
            else{
                System.out.print("----");
                System.out.println(i.getName());
            }
        }
        
    }

}
