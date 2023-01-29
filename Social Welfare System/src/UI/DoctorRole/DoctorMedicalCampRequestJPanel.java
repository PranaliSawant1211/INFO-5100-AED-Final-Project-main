/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.DoctorRole;

import Business.Enterprises.Enterprise;
import Business.Organization.DoctorConsultantOrg;
import Business.Role.Doctor_Role;
import Business.UserAccount.User_Account;
import Business.WorkStream.MedicalCampRequest;
import Business.WorkStream.MedicalCampWorkRequest;
import Business.WorkStream.WorkRequest;
import java.awt.CardLayout;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pranali
 */
public class DoctorMedicalCampRequestJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private DoctorConsultantOrg organization;
    private Enterprise enterprise;
    private User_Account userAccount;
    private HashMap<Doctor_Role,Integer> doctorsAssigned;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public DoctorMedicalCampRequestJPanel(JPanel userProcessContainer, User_Account account, DoctorConsultantOrg organization, Enterprise enterprise) {
        initComponents();
        doctorsAssigned = new HashMap();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        populateCampTable();
    }
    
    public void populateCampTable(){
        DefaultTableModel model = (DefaultTableModel) campRequestJTable.getModel();
        
        model.setRowCount(0);
        for (WorkRequest request : organization.getWorkStream().getWorkRequestList()){
            if(request instanceof MedicalCampWorkRequest){
                Object[] row = new Object[5];
                row[0] = request;
                row[1] = request.getSender().getEmployee().getName();
                row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
                row[3] = request.getStatus();
                row[4] = ((MedicalCampWorkRequest)request).getCampResult();

                model.addRow(row);
            }
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

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        assignJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        refreshJButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        campRequestJTable = new javax.swing.JTable();
        enterpriseLabel = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 241, 228));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        jLabel1.setText("Medical Camp Request");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 20, 290, 40));

        jButton2.setBackground(new java.awt.Color(193, 212, 227));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_button.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 60, 40));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1170, 70));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(193, 212, 227));

        assignJButton.setBackground(new java.awt.Color(83, 124, 142));
        assignJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        assignJButton.setText("Assign to me");
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });

        processJButton.setBackground(new java.awt.Color(249, 248, 248));
        processJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        processJButton.setText("Process");
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });

        refreshJButton.setBackground(new java.awt.Color(83, 124, 142));
        refreshJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(0, 0, 0));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

        campRequestJTable.setBackground(new java.awt.Color(0, 0, 0));
        campRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
        campRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Sender", "Assigned To", "Status", "Camp result"
            }
        ));
        campRequestJTable.setShowGrid(true);
        jScrollPane2.setViewportView(campRequestJTable);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(assignJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(processJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(refreshJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(assignJButton)
                    .addComponent(processJButton)
                    .addComponent(refreshJButton))
                .addGap(23, 23, 23))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 140, -1, -1));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        enterpriseLabel.setText("Enterprise :");
        jPanel3.add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 127, 30));

        valueLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        valueLabel.setText("<value>");
        jPanel3.add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 90, 140, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/doctor_backnew.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1190, 1020));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = campRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            JOptionPane.showMessageDialog(null, "Select a request to proceed");
            return;
        }

        MedicalCampWorkRequest medcampWReq = (MedicalCampWorkRequest)campRequestJTable.getValueAt(selectedRow, 0);
        if(medcampWReq.getStatus().equals("Assigned") || medcampWReq.getStatus().equals("Completed")){
            JOptionPane.showMessageDialog(null, "Time Conflict doctor is already in Process");
            return;
        }
        medcampWReq.setReceiver(userAccount);
        medcampWReq.setStatus("Pending from Doctor");
        populateCampTable();
    }//GEN-LAST:event_assignJButtonActionPerformed

    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed
        // TODO add your handling code here:
         int selectedRow = campRequestJTable.getSelectedRow();

        if (selectedRow < 0){
            return;
        }

        MedicalCampWorkRequest request = (MedicalCampWorkRequest)campRequestJTable.getValueAt(selectedRow, 0);
        if(!("Pending from Doctor".equals(request.getStatus()))){
            JOptionPane.showMessageDialog(null, "Should be Assigned Before Processing");
            return;
        }
        if(!request.getStatus().equals("Completed")){
            request.setStatus("Processing");
            processMedicalCampRequestJPanel processWorkRequestJPanel = new processMedicalCampRequestJPanel(userProcessContainer, request,userAccount);
            userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else{
            JOptionPane.showMessageDialog(null, "Already Completed");
            return;
        }
    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        // TODO add your handling code here:
        populateCampTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JTable campRequestJTable;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}