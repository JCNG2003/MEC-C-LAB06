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
public class ThreadManage extends Thread {
        
        Random random;
        JLabel label;
        
        public ThreadManage(JLabel label){
           random = new Random();
           this.label = label;
        }
        @Override
	public void run() {
           int i=0;
            while(i<10){
               try {
                   int dadoAleatorio = random.nextInt(6) + 1; // Número aleatorio entre 1 y 6
                   
                   Icon icon = new ImageIcon(getClass().getResource("/aleatgames01/resources/dados/dado"+dadoAleatorio+".png"));
                   
                   
                   label.setIcon(icon);
                   sleep(100);
                   i++;
               } catch (InterruptedException ex) {
                   Logger.getLogger(ThreadManage.class.getName()).log(Level.SEVERE, null, ex);
               }
            }
        
	}

	
}
