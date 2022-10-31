/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.Encounter;
import model.EncounterHistory;
import model.Gender;
import model.House;
import model.Patient;
import model.Person;
import model.VitalSigns;

/**
 *
 * @author shubhamgoyal
 */
public class PatientJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientJPanel
     */
    
    private JPanel displayJPanel;
    private model.AppSystem system;
    private Patient patient;
    
    public PatientJPanel(JPanel displayJPanel,model.AppSystem system, Patient patient) {
        initComponents();
        this.displayJPanel=displayJPanel;
        this.system=system;
        this.patient=patient;
        displayData();
        populateTable();
    }
    
    private void displayData() {
        
        txtName.setText(patient.getName());
        txtAge.setText(String.valueOf(patient.getAge()));
        String[] genders  = Gender.getGenderArray();
        for(String gender:genders){
            ComboBoxGender.addItem(gender);
        }
        
        ComboBoxGender.setSelectedItem(patient.getGender().name());
        
        txtUserID.setText(patient.getUserID());
        txtPassword.setText(patient.getPassword());
//        txtCity.setText(patient.getCity().toString());
//        txtCommunity.setText(patient.getCommunity().toString());
//        txtHouse.setText(patient.getHouseName().toString());
       
    }
    public void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        model.setRowCount(0);
        if(patient.getEncounterHistory().getEncounters()!=null){
            EncounterHistory encounterHistory = patient.getEncounterHistory();
            List<Encounter> encounters = encounterHistory.getEncounters();
            if(encounters!=null){
                for(Encounter encounter:patient.getEncounterHistory().getEncounters()){
                    Object[] row = new Object[9];
                    row[0]=new Date();
                    row[1]=encounter.getVitalSigns().getWeight();
                    row[2]=encounter.getVitalSigns().getUprBloodPressure();
                    row[3]=encounter.getVitalSigns().getLowBloodPressure();
                    row[4]=encounter.getVitalSigns().getHeight();
                    row[5]=encounter.getVitalSigns().getTemperate();
                    row[6]=encounter.getVitalSigns().getPulseRate();
                    row[7]=encounter.getVitalSigns().getRespirationRate();
                    row[8]=encounter.getVitalSigns().getOxygenSaturation();
                
                    model.addRow(row);
                }
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

        RbtnGrpGender = new javax.swing.ButtonGroup();
        jLabel4 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblGender = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblUserID = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        btnUpdate = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatient = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnAddVital = new javax.swing.JButton();
        ComboBoxGender = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Patient Info Center");

        lblName.setText("Name:");

        lblGender.setText("Gender:");

        lblAge.setText("Age:");

        lblUserID.setText("User ID:");

        lblPassword.setText("Password:");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        tblPatient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Date", "Weight", "Blood Pressure(U)", "Blood Pressure(L)", "Height", "Pulse Rate", "Respiration Rate", "Temperature", "SpO2"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblPatient);

        btnView.setText("View");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAddVital.setText("Add Vital");
        btnAddVital.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVitalActionPerformed(evt);
            }
        });

        btnBack.setText("<Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnAddVital)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(btnView, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblUserID)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblName)
                                            .addComponent(lblAge))
                                        .addGap(15, 15, 15)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(148, 148, 148)))
                                .addGap(46, 46, 46)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPassword)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblGender)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(ComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(43, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName)
                    .addComponent(lblGender)
                    .addComponent(ComboBoxGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAge))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnAddVital))
                .addContainerGap(21, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(isDataValid()){
            patient.setName(txtName.getText());
            patient.setAge(Double.valueOf(txtAge.getText()));
            patient.setGender(Gender.valueOf((String)ComboBoxGender.getSelectedItem()));
//            patient.setLastUpdatedDate(new Date());
            JOptionPane.showMessageDialog(this, "Successfully updated Person Details");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private boolean isDataValid() {
        
        boolean valid = true;
        if(!txtName.getText().matches("^[a-zA-Z ]+$")){
            valid=false;
            JOptionPane.showMessageDialog(this, "Please check Name dataType");
        }
        
        try{
            double age = Double.valueOf(txtAge.getText());
            if(age<0) {
                valid =false;
                JOptionPane.showMessageDialog(this, "Age cannot be negative");
            }
        }catch(Exception e) {
            valid = false;
            JOptionPane.showMessageDialog(this, "Please check Age dataType");
        }
        return valid;
    }    
    
    private void btnAddVitalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVitalActionPerformed
        // TODO add your handling code here:
        VitalSignJPanel vitalSignJPanel = new VitalSignJPanel(displayJPanel, system, patient);
        displayJPanel.add("AddVitalPanel", vitalSignJPanel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }//GEN-LAST:event_btnAddVitalActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedIndex  = tblPatient.getSelectedRow();
        if(selectedIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to View/Update");
            return;
        }
        
        DefaultTableModel model = (DefaultTableModel) tblPatient.getModel();
        VitalSigns vitalSignsToUpdate = (VitalSigns) model.getValueAt(selectedIndex, 0);
        navigateToVitalSignView(vitalSignsToUpdate);
    }//GEN-LAST:event_btnViewActionPerformed

                                          
    private void navigateToVitalSignView(VitalSigns vitalSigns) {
        
        ViewVitalsJPanel vitalSignsJPanel = new ViewVitalsJPanel(displayJPanel, system, vitalSigns);
        displayJPanel.add("ViewVitalSigns",vitalSignsJPanel);
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.next(displayJPanel);
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        CardLayout cardLayout =  (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxGender;
    private javax.swing.ButtonGroup RbtnGrpGender;
    private javax.swing.JButton btnAddVital;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblGender;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JTable tblPatient;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
