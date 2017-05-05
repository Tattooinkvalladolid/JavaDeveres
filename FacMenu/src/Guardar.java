
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;


public class Guardar   {
   //Guardar los datos en un fichero 
   public static void guardarFactura(String Guardar){
    
        Factura factura = new Factura();
             Writer writer = null;
            
       
        try{  
            writer = new FileWriter(ContabilidadGUI.guardarArchivo);
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

 
