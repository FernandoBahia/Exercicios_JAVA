import javax.swing.JOptionPane;

public class Exemplo5 {
   public static void main(String[] args) {
      String controle;
      controle = JOptionPane.showInputDialog("Você concorda com os termos? (s/n)");
      char controleCHAR = controle.charAt(0);

      switch(controleCHAR){
        case's':
        JOptionPane.showMessageDialog(null, "Sim");
        break;

        case'n':
        JOptionPane.showMessageDialog(null, "Não");
        break;
        
        default:
        JOptionPane.showMessageDialog(null, "Opção invalida");
        break;
    }
   } 
}
