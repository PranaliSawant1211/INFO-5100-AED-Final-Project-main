/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Business.Role;

import Business.Ecosystem.Ecosystem;
import Business.Enterprises.Enterprise;
import Business.Network.NetworkSystem;
import Business.Organization.Org;
import Business.UserAccount.User_Account;
import UI.BloodDonorRole.BloodDonorWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Pranali
 */
public class BloodDonorRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, User_Account account, Org organization, Enterprise enterprise, Ecosystem business, NetworkSystem network) {
        return new BloodDonorWorkAreaJPanel(userProcessContainer, account, organization, business);
    }

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
