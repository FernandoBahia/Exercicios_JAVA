
import javax.swing.JOptionPane;

public class Exemplo10 {
    public static void main(String[] args) {
        int ano_nasc, idade, ano_atual;
        String nome;


        ano_nasc = Integer.parseInt(JOptionPane.showInputDialog("Informe seu ano de nascimento: "));
        ano_atual = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano atual: "));
        nome =  JOptionPane.showInputDialog("Informe seu nome: ");


       idade = ano_atual - ano_nasc;

        if(ano_nasc < ano_atual){
            JOptionPane.showMessageDialog(null, "Sua idade é: " + idade + " anos " + nome);
        }else{
            if(ano_nasc > ano_atual){
                JOptionPane.showMessageDialog(null, "Erro");
            }
        }
    }
}
