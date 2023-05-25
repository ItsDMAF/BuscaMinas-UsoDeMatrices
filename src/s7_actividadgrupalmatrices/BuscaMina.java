
package s7_actividadgrupalmatrices;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class BuscaMina extends FrameMina implements ActionListener{
    
    
    //matriz de los valores de botones
    private final int[][] botones_valor = new int[5][5];
    int cont_bom= 0;
    
    int opcion_reinicio = 3;
    
    ImageIcon bomb = new ImageIcon("src/s7_actividadgrupalmatrices/bomb.png");
    
    
    BuscaMina(){
        //Variables y matrices usadas en el juego
        puntaje = 0;
        lb_cont_puntaje.setText(String.valueOf(puntaje));
        
        vida = 3;
        lb_cont_vida.setText(String.valueOf(vida));
        
        bt_reinicio.addActionListener(this);
        bt_salir.addActionListener(this);
        
        
        //inicia los valores de los botones;
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if(cont_bom <= 10){
                    this.botones_valor[i][j]=0+aleat.nextInt(2);
                }
                if(this.botones_valor[i][j] == 1)
                    cont_bom++;
            }
        }
        
        //agrega las acciones a los
        for (int i = 0; i < botones.length; i++) {
            
            for (int j = 0; j < botones[0].length; j++) {
                
                botones[i][j].addActionListener(this);
            }
            
        }    
        
        
        
    }// fin del constructo
    
    
    
    
    //acciones de los botones
    public void actionPerformed(ActionEvent e) {

        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[0].length; j++) {
                if (e.getSource() == botones[i][j]) {
                    botones[i][j].setEnabled(false);
                    botones[i][j].setBackground(new Color(102, 102, 102));

                    if (botones_valor[i][j] == 1) {
                        vida--;
                        lb_cont_vida.setText(String.valueOf(vida));
                        
                        botones[i][j].setIcon(bomb);
                        
                        
                    }else{
                        puntaje++;
                        lb_cont_puntaje.setText(String.valueOf(puntaje));
                    }
                    
                    if (vida == 0) {
                        img_estado_moyai.setVisible(true);
                        img_estado_feli.setVisible(false);
                        opcion_reinicio = JOptionPane.showConfirmDialog(frame, "!!!! GAME OVER !!!\nquiere jugar otra vez?",
                                 "Perdio", 0, 0, moyai);
                    }
                    
                    if(opcion_reinicio == 0){
                        reiniciar();
                    }else if (opcion_reinicio == 1 || opcion_reinicio == 2){
                        bt_salir.doClick();
                    }
                    
                    frame.repaint();
                }
            }

        }// acciones de los tableros
        
         if (e.getSource() == bt_reinicio) {
             
            reiniciar();
            
        }//acciones del boton reinicio
         
         
        if (e.getSource() == bt_salir) {
            frame.dispose();
        }// accion del boton salir 
    }
        
    
    

    public void imprimir_Valor(){
        
        for (int i = 0; i < botones_valor.length; i++) {
            
            for (int j = 0; j < botones_valor[0].length; j++) {
                
                System.out.print(botones_valor[i][j] + " ");
                
            }
            
            System.out.println();
        }
    }
    
    public void reiniciar() {
        for (int i = 0; i < botones.length; i++) {
            for (int j = 0; j < botones[0].length; j++) {
                puntaje = 0;
                lb_cont_puntaje.setText(String.valueOf(puntaje));

                vida = 3;
                lb_cont_vida.setText(String.valueOf(vida));
                cont_bom = 0;

                botones[i][j].setEnabled(true);
                botones[i][j].setBackground(Color.gray);
                botones[i][j].setIcon(null);

                img_estado_feli.setVisible(true);
                img_estado_moyai.setVisible(false);
                frame.repaint();
                puntaje = 0;
                lb_cont_puntaje.setText(String.valueOf(puntaje));
                vida = 3;
                lb_cont_vida.setText(String.valueOf(vida));
                opcion_reinicio = 3;

                if (cont_bom <= 6) {
                    this.botones_valor[i][j] = 0 + aleat.nextInt(2);
                }
                if (this.botones_valor[i][j] == 1) {
                    cont_bom++;
                }
                
                

            }

        }
        
        //System.out.println();
       //d imprimir_Valor();
    }

    
}
