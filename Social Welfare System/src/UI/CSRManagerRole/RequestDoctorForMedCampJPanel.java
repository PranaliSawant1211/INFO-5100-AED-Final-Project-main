/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.CSRManagerRole;

import Business.Enterprises.Enterprise;
import Business.Organization.DoctorConsultantOrg;
import Business.Organization.Org;
import Business.UserAccount.User_Account;
import Business.WorkStream.HosMedCampWorkRequest;
import Business.WorkStream.MedicalCampRequest;
import Business.WorkStream.MedicalCampWorkRequest;
import UI.MedicalCampOrganizerRole.MedicalCampOrganizerWorkAreaJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pranali
 */
public class RequestDoctorForMedCampJPanel extends javax.swing.JPanel {

    /**
     * Creates new form RequestCampsJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private User_Account userAccount;
    private MedicalCampWorkRequest medcampWReq;
    boolean emptyValidationStatus = true;
    public RequestDoctorForMedCampJPanel(JPanel userProcessContainer, User_Account userAccount, Enterprise enterprise, MedicalCampWorkRequest medcampWReq) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.medcampWReq = medcampWReq;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        backJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        messageJTextField = new javax.swing.JTextField();
        requestDoctorJButton = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 241, 228));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_button.png"))); // NOI18N
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        jPanel2.add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, -1, 40));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel3.setText("Request Doctor For Medical Camp");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, 370, 50));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 80));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(193, 212, 227));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Message");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 135, 26));
        jPanel1.add(messageJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 261, -1));

        requestDoctorJButton.setBackground(new java.awt.Color(239, 241, 228));
        requestDoctorJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        requestDoctorJButton.setText(" Request");
        requestDoctorJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        requestDoctorJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestDoctorJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(requestDoctorJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 110, 50));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        jPanel1.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 120, 30));

        valueLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        valueLabel.setText("<value>");
        jPanel1.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 130, 30));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, 460, 250));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/csr_backnew.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 80, 1220, 710));
    }// </editor-fold>//GEN-END:initComponents

    private void requestDoctorJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestDoctorJButtonActionPerformed
        // TODO add your handling code here:
        
        try{
            if(EmpytyFieldValidation()){
                String message = messageJTextField.getText();
        
        if(medcampWReq.getStatus().equals("Pending from CSR")){
            medcampWReq.setStatus("Requested Doctor by CSR");
            medcampWReq.setMessage(message);
            System.out.println("user ac of mcr"+userAccount);
            medcampWReq.setSender(userAccount);

            Org org = null;
            for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()){
                if (organization instanceof DoctorConsultantOrg){
                    org = organization;
                    break;
                }
            }
            if (org!=null){
                org.getWorkStream().getWorkRequestList().add(medcampWReq);
                userAccount.getWorkStream().getWorkRequestList().add(medcampWReq);
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "If not Assigned then Already Completed!");
            return;
        }
        messageJTextField.setText("");
            }
            else{
                JOptionPane.showMessageDialog(this,"Message cannot be empty");
                emptyValidationStatus=true;
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(this,"Message request not submitted, Try again");
            System.out.println(e.toString());
            emptyValidationStatus=true;
        }
        
//        String message = messageJTextField.getText();
//        
//        if(medcampWReq.getStatus().equals("Pending from CSR")){
//            medcampWReq.setStatus("Requested Doctor by CSR");
//            medcampWReq.setMessage(message);
//            System.out.println("user ac of mcr"+userAccount);
//            medcampWReq.setSender(userAccount);
//
//            Org org = null;
//            for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()){
//                if (organization instanceof DoctorConsultantOrg){
//                    org = organization;
//                    break;
//                }
//            }
//            if (org!=null){
//                org.getWorkStream().getWorkRequestList().add(medcampWReq);
//                userAccount.getWorkStream().getWorkRequestList().add(medcampWReq);
//            }
//        }
//        else{
//            JOptionPane.showMessageDialog(null, "If not Assigned then Already Completed!");
//            return;
//        }
//        messageJTextField.setText("");
    }//GEN-LAST:event_requestDoctorJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CSRManagerWorkAreajPanel csrmwp = (CSRManagerWorkAreajPanel) component;
        csrmwp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private boolean EmpytyFieldValidation() {
        if(messageJTextField.getText().equals(null) || messageJTextField.getText().trim().isEmpty() )
        {
            messageJTextField.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            messageJTextField.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!messageJTextField.getText().equals(null) && !messageJTextField.getText().trim().isEmpty() )
        {
            messageJTextField.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        return emptyValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField messageJTextField;
    private javax.swing.JButton requestDoctorJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
