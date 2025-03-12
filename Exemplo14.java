import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exemplo14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double desconto = 0;

        // Captura o nome do cliente
        String nome = JOptionPane.showInputDialog("Digite o nome do cliente: ");
        
        // Captura o preço do produto
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do produto: R$ "));
        
        // Captura a categoria do produto
        String categoriaInput = JOptionPane.showInputDialog("Digite a categoria do produto: \n A \n B \n C \n D \n E");
        char categoria = categoriaInput.charAt(0);

        // Calcula desconto com base na categoria
        switch (Character.toLowerCase(categoria)) {
            case 'a':
                desconto = 0.10;
                break;
            case 'b':
                desconto = 0.15;
                break;
            case 'c':
                desconto = 0.20;
                break;
            case 'd':
                desconto = 0.25;
                break;
            case 'e':
                desconto = 0.50;
                break;
            default:
                JOptionPane.showMessageDialog(null, "Categoria inválida.");
                sc.close();
                return; // Encerra o programa se a categoria for inválida
        }

        // Calcula o valor do desconto e o preço final
        double valorDesconto = preco * desconto;
        double precoFinal = preco - valorDesconto;

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, "O cliente " + nome + " deverá pagar R$ " + String.format("%.2f", precoFinal) + " pelo produto após o desconto.");

        sc.close();
    }
}