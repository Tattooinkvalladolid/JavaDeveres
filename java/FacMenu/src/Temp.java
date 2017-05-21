
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Temp {
 public static void guardarFactura(String Guardar){
    
        Factura factura = new Factura();
             Writer writer = null;
            
       
        try{  
            writer = new FileWriter("Temp.CSV");
            writer.write(Guardar);
       
            }catch(IOException e){ 
                System.err.println("Error en guardar "+e);
                } finally {
              try {
                 writer.close();
               } catch (IOException ex) {
                 //do something with e... log, perhaps rethrow etc.
                 System.err.println("Error en guardar en el disco "+ex);
                 
            }     
            }
        } 
}
