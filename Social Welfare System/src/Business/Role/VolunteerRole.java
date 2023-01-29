/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem.Ecosystem;
import Business.Enterprises.Enterprise;
import Business.Network.NetworkSystem;
import Business.Organization.Org;
import Business.Organization.VolunteerOrganization;
import Business.UserAccount.User_Account;
import javax.swing.JPanel;
import UI.VolunteerRole.VolunteerWorkAreaJPanel;

/**
 *
 * @author Pranali
 */
public class VolunteerRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_Account account, Org organization, Enterprise enterprise, Ecosystem business, NetworkSystem network) {
        return new VolunteerWorkAreaJPanel(userProcessContainer, account, (VolunteerOrganization)organization, enterprise, business);
    }
}
