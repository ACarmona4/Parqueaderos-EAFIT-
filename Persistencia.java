package EAFITp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;
import java.util.*;
public class Persistencia {
    
    //-----------------------------------------
    //Registrar las horas de ingreso
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

    //-----------------------------------------
    //Registrar los usuarios
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
            pw.println("Usuario: "+eMail+" se ha registrado en la aplicación"+"\n");
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

    //-----------------------------------------
    //Leer hora
    public static ArrayList<String> leerFichero() {
        ArrayList<String> horas = new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
           archivo = new File("Análisis Movimientos.txt");
           fr = new FileReader(archivo);
           br = new BufferedReader(fr);

           String linea;
           while((linea = br.readLine()) != null){
              horas.add(linea); // Agrega la línea al ArrayList
           }
        } catch(Exception e) {
           e.printStackTrace();
        } finally {
           try {
              if (fr != null) {
                 fr.close();
              }
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        
        return horas; // Devuelve el ArrayList con las líneas del archivo
     }

       //-----------------------------------------
    //Leer hora
    public static ArrayList<String> leerFichero2() {
        ArrayList<String> dias = new ArrayList<>();
        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;

        try {
           archivo = new File("Análisis Movimientos Dias.txt");
           fr = new FileReader(archivo);
           br = new BufferedReader(fr);

           String linea;
           while((linea = br.readLine()) != null){
              dias.add(linea); // Agrega la línea al ArrayList
           }
        } catch(Exception e) {
           e.printStackTrace();
        } finally {
           try {
              if (fr != null) {
                 fr.close();
              }
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
        
        return dias; // Devuelve el ArrayList con las líneas del archivo
     }

    //-----------------------------------------
    //Leer solo las horas (HH)
    public static void guardarHoraAnalisis(String horaIngreso){
        File f = new File("Análisis Movimientos.txt");
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
            writer = new FileWriter("Análisis Movimientos.txt",true);
            pw = new PrintWriter(writer);
            pw.println(horaIngreso+"\n");
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

    //-----------------------------------------
    //Leer dia
    public static void guardarDia(String dia){
        File f = new File("Análisis Movimientos.txt");
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
            writer = new FileWriter("Análisis Movimientos Dias.txt",true);
            pw = new PrintWriter(writer);
            pw.println(dia+"\n");
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


