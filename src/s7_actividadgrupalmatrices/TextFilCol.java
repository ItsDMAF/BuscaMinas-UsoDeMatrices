/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package s7_actividadgrupalmatrices;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author kelvi
 */
public class TextFilCol extends JTextField implements ActionListener {
 
     JTextField tf1,tf2;
    JButton b1;
    JLabel label = new JLabel("Filas");
    JLabel label2 = new JLabel("Columnas");
    
    String cadena = "";
    
    JFrame f;
    
    TextFilCol(){
        f= new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Filas Y Columnas");
        f.setLayout(null);
        tf1=new JTextField();
        tf1.setBounds(80,50,100,20);
        label.setBounds(50, 50, 50, 20);
        
        
        
        tf2=new JTextField();
        tf2.setBounds(80,100,100,20);
        label2.setBounds(20, 100, 90, 20);
        
        b1=new JButton("OK");
        b1.setBounds(80,150,100,25);
        
        b1.addActionListener(this);
        f.add(label);
        f.add(label2);
        f.add(tf1);
        f.add(tf2);
        f.add(b1);
        f.setSize(260,250);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = tf1.getText();
        String s2 = tf2.getText();
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        int c = 0;
        if (e.getSource() == b1) {

            int[][] matris = new int[a][b];

            String cadena = "";

            for (int[] matri : matris) {
                for (int j = 0; j < matris[0].length; j++) {
                    cadena += matri[j] + " ";
                }
            }
            cadena += "\n";
            
            f.setSize(260,500);
            
            JLabel matriz = new JLabel(cadena);
            
            f.add(matriz);
            
            
        }
        
    }
    
 }
