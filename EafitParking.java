package EAFITp;

import javax.swing.JFrame;

public class EafitParking {
    public static void main(String[] args){
        JFrame frame = new JFrame ("InterfazParEAFIT");
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add (new InterfazParEAFIT());
        frame.pack();
        frame.setVisible (true);
        
    }
}
