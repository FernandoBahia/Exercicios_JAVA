
import javax.swing.JOptionPane;

public class Exemplo11 {
    public static void main (String [] args){
      int idade;

      idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade: "));

      if(idade >= 15 && idade <= 25){
         JOptionPane.showMessageDialog(null, "ACEITA");
      }else{
            JOptionPane.showMessageDialog(null, "NÃO ACEITA");
        }
      }
    }

