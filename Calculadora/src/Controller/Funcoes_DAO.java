
package Controller;

import static View.Tela_GUI.img_img;
import static View.Tela_GUI.res_txt;
import static View.Tela_GUI.valor1_txt;
import static View.Tela_GUI.valor2_txt;
import java.awt.Color;
import javax.swing.JOptionPane;
import static View.Tela_GUI.img_img2;
import static View.Tela_GUI.img_img3;
import static View.Tela_GUI.img_img4;
import static View.Tela_GUI.img_img5;


public class Funcoes_DAO {
    
    

        public static double valor1 = 0;
        public static double valor2 = 0;
        public static double valor3 = 0;
        
        
        public static void imc(){
            
        img_img2.setVisible(false);
        img_img.setVisible(false);
        img_img3.setVisible(false);
        img_img4.setVisible(false);
        img_img5.setVisible(false);
            
        valor1 = Double.parseDouble(View.Tela_GUI.valor1_txt.getText());   
        valor2 = Double.parseDouble(View.Tela_GUI.valor2_txt.getText());
           
        valor3 = valor1/(valor2*valor2);
         
        res_txt.setText(String.format("%.2f",valor3));
        res_txt.setVisible(true);
        if(valor3>=40){
            img_img.setVisible(true);
            res_txt.setBackground(Color.red);
        }else if(valor3>=30){
            img_img3.setVisible(true);
            res_txt.setBackground(Color.orange);
        }else if(valor3>=25){
            img_img4.setVisible(true);
            res_txt.setBackground(Color.yellow);
        }else if(valor3>=18.6){
            img_img2.setVisible(true);
            res_txt.setBackground(Color.green);
        }else{           
            img_img5.setVisible(true);
            res_txt.setBackground(Color.blue);
        }
    }    
        public static void limpar(){
        valor1_txt.setText(null);
        valor2_txt.setText(null);
        res_txt.setText("");
        res_txt.setBackground(null);
        }
        
      
    
}
