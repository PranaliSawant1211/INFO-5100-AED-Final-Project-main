/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Organization;

import Business.Role.BloodReceiverRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Pranali
 */
public class BloodReceiverOrganization extends Org{
    
    public BloodReceiverOrganization() {
        super(Org.Type.BloodReceiver.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodReceiverRole());
        return roles;
    }
}
