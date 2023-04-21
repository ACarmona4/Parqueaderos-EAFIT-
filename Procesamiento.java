package EAFITp;
import java.time.DayOfWeek;
import java.time.LocalDate;
import javax.swing.JFrame;

public class Procesamiento {
    // Definir variables de instancia
    
    static LocalDate today = LocalDate.now();
    static DayOfWeek dayOfWeek = today.getDayOfWeek();

    static JFrame ppal = new JFrame();
    static JFrame reportar = new JFrame();
    static JFrame datos = new JFrame();
    static JFrame novedades = new JFrame();

    //Registrar ingresos y salidas
    
    public static int registrarIngreso(int capacidad, int limite){
        if (capacidad == limite){
            capacidad = limite;
        } else {
            capacidad += 1;
        }

        return capacidad;
    }

public static int registrarSalida(int capacidad, int limite){
    if (capacidad == limite){
        capacidad = limite;
    } else {
        capacidad -= 1; 
    }

    return capacidad;
}
    
    //---------------------------------------------------
    //Pico y placa

    public static boolean verificarPicoPlaca (int digito){
    
        if(dayOfWeek.toString().equals("MONDAY") && (digito==6 || digito==9)){
            return true;
    
        }else if(dayOfWeek.toString().equals("TUESDAY") && (digito==5 || digito==7)){
            return true;
    
        }else if(dayOfWeek.toString().equals("WEDNESDAY") && (digito==1 || digito==4)){
            return true;
    
        }else if(dayOfWeek.toString().equals("THURSDAY") && (digito==8 || digito==0)){
            return true;
    
        }else if(dayOfWeek.toString().equals("FRIDAY") && (digito==2 || digito==3)){
            return true;
    
        }else {
            return false;
        }
    }
    // -------------------------------------------
    //Traducir dia
    
      public static void traducirDia(){

        if (dayOfWeek == DayOfWeek.MONDAY){
             InterfazPrincipal.dia_label.setText(" Hoy es lunes ");
        }
        if (dayOfWeek == DayOfWeek.TUESDAY){
             InterfazPrincipal.dia_label.setText(" Hoy es martes");
        }
        if (dayOfWeek == DayOfWeek.WEDNESDAY){
            InterfazPrincipal.dia_label.setText(" Hoy es miércoles ");
        }
        if (dayOfWeek == DayOfWeek.THURSDAY){
             InterfazPrincipal.dia_label.setText(" Hoy es jueves ");
        }
        if (dayOfWeek == DayOfWeek.FRIDAY){
            InterfazPrincipal.dia_label.setText(" Hoy es viernes ");
        }
        if (dayOfWeek == DayOfWeek.SATURDAY){
            InterfazPrincipal.dia_label.setText(" Hoy es sábado ");
        }
        if (dayOfWeek == DayOfWeek.SUNDAY){
            InterfazPrincipal.dia_label.setText(" Hoy es domingo ");
        }
    }
    //-------------------------------------
    //Obtener hora

    //-------------------------------------
    //Recomendar parqueadero
    public static String recomendarParqueadero(int ing, int ppal, int idiomas){
        String variable = "   Principal";

        if ((ing > ppal) && (ing>idiomas)){
            variable = "   Ingenieros";
        }
        if ((ppal > ing) && (ppal>idiomas)){
            variable = "   Principal";
        }
        if ((idiomas > ing) && (idiomas>ppal)){
            variable = "   Idiomas";
        }

        if ((ing == ppal) && (ppal > idiomas)){
            variable = "   Ppal o Ing";
        }

        if ((ing == idiomas) && (idiomas > ppal)){
            variable = "   Ing o Idiomas";
        }

        if ((ppal == idiomas) && (idiomas > ing)){
            variable = "   Ppal o Idiomas";
        }

        if ((ppal == idiomas) && (idiomas == ing)){
            variable = "   Cualquiera";
        }
        return variable;
    }
    //----------------------------------------
    //Crear interfaz y mostrarla
    public static void crearInterfaces(){
        novedades.getContentPane().add (new InterfazNovedades());
        ppal.getContentPane().add (new InterfazPrincipal());
        reportar.getContentPane().add (new InterfazReportes());
        datos.getContentPane().add (new InterfazDatos());
    }
    public static void verReportes(){
        reportar.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        reportar.pack();
        reportar.setVisible(true);
    }
    public static void verPrincipal(){
        ppal.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        ppal.pack();
        ppal.setVisible(true);
    }
    public static void verNovedades(){
        novedades.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        novedades.pack();
        novedades.setVisible(true);
    }
    public static void verDatos(){
        datos.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        datos.pack();
        datos.setVisible(true);
    }
}