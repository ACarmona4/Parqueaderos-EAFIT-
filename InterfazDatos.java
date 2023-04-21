package EAFITp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class InterfazDatos extends JPanel implements ActionListener {
    private JButton reportar_boton;
    private JLabel sistema_label;
    private JLabel eafit_label;
    private JButton ppal_boton;
    private JButton datos_boton;
    private JButton novedades_boton;
    private JLabel datos_titulo;
    private JLabel datos_label;
    private JLabel horallegada_label;
    private JLabel dias_label;
    private JTextField diaMas_textf;
    private JTextField mayor_textf;
    private JTextField menor_textf;
    private JTextField diaMenos_textf;

    public InterfazDatos() {
        //construct components
        reportar_boton = new JButton ("REPORTAR");
        sistema_label = new JLabel ("Sistema parqueaderos");
        eafit_label = new JLabel ("EAFIT");
        ppal_boton = new JButton ("PRINCIPAL");
        datos_boton = new JButton ("DATOS");
        novedades_boton = new JButton ("NOVEDADES");
        datos_titulo = new JLabel ("DATOS");
        datos_label = new JLabel ("Conozca los detalles del flujo vehicular en los parqueaderos de la universidad:");
        horallegada_label = new JLabel ("Flujo vehicular por horas:");
        dias_label = new JLabel ("Informacion por dia:");
        diaMas_textf = new JTextField (5);
        mayor_textf = new JTextField (5);
        menor_textf = new JTextField (5);
        diaMenos_textf = new JTextField (5);

        //set components properties
        datos_boton.setEnabled (false);
        datos_titulo.setEnabled (false);
        diaMas_textf.setEnabled (false);
        mayor_textf.setEnabled (false);
        menor_textf.setEnabled (false);
        diaMenos_textf.setEnabled (false);

        //adjust size and set layout
        setPreferredSize (new Dimension (809, 434));
        setLayout (null);

        //add components
        add (reportar_boton);
        reportar_boton.addActionListener(this);
        add (sistema_label);
        add (eafit_label);
        add (ppal_boton);
        ppal_boton.addActionListener(this);
        add (datos_boton);
        add (novedades_boton);
        novedades_boton.addActionListener(this);
        add (datos_titulo);
        add (datos_label);
        add (horallegada_label);
        add (dias_label);
        add (diaMas_textf);
        add (mayor_textf);
        add (menor_textf);
        add (diaMenos_textf);

        //set component bounds (only needed by Absolute Positioning)
        reportar_boton.setBounds (145, 350, 130, 50);
        sistema_label.setBounds (5, 355, 135, 25);
        eafit_label.setBounds (50, 375, 100, 25);
        ppal_boton.setBounds (290, 350, 130, 50);
        datos_boton.setBounds (430, 350, 130, 50);
        novedades_boton.setBounds (570, 350, 130, 50);
        datos_titulo.setBounds (10, 5, 115, 30);
        datos_label.setBounds (10, 30, 470, 15);
        horallegada_label.setBounds (10, 65, 190, 20);
        dias_label.setBounds (10, 170, 190, 20);
        diaMas_textf.setBounds (10, 200, 240, 25);
        mayor_textf.setBounds (10, 90, 190, 25);
        menor_textf.setBounds (10, 120, 190, 25);
        diaMenos_textf.setBounds (10, 230, 240, 25);
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == reportar_boton){
            Procesamiento.verReportes();
        }
        if (e.getSource() == ppal_boton){
            Procesamiento.verPrincipal();
        }
        if (e.getSource() == novedades_boton){
            Procesamiento.verNovedades();
        }
    }
}
