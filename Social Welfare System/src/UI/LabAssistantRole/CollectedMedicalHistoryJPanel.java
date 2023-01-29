/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI.LabAssistantRole;

import Business.Enterprises.Enterprise;
import Business.Network.NetworkSystem;
import Business.Organization.Org;
import Business.UserAccount.User_Account;
import Business.WorkStream.DocLabRequest;
import Business.WorkStream.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Aditya
 */
public class CollectedMedicalHistoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CollectedMedicalHistoryJPanel
     */
    JPanel userProcessContainer;

    DocLabRequest request;
    User_Account useraccount;
    Enterprise enterprise;
    String result = "";
    String solution = "";
    String type = "";
    boolean emptyValidationStatus = true;
    // private EcoSystem system;
    // private DB4OUtil dB4OUtil = DB4OUtil.getInstance();

    public CollectedMedicalHistoryJPanel(JPanel userProcessContainer, DocLabRequest request,
            User_Account useraccount, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.useraccount = useraccount;
        // system = dB4OUtil.retrieveSystem();
        this.enterprise = enterprise;
        populateMedicalHistory();

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
        jLabel9 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMedicalHist = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtHealthRisk = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMedConsum = new javax.swing.JTextArea();
        jLabel14 = new javax.swing.JLabel();
        resBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(239, 241, 228));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("          Patient's Medical History & Symptoms");
        jPanel6.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 497, 37));

        backBtn.setBackground(new java.awt.Color(71, 120, 197));
        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/UI/LabAssistantRole/back_button.png"))); // NOI18N
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });
        jPanel6.add(backBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 6, -1, -1));

        add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1640, -1));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(193, 212, 227));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(239, 241, 228));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel2.setText("Age");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, -1, 20));

        txtName.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        txtName.setEnabled(false);
        jPanel2.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 50, 152, -1));

        txtGender.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        txtGender.setEnabled(false);
        jPanel2.add(txtGender, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 90, 152, -1));

        txtAge.setFont(new java.awt.Font("Century Gothic", 0, 10)); // NOI18N
        txtAge.setEnabled(false);
        jPanel2.add(txtAge, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 152, -1));

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("General Information");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 230, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel1.setText("Name");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, -1, -1));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 10)); // NOI18N
        jLabel13.setText("Gender");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 90, -1, -1));

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 420, 200));

        jPanel1.setBackground(new java.awt.Color(239, 241, 228));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtMedicalHist.setColumns(20);
        txtMedicalHist.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtMedicalHist.setRows(5);
        jScrollPane1.setViewportView(txtMedicalHist);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 330, 90));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Medical History");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 155, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setText("Current Health Risk Found");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 193, 31));

        txtHealthRisk.setColumns(20);
        txtHealthRisk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtHealthRisk.setRows(5);
        jScrollPane2.setViewportView(txtHealthRisk);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 340, -1));

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, 390, 290));

        jPanel4.setBackground(new java.awt.Color(239, 241, 228));
        jPanel4.setPreferredSize(new java.awt.Dimension(360, 266));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtResult.setColumns(20);
        txtResult.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtResult.setRows(5);
        jScrollPane4.setViewportView(txtResult);

        jPanel4.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 330, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setText("Lab Assessment Result");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 202, -1));

        txtMedConsum.setColumns(20);
        txtMedConsum.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtMedConsum.setRows(5);
        jScrollPane3.setViewportView(txtMedConsum);

        jPanel4.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 340, 90));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel14.setText("Medical Dose Consumption Details ");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 277, 31));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, 400, 300));

        resBtn.setBackground(new java.awt.Color(0, 0, 0));
        resBtn.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        resBtn.setForeground(new java.awt.Color(255, 255, 255));
        resBtn.setText("Process & Send Result");
        resBtn.setBorder(null);
        resBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resBtnActionPerformed(evt);
            }
        });
        jPanel3.add(resBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 560, 198, 44));

        jPanel5.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 980, 630));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/labb1.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1640, 1030));
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        LabAssistantWorkAreaJPanel lab_wrk_area = (LabAssistantWorkAreaJPanel) component;
        lab_wrk_area.populateLabRequestTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backBtnActionPerformed

    private void resBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resBtnActionPerformed
        // TODO add your handling code here:
        
//        try{
//            if(EmpytyFieldValidation()){
//
//                if (request.isDrug_history() || request.isAlcohol_history()
//                || request.isHr_risk() || request.isTemp_risk()
//                || (request.isOxycodone_taken() && request.isOxycodone_risk())
//                || (request.isFantanyl_taken() && request.isFantanyl_risk())
//                || (request.isBupre_taken() && request.isBupre_risk())
//                || (request.isMethadone_taken() && request.isMethadone_risk())
//                || (request.isOxymorphone_taken() && request.isOxymorphone_risk())
//                || (request.isInjection_checked()) || (request.isIntoxication_checked())
//                || request.isWithdrawal_checked() || request.isDisease_checked()) {
//            type = "Overdose [Pharmacotherapist]";
//            result = result + "This is an Opioid Overdose case.";
//            solution = "Patient is recommended for Pharmacotherapist.";
//            request.setStatus("Lab req done");
//
//        } // Send to Psychiatrist when the below criteria is true 
//        else if (request.isDepression_history() || request.isAnxiety_history()
//                || request.isDisrupt_history() || request.isBp_risk() || request.isResp_risk()) {
//            type = "Overdose [Psychiatrist]";
//            result = result + "This is an Opioid Overdose case.";
//            solution = "Patient is recommended for Psychiatrist.";
//            request.setStatus("Lab req done");
//
//        } // If not any above criteria then patient can be treated medically 
//        else {
//            type = "Not Overdose [Medical Treatment]";
//            result = result + "This is not an Opioid Overdose case." + "\n"
//                    + "Patient is recommended for medical treatment .";
//            solution = "Patient is recommended for medical treatm.";
//            request.setStatus("Lab req done");
//
//        }
//
//        txtResult.setText(result);
//        /*-----------------------*/
//        int b = request.getHashcode();
//        System.out.println("b" + b);
//        
//        Enterprise inEnterprise = null;
//        Org inOrganization = null;
//        NetworkSystem inNetwork = null;
//        for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
//            if (organization.getName().equals("Doctor Organization")) {
//                for (WorkRequest work : organization.getWorkStream().getWorkRequestList()) {
//                    //                      System.out.println(work.getHashcode());
//                    if (work.getHashcode() == b) {
//                        work.setStatus("Lab req done");
//                        work.setLabresult(result);
//                        work.setResulttype(type);
//                        work.setSolution(solution);
//                    }
//
//                }
//            }
//        }
//
//        JOptionPane.showMessageDialog(null, "Results Sent Successfully");
//            }
//            else{
//                JOptionPane.showMessageDialog(this,"Lab Assessment result cannot be empty");
//                emptyValidationStatus=true;
//            }
//        }
//        catch(Exception e){
//            JOptionPane.showMessageDialog(this,"Try again");
//            System.out.println(e.toString());
//            emptyValidationStatus=true;
//        }
        
        if (request.isDrug_history() || request.isAlcohol_history()
                || request.isHr_risk() || request.isTemp_risk()
                || (request.isOxycodone_taken() && request.isOxycodone_risk())
                || (request.isFantanyl_taken() && request.isFantanyl_risk())
                || (request.isBupre_taken() && request.isBupre_risk())
                || (request.isMethadone_taken() && request.isMethadone_risk())
                || (request.isOxymorphone_taken() && request.isOxymorphone_risk())
                || (request.isInjection_checked()) || (request.isIntoxication_checked())
                || request.isWithdrawal_checked() || request.isDisease_checked()) {
            type = "Overdose [Pharmacotherapist]";
            result = result + "This is an Opioid Overdose case.";
            solution = "Patient is recommended for Pharmacotherapist.";
            request.setStatus("Lab req done");

        } // Send to Psychiatrist when the below criteria is true 
        else if (request.isDepression_history() || request.isAnxiety_history()
                || request.isDisrupt_history() || request.isBp_risk() || request.isResp_risk()) {
            type = "Overdose [Psychiatrist]";
            result = result + "This is an Opioid Overdose case.";
            solution = "Patient is recommended for Psychiatrist.";
            request.setStatus("Lab req done");

        } // If not any above criteria then patient can be treated medically 
        else {
            type = "Not Overdose [Medical Treatment]";
            result = result + "This is not an Opioid Overdose case." + "\n"
                    + "Patient is recommended for medical treatment .";
            solution = "Patient is recommended for medical treatm.";
            request.setStatus("Lab req done");

        }

        txtResult.setText(result);
        /*-----------------------*/
        int b = request.getHashcode();
        System.out.println("b" + b);
        
        Enterprise inEnterprise = null;
        Org inOrganization = null;
        NetworkSystem inNetwork = null;
        for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
            if (organization.getName().equals("Doctor Organization")) {
                for (WorkRequest work : organization.getWorkStream().getWorkRequestList()) {
                    //                      System.out.println(work.getHashcode());
                    if (work.getHashcode() == b) {
                        work.setStatus("Lab req done");
                        work.setLabresult(result);
                        work.setResulttype(type);
                        work.setSolution(solution);
                    }

                }
            }
        }

        JOptionPane.showMessageDialog(null, "Result Sent Successfully");
    }//GEN-LAST:event_resBtnActionPerformed
    public void populateMedicalHistory() {

        txtName.setText(request.getName());
        txtGender.setText(request.getGender());
        txtAge.setText(Integer.toString(request.getAge()));
        String med_hist = "";
        String health_risk = "";
        String consum_risk = "";
        if (request.isDrug_history()) {
            med_hist = "Drug History Found" + "\n";

        }

        if (request.isAlcohol_history()) {
            med_hist = med_hist + "Alcohol History Found" + "\n";

        }

        if (request.isDepression_history()) {
            med_hist = med_hist + "Depression History Found" + "\n";
        }

        if (request.isAnxiety_history()) {
            med_hist = med_hist + "Anxiety History Found" + "\n";
        }
        if (request.isDisrupt_history()) {
            med_hist = med_hist + "Bad Social Relationships History Found" + "\n";
        }
        if (med_hist.length() > 0) {
            result = result + med_hist;
            txtMedicalHist.setText(med_hist);
        } else {
            txtMedicalHist.setText("No Severe Medical History Found");
        }

        if (request.isHr_risk()) {
            health_risk = "Heart Risk Found" + "\n";
        }

        if (request.isBp_risk()) {
            health_risk = "High Blood Pressure Diagnosed" + "\n";
        }

        if (request.isTemp_risk()) {
            health_risk = health_risk + "Fever Diagnosed" + "\n";
        }

        if (request.isResp_risk()) {
            health_risk = health_risk + "High Respiratory Rate Diagnosed" + "\n";
        }
        if (health_risk.length() > 0) {
            txtHealthRisk.setText(health_risk);
        } else {
            txtHealthRisk.setText("No Sever Health Risk Detected");
        }

        // Calculating consumption risk 
        if (request.isOxycodone_taken() && request.isOxycodone_risk()) {
            consum_risk = "Above Limit Oxycodone Conspumtion History" + "\n";
        }

        if (request.isFantanyl_taken() && request.isFantanyl_risk()) {
            consum_risk = consum_risk + "Above Limit Fantanyl Conspumtion History" + "\n";
        }

        if (request.isBupre_taken() && request.isBupre_risk()) {
            consum_risk = consum_risk + "Above Limit Buprenorphine Conspumtion History" + "\n";
        }

        if (request.isMethadone_taken() && request.isMethadone_risk()) {
            consum_risk = consum_risk + "Above Limit Methadon Conspumtion History" + "\n";
        }

        if (request.isOxymorphone_taken() && request.isOxymorphone_risk()) {
            consum_risk = consum_risk + "Above Limit Oxymorphone Conspumtion History" + "\n";
        }
        if (consum_risk.length() > 0) {
            txtMedConsum.setText(consum_risk);
        } else {
            txtMedConsum.setText("No severe medicine consumption history found");
        }

    }

//    private boolean EmpytyFieldValidation() {
//        if(txtResult.getText().equals(null) || txtResult.getText().trim().isEmpty() )
//        {
//            txtResult.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
//            txtResult.setToolTipText("This Field Cannot be empty");
//            emptyValidationStatus= false;
//        }
//        if(!txtResult.getText().equals(null) && !txtResult.getText().trim().isEmpty() )
//        {
//            txtResult.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
//        }
//        return emptyValidationStatus;
//        
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton resBtn;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextArea txtHealthRisk;
    private javax.swing.JTextArea txtMedConsum;
    private javax.swing.JTextArea txtMedicalHist;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextArea txtResult;
    // End of variables declaration//GEN-END:variables
}