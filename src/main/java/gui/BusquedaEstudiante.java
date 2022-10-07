package gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BusquedaEstudiante extends JFrame {
    private JPanel BusquedaEstudiante;
    private JTextField textoNombBusqueda;
    private JComboBox carrerasBusqueda;
    private JLabel carreraBusqueda;
    private JLabel nombreEstBusqueda;
    private JButton cerrarButton;

    public BusquedaEstudiante(String title) {

        super(title);

        setBounds(100, 100, 450, 300);


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(BusquedaEstudiante);
        this.pack();
        cerrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });
    }
}
