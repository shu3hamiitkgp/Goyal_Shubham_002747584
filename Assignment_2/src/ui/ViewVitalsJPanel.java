/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.VitalSigns;

/**
 *
 * @author shubhamgoyal
 */
public class ViewVitalsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewVitalsJPanel
     */
    private JPanel displayJPanel;
    private model.AppSystem system;
    private VitalSigns vitalSigns;
    
    public ViewVitalsJPanel(JPanel displayJPanel, model.AppSystem system, VitalSigns vitalSigns) {
        
        this.displayJPanel=displayJPanel;
        this.system=system;
        this.vitalSigns=vitalSigns;
        initComponents();
        displayData(vitalSigns);
    }

    private void displayData(VitalSigns vitalSigns){
        
        weightJTextField.setText(String.valueOf(vitalSigns.getWeight()));
        bloodPressureSysJTextField.setText(String.valueOf(vitalSigns.getUprBloodPressure()));
        bloodPressureDsJTextField.setText(String.valueOf(vitalSigns.getLowBloodPressure()));
        heightJTextField.setText(String.valueOf(vitalSigns.getHeight()));
        bodyTemperatureJTextField.setText(String.valueOf(vitalSigns.getTemperate()));
        pulseRateJTextField.setText(String.valueOf(vitalSigns.getPulseRate()));
        respirationRateJTextField.setText(String.valueOf(vitalSigns.getRespirationRate()));
        oxygenSaturationJTextField.setText(String.valueOf(vitalSigns.getOxygenSaturation()));
        
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel13 = new javax.swing.JLabel();
        bloodPressureSysJTextField = new javax.swing.JTextField();
        oxygenSaturationJTextField = new javax.swing.JTextField();
        weightJTextField = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        respirationRateJTextField = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        heightJTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnUpdate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        pulseRateJTextField = new javax.swing.JTextField();
        bodyTemperatureJTextField = new javax.swing.JTextField();
        bloodPressureDsJTextField = new javax.swing.JTextField();

        jLabel13.setText("SpO2:");

        jLabel9.setText("Height:");

        jLabel10.setText("Temperature:");

        jLabel15.setText("Respiration Rate:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Vital Sign Info Center");

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel2.setText("Weight:");

        jLabel11.setText("Blood Pressure(U):");

        jLabel14.setText("Pulse Rate:");

        jLabel8.setText("Blood Pressure(L):");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBack))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pulseRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(bloodPressureSysJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(bloodPressureDsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(72, 72, 72)
                                        .addComponent(jLabel9))
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(bodyTemperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(heightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(oxygenSaturationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(respirationRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(weightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bloodPressureSysJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bodyTemperatureJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(heightJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bloodPressureDsJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pulseRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oxygenSaturationJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(respirationRateJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnUpdate))
                .addGap(159, 159, 159))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if(isDataValid()) {
            vitalSigns.setUprBloodPressure(Double.valueOf(bloodPressureSysJTextField.getText()));
            vitalSigns.setLowBloodPressure(Double.valueOf(bloodPressureDsJTextField.getText()));
            vitalSigns.setTemperate(Double.valueOf(bodyTemperatureJTextField.getText()));
            vitalSigns.setHeight(Double.valueOf(heightJTextField.getText()));
            vitalSigns.setOxygenSaturation(Double.valueOf(oxygenSaturationJTextField.getText()));
            vitalSigns.setPulseRate(Integer.valueOf(pulseRateJTextField.getText()));
            vitalSigns.setRespirationRate(Integer.valueOf(respirationRateJTextField.getText()));
            vitalSigns.setWeight(Double.valueOf(weightJTextField.getText()));
//            vitalSigns.setLastUpdatedDate(new Date());

            JOptionPane.showMessageDialog(this, "Successfully updated the Vital Signs");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private boolean isDataValid() {
        
        boolean validData = true;
        
        try{
            double weight = Double.valueOf(weightJTextField.getText());
            if(weight <0) {
                validData=false;
                JOptionPane.showMessageDialog(this, "Weight cannot be negative");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please check the dataType of Weight");
            validData = false;
        }
        
        try{
            double bloodPressureSys = Double.valueOf(bloodPressureSysJTextField.getText());
            if(bloodPressureSys <0) {
                validData=false;
                JOptionPane.showMessageDialog(this, "BloodPressureSys cannot be negative");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please check the dataType of bloodPressureSys");
            validData = false;
        }
        
        try{
            double bloodPressureDs = Double.valueOf(bloodPressureDsJTextField.getText());
            if(bloodPressureDs <0) {
                validData=false;
                JOptionPane.showMessageDialog(this, "BloodPressureDs cannot be negative");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please check the dataType of BloodPressureDs");
            validData = false;
        }

        try{
            double height = Double.valueOf(heightJTextField.getText());
            if(height <0) {
                validData=false;
                JOptionPane.showMessageDialog(this, "Height cannot be negative");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please check the dataType of Height");
            validData = false;
        }        
        
        try{
            double bodyTemp = Double.valueOf(bodyTemperatureJTextField.getText());
            if(bodyTemp <0) {
                validData=false;
                JOptionPane.showMessageDialog(this, "BodyTemperature cannot be negative");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please check the dataType of BodyTemperature");
            validData = false;
        }

        try{
            double oxygenSat = Double.valueOf(oxygenSaturationJTextField.getText());
            if(oxygenSat <0 || oxygenSat > 100) {
                validData=false;
                JOptionPane.showMessageDialog(this, "OxygenSaturation cannot be less than 0 or greater than 100");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please check the dataType of OxygenSaturation");
            validData = false;
        }
        
        try{
            int pulseRate = Integer.valueOf(pulseRateJTextField.getText());
            if(pulseRate <0 ) {
                validData=false;
                JOptionPane.showMessageDialog(this, "PulseRate cannot be negative");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please check the dataType of PulseRate");
            validData = false;
        }        

        try{
            int respiration = Integer.valueOf(respirationRateJTextField.getText());
            if(respiration <0 ) {
                validData=false;
                JOptionPane.showMessageDialog(this, "Respiration cannot be negative");
            }
        }catch (Exception e){
            JOptionPane.showMessageDialog(this, "Please check the dataType of Respiration");
            validData = false;
        }        
        
        
        return validData;
        
    }
    
    private void resetData(){
        
        bloodPressureSysJTextField.setText("");
        bloodPressureDsJTextField.setText("");
        bodyTemperatureJTextField.setText("");
        heightJTextField.setText("");
        oxygenSaturationJTextField.setText("");
        pulseRateJTextField.setText("");
        respirationRateJTextField.setText("");
        weightJTextField.setText("");
        
    }
    
    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        displayJPanel.remove(this);
        Component[] componentArray = displayJPanel.getComponents();
        Component component = componentArray[componentArray.length-1];
        PatientJPanel encounterHistoryJPanel = (PatientJPanel) component;
        encounterHistoryJPanel.populateTable();
        CardLayout cardLayout = (CardLayout) displayJPanel.getLayout();
        cardLayout.previous(displayJPanel);
    }//GEN-LAST:event_btnBackActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField bloodPressureDsJTextField;
    private javax.swing.JTextField bloodPressureSysJTextField;
    private javax.swing.JTextField bodyTemperatureJTextField;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JTextField heightJTextField;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField oxygenSaturationJTextField;
    private javax.swing.JTextField pulseRateJTextField;
    private javax.swing.JTextField respirationRateJTextField;
    private javax.swing.JTextField weightJTextField;
    // End of variables declaration//GEN-END:variables
}
