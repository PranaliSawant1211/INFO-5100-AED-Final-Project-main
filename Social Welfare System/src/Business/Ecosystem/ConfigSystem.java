/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ecosystem;

import Business.Human.Person;
import Business.Role.SystemAdminRole;
import Business.UserAccount.User_Account;

/**
 *
 * @author Pranali
 */
public class ConfigSystem {
    public static Ecosystem configure(){
        
        Ecosystem system = Ecosystem.getInstance();
        
        //Create a network, create an enterprise, initialize some organization,some employee,User account
        
        Person person = system.getPersonDirectory().createPerson("RRH");
        User_Account ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", person, new SystemAdminRole(),"");
        
        return system;
    }
 
}
