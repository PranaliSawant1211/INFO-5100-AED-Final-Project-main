/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminmainRole;
import Business.Role.PsychiatristRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Aditya
 */
public class PsychiatristOrg extends Org {

    public PsychiatristOrg() {
        super(Org.Type.Psychiatrist.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PsychiatristRole());
        return roles;
    }
}
