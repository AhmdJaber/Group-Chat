package com.mycompany.groupchat;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class DisplayGroup {
    public static void Display(Scanner in, Map<String, Boolean> chkGroup, Map<String, ArrayList<String>> Groups){
        System.out.print("Enter the Group name: ");
        String Group = in.next();
        
        int cnt = 0; 
        while(chkGroup.get(Group) == null && (cnt < 10)){
            System.out.print("Enter an existing group name: ");
            Group = in.next();
            cnt++; 
        }
        Group.split("");
        
        ArrayList<String> curGroup = Groups.get(Group);
        for(String user: curGroup)
            System.out.print(user + " ");

        System.out.println();
        
    }
}
