/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class GrupBox extends javax.swing.JFrame {

    /**
     * Creates new form GrupBox
     */
    public GrupBox() {
        initComponents();
           RadioButton4.setEnabled(false);
            RadioButton5.setEnabled(false);
            RadioButton6.setEnabled(false);
            independentecheackbox.setEnabled(false);
            CheckBox3.setEnabled(false);
            
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        RadioGrup1 = new javax.swing.ButtonGroup();
        RadioGrup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        RadioButton1 = new javax.swing.JRadioButton();
        RadioButton2 = new javax.swing.JRadioButton();
        RadioButton3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        CheckBox1 = new javax.swing.JCheckBox();
        CheckBox2 = new javax.swing.JCheckBox();
        CheckBox3 = new javax.swing.JCheckBox();
        ExclosiveRadioButton = new javax.swing.JCheckBox();
        CheckBoxButton = new javax.swing.JCheckBox();
        RadioButton4 = new javax.swing.JRadioButton();
        RadioButton5 = new javax.swing.JRadioButton();
        RadioButton6 = new javax.swing.JRadioButton();
        independentecheackbox = new javax.swing.JCheckBox();
        ButonNormal = new javax.swing.JButton();
        ButtonToggle = new javax.swing.JToggleButton();
        ButtonFlat = new javax.swing.JButton();
        ButonPopup = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Group Box");

        jLabel1.setText("Exclosive Radio Buttons");

        RadioGrup1.add(RadioButton1);
        RadioButton1.setSelected(true);
        RadioButton1.setText("Radio Button 1");

        RadioGrup1.add(RadioButton2);
        RadioButton2.setText("Radio Button 2");

        RadioGrup1.add(RadioButton3);
        RadioButton3.setText("Radio Button 3");

        jLabel2.setText("Non-Exlosive CheckBoxes");

        CheckBox1.setText("CheckBox 1");

        CheckBox2.setSelected(true);
        CheckBox2.setText("CheckBox 2");
        CheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox2ActionPerformed(evt);
            }
        });

        CheckBox3.setSelected(true);
        CheckBox3.setText("Tri-State Button");

        ExclosiveRadioButton.setText("Exlosive Radio Button");
        ExclosiveRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExclosiveRadioButtonActionPerformed(evt);
            }
        });

        CheckBoxButton.setSelected(true);
        CheckBoxButton.setText("Push Buttons");
        CheckBoxButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBoxButtonActionPerformed(evt);
            }
        });

        RadioGrup2.add(RadioButton4);
        RadioButton4.setSelected(true);
        RadioButton4.setText("Radio button 1");

        RadioGrup2.add(RadioButton5);
        RadioButton5.setText("Radio Button 2");

        RadioGrup2.add(RadioButton6);
        RadioButton6.setText("Radio Button 3");

        independentecheackbox.setSelected(true);
        independentecheackbox.setText("Independent checkbox");

        ButonNormal.setText("Normal Button");

        ButtonToggle.setSelected(true);
        ButtonToggle.setText("Toggle Button ");

        ButtonFlat.setText("Flat Button");

        ButonPopup.setText("Popup Button");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ExclosiveRadioButton)
                            .addComponent(RadioButton4)
                            .addComponent(RadioButton6)
                            .addComponent(independentecheackbox)
                            .addComponent(RadioButton5))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(CheckBox3)
                                        .addComponent(CheckBox2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(CheckBox1, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(CheckBoxButton)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ButtonToggle, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButonPopup, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonFlat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButonNormal, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44))))
                    .addComponent(RadioButton1)
                    .addComponent(jLabel1)
                    .addComponent(RadioButton3)
                    .addComponent(RadioButton2))
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButton1)
                            .addComponent(CheckBox1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButton2)
                            .addComponent(CheckBox2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(RadioButton3)
                            .addComponent(CheckBox3))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ExclosiveRadioButton)
                            .addComponent(CheckBoxButton))
                        .addGap(18, 18, 18)
                        .addComponent(RadioButton4))
                    .addComponent(ButonNormal))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton5)
                    .addComponent(ButtonToggle))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RadioButton6)
                    .addComponent(ButtonFlat))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(independentecheackbox)
                    .addComponent(ButonPopup))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ButonNormal, ButonPopup, ButtonFlat, ButtonToggle});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExclosiveRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExclosiveRadioButtonActionPerformed

        // TODO add your handling code here:
         
        if (ExclosiveRadioButton.isSelected() ) {
            RadioButton4.setEnabled(true);
            RadioButton5.setEnabled(true);
            RadioButton6.setEnabled(true);
            independentecheackbox.setEnabled(true);
        }else{
            RadioButton4.setEnabled(false);
            RadioButton5.setEnabled(false);
            RadioButton6.setEnabled(false);
            independentecheackbox.setEnabled(false);
        }
    }//GEN-LAST:event_ExclosiveRadioButtonActionPerformed

    private void CheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox2ActionPerformed
        // TODO add your handling code here:
        if (CheckBox2.isSelected()) {
            CheckBox3.setEnabled(false);
        }else{
        CheckBox3.setEnabled(true);
        }
    }//GEN-LAST:event_CheckBox2ActionPerformed

    private void CheckBoxButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBoxButtonActionPerformed

        // TODO add your handling code here:
       
        if (CheckBoxButton.isSelected()) {
             ButonNormal.setEnabled(true);
             ButonPopup.setEnabled(true);
             ButtonFlat.setEnabled(true);
             ButtonToggle.setEnabled(true);
        }else{
         ButonNormal.setEnabled(false);
         ButonPopup.setEnabled(false);
         ButtonFlat.setEnabled(false);
         ButtonToggle.setEnabled(false);
        }
    }//GEN-LAST:event_CheckBoxButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GrupBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GrupBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GrupBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GrupBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GrupBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButonNormal;
    private javax.swing.JButton ButonPopup;
    private javax.swing.JButton ButtonFlat;
    private javax.swing.JToggleButton ButtonToggle;
    private javax.swing.JCheckBox CheckBox1;
    private javax.swing.JCheckBox CheckBox2;
    private javax.swing.JCheckBox CheckBox3;
    private javax.swing.JCheckBox CheckBoxButton;
    private javax.swing.JCheckBox ExclosiveRadioButton;
    private javax.swing.JRadioButton RadioButton1;
    private javax.swing.JRadioButton RadioButton2;
    private javax.swing.JRadioButton RadioButton3;
    private javax.swing.JRadioButton RadioButton4;
    private javax.swing.JRadioButton RadioButton5;
    private javax.swing.JRadioButton RadioButton6;
    private javax.swing.ButtonGroup RadioGrup1;
    private javax.swing.ButtonGroup RadioGrup2;
    private javax.swing.JCheckBox independentecheackbox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}