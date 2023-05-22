/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aleatgames01;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author CESAR
 */
public class ThreadManageTragaMoneda extends Thread {
        
       Random random;
       String name;
       
       JLabel vectorImages[];
        public ThreadManageTragaMoneda(JLabel VectorImages[] ){
          random = new Random();
           this.vectorImages = VectorImages;
        }
        @Override
	public void run() {
        
          int posicion1 = -1;
          int posicion2 = -1;
          int posicion3 = -1;
          int i = 0;
          while(i<10){
               try {
         
                   
                  
                   posicion1 = random.nextInt(2) + 0;
                   cambiarIcono(0,posicion1);
                   sleep(100);
                   posicion2 = random.nextInt(2) + 0;
                   cambiarIcono(1,posicion2);
                   
                   sleep(100);
                   posicion3 = random.nextInt(2) + 0;
                    cambiarIcono(2,posicion3);
                    sleep(100);
                   i++;
                  
                   
               } catch (InterruptedException ex) {
                   Logger.getLogger(ThreadManageTragaMoneda.class.getName()).log(Level.SEVERE, null, ex);
               }
           }
   

        
	}
        
      
         public void cambiarIcono(int pos1, int pos2){
            
            Icon icono =  vectorImages[pos1].getIcon();
       
            vectorImages[pos1].setIcon(vectorImages[pos2].getIcon());
           
            vectorImages[pos2].setIcon(icono);
           
        }
        
       
	
}
