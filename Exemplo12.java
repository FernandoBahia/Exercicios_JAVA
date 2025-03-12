
import javax.swing.JOptionPane;

public class Exemplo12 {
    public static void main(String[] args) {
        int controle; 
        int resultado, num1 , num2 ;


        num1 = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Insira outro numero: "));

        controle = Integer.parseInt(JOptionPane.showInputDialog("Qual operação você quer executar?" + "\n 1 - adição \n 2 - subtração \n 3 - multiplicação \n 4 - divisão"));

        switch(controle){

            case 1: 
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;

            case 2: 
            resultado = num1 - num2;
            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;

            case 3: 
            resultado = num1 * num2;
            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;

            case 4: 
            resultado = num1 % num2;
            JOptionPane.showMessageDialog(null, "O resultado é: " + resultado);
            break;
        }
    }
}
