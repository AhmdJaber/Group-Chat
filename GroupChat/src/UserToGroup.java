package com.mycompany.groupchat;

import java.util.Map;
import java.util.Scanner;
import java.util.ArrayList;

public class UserToGroup {
    public static void Add(Scanner in, Map<String, Boolean> chkUser,  
        Map<String, Boolean> chkGroup, Map<String, ArrayList<String>> Groups){
        
        if (chkUser.isEmpty()){
            System.out.println("There are no Users yet.");
            System.out.println("\n\n\n===============================");
            return; 
        }
        if (chkGroup.isEmpty()){
            System.out.println("There are no Groups yet.");
            System.out.println("\n\n\n===============================");
            return; 
        }

        int cnt = 0; 
        String User, Group; 
        System.out.print("Enter the user name: ");
        User = in.next(); 
        
        System.out.print("Enter the group name: ");
        Group = in.next();

        while(chkUser.get(User) == null && (cnt < 10)){
            System.out.print("Enter an existing user name: ");
            User = in.next();
            cnt++; 
        }
        User.split("");
        
        while(chkGroup.get(Group) == null && (cnt < 10)){
            System.out.print("Enter an existing group name: ");
            Group = in.next();
            cnt++; 
        }
        Group.split("");

        if (chkUser.get(User) == null || chkGroup.get(Group) == null)
            System.out.println("Failed to add, Try again");

        else {
            Groups.computeIfAbsent(Group, k -> new ArrayList<>()).add(User);
            ArrayList<String> curGroup = Groups.get(Group); 

            for(String user: curGroup){
                if (User == user)
                    continue; 
                System.out.println(user + ":\n" + User + " joined to " + Group + '\n');
            }

        }
    }
}
