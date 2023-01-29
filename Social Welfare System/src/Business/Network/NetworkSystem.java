/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprises.EnterpriseMainDirectory;

/**
 *
 * @author Makarand
 */
public class NetworkSystem {
     private String name;
    private EnterpriseMainDirectory enterpriseDirectory;
    
    public NetworkSystem(){
        enterpriseDirectory=new EnterpriseMainDirectory();
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseMainDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }
    
    @Override
    public String toString(){
        return name;
    }
    
    
}
