package com.mycompany.groupchat;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class NewMessege {
    public static void Messege(Scanner in, Map<String, Boolean> chkUser,  
        Map<String, Boolean> chkGroup, Map<String, ArrayList<String>> Groups){
        
        String User, Group, Messege; 
        System.out.print("Your User name: ");
        User = in.next();
        
        int cnt = 0; 
        while(chkUser.get(User) == null && (cnt < 10)){
            System.out.print("Enter an existing user name: ");
            User = in.next();
            cnt++; 
        }

        System.out.print("The group to which you'd like to send a message: ");
        Group = in.next(); 
        
        while(chkGroup.get(Group) == null && (cnt < 10)){
            System.out.print("Enter an existing group name: ");
            Group = in.next();
            cnt++; 
        }

        if (chkUser.get(User) == null || chkGroup.get(Group) == null){
            System.out.println("Failed, Try again");
        }
        else {
            in.nextLine(); 
            System.out.print("Your Messege: ");
            Messege = in.nextLine(); 

            ArrayList<String> curGroup = Groups.get(Group); 

            for(String user: curGroup){ 
                if (user == User)
                    continue; 
                System.out.println(user + ", New messege\n" + User + ": " + Messege + '\n');
            }

        }
    }
}
