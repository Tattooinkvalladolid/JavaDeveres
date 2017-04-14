
public class Factura {

    String numeroFactura ;
    String nombre ;
    String apellidos ;
    String calle ;
    String ciudad ;
    String cP;
    String ConseptoTF0;
    String ConseptoTF1;
    String ConseptoTF2;
    String ConseptoTF3;
    
    String ObservacionesTF;
    
    Double PrecioTF0;
    Double PrecioTF1;
    Double PrecioTF2;
    Double PrecioTF3;

    String getFacturaCSV() {
        String allFactura = numeroFactura +";"+ nombre +";"+ apellidos +";"+ calle +";"+ cP +";"+ ciudad  +";"+ConseptoTF0 +";"+ ConseptoTF1 +";"+ ConseptoTF2 +";"+ ConseptoTF3 + ";"+ PrecioTF0 +";"+PrecioTF0 +";"+ PrecioTF0 +";"+ PrecioTF0 +"\n";
        return allFactura;
    }
    
    
    
}
