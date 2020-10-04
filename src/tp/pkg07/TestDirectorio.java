
package tp.pkg07;

public class TestDirectorio {

    
    public static void main(String[] args) {
        Directorio guia = new Directorio();
        
        guia.agregarCliente(2661, new Cliente(29,"Giannelli","Ariel","San Luis","carlosgardel"));
        guia.agregarCliente(2662, new Cliente(29,"Aguero","Kun","San Luis","carlosgardel"));
        guia.agregarCliente(2663, new Cliente(23,"Sosa","Javier","Merlo","carlosgardel"));
        guia.agregarCliente(2664, new Cliente(23,"Costa","Alejandro","San Luis","carlosgardel"));
        guia.agregarCliente(2665, new Cliente(21,"Fruks","Roxana","San Luis","carlosgardel"));
        guia.agregarCliente(2666, new Cliente(23,"Godoy","Ariel","Merlo","carlosgardel"));
        guia.agregarCliente(2667, new Cliente(23,"Sosa","Ana","Merlo","carlosgardel"));
        guia.agregarCliente(2668, new Cliente(23,"Messi","Leo","San Luis","carlosgardel"));
        guia.agregarCliente(2669, new Cliente(21,"Saez","Ariel","Merlo","carlosgardel"));
        guia.agregarCliente(2670, new Cliente(27,"Sosa","Lucas","San Luis","carlosgardel"));
             
        guia.buscarCliente(2665);
            
        guia.buscarClientes("Merlo");
        
        guia.borrarCliente(23);
    
        guia.buscarTelefono("Sosa");

    }    
}
