/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem.Ecosystem;
import Business.Enterprises.Enterprise;
import Business.Network.NetworkSystem;
import Business.Organization.Org;
import Business.UserAccount.User_Account;
import javax.swing.JPanel;

/**
 *
 * @author Pranali
 */
public abstract class Role {

    public enum RoleType {
        Admin("Admin"),
        Doctor("Doctor"), 
        Patient("Patient"),
        LabAssistant("LabAssistant"), 
        Druggist("Druggist"),
        Physiotherapist("Physiotherapist"),
        Psychiatrist("Psychiatrist"),
        Distributor("Distributor"),
        SysAdminRole("SysAdmin");

        private String value;

        private RoleType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public abstract JPanel createWorkArea(JPanel userProcessContainer,
            User_Account account,
            Org organization,
            Enterprise enterprise,
            Ecosystem business,
            NetworkSystem network);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}
