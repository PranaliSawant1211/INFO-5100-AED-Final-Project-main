/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package Business.Human;

/**
 *
 * @author Pranali
 */
 public enum BloodGroup{
     A("A"),
     B("B"),
     AB("AB"),
     O("O");
     public String value;

    private BloodGroup(String value) {
        this.value = value;
    }
     
 }
