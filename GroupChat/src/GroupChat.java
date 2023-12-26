package com.mycompany.groupchat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GroupChat {
    
    public static void main(String[] args) { 
        Scanner in = new Scanner(System.in); 
        
        Map<String, Integer> mpUser = new HashMap<>(), mpGroup = new HashMap<>();
        Map<String, Boolean> chkUser = new HashMap<>(), chkGroup = new HashMap<>();
        Map<String, ArrayList<String>> Groups = new HashMap<>(); 
        
        
        while(true){
            System.out.println("Choose an action: ");
            System.out.println("1. Create a new User");
            System.out.println("2. Create a new Group");
            System.out.println("3. Add User to a Group");
            System.out.println("4. write a messege on a Group");
            System.out.println("5. Get Group members");
            
            
            int n = in.nextInt(); 
            if (n == 1){
                AddUser.Add(in, mpUser, chkUser); 
            }
            
            else if (n == 2) {
                AddGroup.Add(in, mpGroup, chkGroup);
            }
            
            else if (n == 3) {
                UserToGroup.Add(in, chkUser, chkGroup, Groups); // Add a user to Group
            } 
            
            else if (n == 4){
                NewMessege.Messege(in, chkUser, chkGroup, Groups); // Messege from some User to some Group
            }
            
            else if (n == 5) {
                DisplayGroup.Display(in, chkGroup, Groups); // Display the members of some group
            }
            
            else {
                System.out.println("Enter a valid action!!");
            }
            
            
            System.out.println("\n\n\n============================");
        }
    }
}
