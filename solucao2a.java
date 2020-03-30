import javax.swing.*;
public class solucao2a{
   public static void main(String[] args){
     int i;
     int s1 = 0;
     int s2 = 0;
     
     do{
         i = Integer.parseInt (JOptionPane.showInputDialog("Digite um numero: "));
         
         if(i >= 0){
            s1 = s1 + 1;
            s2 = s2 + i;
         }
         i++;
         }while(i > 0);
         int n = s2 / s1;
         JOptionPane.showMessageDialog(null,"O resulta e: " + n);
         
         System.exit(0);
         }
         }