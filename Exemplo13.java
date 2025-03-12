
import javax.swing.JOptionPane;

public class Exemplo13 {
    public static void main(String[] args) {
        
        String nome = "Adalberto";
        String controle;
        controle = JOptionPane.showInputDialog("Informe a profissão do adalberto: " + "\n e - engenheiro \n  p - programador \n m - médico \n a - advogado \n d - designer");
        char controleCHAR = controle.charAt(0);

            switch(controleCHAR){

            case 'e':
            JOptionPane.showMessageDialog(null, nome + " é " + "engenheiro" );
            break;

            case 'p':
            JOptionPane.showMessageDialog(null, nome + " é " + "programador" );
            break;

            case 'm':
            JOptionPane.showMessageDialog(null, nome + " é " + "médico" );
            break;

            case 'a':
            JOptionPane.showMessageDialog(null, nome + " é " + "advogado" );
            break;

            case 'd':
            JOptionPane.showMessageDialog(null, nome + " é " + "designer" );
            break;

            default:
            JOptionPane.showMessageDialog(null, nome + " trabalha com outra coisa!");
            break;
        }
    }
}
