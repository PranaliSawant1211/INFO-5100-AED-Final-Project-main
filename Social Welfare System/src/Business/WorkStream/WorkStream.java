/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkStream;

import java.util.ArrayList;

/**
 *
 * @author Pranali
 */
public class WorkStream {
    
    private ArrayList<WorkRequest> workRequestList;
    private ArrayList<PatientAppRequest> patientAppointmentRequest;
    private ArrayList<DocLabRequest> doctorLabRequest;

    
    public WorkStream() {
        workRequestList = new ArrayList();
        patientAppointmentRequest= new ArrayList();
        doctorLabRequest= new ArrayList();

    }
    
     public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
     
    // For patientAppointmentRequest

    public ArrayList<PatientAppRequest> getPatientAppointmentRequest() {
        return patientAppointmentRequest;
    }

    public void setPatientAppointmentRequest(ArrayList<PatientAppRequest> patientAppointmentRequest) {
        this.patientAppointmentRequest = patientAppointmentRequest;
    }

    
    public ArrayList<DocLabRequest> getDoctorLabRequest() {
        return doctorLabRequest;
    }

    public void setDoctorLabRequest(ArrayList<DocLabRequest> doctorLabRequest) {
        this.doctorLabRequest = doctorLabRequest;
    }
    }