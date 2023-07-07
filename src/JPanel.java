import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class JPanel extends Container {
    private JPanel Panel;
    private JButton Guardar;
    private JTextField NompreP;
    private JTextField CedulaP;
    private JTextField EdadP;
    private JButton Cargar;
    private JLabel Nombre;
    private JLabel Cedula;
    private JLabel Edad;

    public JPanel() {
    String filePath="datos.dat";
    MiClase miObjeto=new MiClase("Juan",42);
    Cargar.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        }
    });
        Guardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

    }
    public static void main(String[] args) {
        JFrame Panel = new JFrame("JPanel");
        Panel.setContentPane(new JPanel().Panel);
        Panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Panel.pack();
        Panel.setVisible(true);
    }}