/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.AdminmainRole;
import Business.Role.Role;
import Business.Role.DistributorRole;
import java.util.ArrayList;

/**
 *
 * @author Pranali
 */
public class DistributorOrg extends Org {

    public DistributorOrg() {
        super(Type.Distributor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DistributorRole());
        return roles;
    }
}
