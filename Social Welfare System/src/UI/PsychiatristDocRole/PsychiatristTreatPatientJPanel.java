/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.PsychiatristDocRole;

import Business.WorkStream.PatientAppRequest;
import Business.WorkStream.WorkRequest;
import java.awt.CardLayout;
import java.text.DateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aditya
 */
public class PsychiatristTreatPatientJPanel extends javax.swing.JPanel {

    HashMap<String, String> frenquency = new HashMap<String, String>();
    JPanel userProcessContainer;
    WorkRequest request;

    /**
     * Creates new form PsychiatristTreatPatientJPanel
     */
    public PsychiatristTreatPatientJPanel(JPanel userProcessContainer, WorkRequest request) {
        initComponents();
        this.request = request;
        this.userProcessContainer = userProcessContainer;
        frenquency.put("Set Daily Councelling Meetings", "1");
        frenquency.put("Set Alternate days Meetings", "2");
        frenquency.put("Set Weekly Meetings", "3");
        frenquency.put("Set Monthly Meetings", "4");
        Set entryset = frenquency.entrySet();
        // Obtaining an iterator for the entry set
        Iterator it = entryset.iterator();
        while (it.hasNext()) {
            Map.Entry hb_me = (Map.Entry) it.next();
            meetComboBox.addItem(hb_me.getKey());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel6 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        meetComboBox = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        fromDate = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        toDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(193, 212, 227));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel8.setText("Set Meeting With Patient");
        jPanel6.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 10, 300, 30));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 1180, 60));

        jPanel1.setBackground(new java.awt.Color(239, 241, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(71, 120, 197));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/PsychiatristDocRole/back_button.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 6, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(239, 241, 228));
        jButton2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton2.setText("Send Decision to Patient");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 182, 36));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel1.setText("Select meeting frequency:");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        jPanel2.add(meetComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 138, -1));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel3.setText("From:");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        fromDate.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(fromDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 138, -1));

        jLabel4.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel4.setText("To:");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));

        toDate.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.add(toDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 138, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 370, 300));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/psychiatrist_logo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 100, 90));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 970));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/psy1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:

        Date from = fromDate.getDate();
        String fromDte = DateFormat.getDateInstance().format(from);
        request.setFromDate(fromDte);

        Date to = toDate.getDate();
        String toDate = DateFormat.getDateInstance().format(to);
        request.setToDate(toDate);

        if ((String) meetComboBox.getSelectedItem() == "Set Daily Councelling Meetings") {

            request.setAppointmentDecision("Set Daily Councelling Meetings");
        }
        if ((String) meetComboBox.getSelectedItem() == "Set Alternate days Meetings") {
            request.setAppointmentDecision("Set Alternate days Meetings");
        }
        if ((String) meetComboBox.getSelectedItem() == "Set Weekly Meetings") {

            request.setAppointmentDecision("Set Weekly Meetings");
        }
        if ((String) meetComboBox.getSelectedItem() == "Set Monthly Meetings") {

            request.setAppointmentDecision("Set Monthly Meetings");
        }
        request.setDiagnose("Meeting Information: " + request.getAppointmentDecision() + " "+ request.getFromDate() + " to " + request.getToDate());
        JOptionPane.showMessageDialog(null, "Decision sent to patient ");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser fromDate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JComboBox meetComboBox;
    private com.toedter.calendar.JDateChooser toDate;
    // End of variables declaration//GEN-END:variables
}