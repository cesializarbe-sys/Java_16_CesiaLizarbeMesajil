package vallegrande.edu.pe.view;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vallegrande.edu.pe.controller.CalculadoraController;

public class CalculadoraView extends JFrame {
    private JTextField txtNumero1, txtNumero2, txtResultado;
    private JButton btnSumar, btnRestar;
    private CalculadoraController controller;

    public CalculadoraView() {
        controller = new CalculadoraController();
        setTitle("Calculadora con JFrame");
        setSize(400, 250);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lbl1 = new JLabel("Número 1:");
        lbl1.setBounds(50, 30, 80, 25);
        add(lbl1);

        txtNumero1 = new JTextField();
        txtNumero1.setBounds(150, 30, 150, 25);
        add(txtNumero1);

        JLabel lbl2 = new JLabel("Número 2:");
        lbl2.setBounds(50, 70, 80, 25);
        add(lbl2);

        txtNumero2 = new JTextField();
        txtNumero2.setBounds(150, 70, 150, 25);
        add(txtNumero2);

        btnSumar = new JButton("Sumar");
        btnSumar.setBounds(50, 110, 100, 30);
        add(btnSumar);

        btnRestar = new JButton("Restar");
        btnRestar.setBounds(200, 110, 100, 30);
        add(btnRestar);

        txtResultado = new JTextField();
        txtResultado.setBounds(150, 160, 150, 25);
        txtResultado.setEditable(false);
        add(txtResultado);

        // Eventos
        btnSumar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtNumero1.getText());
                double num2 = Double.parseDouble(txtNumero2.getText());
                double resultado = controller.sumar(num1, num2);
                txtResultado.setText(String.valueOf(resultado));
            }
        });

        btnRestar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double num1 = Double.parseDouble(txtNumero1.getText());
                double num2 = Double.parseDouble(txtNumero2.getText());
                double resultado = controller.restar(num1, num2);
                txtResultado.setText(String.valueOf(resultado));
            }
        });

        setVisible(true);
    }
}
