package EAFITp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class InterfazNovedades extends JPanel implements ActionListener {
    private JButton reportar_boton;
    private JLabel sistema_label;
    private JLabel eafit_label;
    private JButton ppal_boton;
    private JButton datos_boton;
    private JButton jcomp6;
    private JLabel novedades_titulo;
    private JLabel novTitulo_label;
    private JTextArea novedades_textf;

    public InterfazNovedades() {
        //construct components
        reportar_boton = new JButton ("REPORTAR");
        sistema_label = new JLabel ("Sistema parqueaderos");
        eafit_label = new JLabel ("EAFIT");
        ppal_boton = new JButton ("PRINCIPAL");
        datos_boton = new JButton ("DATOS");
        jcomp6 = new JButton ("NOVEDADES");
        novedades_titulo = new JLabel ("NOVEDADES");
        novTitulo_label = new JLabel ("Entérate de las novedades para hoy!");
        novedades_textf = new JTextArea (5, 5);

        //set components properties
        jcomp6.setEnabled (false);
        novedades_titulo.setEnabled (false);
        novedades_textf.setEnabled (false);

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
        datos_boton.addActionListener(this);
        add (jcomp6);
        add (novedades_titulo);
        add (novTitulo_label);
        add (novedades_textf);

        //set component bounds (only needed by Absolute Positioning)
        reportar_boton.setBounds (145, 350, 130, 50);
        sistema_label.setBounds (5, 355, 140, 25);
        eafit_label.setBounds (50, 375, 100, 25);
        ppal_boton.setBounds (290, 350, 130, 50);
        datos_boton.setBounds (430, 350, 130, 50);
        jcomp6.setBounds (570, 350, 130, 50);
        novedades_titulo.setBounds (10, 5, 115, 30);
        novTitulo_label.setBounds (10, 30, 225, 20);
        novedades_textf.setBounds (10, 55, 690, 280);

        novedades_textf.setText("Para el día de hoy, nuestros parqueaderos se encuentran funcionando con total normalidad.");
        
    }

    public void actionPerformed(ActionEvent e){
        if (e.getSource() == reportar_boton){
            Procesamiento.verReportes();
        }
        if (e.getSource() == datos_boton){
            Procesamiento.verDatos();
        }
        if (e.getSource() == ppal_boton){
            Procesamiento.verPrincipal();
        }
    }
}
