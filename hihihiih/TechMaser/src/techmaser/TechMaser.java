/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package techmaser;

import Model.User;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class TechMaser {
   public static List<User> users;
    public static User user;

    static {
        users = new ArrayList<>();
        users.add(new User("tien", "123", "tien@gmail.com","sv"));
        users.add(new User("hihi", "123", "hihi@gmail.com","sv"));
        users.add(new User("linh", "123", "linh@gmail.com","sv"));
        users.add(new User("hung", "123", "hung@gmail.com","sv"));

        
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
