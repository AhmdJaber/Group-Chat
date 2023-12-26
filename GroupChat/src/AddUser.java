package com.mycompany.groupchat;

import java.util.Map;
import java.util.Scanner;

public class AddUser {
    public static void Add(Scanner in, Map<String, Integer> mpUser, Map<String, Boolean> chkUser){
        System.out.print("Enter The User name: ");
        String name = in.next(); 
        Integer id = mpUser.get(name); 

        if (id == null) // First occurrence of some username   
            mpUser.put(name, 0); 
        
        else 
            mpUser.put(name, id + 1);
        
        // after the first occurrence, Id will be concatenated with the name
        if (mpUser.get(name) != 0) 
            name += mpUser.get(name); 
        
        chkUser.put(name, true); 
        System.out.println("The User name is:   " + name);
    }
}
