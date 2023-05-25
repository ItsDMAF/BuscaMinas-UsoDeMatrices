
package s7_actividadgrupalmatrices;
/*
Integrantes
Kelvin Melgar
Emanuel Flores
Diego Andino
Gerardo Cano

*/



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class S7_ActividadGrupalMatrices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Inicio el juego de busca Minas
        //BuscaMina bm = new BuscaMina();
        //bm.imprimir_Valor();
        
        Acciones accion = new Acciones();
        ImageIcon icon_menu = new ImageIcon("src/s7_actividadgrupalmatrices/menu.png");
        
        
        JFrame frame = new JFrame();
        frame.setTitle("Proyecto Grupal Matrices y GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,890);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setIconImage(icon_menu.getImage());
        
        
        
        JPanel banner = new JPanel();
        banner.setBackground(new Color(189, 189, 189));
        banner.setLayout(null);
        banner.setPreferredSize(new Dimension(600,200));
        
        JPanel opciones = new JPanel();
        opciones.setBackground(Color.BLACK);
        opciones.setLayout(new FlowLayout(FlowLayout.CENTER, 40, 40));
        opciones.setPreferredSize(new Dimension(600,150));
        
        //definimos los botones
        JButton[] botones = new JButton[13];
        
        for (int i = 0; i < botones.length; i++) {
            
            botones[i] = new JButton();
            botones[i].setBackground(Color.gray);
            botones[i].setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 20));
            botones[i].setFocusable(false);
            botones[i].setPreferredSize(new Dimension(300,50));
            
            switch(i){
                
                case 1:
                    botones[i].setText("Imprimir una Matriz");
                    botones[i].addActionListener(accion.ejercicio1);
                    break;
                case 2:
                    botones[i].setText("Sumar dos Matrices");
                    botones[i].addActionListener(accion.ejercicio2);
                    break;
                    
                case 3:
                    botones[i].setText("Sumar Elementos Matriz");
                    botones[i].addActionListener(accion.ejercicio3);
                    break;
                case 4:
                    botones[i].setText("Numero Mayor Matriz");
                    botones[i].addActionListener(accion.ejercicio4);
                    break;
                    
                case 5:
                    botones[i].setText("Suma en Diagonal");
                    botones[i].addActionListener(accion.ejercicio5);
                    break;
                case 6:
                    botones[i].setText("Suma Diagona Alreves");
                    botones[i].addActionListener(accion.ejercicio6);
                    break;
                    
                case 7:
                    botones[i].setText("Suma de Triangulos");
                    botones[i].addActionListener(accion.ejercicio7);
                    break;
                case 8:
                    botones[i].setText("Suma Fila");
                    botones[i].addActionListener(accion.ejercicio8);
                    break;
                    
                case 9:
                    botones[i].setText("Suma Columnas");
                    botones[i].addActionListener(accion.ejercicio9);
                    break;
                case 10:
                    botones[i].setText("Ceros Alrededor");
                    botones[i].addActionListener(accion.ejercicio10);
                    break;
                    
                case 11:
                    botones[i].setText("Ordenar Matriz");
                    botones[i].addActionListener(accion.ejercicio11);
                    break;
                case 12:
                    botones[i].setText("Multiplicar Matriz");
                    botones[i].addActionListener(accion.ejercicio12);
                    break;
                
                case 0:
                    botones[i].setText("!! Busca Minas !!");
                    botones[i].addActionListener(accion.buscaMina);
                    botones[i].setBackground(new Color(183, 170, 170));
                    break;
                    
                
            }
            
            opciones.add(botones[i]);
            
        }
        
        
        //etiquetas
        JLabel titulo = new JLabel();
        titulo.setText("Proyecto Grupal Matrices-GUI");
        titulo.setFont(new Font("Digital-7 Mono", Font.CENTER_BASELINE , 50));
        titulo.setBounds(60, 0, 900, 100);
        
        JLabel[] nom = new JLabel[4];
        
        
        String[] integ = {"Kelvin Melgar", "Diego Andino", "Emanuel Flores", "Gerardo Cano"};
        
        for (int i = 0; i < 4; i++) {
            nom[i] = new JLabel();
            nom[i].setText(integ[i]);
            nom[i].setBounds((i*3)*60 + 80, 50, 200, 100);
            nom[i].setFont(new Font("Digital-7 Mono", Font.ITALIC , 20));
            banner.add(nom[i]);
        }
        
        
        
        
        
        
        banner.add(titulo);
        
        
        frame.add(banner, BorderLayout.NORTH);
        frame.add(opciones, BorderLayout.CENTER);
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
    }
    
}
