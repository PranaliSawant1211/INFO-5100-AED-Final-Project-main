/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;


import Business.Human.Person;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Makarand
 */
public class UserAcctDirectory {
    
    private ArrayList<User_Account> userAccountList;

    public UserAcctDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<User_Account> getUserAccountList() {
        return userAccountList;
    }
    
    public User_Account authenticateUser(String username, String password){
        for (User_Account ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public User_Account createUserAccount(String username, String password, Person human, Role role, String email){
        User_Account userAccount = new User_Account();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setEmployee(human);
        userAccount.setRole(role);
        userAccount.setEmail(email);
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (User_Account ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
}
