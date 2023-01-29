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
import Business.Organization.CSROrganization;
import Business.UserAccount.User_Account;
import javax.swing.JPanel;
import UI.CSRManagerRole.CSRManagerWorkAreajPanel;
/**
 *
 * @author Pranali
 */
public class CSRManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_Account account, Org organization, Enterprise enterprise, Ecosystem business, NetworkSystem network) {
        return new CSRManagerWorkAreajPanel(userProcessContainer, account, (CSROrganization)organization, enterprise, business);
    }
    
}
