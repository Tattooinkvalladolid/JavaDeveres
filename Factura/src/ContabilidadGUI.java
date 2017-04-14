

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;





/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class ContabilidadGUI extends javax.swing.JFrame {

    /**
     * Creates new form FacturaGUI
     */
    public ContabilidadGUI() {
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

        Nfactura = new javax.swing.JLabel();
        NfacturaTF = new javax.swing.JTextField();
        VerFacturaCompleta = new javax.swing.JButton();
        Nombre = new javax.swing.JLabel();
        NombreTF = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        ApellidosTF = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        CalleTF = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        CiudadTF = new javax.swing.JTextField();
        ConseptoTl = new javax.swing.JLabel();
        ConseptoTF0 = new javax.swing.JTextField();
        PrecioTF0 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        ConseptoTF1 = new javax.swing.JTextField();
        PrecioTF1 = new javax.swing.JTextField();
        ConseptoTF2 = new javax.swing.JTextField();
        PrecioTF2 = new javax.swing.JTextField();
        ConseptoTF3 = new javax.swing.JTextField();
        PrecioTF3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        ObservacionesTF = new javax.swing.JTextArea();
        CpTF = new javax.swing.JTextField();
        ErrorTL = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        GuardarTodo = new javax.swing.JButton();
        CargarultimaFactura = new javax.swing.JButton();
        BuscarFactura = new javax.swing.JButton();
        MensajeTF = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Factura Tattoo Ink Valladolid ");
        setAlwaysOnTop(true);
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(50, 50, 50));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(523, 705));
        setMinimumSize(new java.awt.Dimension(523, 705));

        Nfactura.setText("Nª Factura:");

        VerFacturaCompleta.setText("Ver Factura");
        VerFacturaCompleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerFacturaCompletaActionPerformed(evt);
            }
        });

        Nombre.setText("Nombre:");

        jLabel1.setText("Apellidos:");

        jLabel2.setText("Ciudad:");

        jLabel3.setText("CP:");

        jLabel4.setText("Calle:");

        ConseptoTl.setText("Consepto:               Al menos uno obligatorio");

        jLabel5.setText("Precio:");

        ObservacionesTF.setColumns(20);
        ObservacionesTF.setRows(5);
        jScrollPane1.setViewportView(ObservacionesTF);

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        GuardarTodo.setText("Guardar");
        GuardarTodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarTodoActionPerformed(evt);
            }
        });

        CargarultimaFactura.setText("Cargar la ultima Factura");
        CargarultimaFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CargarultimaFacturaActionPerformed(evt);
            }
        });

        BuscarFactura.setText("Buscar Factura");
        BuscarFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarFacturaActionPerformed(evt);
            }
        });

        MensajeTF.setForeground(new java.awt.Color(255, 0, 0));

        jLabel6.setText("Observaciones");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(ConseptoTF0, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ConseptoTl)
                                .addComponent(ConseptoTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ConseptoTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ConseptoTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(24, 24, 24)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(PrecioTF0, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PrecioTF1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PrecioTF2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(PrecioTF3, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Nfactura)
                                .addComponent(Nombre)
                                .addComponent(jLabel1)
                                .addComponent(jLabel4)
                                .addComponent(jLabel2))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(CalleTF, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(CpTF, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(NfacturaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(24, 24, 24)
                                    .addComponent(BuscarFactura))
                                .addComponent(NombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ApellidosTF)
                                .addComponent(CiudadTF)))
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(184, 184, 184)
                                    .addComponent(MensajeTF, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ErrorTL, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(GuardarTodo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CargarultimaFactura)
                        .addGap(42, 42, 42)
                        .addComponent(Salir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(VerFacturaCompleta)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NfacturaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nfactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BuscarFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ApellidosTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CalleTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(CpTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CiudadTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(24, 24, 24)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConseptoTl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConseptoTF0)
                    .addComponent(PrecioTF0))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConseptoTF1)
                    .addComponent(PrecioTF1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConseptoTF2)
                    .addComponent(PrecioTF2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConseptoTF3)
                    .addComponent(PrecioTF3))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ErrorTL, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MensajeTF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(VerFacturaCompleta)
                    .addComponent(Salir)
                    .addComponent(GuardarTodo)
                    .addComponent(CargarultimaFactura))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void VerFacturaCompletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerFacturaCompletaActionPerformed
Factura dataFactura = new Factura();
        //condiciones de texto en blanco
        //Recojer datos de todos los campos de texto
         if (NfacturaTF.getText().equals("")) {
            NfacturaTF.setBackground(Color.pink);
         }else{
             NfacturaTF.setBackground(Color.WHITE);
             dataFactura.numeroFactura = NfacturaTF.getText();
        }
         
        if (NombreTF.getText().equals("")) {
            NombreTF.setBackground(Color.pink);
         }else{
            NombreTF.setBackground(Color.WHITE);
            dataFactura.nombre = NombreTF.getText();
        }
        
        if (ApellidosTF.getText().equals("")) {
            ApellidosTF.setBackground(Color.pink);
         }else{
             ApellidosTF.setBackground(Color.WHITE);
             dataFactura.apellidos = ApellidosTF.getText();
        }
        
        if (CalleTF.getText().equals("")) {
            CalleTF.setBackground(Color.pink);
         }else{
            CalleTF.setBackground(Color.WHITE);
            dataFactura.calle = CalleTF.getText();
        }
         
        if (CpTF.getText().equals("")) {
            CpTF.setBackground(Color.pink);
         }else{
             CpTF.setBackground(Color.WHITE);
             dataFactura.cP = CpTF.getText();
        }
         
        if (CiudadTF.getText().equals("")) {
            CiudadTF.setBackground(Color.pink);
         }else{
             CiudadTF.setBackground(Color.WHITE);
             dataFactura.ciudad = CiudadTF.getText();
        }
        
         if (ConseptoTF0.getText().equals("")) {
            ConseptoTF0.setBackground(Color.pink);
         }else{
             ConseptoTF0.setBackground(Color.WHITE);
             dataFactura.ciudad = ConseptoTF0.getText();
        }
         if (ConseptoTF1.getText().equals("")) {
            ConseptoTF1.setBackground(Color.pink);
         }else{
             ConseptoTF1.setBackground(Color.WHITE);
             dataFactura.ciudad = ConseptoTF1.getText();
        }
         if (ConseptoTF2.getText().equals("")) {
            ConseptoTF2.setBackground(Color.pink);
         }else{
             ConseptoTF2.setBackground(Color.WHITE);
             dataFactura.ciudad = ConseptoTF2.getText();
        }
        if (ConseptoTF3.getText().equals("")) {
            ConseptoTF3.setBackground(Color.pink);
         }else{
             ConseptoTF3.setBackground(Color.WHITE);
             dataFactura.ciudad = ConseptoTF3.getText();
        }
        
        if (PrecioTF0.getText().equals("")) {
            PrecioTF0.setBackground(Color.pink);
         }else{
             PrecioTF0.setBackground(Color.WHITE);
             dataFactura.ciudad = PrecioTF0.getText();
        }
        
         if (PrecioTF1.getText().equals("")) {
            PrecioTF1.setBackground(Color.pink);
         }else{
             PrecioTF1.setBackground(Color.WHITE);
             dataFactura.ciudad = PrecioTF1.getText();
        }
         
          if (PrecioTF2.getText().equals("")) {
            PrecioTF2.setBackground(Color.pink);
         }else{
             PrecioTF2.setBackground(Color.WHITE);
             dataFactura.ciudad = PrecioTF2.getText();
        }
          
           if (PrecioTF3.getText().equals("")) {
            PrecioTF3.setBackground(Color.pink);
         }else{
             PrecioTF3.setBackground(Color.WHITE);
             dataFactura.ciudad = PrecioTF3.getText();
        }
          if ( CiudadTF.getText().equals("") && CpTF.getText().equals("")
                && CalleTF.getText().equals("") && ApellidosTF.getText().equals("") 
                && NombreTF.getText().equals("") && NfacturaTF.getText().equals("") 
                && ConseptoTF0.getText().equals("") && PrecioTF0.getText().equals("")
                && ConseptoTF1.getText().equals("") && PrecioTF1.getText().equals("")
                && ConseptoTF2.getText().equals("") && PrecioTF2.getText().equals("")
                && ConseptoTF3.getText().equals("") && PrecioTF3.getText().equals("")
            ){
            
             MensajeTF.setText("Rellena Todos los campos de color rosa");
         }else{
             //Abrir una nueva ventana 
        dispose();
        FacturaCompleta NuevaVentana = new FacturaCompleta();
        NuevaVentana.setVisible(true);
        }      
          
            
    }//GEN-LAST:event_VerFacturaCompletaActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_SalirActionPerformed

    private void GuardarTodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarTodoActionPerformed
        
        Factura dataFactura = new Factura();
        //condiciones de texto en blanco
        //Recojer datos de todos los campos de texto
         if (NfacturaTF.getText().equals("")) {
            NfacturaTF.setBackground(Color.pink);
         }else{
             NfacturaTF.setBackground(Color.WHITE);
             dataFactura.numeroFactura = NfacturaTF.getText();
        }
         
        if (NombreTF.getText().equals("")) {
            NombreTF.setBackground(Color.pink);
         }else{
            NombreTF.setBackground(Color.WHITE);
            dataFactura.nombre = NombreTF.getText();
        }
        
        if (ApellidosTF.getText().equals("")) {
            ApellidosTF.setBackground(Color.pink);
         }else{
             ApellidosTF.setBackground(Color.WHITE);
             dataFactura.apellidos = ApellidosTF.getText();
        }
        
        if (CalleTF.getText().equals("")) {
            CalleTF.setBackground(Color.pink);
         }else{
            CalleTF.setBackground(Color.WHITE);
            dataFactura.calle = CalleTF.getText();
        }
         
        if (CpTF.getText().equals("")) {
            CpTF.setBackground(Color.pink);
         }else{
             CpTF.setBackground(Color.WHITE);
             dataFactura.cP = CpTF.getText();
        }
         
        if (CiudadTF.getText().equals("")) {
            CiudadTF.setBackground(Color.pink);
         }else{
             CiudadTF.setBackground(Color.WHITE);
             dataFactura.ciudad = CiudadTF.getText();
        }
        
         if (ConseptoTF0.getText().equals("")) {
            ConseptoTF0.setBackground(Color.pink);
         }else{
             ConseptoTF0.setBackground(Color.WHITE);
             dataFactura.ciudad = ConseptoTF0.getText();
        }
         
         if (ConseptoTF1.getText().equals("")) {
            ConseptoTF1.setBackground(Color.pink);
         }else{
             ConseptoTF1.setBackground(Color.WHITE);
             dataFactura.ciudad = ConseptoTF1.getText();
        }
         if (ConseptoTF2.getText().equals("")) {
            ConseptoTF2.setBackground(Color.pink);
         }else{
             ConseptoTF2.setBackground(Color.WHITE);
             dataFactura.ciudad = ConseptoTF2.getText();
        }
        if (ConseptoTF3.getText().equals("")) {
            ConseptoTF3.setBackground(Color.pink);
         }else{
             ConseptoTF3.setBackground(Color.WHITE);
             dataFactura.ciudad = ConseptoTF3.getText();
        }
        
        if (PrecioTF0.getText().equals("")) {
            PrecioTF0.setBackground(Color.pink);
         }else{
             PrecioTF0.setBackground(Color.WHITE);
             dataFactura.ciudad = PrecioTF0.getText();
        }
        
         if (PrecioTF1.getText().equals("")) {
            PrecioTF1.setBackground(Color.pink);
         }else{
             PrecioTF1.setBackground(Color.WHITE);
             dataFactura.ciudad = PrecioTF1.getText();
        }
         
          if (PrecioTF2.getText().equals("")) {
            PrecioTF2.setBackground(Color.pink);
         }else{
             PrecioTF2.setBackground(Color.WHITE);
             dataFactura.ciudad = PrecioTF2.getText();
        }
          
           if (PrecioTF3.getText().equals("")) {
            PrecioTF3.setBackground(Color.pink);
         }else{
             PrecioTF3.setBackground(Color.WHITE);
             dataFactura.ciudad = PrecioTF3.getText();
        }
        
        if ( CiudadTF.getText().equals("") && CpTF.getText().equals("")
                && CalleTF.getText().equals("") && ApellidosTF.getText().equals("") 
                && NombreTF.getText().equals("") && NfacturaTF.getText().equals("") 
                && ConseptoTF0.getText().equals("") && PrecioTF0.getText().equals("")
            ){
            
             MensajeTF.setText("Rellena Todos los campos de color rosa");
         }else{
             //Guardar todos los datos en un archivo CSV
           Guardar guardar = new Guardar();
            guardar.guardarFactura(dataFactura.getFacturaCSV());
            MensajeTF.setText("");
        }      
    }//GEN-LAST:event_GuardarTodoActionPerformed

    private void BuscarFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarFacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BuscarFacturaActionPerformed

    private void CargarultimaFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CargarultimaFacturaActionPerformed

        
        // TODO add your handling code here:
        
        ArrayList<Factura> miFacturas = LeerArchivo.leerFacturas("todasFacturas.csv");


           for (Factura miFactura : miFacturas) {
               NfacturaTF.setText(miFactura.numeroFactura);
               NombreTF.setText(miFactura.nombre);
               ApellidosTF.setText(miFactura.apellidos);
               CalleTF.setText(miFactura.calle);
               CpTF.setText(miFactura.cP);
               CiudadTF.setText(miFactura.ciudad);
               ConseptoTF0.setText(miFactura.ConseptoTF0);
               ConseptoTF1.setText(miFactura.ConseptoTF1);
               ConseptoTF2.setText(miFactura.ConseptoTF2);
               ConseptoTF3.setText(miFactura.ConseptoTF3);

            } 

    }//GEN-LAST:event_CargarultimaFacturaActionPerformed

    /**
     * @param rgs the command line arguments
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
            java.util.logging.Logger.getLogger(ContabilidadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ContabilidadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ContabilidadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ContabilidadGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ContabilidadGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidosTF;
    private javax.swing.JButton BuscarFactura;
    private javax.swing.JTextField CalleTF;
    private javax.swing.JButton CargarultimaFactura;
    private javax.swing.JTextField CiudadTF;
    private javax.swing.JTextField ConseptoTF0;
    private javax.swing.JTextField ConseptoTF1;
    private javax.swing.JTextField ConseptoTF2;
    private javax.swing.JTextField ConseptoTF3;
    private javax.swing.JLabel ConseptoTl;
    private javax.swing.JTextField CpTF;
    private javax.swing.JLabel ErrorTL;
    private javax.swing.JButton GuardarTodo;
    private javax.swing.JLabel MensajeTF;
    private javax.swing.JLabel Nfactura;
    private javax.swing.JTextField NfacturaTF;
    private javax.swing.JLabel Nombre;
    private javax.swing.JTextField NombreTF;
    private javax.swing.JTextArea ObservacionesTF;
    private javax.swing.JTextField PrecioTF0;
    private javax.swing.JTextField PrecioTF1;
    private javax.swing.JTextField PrecioTF2;
    private javax.swing.JTextField PrecioTF3;
    private javax.swing.JButton Salir;
    private javax.swing.JButton VerFacturaCompleta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
