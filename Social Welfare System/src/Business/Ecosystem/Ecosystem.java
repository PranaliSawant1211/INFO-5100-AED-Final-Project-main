/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Ecosystem;

import Business.Network.NetworkSystem;
import Business.Organization.Org;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import java.util.ArrayList;

/**
 *
 * @author Pranali
 */
public class Ecosystem extends Org {
     private static Ecosystem business;
    private ArrayList<NetworkSystem> networkList;
    public static Ecosystem getInstance(){
        if(business==null){
            business=new Ecosystem();
        }
        return business;
    }
  
    public NetworkSystem createAndAddNetwork(){
        NetworkSystem network=new NetworkSystem();
        networkList.add(network);
        return network;
    }
    
    public void deleteNetwork(NetworkSystem network)
    {
        networkList.remove(network);
    }
   
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private Ecosystem(){
        super(null);
        networkList=new ArrayList<NetworkSystem>();
    }

    public ArrayList<NetworkSystem> getNetworkList() {
        return networkList;
    }

    public void setNetworkList(ArrayList<NetworkSystem> networkList) {
        this.networkList = networkList;
    }
    
    public boolean checkIfUserIsUnique(String userName){
        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
           return false;
        }
        for(NetworkSystem network:networkList){
            
        }
        return true;
    }
}
