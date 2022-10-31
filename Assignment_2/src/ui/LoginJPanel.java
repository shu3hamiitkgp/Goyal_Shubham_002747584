/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import model.Patient;

/**
 *
 * @author shubhamgoyal
 */
public class LoginJPanel extends javax.swing.JPanel {

    /**
     * Creates new form LoginJPanel
     */
    
    private model.AppSystem system;
    private JPanel displayJPanel;
    private Patient patient;

    public LoginJPanel(JPanel displayJPanel,model.AppSystem system) {
        
        initComponents();
        this.displayJPanel=displayJPanel;
        this.system=system;
        this.patient=patient;
//        this.system=system;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        txtPassword = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblUserID = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        ComboBoxRole = new javax.swing.JComboBox<>();
        lblRole = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblPassword.setText("Password :");

        lblUserID.setText("UserID :");

        ComboBoxRole.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "System Admin", "Community Admin", "Hospital Admin", "Patient", "Doctor" }));

        lblRole.setText("Role :");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Healthcare Data Center");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(lblRole))
                                    .addComponent(lblPassword, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblUserID, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ComboBoxRole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtPassword)
                                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnSubmit))
                        .addGap(100, 100, 100))
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblRole)
                    .addComponent(ComboBoxRole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUserID)
                    .addComponent(txtUserID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(btnSubmit)
                .addContainerGap(108, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:

        String userID= txtUserID.getText();
        String password = txtPassword.getText();
        String role = ComboBoxRole.getSelectedItem().toString();

        if (userID.equals("")||password.equals("")){
            JOptionPane.showMessageDialog(this,"Some fields are empty","Error",1);
        }else{
            try{
                if(role.equalsIgnoreCase("System Admin")){

                    if(userID.equals("Admin") && password.equals("Admin")){

                        SystemJPanel sysJPanel = new SystemJPanel(displayJPanel,system);
                        //                    SplitPanel.setRightComponent(sysJPanel);

                        displayJPanel.add("SystemInfo",sysJPanel);
                        CardLayout layout = (CardLayout) displayJPanel.getLayout();
                        layout.next(displayJPanel);
                        


                    }else{
                        JOptionPane.showMessageDialog(null, "Password is not correct");
                    }
                }else if (role.equals("Community Admin")){
                    if(userID.equals("cadmin@gmail.com") && password.equals("cadmin$CA123")){

                        CityJPanel cityJPanel = new CityJPanel(displayJPanel,system);
                        //                    SplitPanel.setRightComponent(sysJPanel);

                        displayJPanel.add("CityInfo",cityJPanel);
                        CardLayout layout = (CardLayout) displayJPanel.getLayout();
                        layout.next(displayJPanel);
                       
                    }else{
                        JOptionPane.showMessageDialog(null, "Password is not correct");
                    }
                }else if (role.equals("Hospital Admin")){
                    if(userID.equals("hadmin@gmail.com") && password.equals("hadmin$HA123")){

                        HospitalJPanel hospitalJPanel = new HospitalJPanel(displayJPanel,system,system.getCities().get(0).getCommunities().get(0));
                        //                    SplitPanel.setRightComponent(sysJPanel);

                        displayJPanel.add("HospitalInfo",hospitalJPanel);
                        CardLayout layout = (CardLayout) displayJPanel.getLayout();
                        layout.next(displayJPanel);
                       
                    }else{
                        JOptionPane.showMessageDialog(null, "Password is not correct");
                    }
                }else if (role.equals("Patient")){
                    if(userID.equals("patient@gmail.com") && password.equals("patient$PA123")){

                        CommunityJPanel communityJPanel = new CommunityJPanel(displayJPanel,system, system.getCities().get(0));
                        //                    SplitPanel.setRightComponent(sysJPanel);

                        displayJPanel.add("CityInfo",communityJPanel);
                        CardLayout layout = (CardLayout) displayJPanel.getLayout();
                        layout.next(displayJPanel);
                       
                    }else{
                        JOptionPane.showMessageDialog(null, "Password is not correct");
                    }
                }  else if (role.equals("Doctor")){
                    if(userID.equals("doctor@gmail.com") && password.equals("doctor$DA123")){

                        ViewPersonsJPanel viewPersonJPanel = new ViewPersonsJPanel(displayJPanel,system,system.getCities().get(0).getCommunities().get(0).getHouses().get(0));
                        //                    SplitPanel.setRightComponent(sysJPanel);

                        displayJPanel.add("PatientInfo",viewPersonJPanel);
                        CardLayout layout = (CardLayout) displayJPanel.getLayout();
                        layout.next(displayJPanel);
                       
                    }else{
                        JOptionPane.showMessageDialog(null, "Password is not correct");
                    }
                }  
            
               
                }catch(Exception ex){
                    System.out.println(""+ex);
                }
            }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxRole;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblUserID;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUserID;
    // End of variables declaration//GEN-END:variables
}
