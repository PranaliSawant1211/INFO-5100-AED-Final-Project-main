/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminmainRole;
import Business.Role.PharmacotherapistRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Pranali
 */
public class PharmacotherapistOrg extends Org {
       public PharmacotherapistOrg() {
        super(Org.Type.Pharmacotherapist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PharmacotherapistRole());
        return roles;
    } 
}
