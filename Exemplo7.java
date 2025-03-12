
import javax.swing.JOptionPane;

public class Exemplo7 {
    public static void main(String[] args) {
        int num1;

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Põe um número ae: "));
    
        if(num1 % 2 == 0){
          JOptionPane.showMessageDialog(null, num1);
        }else{
            if(num1 % 2 != 0){
                JOptionPane.showMessageDialog(null, num1);

            }
        }
    }
}

//nessa o pai foi genio