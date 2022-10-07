package gui;

import model.Estudiante;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistroEstudiante extends JFrame {
    private JTextField textoNombre;
    private JTextField textoRut;
    private JTextField textoNumero;
    private JComboBox ListaCarrera;

    private JPanel RegistroEstudiante;
    private JButton guardarButton;
    private JLabel nombre;
    private JLabel rut;
    private JLabel numero;
    private JLabel carrera;
    private JButton siguenteButton;
    private JButton volverButton;


    public RegistroEstudiante(String title) {

        super(title);

        setBounds(100, 100, 450, 300);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(RegistroEstudiante);
        this.pack();


        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Estudiante estudianteAdd = new Estudiante();
                estudianteAdd.setNombre( textoNombre.getText() );
                estudianteAdd.setRut( textoRut.getText() );
                estudianteAdd.setNumeroMatricula(Integer.parseInt(textoNumero.getText()));
                estudianteAdd.setCarrera(ListaCarrera.getActionCommand());

                    JOptionPane.showMessageDialog(null, "Datos agregados");

                dispose();
            }
        });
        siguenteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroCarrera frame3 = new RegistroCarrera("Registro Carrera");
                frame3.setVisible(true);
                dispose();
            }
        });
        volverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ventanaBienvenida frame = new ventanaBienvenida("Bienvenida");
                frame.setVisible(true);
                dispose();
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame2 = new RegistroEstudiante("Registro Estudiante");
        frame2.setVisible(true);
    }

}
