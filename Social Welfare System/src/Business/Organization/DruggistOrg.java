/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminmainRole;
import Business.Role.DruggistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Makarand
 */
public class DruggistOrg extends Org{
       public DruggistOrg() {
        super(Org.Type.Druggist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DruggistRole());
        return roles;
    } 
}
