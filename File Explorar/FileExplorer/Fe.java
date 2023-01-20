package FileExplorer;

import java.io.*;
import java.util.Scanner;

public class Fe {

    public static void main(String[] args) {

        System.out.println("Our available commands are: exp delete rename copy exit");
        System.out.println("What do you want to do?");
        Scanner input = new Scanner(System.in);
        outer:
        while (true) {
            String str = input.nextLine().toLowerCase().trim();
            if(null==str){
                System.out.println("You didn't give any command!...");
            }
            else{
                switch(str){
                    case "delete":
                        System.out.println("Enter path of file/folder you want to delete: ");
                        Delete.delete(input.nextLine().trim());
                        break;

                    case "exp":
                        System.out.println("Enter path of the folder you want to explore: ");
                        Explore.exp(input.nextLine().trim());
                        break;    
                }
            }
        }
    }
}

