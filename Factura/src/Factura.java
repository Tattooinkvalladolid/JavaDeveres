
public class Factura {

    String numeroFactura ;
    String nombre ;
    String apellidos ;
    String calle ;
    String ciudad ;
    String cP;
    String conseptoTF0;
    String conseptoTF1;
    String conseptoTF2;
    String conseptoTF3;
    
    String observacionesTF;
    
    String precioTF0;
    String precioTF1;
    String precioTF2;
    String precioTF3;
    
    int proba;

    String getFacturaCSV() {
        String allFactura = numeroFactura +";"+ nombre +";"+ apellidos +";"+ calle +";"+ cP +";"+ ciudad   +";"+ conseptoTF0 +";"+ conseptoTF1 +";"+ conseptoTF2 +";"+ conseptoTF3 + ";"+ precioTF0 +";"+precioTF0 +";"+ precioTF0 +";"+ precioTF0 +"\n";
        return allFactura;
    }
    
    
    
}
