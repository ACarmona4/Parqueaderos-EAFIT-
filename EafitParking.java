package EAFITp;
import javax.swing.JFrame;

public class EafitParking extends JFrame {

    public static void main(String[] args){
        JFrame opening = new JFrame ("Parqueaderos EAFIT");
        opening.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        opening.getContentPane().add (new InterfazIngreso());
        opening.pack();
        opening.setVisible (true);

    }
}
