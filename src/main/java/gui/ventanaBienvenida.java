package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventanaBienvenida extends JFrame {
    private JButton ingresaAquiButton;
    private JPanel menuBienvenida;


    public ventanaBienvenida(String title) {

        super(title);

        setBounds(100, 100, 450, 300);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(menuBienvenida);
        this.pack();


        ingresaAquiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                RegistroEstudiante frame2 = new RegistroEstudiante("Registro Estudiante");
                frame2.setVisible(true);
                dispose();
            }
        });
    }



    public static void main(String[] args) {
        JFrame frame = new ventanaBienvenida("Bienvenida");
        frame.setVisible(true);
    }
}