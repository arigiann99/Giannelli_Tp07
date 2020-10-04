package tp.pkg07;

import java.util.*;

public class Directorio {
    
    private TreeMap<Long, Cliente> listaClientes = new TreeMap<>();
    
    public void agregarCliente(long t, Cliente c){
        Cliente cliente = listaClientes.put(t, c);
        if (cliente != null)
            System.out.println("No se pudo agregar cliente, verifique nuevamente");
    }
    
    public void buscarCliente(long t){
        Set<Long> claves = listaClientes.keySet();
        for(long i:claves){
            if(i==t)
                System.out.println(listaClientes.get(i).getApellido()+" "+listaClientes.get(i).getNombre());            
        }
    }
    
    public void buscarTelefono(String apellido){
        Set<Long> claves = listaClientes.keySet();
        for(long i:claves){
           if(listaClientes.get(i).getApellido().equals(apellido))    
                 System.out.println(i);
        } 
    }
       
    public void buscarClientes (String ciudad){
        Set<Long> claves = listaClientes.keySet();
        for(long i:claves){
           if(listaClientes.get(i).getCiudad().equals(ciudad))    
                 System.out.println(listaClientes.get(i).getApellido()+" "+listaClientes.get(i).getNombre());
        } 
    }
    
    public void borrarCliente(long dni){
        Set<Long> claves = listaClientes.keySet();
        Iterator<Long> i= claves.iterator();
        long clave = -1;
        while(i.hasNext()){
            clave=i.next();
            if(listaClientes.get(clave).getDni()==dni){
                i.remove();
            }
        } 
    }
    
}
