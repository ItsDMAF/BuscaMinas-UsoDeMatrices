
package s7_actividadgrupalmatrices;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.security.SecureRandom;


public class FrameMina {
    
    JFrame frame = new JFrame();
    JPanel menu = new JPanel();
    
    ImageIcon feli = new ImageIcon("src/s7_actividadgrupalmatrices/feli.png");
    ImageIcon moyai = new ImageIcon("src/s7_actividadgrupalmatrices/moyai.png");
    ImageIcon icon = new ImageIcon("src/s7_actividadgrupalmatrices/mina.png");
    JButton bt_reinicio = new JButton("Reiniciar");
    JButton bt_salir = new JButton("Salir");
    JLabel lb_puntaje = new JLabel("Puntaje");
    JLabel img_estado_feli = new JLabel();
    JLabel img_estado_moyai = new JLabel();
    JLabel lb_cont_puntaje = new JLabel();
    
    JLabel lb_vida = new JLabel("Vidas");
    JLabel lb_cont_vida = new JLabel();
    
    //matriz de los botones
    JButton[][] botones = new JButton[5][5];
    //matriz de los valores de botones
    
    static SecureRandom aleat = new SecureRandom();
    
    
    int puntaje;
    int vida;
    
    FrameMina(){
        
        
        frame.setTitle("Busca Minas");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(601,890);
        frame.setLayout(new BorderLayout());
        frame.setResizable(false);
        frame.setIconImage(icon.getImage());
       
       
       //Personilzar Bnnaer superior
        bt_reinicio.setBackground(Color.gray);
        bt_reinicio.setBounds(450, 25, 100, 40);
        bt_reinicio.setFocusable(false);
        
        
        bt_salir.setBackground(Color.gray);
        bt_salir.setBounds(450, 75, 100, 40);
        bt_salir.setFocusable(false);
        
        lb_puntaje.setBounds(30, 20, 90, 20);
        lb_puntaje.setBackground(Color.yellow);
        lb_puntaje.setFont(new Font("Arial", Font.BOLD, 20));
        
        lb_cont_puntaje.setText(String.valueOf(puntaje));
        lb_cont_puntaje.setBounds(55, 48, 90, 20);
        lb_cont_puntaje.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 20));
        
        lb_vida.setBounds(30, 100, 90, 20);
        lb_vida.setBackground(Color.yellow);
        lb_vida.setFont(new Font("Arial", Font.BOLD, 20));
        
        lb_cont_vida.setText(String.valueOf(vida));
        lb_cont_vida.setBounds(110, 100, 90, 20);
        lb_cont_vida.setFont(new Font("Comic Sans MS", Font.CENTER_BASELINE, 20));
        
        img_estado_feli.setIcon(feli);
        img_estado_feli.setBounds(250, 35, 90, 100);
        
        img_estado_moyai.setIcon(moyai);
        img_estado_moyai.setBounds(250, 35, 90, 100);
        img_estado_moyai.setVisible(false);
        
        
        
        
        
        
        JPanel tablero = new JPanel();
        
        menu.setBackground(new Color(189, 189, 189));
        menu.setLayout(null);
        menu.setPreferredSize(new Dimension(600,150));
        menu.add(bt_reinicio);
        menu.add(bt_salir);
        menu.add(lb_puntaje);
        menu.add(lb_cont_puntaje);
        menu.add(lb_vida);
        menu.add(lb_cont_vida);
        menu.add(img_estado_feli);
        menu.add(img_estado_moyai);
        
        //Banner de la matriz

        tablero.setPreferredSize(new Dimension(601,610));
        tablero.setLayout(null);
        tablero.setBackground(Color.blue);
        for (int i = 0; i < botones.length; i++) {
            
            for (int j = 0; j < botones[0].length; j++) {
                
                botones[i][j] = new JButton();
                botones[i][j].setBackground(Color.gray);
                botones[i][j].setBounds(120*j, 120*i, 120, 130);
                botones[i][j].setPreferredSize(new Dimension(120,130));
                botones[i][j].setFocusable(false);
                botones[i][j].setBorder(BorderFactory.createLineBorder(Color.lightGray, 2, false));
                botones[i][j].setRolloverEnabled(false);
                
                tablero.add(botones[i][j]);
            }
        }
        
        
        frame.add(menu, BorderLayout.NORTH);
        frame.add(tablero, BorderLayout.SOUTH);
        
        
        
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        
        
        
    }
    
    
    public int[][] agregar_Valor_BTs(int[][] matriz){
        int[][] temp = new int[matriz.length][matriz[0].length];
        
        int cont_uno = 0;
        
        int[][] minas=new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                minas[i][j]=0+aleat.nextInt(2);
            }
        }
        
        
        
        return temp;
    }
    
    
    
}

//fin de la clase
