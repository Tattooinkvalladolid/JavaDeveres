
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Tarea0 extends javax.swing.JFrame {

    /**
     * Creates new form Tarea0
     */
    public Tarea0() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        ButtonMostrarMensaje = new javax.swing.JButton();
        Mensaje1 = new javax.swing.JRadioButton();
        Mensaje2 = new javax.swing.JRadioButton();
        Mensaje3 = new javax.swing.JRadioButton();
        Mensaje4 = new javax.swing.JRadioButton();
        Mensaje5 = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonMostrarMensaje.setText("Mostrar mensaje");
        ButtonMostrarMensaje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonMostrarMensajeActionPerformed(evt);
            }
        });

        buttonGroup1.add(Mensaje1);
        Mensaje1.setSelected(true);
        Mensaje1.setText("Mensaje 1");
        Mensaje1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mensaje1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Mensaje2);
        Mensaje2.setText("Mensaje 2");

        buttonGroup1.add(Mensaje3);
        Mensaje3.setText("Mensaje 3");

        buttonGroup1.add(Mensaje4);
        Mensaje4.setText("Mensaje 4");
        Mensaje4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mensaje4ActionPerformed(evt);
            }
        });

        buttonGroup1.add(Mensaje5);
        Mensaje5.setText("Mensaje 5");
        Mensaje5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Mensaje5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Mensaje5)
                    .addComponent(Mensaje4)
                    .addComponent(Mensaje3)
                    .addComponent(Mensaje2)
                    .addComponent(Mensaje1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(478, Short.MAX_VALUE)
                .addComponent(ButtonMostrarMensaje)
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Mensaje1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mensaje2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mensaje3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mensaje4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Mensaje5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 258, Short.MAX_VALUE)
                .addComponent(ButtonMostrarMensaje)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Mensaje1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mensaje1ActionPerformed

        // Si esta seleccionado mostar mensaje de info
     
        
        
    }//GEN-LAST:event_Mensaje1ActionPerformed

    private void ButtonMostrarMensajeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonMostrarMensajeActionPerformed

        // TODO add your handling code here:
           if (Mensaje1.isSelected()) {
               JOptionPane.showMessageDialog(rootPane, "Mensaje Simple informacion","Mensaje Simple" , 1);
              
        }
        
           if (Mensaje2.isSelected()) {
               JOptionPane.showInputDialog("Mensaje de entrada" , Mensaje1);
        }
        
           if (Mensaje3.isSelected()) {
               JOptionPane.showInternalInputDialog(rootPane, "Mensjae interno");
        }
           if (Mensaje4.isSelected()) {
            JOptionPane.showMessageDialog(rootPane, "Se te a guardado todo con exito", "Informacion adicional", 1);
        }
           if (Mensaje5.isSelected()) {
            ImageIcon icon = new ImageIcon(getClass().getResource("ico.png"));
            JOptionPane.showConfirmDialog(Mensaje5, "Quieres seguir sin guardar ?", "Mensaje informativo" , WIDTH, HEIGHT, icon);
            
               if (Mensaje5.areFocusTraversalKeysSet(WIDTH)) {
                   System.err.print("entro");
               }else{
               System.out.print("no esta");
               }
           
           }
    }//GEN-LAST:event_ButtonMostrarMensajeActionPerformed

    private void Mensaje5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mensaje5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Mensaje5ActionPerformed

    private void Mensaje4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Mensaje4ActionPerformed

        // TODO add your handling code here:
    }//GEN-LAST:event_Mensaje4ActionPerformed

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
            java.util.logging.Logger.getLogger(Tarea0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tarea0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tarea0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tarea0.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tarea0().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonMostrarMensaje;
    private javax.swing.JRadioButton Mensaje1;
    private javax.swing.JRadioButton Mensaje2;
    private javax.swing.JRadioButton Mensaje3;
    private javax.swing.JRadioButton Mensaje4;
    private javax.swing.JRadioButton Mensaje5;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}