/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.FundsProviderRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Pranali
 */
public class FundsProviderOrganization extends Org{
    public FundsProviderOrganization() {
        super(Org.Type.FundsProvider.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FundsProviderRole());
        return roles;
    }
}
