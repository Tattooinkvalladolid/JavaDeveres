  JDialog.setDefaultLookAndFeelDecorated(true);
    int response = JOptionPane.showConfirmDialog(Top, "Quieres guardar antes de salir", "Mensaje Importante",
        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
    if (response == JOptionPane.NO_OPTION) {
      
      System.exit(0);
    } else if (response == JOptionPane.YES_OPTION) {
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
        
         if (CiudadTF.getText().equals("")) {
            CiudadTF.setBackground(Color.pink);
            }else{
            CiudadTF.setBackground(Color.WHITE);
            dataFactura.ciudad = CiudadTF.getText();
        }
         
         if (ConseptoTF0.getText().equals("")) {
            ConseptoTF1.setBackground(Color.pink);
            }else{
            ConseptoTF0.setBackground(Color.WHITE);
            dataFactura.conseptoTF0 = ConseptoTF0.getText();
        }
         
         if (ConseptoTF1.getText().equals("")) {
            ConseptoTF1.setBackground(Color.pink);
            }else{
            ConseptoTF1.setBackground(Color.WHITE);
            dataFactura.conseptoTF1 = ConseptoTF1.getText();
        }
         
        if (ConseptoTF2.getText().equals("")) {
            ConseptoTF2.setBackground(Color.pink);
            }else{
            ConseptoTF2.setBackground(Color.WHITE);
            dataFactura.conseptoTF2 = ConseptoTF2.getText();
        }
        
         if (ConseptoTF3.getText().equals("")) {
            ConseptoTF3.setBackground(Color.pink);
            }else{
            ConseptoTF3.setBackground(Color.WHITE);
            dataFactura.conseptoTF3 = ConseptoTF3.getText();
        }
        
        if (PrecioTF0.getText().equals("")) {
            PrecioTF0.setBackground(Color.pink);
            }else{
            PrecioTF0.setBackground(Color.WHITE);
            dataFactura.precioTF0 = PrecioTF0.getText();    
        }
         
        if (PrecioTF1.getText().equals("")) {
            PrecioTF1.setBackground(Color.pink);
            }else{
            PrecioTF1.setBackground(Color.white);
            dataFactura.precioTF1 = PrecioTF1.getText();
        }
        
        if (PrecioTF2.getText().equals("")) {
            PrecioTF2.setBackground(Color.pink);
            }else{
            PrecioTF2.setBackground(Color.white);
            dataFactura.precioTF2 = PrecioTF2.getText();
         }
        
        if (PrecioTF3.getText().equals("")) {
            PrecioTF3.setBackground(Color.pink);
            }else{
            PrecioTF3.setBackground(Color.white);
            dataFactura.precioTF3 = PrecioTF3.getText();
         }
        
        if (ObservacionesTF.getText().equals("")) {
            ObservacionesTF.setBackground(Color.pink);
            }else{
            ObservacionesTF.setBackground(Color.white);
            dataFactura.observacionesTF = ObservacionesTF.getText();
            }
        //Condicion para poder guardar. Campos obligatorios.
        if ( CiudadTF.getText().equals("") && CpTF.getText().equals("")
                && CalleTF.getText().equals("") && ApellidosTF.getText().equals("") 
                && NombreTF.getText().equals("") && NfacturaTF.getText().equals("") 
                && ConseptoTF0.getText().equals("") && PrecioTF1.getText().equals("")
            ){
            
             MensajeTF.setText("Rellena Todos los campos de color rosa");
            }else{
             //Guardar todos los datos en un archivo CSV
            Guardar guardar = new Guardar();
            guardar.guardarFactura(dataFactura.getFacturaCSV());
            MensajeTF.setText("");
        } 
    } else if (response == JOptionPane.CANCEL_OPTION) {
      System.out.println("boton Cansel");
    } else if (response == JOptionPane.CLOSED_OPTION) {
      System.out.println("boton x"); 
        }
        
