package EAFITp;
import java.awt.*;
import java.awt.event.*;
import java.time.DayOfWeek;
import java.time.LocalDate;
import javax.swing.*;
import javax.swing.event.*;

class InterfazParEAFIT extends JPanel implements ActionListener{
    // DEFINIR CAPACIDADES TOTALES (PARAMETROS GLOBALES)
    int capacidad_ing = 178;
    int capacidad_ppal = 423;
    int capacidad_idiomas = 191;

    int tope_ing = 178;
    int tope_ppal = 423;
    int tope_idiomas = 191;
    //--------------------------------

    private JLabel dia_label;
    private JTextField ing_capacidad;
    private JLabel celdas_label;
    private JLabel recom_label;
    private JTextField recom_capacidad;
    private JLabel especiales_label;
    private JTextField movr_capacidad;
    private JTextField bajae_capacidad;
    private JLabel movr_label;
    private JLabel bajae_label;
    private JButton ppal_boton;
    private JButton datos_boton;
    private JButton novedades_boton;
    private JButton reportar_boton;
    private JLabel sistema_label;
    private JLabel eafit_label;
    private JTextField placa_entrada;
    private JLabel placa_label;
    private JTextField placa_boolean;
    private JTextField ppal_capacidad;
    private JTextField idiomas_capacidad;
    private JLabel jcomp21;
    private JLabel jcomp22;
    private JLabel jcomp23;
    private JButton menos_ing;
    private JButton mas_ing;
    private JButton menos_ppal;
    private JButton mas_ppal;
    private JButton menos_idiomas;
    private JButton mas_idiomas;
    private LocalDate today;
    private DayOfWeek dayOfWeek;
    
    public InterfazParEAFIT() {


        //construct components
        dia_label = new JLabel ("Hoy es:");
        ing_capacidad = new JTextField (5);
        celdas_label = new JLabel ("CELDAS DISPONIBLES ");
        recom_label = new JLabel ("Te recomendamos ir a ");
        recom_capacidad = new JTextField (5);
        especiales_label = new JLabel ("Parqueaderos Especiales");
        movr_capacidad = new JTextField (5);
        bajae_capacidad = new JTextField (5);
        movr_label = new JLabel ("Mov. Reducida");
        bajae_label = new JLabel ("Baja Emisión");
        ppal_boton = new JButton ("PRINCIPAL");
        datos_boton = new JButton ("DATOS");
        novedades_boton = new JButton ("NOVEDADES");
        reportar_boton = new JButton ("REPORTAR");
        sistema_label = new JLabel ("Sistema parqueaderos");
        eafit_label = new JLabel ("EAFIT");
        placa_entrada = new JTextField (5);
        placa_label = new JLabel ("Entre ultimo digito de placa:");
        placa_boolean = new JTextField (5);
        ppal_capacidad = new JTextField (5);
        idiomas_capacidad = new JTextField (5);
        jcomp21 = new JLabel ("Ingenieria");
        jcomp22 = new JLabel ("Principal");
        jcomp23 = new JLabel ("Idiomas");
        menos_ing = new JButton ("-");
        mas_ing = new JButton ("+");
        menos_ppal = new JButton ("-");
        mas_ppal = new JButton ("+");
        menos_idiomas = new JButton ("-");
        mas_idiomas = new JButton ("+");

        //set components properties
        ing_capacidad.setEnabled (false);
        recom_capacidad.setEnabled (false);
        movr_capacidad.setEnabled (false);
        bajae_capacidad.setEnabled (false);
        placa_boolean.setEnabled (false);
        ppal_capacidad.setEnabled (false);
        idiomas_capacidad.setEnabled (false);

        //adjust size and set layout
        setPreferredSize (new Dimension (809, 434));
        setLayout (null);

        //add components
        add (dia_label);
        add (ing_capacidad);
        add (celdas_label);
        add (recom_label);
        add (recom_capacidad);
        add (especiales_label);
        add (movr_capacidad);
        add (bajae_capacidad);
        add (movr_label);
        add (bajae_label);

        add (ppal_boton);
        ppal_boton.addActionListener(this);
        add (datos_boton);
        datos_boton.addActionListener(this);
        add (novedades_boton);
        novedades_boton.addActionListener(this);
        add (reportar_boton);
        reportar_boton.addActionListener(this);

        add (sistema_label);
        add (eafit_label);

        add (placa_entrada);
        placa_entrada.addActionListener(this);
        add (placa_label);
        add (placa_boolean);

        add (ing_capacidad);
        add (ppal_capacidad);
        add (idiomas_capacidad);
        add (jcomp21);
        add (jcomp22);
        add (jcomp23);

        add (menos_ing);
        menos_ing.addActionListener(this);
        add (mas_ing);
        mas_ing.addActionListener(this);
        add (menos_ppal);
        menos_ppal.addActionListener(this);
        add (mas_ppal);
        mas_ppal.addActionListener(this);
        add (menos_idiomas);
        menos_idiomas.addActionListener(this);
        add (mas_idiomas);
        mas_idiomas.addActionListener(this);

        //set component bounds (only needed by Absolute Positioning)
        dia_label.setBounds (0, 0, 170, 25);
        ing_capacidad.setBounds (155, 50, 85, 50);
        celdas_label.setBounds (300, 10, 140, 30);
        recom_label.setBounds (225, 210, 185, 35);
        recom_capacidad.setBounds (360, 215, 120, 25);
        especiales_label.setBounds (580, 160, 155, 25);
        movr_capacidad.setBounds (565, 185, 75, 55);
        bajae_capacidad.setBounds (670, 185, 75, 55);
        movr_label.setBounds (560, 235, 100, 25);
        bajae_label.setBounds (670, 235, 100, 25);
        ppal_boton.setBounds (315, 375, 110, 45);
        datos_boton.setBounds (495, 375, 110, 45);
        novedades_boton.setBounds (635, 375, 110, 45);
        reportar_boton.setBounds (135, 375, 110, 45);
        sistema_label.setBounds (0, 380, 130, 25);
        eafit_label.setBounds (45, 400, 100, 25);
        placa_entrada.setBounds (85, 185, 40, 25);
        placa_label.setBounds (15, 165, 190, 20);
        placa_boolean.setBounds (35, 215, 140, 30);
        ppal_capacidad.setBounds (325, 50, 85, 50);
        idiomas_capacidad.setBounds (495, 50, 85, 50);
        jcomp21.setBounds (165, 95, 65, 25);
        jcomp22.setBounds (340, 95, 75, 20);
        jcomp23.setBounds (520, 95, 70, 20);
        menos_ing.setBounds (140, 115, 45, 30);
        mas_ing.setBounds (200, 115, 45, 30);
        menos_ppal.setBounds (315, 115, 45, 30);
        mas_ppal.setBounds (375, 115, 45, 30);
        menos_idiomas.setBounds (485, 115, 45, 30);
        mas_idiomas.setBounds (545, 115, 45, 30);
        
        // Datos iniciales
        ing_capacidad.setText("178");
        ppal_capacidad.setText("423");
        idiomas_capacidad.setText("191");
        bajae_capacidad.setText("      08");
        movr_capacidad.setText("      16");

        // GET DIA
        today = LocalDate.now();
        dayOfWeek = today.getDayOfWeek();

        // TRADUCIR DIA
        if (dayOfWeek == DayOfWeek.MONDAY){
            dia_label.setText(" Hoy es Lunes ");
        }
        if (dayOfWeek == DayOfWeek.TUESDAY){
            dia_label.setText(" Hoy es Martes ");
        }
        if (dayOfWeek == DayOfWeek.WEDNESDAY){
            dia_label.setText(" Hoy es Miercoles ");
        }
        if (dayOfWeek == DayOfWeek.THURSDAY){
            dia_label.setText(" Hoy es Jueves ");
        }
        if (dayOfWeek == DayOfWeek.FRIDAY){
            dia_label.setText(" Hoy es Viernes ");
        }
        if (dayOfWeek == DayOfWeek.SATURDAY){
            dia_label.setText(" Hoy es Sabado ");
        }
        if (dayOfWeek == DayOfWeek.SUNDAY){
            dia_label.setText(" Hoy es Domingo ");
        }

        recom_capacidad.setText("  Principal");
    }
 

 // ACTION PERFORMED ---------------------------------------

    // REGISTRAR INGRESO Y SALIDA
    public void actionPerformed(ActionEvent e){  
        if(e.getSource() == menos_ing && capacidad_ing == 0){
            capacidad_ing = capacidad_ing;
        } else if(e.getSource() == menos_ing){
            capacidad_ing -= 1;
            ing_capacidad.setText(Integer.toString(capacidad_ing));
            }

        if(e.getSource() == mas_ing && capacidad_ing == 178){
            capacidad_ing = capacidad_ing;
        } else if(e.getSource() == mas_ing){
            capacidad_ing += 1;
              ing_capacidad.setText(Integer.toString(capacidad_ing));
          }

          if(e.getSource() == menos_ppal && capacidad_ppal == 0){
            capacidad_ppal = capacidad_ppal;
        } else if(e.getSource() == menos_ppal){
           capacidad_ppal -= 1;
           ppal_capacidad.setText(Integer.toString(capacidad_ppal));
        }

        if(e.getSource() == mas_ppal && capacidad_ppal == 423){
            capacidad_ppal = capacidad_ppal;
        } else if(e.getSource() == mas_ppal){
            capacidad_ppal += 1;
            ppal_capacidad.setText(Integer.toString(capacidad_ppal));
        }

        if(e.getSource() == menos_idiomas && capacidad_idiomas == 0){
            capacidad_idiomas = capacidad_idiomas;
        } else if(e.getSource() == menos_idiomas){
            capacidad_idiomas -= 1;
            idiomas_capacidad.setText(Integer.toString(capacidad_idiomas));
        }

        if(e.getSource() == mas_idiomas && capacidad_idiomas == 191){
            capacidad_idiomas = capacidad_idiomas;
        } else if(e.getSource() == mas_idiomas){
            capacidad_idiomas += 1;
            idiomas_capacidad.setText(Integer.toString(capacidad_idiomas));
        }

        // RECOMENDACION PARQUEADERO
        if ((e.getSource() == mas_idiomas) || (e.getSource() == menos_idiomas) || (e.getSource() == mas_ppal) || (e.getSource()==menos_ppal) || (e.getSource()==mas_ing) || (e.getSource()==mas_ing) ){
            if ((capacidad_ppal > capacidad_ing) && (capacidad_ppal > capacidad_idiomas)){
                recom_capacidad.setText("  Principal");
            } else if ((capacidad_ing > capacidad_ppal) && (capacidad_ing > capacidad_idiomas)){
                recom_capacidad.setText("  Ingenieros");
            } else if ((capacidad_idiomas>capacidad_ppal)&&(capacidad_idiomas>capacidad_ing)){
                recom_capacidad.setText("  Idiomas");
            } 
            
            // Si hay dos o tres iguales
            if ((capacidad_ppal == capacidad_idiomas) && (capacidad_ppal>capacidad_ing)){
                recom_capacidad.setText("  Ppal o Idiomas");
            }
            if ((capacidad_ppal == capacidad_ing) && (capacidad_ppal>capacidad_idiomas)){
                recom_capacidad.setText("  Ppal o Ing");
            }
            if ((capacidad_idiomas == capacidad_ing) && (capacidad_idiomas>capacidad_ppal)){
                recom_capacidad.setText("  Idiomas o Ing");
            }
            if ((capacidad_idiomas == capacidad_ing) && (capacidad_ing==capacidad_ppal)){
                recom_capacidad.setText("   Cualquiera");
            }
        }
        
        // PICO Y PLACA
        if(e.getSource() == placa_entrada){
            int digito = Integer.parseInt(placa_entrada.getText());
            System.out.println(placa_entrada.getText());
            if(dayOfWeek.toString().equals("MONDAY") && (digito==6 || digito==9))
                placa_boolean.setText("SI PICO Y PLACA");
            else if(dayOfWeek.toString().equals("TUESDAY") && (digito==5 || digito==7))
                placa_boolean.setText("SI PICO Y PLACA");
            else if(dayOfWeek.toString().equals("WEDNESDAY") && (digito==1 || digito==4))
                placa_boolean.setText("SI PICO Y PLACA");
            else if(dayOfWeek.toString().equals("THURSDAY") && (digito==8 || digito==10))
                placa_boolean.setText("SI PICO Y PLACA");
            else if(dayOfWeek.toString().equals("FRIDAY") && (digito==2 || digito==3))
                placa_boolean.setText("SI PICO Y PLACA");
            else
                placa_boolean.setText("NO PICO Y PLACA");
            }


        } 
     
}





