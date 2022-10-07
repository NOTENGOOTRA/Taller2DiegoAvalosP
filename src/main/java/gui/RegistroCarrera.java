package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroCarrera extends JFrame {
    private JTextField TextonombreCarrera;
    private JTextField TextocodigoCarrera;
    private JTextField TextocantidadSemestres;
    private JLabel nombreCarrera;
    private JLabel codigoCarrera;
    private JLabel cantidadSemestresCarrera;
    private JPanel RegistroCarrera;
    private JButton volverButton;
    private JButton siguienteButton;
    private JButton guardarButton;


    public RegistroCarrera(String title) {

        super(title);

        setBounds(100, 100, 450, 300);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(RegistroCarrera);
        this.pack();


        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        siguienteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                BusquedaEstudiante frame4 = new BusquedaEstudiante("Búsqueda Estudiante");
                frame4.setVisible(true);
                dispose();
            }
        });
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroEstudiante frame2 = new RegistroEstudiante("Registro Estudiane");
                frame2.setVisible(true);
                dispose();

            }
        });
    }

    public static void main(String[] args) {

        JFrame frame3 = new RegistroCarrera("Registro Carrera");
        frame3.setVisible(true);
    }
}