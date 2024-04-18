
package paquete1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArchivosDeTexto {
    File archivo;
    
    public void crearArchivo(){
    archivo=new File("prueba.txt"); //ojo
       try {
           if(archivo.createNewFile()){
        System.out.println("El archivo se creó exitosamente");
           }
           } catch (IOException ex) {
            System.err.println("El archivo no se creo");
        }
    }
    
    public void leerTexto(){
        String cadena;
        try {
            FileReader lector=new FileReader(archivo); //objeto para dar lectura
            BufferedReader lectura=new BufferedReader(lector); //vamos a usar metodos de lectur(BufferedReader).
            cadena=lectura.readLine(); //leyendo la primera linea.
            while(cadena!=null){ //mientras no hayamos llegado al final del archivo 
            System.out.println(cadena);//seguimos imprimiendo la adena que encuentre
            cadena=lectura.readLine();//y seguimos con las siguientes líneas de nuestro archivo.
            }
            
        }catch (FileNotFoundException ex) {
            System.err.println("Error, "+ex);
        }catch (IOException ex) {
            System.err.println("Error, "+ex);          
        }
    }
  
    
    public static void main(String[] args) {
        ArchivosDeTexto archivo=new ArchivosDeTexto();
        archivo.crearArchivo();//cree un archivo en blanco, luego escribí, pero no a través de Java
        archivo.leerTexto();//leyendo lo que se escribió en el archivo.
    }

}
