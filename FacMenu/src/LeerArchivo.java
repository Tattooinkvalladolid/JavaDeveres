
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

class LeerArchivo{
static ArrayList<Factura> leerFacturas(String fString){

        BufferedReader br = null;
        ArrayList<Factura> arrayFacturas = new ArrayList();

        try{

            br = new BufferedReader(new FileReader(fString));

            String line = null;
                while ((line = br.readLine()) != null) {
                    //System.out.println(line);

                    Factura miFactura = new Factura();

                    String facturaEnlinea = line;
                    String[] facturasPorPartes = facturaEnlinea.split(";");

                    miFactura.numeroFactura = facturasPorPartes[0];
                    miFactura.nombre = facturasPorPartes[1];
                    miFactura.apellidos = facturasPorPartes[2];
                    miFactura.calle = facturasPorPartes[3];
                    miFactura.cP = facturasPorPartes[4];
                    miFactura.ciudad = facturasPorPartes[5];
                    miFactura.conseptoTF0 = facturasPorPartes[6];
                    miFactura.conseptoTF1 = facturasPorPartes[7];
                    miFactura.conseptoTF2 = facturasPorPartes[8];
                    miFactura.conseptoTF3 = facturasPorPartes[9];
                    miFactura.conseptoTF3 = facturasPorPartes[9];
                    miFactura.precioTF0 = facturasPorPartes[10];
                    miFactura.precioTF1 = facturasPorPartes[11];
                    miFactura.precioTF2 = facturasPorPartes[12];
                    miFactura.precioTF3 = facturasPorPartes[13];
                    miFactura.observacionesTF = facturasPorPartes[14];

                    arrayFacturas.add(miFactura);
                }

        }catch(IOException e){
                //do something with e... log, perhaps rethrow etc.
        } finally {
            try {
                br.close();
                } catch (IOException ex) {
                 //do something with e... log, perhaps rethrow etc.
            }
        }

        return arrayFacturas;

    }




    


}