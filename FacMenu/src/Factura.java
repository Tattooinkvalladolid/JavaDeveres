
public class Factura {

  public  String numeroFactura ="0" ;
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
    
    String precioTF0="0,0";
    String precioTF1="0,0";
    String precioTF2="0,0";
    String precioTF3="0,0";
    
    int proba;

    String getFacturaCSV() {
        String allFactura = numeroFactura +";"+ nombre +";"+ apellidos +";"+ calle +";"+ cP +";"+ ciudad   +";"+ conseptoTF0 +";"+ conseptoTF1 +";"+ conseptoTF2 +";"+ conseptoTF3 + ";"+ precioTF0 + ";"+ precioTF1  +";"+ precioTF2 +";"+ precioTF3 + ";" + observacionesTF+"\n";
        return allFactura;
    }
    
    
    
}
