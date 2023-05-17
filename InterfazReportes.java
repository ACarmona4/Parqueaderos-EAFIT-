package EAFITp;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class InterfazReportes extends JPanel implements ActionListener {
    private JButton reportar_boton;
    private JLabel sistema_label;
    private JLabel eafit_label;
    private JButton ppal_boton;
    private JButton datos_boton;
    private JButton novedades_boton;
    private JLabel r_titulo;
    private JLabel errores1_label;
    private JLabel errores2_label;
    private JTextField rLink_text;

    public InterfazReportes() {
        //construct components
        reportar_boton = new JButton ("REPORTAR");
        sistema_label = new JLabel ("Sistema parqueaderos");
        eafit_label = new JLabel ("EAFIT");
        ppal_boton = new JButton ("PRINCIPAL");
        datos_boton = new JButton ("DATOS");
        novedades_boton = new JButton ("NOVEDADES");
        r_titulo = new JLabel ("REPORTAR");
        errores1_label = new JLabel ("Agradecemos que desee informar errores para mejorar nuestro servicio,");
        errores2_label = new JLabel ("lo invitamos a llenar la siguiente encuesta para poder registrar su inquietud.");
        rLink_text = new JTextField ("https://forms.gle/i5vA4JoR44KZoMDt5");

        //set components properties
        reportar_boton.setEnabled (false);
        r_titulo.setEnabled (false);

        //adjust size and set layout
        setPreferredSize (new Dimension (809, 434));
        setLayout (null);

        //add components
        add (reportar_boton);
        add (sistema_label);
        add (eafit_label);
        add (ppal_boton);
        ppal_boton.addActionListener(this);
        add (datos_boton);
        datos_boton.addActionListener(this);
        add (novedades_boton);
        novedades_boton.addActionListener(this);
        add (r_titulo);
        add (errores1_label);
        add (errores2_label);
        add (rLink_text);
        

        //set component bounds (only needed by Absolute Positioning)
        reportar_boton.setBounds (145, 350, 130, 50);
        sistema_label.setBounds (5, 355, 135, 25);
        eafit_label.setBounds (50, 375, 100, 25);
        ppal_boton.setBounds (290, 350, 130, 50);
        datos_boton.setBounds (430, 350, 130, 50);
        novedades_boton.setBounds (575, 350, 130, 50);
        r_titulo.setBounds (10, 5, 115, 30);
        errores1_label.setBounds (10, 30, 510, 25);
        errores2_label.setBounds (10, 50, 500, 25);
        rLink_text.setBounds (10, 75, 505, 30);

    }

  
    public void actionPerformed(ActionEvent e){
        if (e.getSource() == ppal_boton){
            Procesamiento.verPrincipal();
        }
        if (e.getSource() == datos_boton){
            Procesamiento.verDatos();
        }
        if (e.getSource() == novedades_boton){
            Procesamiento.verNovedades();
        }
    }
}
