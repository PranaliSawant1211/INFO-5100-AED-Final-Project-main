/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.BloodDonorRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Pranali
 */
public class BloodDonorOrganization extends Org{

    public BloodDonorOrganization() {
        super(Org.Type.BloodDonor.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodDonorRole());
        return roles;
    }
    
}
