package com.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class InterfazGrafica extends JFrame {
    private BaseDeDatos bd;

    public InterfazGrafica(BaseDeDatos bd) {
        this.bd = bd;

        setTitle("My SoulMate - Recomendador de Carreras");
        setSize(550, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        Color fondo = new Color(25, 25, 25);
        Color texto = new Color(230, 230, 230);

        JPanel panel = new JPanel();
        panel.setBackground(fondo);
        panel.setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel titulo = new JLabel("Sistema de Recomendación de Carreras");
        titulo.setFont(new Font("Dialog", Font.BOLD, 18));
        titulo.setForeground(texto);

        JTextField nombre = new JTextField(15);
        JTextField id = new JTextField(15);
        JTextField intereses = new JTextField(15);
        JTextField materias = new JTextField(15);

        JButton agregarUsuario = new JButton("Agregar Usuario");
        JButton recomendar = new JButton("Recomendar Carreras");

        JButton[] botones = {agregarUsuario, recomendar};
        for (JButton b : botones) {
            b.setBackground(Color.WHITE);
            b.setForeground(Color.BLACK);
            b.setFocusPainted(false);
        }

        JLabel[] etiquetas = {
            new JLabel("Nombre:"),
            new JLabel("ID:"),
            new JLabel("Intereses:"),
            new JLabel("Materias favoritas:")
        };
        JTextField[] campos = {nombre, id, intereses, materias};
        for (JLabel l : etiquetas) {
            l.setForeground(texto);
            l.setFont(new Font("Dialog", Font.PLAIN, 14));
        }
        for (JTextField f : campos) {
            f.setBackground(new Color(40, 40, 40));
            f.setForeground(texto);
            f.setCaretColor(texto);
            f.setFont(new Font("Dialog", Font.PLAIN, 13));
            f.setBorder(BorderFactory.createLineBorder(Color.GRAY));
        }

        gbc.insets = new Insets(10, 10, 10, 10);
        gbc.gridx = 0; gbc.gridy = 0; gbc.gridwidth = 2;
        panel.add(titulo, gbc);

        gbc.gridwidth = 1;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.gridy = 1; gbc.gridx = 0; panel.add(etiquetas[0], gbc);
        gbc.gridx = 1; panel.add(nombre, gbc);

        gbc.gridy = 2; gbc.gridx = 0; panel.add(etiquetas[1], gbc);
        gbc.gridx = 1; panel.add(id, gbc);

        gbc.gridy = 3; gbc.gridx = 0; panel.add(etiquetas[2], gbc);
        gbc.gridx = 1; panel.add(intereses, gbc);

        gbc.gridy = 4; gbc.gridx = 0; panel.add(etiquetas[3], gbc);
        gbc.gridx = 1; panel.add(materias, gbc);

        gbc.gridy = 5; gbc.gridx = 0;
        panel.add(agregarUsuario, gbc);
        gbc.gridx = 1;
        panel.add(recomendar, gbc);

        add(panel);

        agregarUsuario.addActionListener(e -> {
            Usuario u = new Usuario(nombre.getText(), id.getText(), intereses.getText(), materias.getText());
            bd.insertarUsuario(u);
            JOptionPane.showMessageDialog(this, "Usuario agregado correctamente :D");
        });

        recomendar.addActionListener(e -> {
            Usuario u = new Usuario(nombre.getText(), id.getText(), intereses.getText(), materias.getText());
            Recomendador r = new Recomendador(bd);
            r.recomendarCarreras(u);
        });
    }
}