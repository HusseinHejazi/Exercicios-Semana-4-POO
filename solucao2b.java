import javax.swing.*;
public class solucao2b{
   public static void main(String[] args){
      int valor;
      int numero = 0;
	      do{
             valor = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero: "));
		if (valor > 100 && valor < 200){
      numero = numero + 1;
      }
	}
	while (valor != 0);
   	JOptionPane.showMessageDialog(null, "Foram digitados a quantiadade de: " + numero);
         System.exit(0);
}
}
      