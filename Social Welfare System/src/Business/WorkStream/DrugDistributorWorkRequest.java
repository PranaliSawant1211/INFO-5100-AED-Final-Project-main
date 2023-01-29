/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.WorkStream;

/**
 *
 * @author Pranali
 */
public class DrugDistributorWorkRequest extends WorkRequest {
    
    private boolean isAca;
    private boolean isCam;
    private boolean isDis;
    private boolean isViv;
    private boolean isAnt;
    private int countAcamprosate;
    private int countDisulfiram;
    private int countCampral;
    private int countAntabuse;
    private int countVivitrol;

    public boolean isIsAca() {
        return isAca;
    }

    public void setIsAca(boolean isAca) {
        this.isAca = isAca;
    }

    public boolean isIsCam() {
        return isCam;
    }

    public void setIsCam(boolean isCam) {
        this.isCam = isCam;
    }

    public boolean isIsDis() {
        return isDis;
    }

    public void setIsDis(boolean isDis) {
        this.isDis = isDis;
    }

    public boolean isIsViv() {
        return isViv;
    }

    public void setIsViv(boolean isViv) {
        this.isViv = isViv;
    }

    public boolean isIsAnt() {
        return isAnt;
    }

    public void setIsAnt(boolean isAnt) {
        this.isAnt = isAnt;
    }

    public int getCountAcamprosate() {
        return countAcamprosate;
    }

    public void setCountAcamprosate(int countAcamprosate) {
        this.countAcamprosate = countAcamprosate;
    }

    public int getCountDisulfiram() {
        return countDisulfiram;
    }

    public void setCountDisulfiram(int countDisulfiram) {
        this.countDisulfiram = countDisulfiram;
    }

    public int getCountCampral() {
        return countCampral;
    }

    public void setCountCampral(int countCampral) {
        this.countCampral = countCampral;
    }

    public int getCountAntabuse() {
        return countAntabuse;
    }

    public void setCountAntabuse(int countAntabuse) {
        this.countAntabuse = countAntabuse;
    }

    public int getCountVivitrol() {
        return countVivitrol;
    }

    public void setCountVivitrol(int countVivitrol) {
        this.countVivitrol = countVivitrol;
    }
    
}
