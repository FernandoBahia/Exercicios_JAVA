
import javax.swing.JOptionPane;

public class Exemplo6 {
 public static void main(String[] args) {
     int num1, num2, resultado;

    num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));
     num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro numero: "));

     resultado = (num1 + num2);

     if (resultado > 10 ){
        JOptionPane.showMessageDialog(null, resultado);
     }else{

     }

 }
}
