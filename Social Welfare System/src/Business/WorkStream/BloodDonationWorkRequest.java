/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package Business.WorkStream;

import Business.Human.BloodGroup;

/**
 *
 * @author Pranali
 */
public class BloodDonationWorkRequest extends WorkRequest{
    
    BloodGroup bloodGroup;
    String email;
    String donorComments;

    public String getDonorComments() {
        return donorComments;
    }

    public void setDonorComments(String donorComments) {
        this.donorComments = donorComments;
    }

    public BloodGroup getBloodGroup() {
        return bloodGroup;
    }

    public void setBloodGroup(BloodGroup bloodGroup) {
        this.bloodGroup = bloodGroup;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
