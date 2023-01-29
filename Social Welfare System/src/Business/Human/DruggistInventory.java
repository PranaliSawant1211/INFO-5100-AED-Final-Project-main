/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Human;

/**
 *
 * @author Pranali
 */
public class DruggistInventory {
    
    private int countAcamprosate;
    private int countDisulfiram;
    private int countCampral;
    private int countAntabuse;
    private int countVivitrol;

    public DruggistInventory() {
        this.countAcamprosate = 0;
        this.countAntabuse =0;
        this.countCampral = 0;
        this.countDisulfiram = 0;
        this.countVivitrol = 0;
    }
    
    

    public int getCountAcamprosate() {
        return countAcamprosate;
    }

    public void setCountAcamprosate(int countAcamprosate) {
        this.countAcamprosate += countAcamprosate;
    }

    public int getCountDisulfiram() {
        return countDisulfiram;
    }

    public void setCountDisulfiram(int countDisulfiram) {
        this.countDisulfiram += countDisulfiram;
    }

    public int getCountCampral() {
        return countCampral;
    }

    public void setCountCampral(int countCampral) {
        this.countCampral += countCampral;
    }

    public int getCountAntabuse() {
        return countAntabuse;
    }

    public void setCountAntabuse(int countAntabuse) {
        this.countAntabuse += countAntabuse;
    }

    public int getCountVivitrol() {
        return countVivitrol;
    }

    public void setCountVivitrol(int countVivitrol) {
        this.countVivitrol += countVivitrol;
    }
    
    
    
}
