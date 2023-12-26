package com.mycompany.groupchat;

import java.util.Map;
import java.util.Scanner;

public class AddGroup {
    public static void Add(Scanner in, Map<String, Integer> mpGroup, Map<String, Boolean> chkGroup){
        System.out.print("Enter the Group name: ");
        String name = in.next(); 
        Integer id = mpGroup.get(name); 

        if (id == null)   
            mpGroup.put(name, 0); 
        else    
            mpGroup.put(name, id + 1); 

        if (mpGroup.get(name) != 0) 
            name += mpGroup.get(name);
        
        chkGroup.put(name, true);
        System.out.println("The Group name is:   " + name);
    }
}
