/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkStream;

/**
 *
 * @author Pranali
 */
public class PatientAppRequest extends WorkRequest {

    private String doctormessage;
    private String appointmentdate;     
    private FinalResult pharmaresult;


    public String getdoctormessage() {
        return doctormessage;
    }

    public void setdoctormessage(String doctormessage) {
        this.doctormessage = doctormessage;
    }
   

    public String getAppointmentdate() {
        return appointmentdate;
    }

    public void setAppointmentdate(String appointmentdate) {
        this.appointmentdate = appointmentdate;
    }

}
