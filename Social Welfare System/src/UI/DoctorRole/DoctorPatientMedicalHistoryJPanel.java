/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.DoctorRole;

import Business.Enterprises.Enterprise;
import Business.Organization.LaboratoryOrg;
import Business.Organization.Org;
import Business.UserAccount.User_Account;
import Business.WorkStream.DocLabRequest;
import Business.WorkStream.PatientAppRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
/**
 *
 * @author Makarand
 */
public class DoctorPatientMedicalHistoryJPanel extends javax.swing.JPanel {

   JPanel userProcessContainer;
   PatientAppRequest request;
   User_Account useraccount;
   Enterprise enterprise;
   String gender[] = {"Male","Female","Other"};
   HashMap<String, String> heart_rate = new HashMap<String, String>();
   HashMap<String, String> temp_range = new HashMap<String, String>();
   HashMap<String, String> bp_range = new HashMap<String, String>();
   HashMap<String, String> resp_range = new HashMap<String, String>();
   HashMap<String, String> med_range = new HashMap<String, String>();
   String inj_opioid_use[] = {"On Hands","On Feet", "On Neck"};
   String opioid_intoxication[] = {"Pin Point Pupil", "Nodding Off", "Drowsiness", "Sweating"};
   String opioid_withdrawal[] = {"Restlessness", "Lacrimation", "Hypertension", "Muscle Tenderness"};
   String liver_disease[] = {"Jaundice","Hepatosplenomegaly","Ascites"};
   boolean emptyValidationStatus = true;
   boolean validationCheck = true;
    /**
     * Creates new form DoctorPatientMedicalHistoryJPanel
     */
    public DoctorPatientMedicalHistoryJPanel(JPanel userProcessContainer, PatientAppRequest request,User_Account useraccount,  Enterprise enterprise) {
        initComponents();
    
        this.userProcessContainer = userProcessContainer;
       this.request = request;
       this.useraccount =useraccount;
       this.enterprise = enterprise;
       for(String str: gender)
       {
           genderCombo.addItem(str);
       }
       for(int i=1; i<=110; i++)
       {
           ageCombo.addItem(i);
       }
       // heart beat range
       heart_rate.put("30bpm-70bpm", "low");
       heart_rate.put("71bpm-100bpm","normal");
       heart_rate.put("101bpm-150bpm","high");
       
       // Getting a Set of Key-value pairs
       Set hb_entrySet = heart_rate.entrySet();
 
       // Obtaining an iterator for the entry set
       Iterator hb_it = hb_entrySet.iterator();
       
       while(hb_it.hasNext())
       {
           Map.Entry hb_me = (Map.Entry)hb_it.next();
           heartRateCombo.addItem(hb_me.getKey());
      }
       
       // temperature range
      
      temp_range.put("normal", "97.7 - 99.5°F");
      temp_range.put("high", ">99.5 or 100.9°F");
      temp_range.put("low", "<95.0°F");
      
      // Getting a Set of Key-value pairs
       Set temp_entrySet = temp_range.entrySet();
 
       // Obtaining an iterator for the entry set
       Iterator t_it = temp_entrySet.iterator();
       
       while(t_it.hasNext())
       {
           Map.Entry t_me = (Map.Entry)t_it.next();
           tempCombo.addItem(t_me.getValue());
      }
       
        // blood pressure range
      
      
      bp_range.put("low", "<120 bp");
      bp_range.put("normal", "120-129 bp");
      bp_range.put("stage2", ">120 bp");
      
      // Getting a Set of Key-value pairs
       Set bp_entrySet = bp_range.entrySet();
 
       // Obtaining an iterator for the entry set
       Iterator bp_it = bp_entrySet.iterator();
       
       while(bp_it.hasNext())
       {
           Map.Entry bp_me = (Map.Entry)bp_it.next();
           bpCombo.addItem(bp_me.getValue());
      }
       
        // respiratory rate range
      
      
      resp_range.put("low", "< 12 bpm");
      resp_range.put("normal", "12-20 bpM");
      resp_range.put("high", "> 20 bpm");
     
      // Getting a Set of Key-value pairs
       Set resp_entrySet = resp_range.entrySet();
 
       // Obtaining an iterator for the entry set
       Iterator resp_it = resp_entrySet.iterator();
       
       while(resp_it.hasNext())
       {
           Map.Entry resp_me = (Map.Entry)resp_it.next();
           respCombo.addItem(resp_me.getValue());
      }
      med_range.put("low", "10-20 mg/mL");
      med_range.put("normL", "20-40 mg/mL");
      med_range.put("high", "40-80 mg/mL");
      
      
      // Getting a Set of Key-value pairs
       Set oxcy_entrySet = med_range.entrySet();
 
       // Obtaining an iterator for the entry set
       Iterator oxcy_it = oxcy_entrySet.iterator();
       
       while(oxcy_it.hasNext())
       {
           Map.Entry oxcy_me = (Map.Entry)oxcy_it.next();
           oxycCombo.addItem(oxcy_me.getValue());
           fenCombo.addItem(oxcy_me.getValue());
           bupCombo.addItem(oxcy_me.getValue());
           metCombo.addItem(oxcy_me.getValue());
           oxymCombo.addItem(oxcy_me.getValue());
      }
       
       for(String str: inj_opioid_use)
       {
           injCombo.addItem(str);
       }
       
       
        for(String str: opioid_intoxication)
       {
           intoCombo.addItem(str);
       }
        
       for(String str: opioid_withdrawal)
       {
           withCombo.addItem(str);
       }
       
               
        for(String str: liver_disease)
       {
           livCombo.addItem(str);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        fenChk = new javax.swing.JCheckBox();
        heartRateCombo = new javax.swing.JComboBox();
        bupChk = new javax.swing.JCheckBox();
        metChk = new javax.swing.JCheckBox();
        oxymChk = new javax.swing.JCheckBox();
        oxycCombo = new javax.swing.JComboBox();
        fenCombo = new javax.swing.JComboBox();
        bupCombo = new javax.swing.JComboBox();
        metCombo = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        oxymCombo = new javax.swing.JComboBox();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        oxycChk = new javax.swing.JCheckBox();
        jLabel21 = new javax.swing.JLabel();
        injChk = new javax.swing.JCheckBox();
        injCombo = new javax.swing.JComboBox();
        intoChk = new javax.swing.JCheckBox();
        intoCombo = new javax.swing.JComboBox();
        withChk = new javax.swing.JCheckBox();
        withCombo = new javax.swing.JComboBox();
        livChk = new javax.swing.JCheckBox();
        livCombo = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        respCombo = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        tempCombo = new javax.swing.JComboBox();
        jLabel16 = new javax.swing.JLabel();
        bpCombo = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        ageCombo = new javax.swing.JComboBox();
        txtpatientname = new javax.swing.JTextField();
        genderCombo = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        drugChk = new javax.swing.JCheckBox();
        alcoholChk = new javax.swing.JCheckBox();
        depressionChk = new javax.swing.JCheckBox();
        anxietyChk = new javax.swing.JCheckBox();
        disruptSocialChk = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(239, 241, 228));
        jPanel1.setPreferredSize(new java.awt.Dimension(1170, 100));

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Fill Patient Medical History & Symptoms");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 497, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(371, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel9)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(193, 212, 227));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(49, 84, 140));
        jLabel10.setText("General Information :");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 100, 230, 30));

        jButton2.setBackground(new java.awt.Color(193, 212, 227));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/back_button.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 13, 60, 40));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(49, 84, 140));
        jLabel19.setText("Medicine ");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 360, 93, -1));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(49, 84, 140));
        jLabel20.setText("Range");
        jPanel3.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 360, 152, -1));

        fenChk.setBackground(new java.awt.Color(193, 212, 227));
        fenChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        fenChk.setText("Fentanyl");
        jPanel3.add(fenChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, -1, -1));

        heartRateCombo.setBackground(new java.awt.Color(193, 212, 227));
        jPanel3.add(heartRateCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 114, -1));

        bupChk.setBackground(new java.awt.Color(193, 212, 227));
        bupChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        bupChk.setText("Buprenorphine");
        jPanel3.add(bupChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 460, -1, -1));

        metChk.setBackground(new java.awt.Color(193, 212, 227));
        metChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        metChk.setText("Methadone");
        jPanel3.add(metChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 490, -1, -1));

        oxymChk.setBackground(new java.awt.Color(193, 212, 227));
        oxymChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        oxymChk.setText("Oxymorphone");
        jPanel3.add(oxymChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 520, -1, -1));

        oxycCombo.setBackground(new java.awt.Color(153, 204, 255));
        oxycCombo.setEnabled(false);
        jPanel3.add(oxycCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 400, 123, -1));

        fenCombo.setBackground(new java.awt.Color(153, 204, 255));
        fenCombo.setEnabled(false);
        jPanel3.add(fenCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 430, 123, -1));

        bupCombo.setBackground(new java.awt.Color(153, 204, 255));
        bupCombo.setEnabled(false);
        jPanel3.add(bupCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 460, 123, -1));

        metCombo.setBackground(new java.awt.Color(153, 204, 255));
        metCombo.setEnabled(false);
        jPanel3.add(metCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, 123, -1));

        jLabel12.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(49, 84, 140));
        jLabel12.setText("Current Physical Symptoms");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, 230, -1));

        oxymCombo.setBackground(new java.awt.Color(153, 204, 255));
        oxymCombo.setEnabled(false);
        jPanel3.add(oxymCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 520, 123, -1));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel14.setText("Heart Rate");
        jPanel3.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, -1, -1));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(49, 84, 140));
        jLabel18.setText("Medicine Consumption History");
        jPanel3.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 230, -1));

        oxycChk.setBackground(new java.awt.Color(193, 212, 227));
        oxycChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        oxycChk.setText("Oxycodone");
        jPanel3.add(oxycChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 400, -1, -1));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(49, 84, 140));
        jLabel21.setText("Additional Information ");
        jPanel3.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 330, 230, -1));

        injChk.setBackground(new java.awt.Color(193, 212, 227));
        injChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        injChk.setText("Injection Opioid Use ");
        jPanel3.add(injChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, -1, -1));

        injCombo.setBackground(new java.awt.Color(153, 204, 255));
        injCombo.setEnabled(false);
        jPanel3.add(injCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 360, 123, -1));

        intoChk.setBackground(new java.awt.Color(193, 212, 227));
        intoChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        intoChk.setText("Opioid Intoxication");
        jPanel3.add(intoChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 390, -1, -1));

        intoCombo.setBackground(new java.awt.Color(153, 204, 255));
        intoCombo.setEnabled(false);
        jPanel3.add(intoCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 420, 123, -1));

        withChk.setBackground(new java.awt.Color(193, 212, 227));
        withChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        withChk.setText("Opioid Withdrawal");
        jPanel3.add(withChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 420, -1, -1));

        withCombo.setBackground(new java.awt.Color(153, 204, 255));
        withCombo.setEnabled(false);
        jPanel3.add(withCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 390, 123, -1));

        livChk.setBackground(new java.awt.Color(193, 212, 227));
        livChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        livChk.setText("Liver Disease");
        jPanel3.add(livChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 450, -1, -1));

        livCombo.setBackground(new java.awt.Color(153, 204, 255));
        livCombo.setEnabled(false);
        livCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                livComboActionPerformed(evt);
            }
        });
        jPanel3.add(livCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 450, 123, -1));

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(49, 84, 140));
        jLabel11.setText("Medical History");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 230, -1));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel17.setText("Respiratory Rate");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 386, -1, 30));

        respCombo.setBackground(new java.awt.Color(193, 212, 227));
        jPanel3.add(respCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 114, -1));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel15.setText("Temperature");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, -1, -1));

        tempCombo.setBackground(new java.awt.Color(193, 212, 227));
        jPanel3.add(tempCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 420, 114, -1));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel16.setText("Blood Pressure");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        bpCombo.setBackground(new java.awt.Color(193, 212, 227));
        jPanel3.add(bpCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 114, -1));

        jButton1.setBackground(new java.awt.Color(83, 124, 142));
        jButton1.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Submit  ");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel3.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 210, 81, 32));

        ageCombo.setBackground(new java.awt.Color(193, 212, 227));
        jPanel3.add(ageCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, -1, -1));

        txtpatientname.setBackground(new java.awt.Color(193, 212, 227));
        txtpatientname.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jPanel3.add(txtpatientname, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 167, -1));

        genderCombo.setBackground(new java.awt.Color(193, 212, 227));
        jPanel3.add(genderCombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 160, -1, -1));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("Name");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 160, -1, 30));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel13.setText("Gender");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, -1, 30));

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("Age");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 160, -1, 20));

        drugChk.setBackground(new java.awt.Color(193, 212, 227));
        drugChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        drugChk.setText("Drug History");
        jPanel3.add(drugChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 290, -1, -1));

        alcoholChk.setBackground(new java.awt.Color(193, 212, 227));
        alcoholChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        alcoholChk.setText("Alcohol History");
        jPanel3.add(alcoholChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 290, -1, -1));

        depressionChk.setBackground(new java.awt.Color(193, 212, 227));
        depressionChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        depressionChk.setText("Depression History");
        jPanel3.add(depressionChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        anxietyChk.setBackground(new java.awt.Color(193, 212, 227));
        anxietyChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        anxietyChk.setText("Anxiety History");
        jPanel3.add(anxietyChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 290, -1, -1));

        disruptSocialChk.setBackground(new java.awt.Color(193, 212, 227));
        disruptSocialChk.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        disruptSocialChk.setText("Bad Social Relationships");
        jPanel3.add(disruptSocialChk, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 290, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 69, 1013, 570));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/doctor_backnew.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1190, -1));

        add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 96, 1190, 1020));
    }// </editor-fold>//GEN-END:initComponents

    private void livComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_livComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_livComboActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DocLabRequest labr = new DocLabRequest();
        labr.setSender(useraccount);

        labr.setMessage("Lab Request");
        labr.setStatus("Med Hist Collected For Lab");
        request.setStatus("Med Hist Collected For Lab");
         request.setDoc_med_history("");

        //Setting patient's general information 
        labr.setName(txtpatientname.getText());
        labr.setGender((String)genderCombo.getSelectedItem());
        labr.setAge((Integer)ageCombo.getSelectedItem());
        
        //Setting patients medical history
        labr.setDrug_history(drugChk.isSelected());
        labr.setAlcohol_history(alcoholChk.isSelected());
        labr.setDepression_history(depressionChk.isSelected());
        labr.setAnxiety_history(anxietyChk.isSelected());
        labr.setDisrupt_history(disruptSocialChk.isSelected());
        
       
        if((String)heartRateCombo.getSelectedItem() == "101bpm-150bpm")
        {
            labr.setHr_risk(true);
        }
        else
        {
            labr.setHr_risk(false);
        }
        
        if((String)tempCombo.getSelectedItem() == ">99.5 or 100.9°F")
        {
            labr.setTemp_risk(true);
        }
        else
        {
            labr.setTemp_risk(false);
        }
        
        if((String)bpCombo.getSelectedItem() == ">120 bp" ||
            (String)bpCombo.getSelectedItem() == "<120 bp")    
        {
            labr.setBp_risk(true);
        }
        else
        {
            labr.setBp_risk(false);
        }
        
        if((String)respCombo.getSelectedItem() == "> 20 bpm" ||
           (String)respCombo.getSelectedItem() == "< 12 bpm")         
        {
            labr.setResp_risk(true);
        }
        else
        {
            labr.setResp_risk(false);
        }
        
        //Setting patient's medicine consumption flag
        labr.setOxycodone_taken(oxycChk.isSelected());
        labr.setFantanyl_taken(fenChk.isSelected());
        labr.setBupre_taken(bupChk.isSelected());
        labr.setMethadone_taken(metChk.isSelected());
        labr.setOxymorphone_taken(oxymChk.isSelected());
        
        //Setting patient's medicine consumption dose risk
        if((String)oxycCombo.getSelectedItem() == "40-80 mg/mL")
        {
            labr.setOxycodone_risk(true);
        }
        else
        {
            labr.setOxycodone_risk(false);
        }
        if((String)fenCombo.getSelectedItem() == "40-80 mg/mL")
        {
            labr.setFantanyl_risk(true);
        }
        else
        {
            labr.setFantanyl_risk(false);
        }
        
        if((String)bupCombo.getSelectedItem() == "40-80 mg/mL")
        {
            labr.setBupre_risk(true);
        }
        else
        {
            labr.setBupre_risk(false);
        }
        
        if((String)metCombo.getSelectedItem() == "40-80 mg/mL")
        {
            labr.setMethadone_risk(true);
        }
        else
        {
            labr.setMethadone_risk(false);
        }
        
        if((String)oxymCombo.getSelectedItem() == "40-80 mg/mL")
        {
            labr.setOxymorphone_risk(true);
        }
        else
        {
            labr.setOxymorphone_risk(false);
        }
        
        //Setting patient's additional consumption flag
        labr.setInjection_checked(injChk.isSelected());
        labr.setIntoxication_checked(intoChk.isSelected());
        labr.setWithdrawal_checked(withChk.isSelected());
        labr.setDisease_checked(livChk.isSelected());
        
        
        //Setting patient's additional consumption flag
        labr.setInjection_type((String)injCombo.getSelectedItem());
        labr.setIntoxication_type((String)intoCombo.getSelectedItem());
        labr.setWithdrawal_type((String)withCombo.getSelectedItem());
        labr.setDisease_type((String)livCombo.getSelectedItem());
        
    //    Doctor_LabRequest labr = new Doctor_LabRequest();
      Org org = null;
        for (Org organization : enterprise.getOrganizationDirectory().getOrganizationList()){
            if (organization instanceof LaboratoryOrg){
                org = organization;
                //testing
                System.out.println(request.hashCode());
              //  org.setHashcode(request.hashCode());
                break;
            }
        }
        if (org!=null){
              int a = request.hashCode();
              request.setHashcode(a);//patient hashcode from db
        System.out.println(a);
        labr.setHashcode(a);
            org.getWorkStream().getWorkRequestList().add(labr);
            useraccount.getWorkStream().getWorkRequestList().add(labr);
        }
    
         JOptionPane.showMessageDialog(null, "Report Submitted Successfully");
               
            // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private boolean RegexValidation() {
        if(!txtpatientname.getText().matches("^[a-zA-Z ]+$"))
        {
            txtpatientname.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtpatientname.setToolTipText("Please enter only characters and space.");
            validationCheck=false;
        }
        
        if(txtpatientname.getText().matches("^[a-zA-Z ]+$"))
        {
            txtpatientname.setBorder(BorderFactory.createLineBorder(Color.BLUE, 0));
        }
        return validationCheck;
    }
    
    private boolean EmpytyFieldValidation() {
        if(txtpatientname.getText().equals(null) || txtpatientname.getText().trim().isEmpty() )
        {
            txtpatientname.setBorder(BorderFactory.createLineBorder(Color.RED, 1));
            txtpatientname.setToolTipText("This Field Cannot be empty");
            emptyValidationStatus= false;
        }
        if(!txtpatientname.getText().equals(null) && !txtpatientname.getText().trim().isEmpty() )
        {
            txtpatientname.setBorder(BorderFactory.createLineBorder(Color.BLUE, 1));
        }
        return emptyValidationStatus;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ageCombo;
    private javax.swing.JCheckBox alcoholChk;
    private javax.swing.JCheckBox anxietyChk;
    private javax.swing.JComboBox bpCombo;
    private javax.swing.JCheckBox bupChk;
    private javax.swing.JComboBox bupCombo;
    private javax.swing.JCheckBox depressionChk;
    private javax.swing.JCheckBox disruptSocialChk;
    private javax.swing.JCheckBox drugChk;
    private javax.swing.JCheckBox fenChk;
    private javax.swing.JComboBox fenCombo;
    private javax.swing.JComboBox genderCombo;
    private javax.swing.JComboBox heartRateCombo;
    private javax.swing.JCheckBox injChk;
    private javax.swing.JComboBox injCombo;
    private javax.swing.JCheckBox intoChk;
    private javax.swing.JComboBox intoCombo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JCheckBox livChk;
    private javax.swing.JComboBox livCombo;
    private javax.swing.JCheckBox metChk;
    private javax.swing.JComboBox metCombo;
    private javax.swing.JCheckBox oxycChk;
    private javax.swing.JComboBox oxycCombo;
    private javax.swing.JCheckBox oxymChk;
    private javax.swing.JComboBox oxymCombo;
    private javax.swing.JComboBox respCombo;
    private javax.swing.JComboBox tempCombo;
    private javax.swing.JTextField txtpatientname;
    private javax.swing.JCheckBox withChk;
    private javax.swing.JComboBox withCombo;
    // End of variables declaration//GEN-END:variables
}
