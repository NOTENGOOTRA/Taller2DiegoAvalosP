package gui;

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


    public RegistroEstudiante(String title) {

        super(title);

        setBounds(100, 100, 450, 300);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(RegistroEstudiante);
        this.pack();

        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre, rut, numero, carrera;
                nombre = textoNombre.getText().toString();
                rut = textoRut.getText().toString();
                numero = textoNumero.getText().toString();
                carrera = ListaCarrera.getActionCommand().toString();

                if (nombre.equals("") && rut.equals("") && numero.equals("") && carrera.equals("") )
                    JOptionPane.showMessageDialog(null, "Insertar datos en todos los campos porfavor");
                else{
                    JOptionPane.showMessageDialog(null, "Datos agregados");
                }

                dispose();
            }
        });
    }
    public static void main(String[] args) {
        JFrame frame2 = new RegistroEstudiante("Registro Estudiante");
        frame2.setVisible(true);
    }

}
