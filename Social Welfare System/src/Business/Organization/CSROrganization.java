/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;
import Business.Role.CSRManagerRole;
import Business.Role.Role;


/**
 *
 * @author Pranali
 */
public class CSROrganization extends Org {
      public CSROrganization() {
        super(Org.Type.CSR.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new CSRManagerRole());
        return roles;
    }
    
}
