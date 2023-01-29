/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprises;

import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Pranali
 */
public class DrugStoresEnterprises extends Enterprise {

    public DrugStoresEnterprises(String name) {
        super(name, Enterprise.EnterpriseType.DrugStores);
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
