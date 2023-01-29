/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;


import Business.Human.DruggistInventory;
import Business.Human.Person;
import Business.Role.Role;
import Business.WorkStream.WorkStream;

/**
 *
 * @author Makarand
 */
public class User_Account {
    
    private String username;
    private String password;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Person getHuman() {
        return Human;
    }

    public void setHuman(Person Human) {
        this.Human = Human;
    }
    private Person Human;
    private Role role;
    private WorkStream workStream;
    private DruggistInventory druggistInventory;

    public User_Account() {
        workStream = new WorkStream();
        druggistInventory = new DruggistInventory();
        
    }
    
    
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setEmployee(Person employee) {
        this.Human = employee;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Person getEmployee() {
        return Human;
    }

    public WorkStream getWorkStream() {
        return workStream;
    }

    public DruggistInventory getDruggistInventory() {
        return druggistInventory;
    }

    public void setDruggistInventory(DruggistInventory druggistInventory) {
        this.druggistInventory = druggistInventory;
    }
    
    

    
    
    @Override
    public String toString() {
        return username;
    }
    
    
    
}