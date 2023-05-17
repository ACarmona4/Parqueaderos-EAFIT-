package EAFITp;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class InterfazIngreso extends JPanel implements ActionListener{
    public static JButton ingreso_boton;
    private JLabel jcomp2;
    private JTextField ingresousuario;
    private JTextField ingresopassword;
    public static JButton ingresoinvitado;
    private JLabel jcomp6;
    private JLabel jcomp7;

    public InterfazIngreso() {
        //construct components
        ingreso_boton = new JButton ("INGRESAR");
        jcomp2 = new JLabel ("BIENVENIDO A PARQUEADEROS EAFIT");
        ingresousuario = new JTextField (5);
        ingresopassword = new JTextField (5);
        ingresoinvitado = new JButton ("INGRESAR COMO INVITADO");
        jcomp6 = new JLabel ("Correo:");
        jcomp7 = new JLabel ("Contraseña:");

        //adjust size and set layout
        setPreferredSize (new Dimension (809, 434));
        setLayout (null);

        //add components
        add (ingreso_boton);
        ingreso_boton.addActionListener(this);
        add (jcomp2);
        add (ingresousuario);
        add (ingresopassword);
        add (ingresoinvitado);
        ingresoinvitado.addActionListener(this);
        add (jcomp6);
        add (jcomp7);

        //set component bounds (only needed by Absolute Positioning)
        ingreso_boton.setBounds (305, 240, 100, 20);
        jcomp2.setBounds (260, 15, 235, 35);
        ingresousuario.setBounds (205, 125, 305, 35);
        ingresopassword.setBounds (270, 195, 170, 25);
        ingresoinvitado.setBounds (245, 325, 215, 30);
        jcomp6.setBounds (330, 100, 150, 25);
        jcomp7.setBounds (330, 170, 125, 30);

    }
    

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ingreso_boton){
            Persistencia.guardarUsuario(ingresousuario.getText());
            Procesamiento.crearInterfaces();
            Procesamiento.verPrincipal();
        }

        if (e.getSource() == ingresoinvitado){

        this.setVisible(false);
        Procesamiento.crearInterfaces();
        Procesamiento.verPrincipal();
        }
    }

}
