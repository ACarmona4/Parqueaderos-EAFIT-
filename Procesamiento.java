package EAFITp;
import java.time.DayOfWeek;
import java.time.LocalDate;
import javax.swing.JFrame;
import java.util.*;

public class Procesamiento {
    //variables de instancia
    static LocalDate today = LocalDate.now();
    static DayOfWeek dayOfWeek = today.getDayOfWeek();

    static JFrame ppal = new JFrame();
    static JFrame reportar = new JFrame();
    static JFrame datos = new JFrame();
    static JFrame novedades = new JFrame();

    //--------------------------------------------------
    //Registrar ingresos y salidas
    public static int registrarSalida(int capacidad, int limite){
        if (capacidad == limite){
            capacidad = limite;
        } else {
            capacidad += 1;
        }

        return capacidad;
    }

public static int registrarIngreso(int capacidad, int limite){
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

    //----------------------------------------
    //Analiza las horas con más flujo
    public static String analizarDatosMayor(ArrayList<String> lineas) {
        int[] conteo = new int[24]; 
        int mayorValor = 0;
        int mayorPosicion = 0;

        // Incrementa el conteo en la posición correspondiente para cada valor en el ArrayList
        for (String valor : lineas) {
            if (!valor.isEmpty()) { 
                int posicion = Integer.parseInt(valor);
                conteo[posicion]++;
            }
        
    
        
        // Encuentra la posición con el mayor valor en el arreglo de conteos
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > mayorValor) {
                mayorValor = conteo[i];
                mayorPosicion = i;
            }
        }
    }
    return Integer.toString(mayorPosicion);

  }

    //----------------------------------------
    //Analiza las horas con menos flujo
    public static String analizarDatosMenor(ArrayList<String> lineas) {
        int[] conteo = new int[24]; 
        int menorValor = 0;
        int menorPosicion = 0;

        // Incrementa el conteo en la posición correspondiente para cada valor en el ArrayList
        for (String valor : lineas) {
            if (!valor.isEmpty()) { 
                int posicion = Integer.parseInt(valor);
                conteo[posicion]++;
            }
        

        
        // Encuentra la posición con el menor valor en el arreglo de conteos
        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] < menorValor) {
                menorValor = conteo[i];
                menorPosicion = i;
            }
        }
    }
    return Integer.toString(menorPosicion);

    }

    //----------------------------------------
    //Analiza el dia con mas flujo
    public static String analizarDiaMas(ArrayList<String> dias){
        int[] conteo = new int[7];

        for (int i = 0; i<dias.size(); i++) {

            if (dayOfWeek.toString().equals("MONDAY")) {
                conteo[0]++;
            } else if (dayOfWeek.toString().equals("TUESDAY")) {
                conteo[1]++;
            } else if (dayOfWeek.toString().equals("WEDNESDAY")) {
                conteo[2]++;
            } else if (dayOfWeek.toString().equals("THURSDAY")) {
                conteo[3]++;
            } else if (dayOfWeek.toString().equals("FRIDAY")) {
                conteo[4]++;
            } else if (dayOfWeek.toString().equals("SATURDAY")){
                conteo[5]++;
            } else if (dayOfWeek.toString().equals("SUNDAY")) {
                conteo[6]++;
            }
        }
        int mayorValor = 0;
        int mayorPosicion = 0;

        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] > mayorValor) {
                mayorValor = conteo[i];
                mayorPosicion = i;
            }
        }

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        return diasSemana[mayorPosicion];

    }

    //----------------------------------------
    //Analiza el dia con mas flujo
    public static String analizarDiaMenos(ArrayList<String> dias){
        int[] conteo = new int[7];

        for (int i = 0; i<dias.size(); i++) {

            if (dayOfWeek.toString().equals("MONDAY")) {
                conteo[0]++;
            } else if (dayOfWeek.toString().equals("TUESDAY")) {
                conteo[1]++;
            } else if (dayOfWeek.toString().equals("WEDNESDAY")) {
                conteo[2]++;
            } else if (dayOfWeek.toString().equals("THURSDAY")) {
                conteo[3]++;
            } else if (dayOfWeek.toString().equals("FRIDAY")) {
                conteo[4]++;
            } else if (dayOfWeek.toString().equals("SATURDAY")){
                conteo[5]++;
            } else if (dayOfWeek.toString().equals("SUNDAY")) {
                conteo[6]++;
            }
        }

        int mayorValor = 0;
        int mayorPosicion = 0;

        for (int i = 0; i < conteo.length; i++) {
            if (conteo[i] < mayorValor) {
                mayorValor = conteo[i];
                mayorPosicion = i;
            }
        }

        String[] diasSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
        return diasSemana[mayorPosicion];

    }
}