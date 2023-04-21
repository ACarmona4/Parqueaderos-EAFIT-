package EAFITp;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
public class Persistencia {
    
    public static void guardarHoras(String horaIngreso, String parqueadero){
        File f = new File("Movimientos Parqueadro.txt");
        FileWriter writer = null;
        PrintWriter pw = null;
        
        // File creation
        if (!f.exists()) {
            try{
                f.createNewFile();
            }catch(IOException exception){
                System.err.println("Error creando el archivo");
            }
        }
        try{
            writer = new FileWriter("Movimientos Parqueadro.txt",true);
            pw = new PrintWriter(writer);
            pw.println("Ingreso registrado a las: "+horaIngreso+" en "+parqueadero+"\n");
        }catch(IOException exception){
                System.err.println("Error abriendo el archivo");
        }finally {
           try {
               //Closing the file
           if (null != writer)
              writer.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }

    public static void guardarUsuario(String eMail){
        File f = new File("Registro Usuarios.txt");
        FileWriter writer = null;
        PrintWriter pw = null;
        
        // File creation
        if (!f.exists()) {
            try{
                f.createNewFile();
            }catch(IOException exception){
                System.err.println("Error creando el archivo");
            }
        }
        try{
            writer = new FileWriter("Registro Usuarios.txt",true);
            pw = new PrintWriter(writer);
            pw.println("Usuario: "+eMail+" Se ha registrado en la aplicación"+"\n");
        }catch(IOException exception){
                System.err.println("Error abriendo el archivo");
        }finally {
           try {
               //Closing the file
           if (null != writer)
              writer.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }
  
}


