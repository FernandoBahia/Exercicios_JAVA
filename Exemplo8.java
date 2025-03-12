
import javax.swing.JOptionPane;

public class Exemplo8 {
    public static void main(String[] args) {
        int num1, num2;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("BOTE AGORA: "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("BOTE AGORA DNV: "));

        if(num1 > num2 ){
            JOptionPane.showMessageDialog(null, "O numero maior é " + num1);
        }else{
            if(num1 == num2){
                JOptionPane.showMessageDialog(null, "O numero maior é " + num1);
            }else{
                JOptionPane.showMessageDialog(null, "O num maior é " + num2);
            }
        }
    }
}
