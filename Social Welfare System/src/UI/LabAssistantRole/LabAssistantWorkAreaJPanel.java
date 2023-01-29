/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LabAssistantRole;

import Business.Ecosystem.Ecosystem;
import Business.Enterprises.Enterprise;
import Business.Network.NetworkSystem;
import Business.Organization.LaboratoryOrg;
import Business.Organization.Org;
import Business.UserAccount.User_Account;
import Business.WorkStream.DocLabRequest;
import Business.WorkStream.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aditya
 */
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    private JPanel userProcessContainer;
    private Ecosystem business;
    private User_Account userAccount;
    private Enterprise enterprise;
    private LaboratoryOrg labOrganization;

    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, User_Account account,
            Org organization, Enterprise enterprise, NetworkSystem network) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;

        this.labOrganization = (LaboratoryOrg)organization;
       this.enterprise = enterprise;

        lblname.setText(userAccount.getEmployee().getName());
        populateLabRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        refreshJButton = new javax.swing.JButton();
        processJButton = new javax.swing.JButton();
        assignJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        labWorkRequestJTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(239, 241, 228));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        refreshJButton.setBackground(new java.awt.Color(239, 241, 228));
        refreshJButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        refreshJButton.setText("Refresh");
        refreshJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        refreshJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(refreshJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 153, 44));

        processJButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        processJButton.setText("Process Medical History");
        processJButton.setBorder(null);
        processJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                processJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(processJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 350, 153, 43));

        assignJButton.setBackground(new java.awt.Color(239, 241, 228));
        assignJButton.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        assignJButton.setText("Assign to self");
        assignJButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        assignJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignJButtonActionPerformed(evt);
            }
        });
        jPanel3.add(assignJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 450, 153, 42));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/lab_logo.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 110, 90, 80));

        add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 800));

        jPanel6.setBackground(new java.awt.Color(193, 212, 227));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel6.setText("Lab Requests Received");
        jPanel6.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, -1, 30));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 0, 1290, 60));

        jPanel1.setBackground(new java.awt.Color(239, 241, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        labWorkRequestJTable.setBackground(new java.awt.Color(0, 0, 0));
        labWorkRequestJTable.setForeground(new java.awt.Color(255, 255, 255));
        labWorkRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Request Intended By", "Request Received By", "Status", "Date"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        labWorkRequestJTable.setShowGrid(true);
        jScrollPane2.setViewportView(labWorkRequestJTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 80, 670, 210));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Lab Assitant Name :");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        lblname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 175, 20));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 170, 760, 370));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/labb1.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void assignJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignJButtonActionPerformed

        int selectedRow = labWorkRequestJTable.getSelectedRow();
        String status;
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a lab request first", "Warning", JOptionPane.WARNING_MESSAGE);

            return;
        }
        status = (String) labWorkRequestJTable.getValueAt(selectedRow, 3);

        if (status.equals("Med Hist Collected For Lab")) {
            WorkRequest request = (WorkRequest) labWorkRequestJTable.getValueAt(selectedRow, 0);
            request.setReceiver(userAccount);
            request.setStatus("Assigned To Lab");
            populateLabRequestTable();
        } else if (status.equals("Assigned To Lab")) {
            JOptionPane.showMessageDialog(null, "Already In Progress", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        } else {
            JOptionPane.showMessageDialog(null, "Your Request Cant be processed", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_assignJButtonActionPerformed
    public void populateLabRequestTable() {
        DefaultTableModel model = (DefaultTableModel) labWorkRequestJTable.getModel();

        model.setRowCount(0);

        for (WorkRequest request : labOrganization.getWorkStream().getWorkRequestList()) {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getSender().getEmployee().getName();
            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
            row[3] = request.getStatus();
            row[4] = request.getRequestDate();

            model.addRow(row);
        }
    }
    private void processJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_processJButtonActionPerformed

        int selectedRow = labWorkRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a lab request first");
            return;
        }


        DocLabRequest request = (DocLabRequest) labWorkRequestJTable.getValueAt(selectedRow, 0);


        request.setStatus("Processing Req");

        CollectedMedicalHistoryJPanel processWorkRequestJPanel = new CollectedMedicalHistoryJPanel(userProcessContainer,
                request, userAccount, enterprise);
        userProcessContainer.add("processWorkRequestJPanel", processWorkRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_processJButtonActionPerformed

    private void refreshJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshJButtonActionPerformed
        populateLabRequestTable();
    }//GEN-LAST:event_refreshJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton assignJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable labWorkRequestJTable;
    private javax.swing.JLabel lblname;
    private javax.swing.JButton processJButton;
    private javax.swing.JButton refreshJButton;
    // End of variables declaration//GEN-END:variables
}