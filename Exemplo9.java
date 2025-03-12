
import javax.swing.JOptionPane;

public class Exemplo9 {
    public static void main(String[] args) {
        double sb, vp, lp;

        sb = Double.parseDouble(JOptionPane.showInputDialog("Digite o Salário bruto: "));
        vp = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da prestação: "));

        lp = sb*0.3;

        if(vp <= lp){
            JOptionPane.showMessageDialog(null, "Empréstimo Concedido! ");
        }else{
            JOptionPane.showMessageDialog(null, "NEGADO! ");

        }
    }
}
