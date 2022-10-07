package gui;

import javax.swing.*;

public class RegistroCarrera extends JFrame {
    private JTextField TextonombreCarrera;
    private JTextField TextocodigoCarrera;
    private JTextField TextocantidadSemestres;
    private JLabel nombreCarrera;
    private JLabel codigoCarrera;
    private JLabel cantidadSemestresCarrera;
    private JPanel RegistroCarrera;


    public RegistroCarrera(String title) {

        super(title);

        setBounds(100, 100, 450, 300);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(RegistroCarrera);
        this.pack();


    }

    public static void main(String[] args) {

        JFrame frame3 = new RegistroCarrera("Registro Carrera");
        frame3.setVisible(true);
    }
}