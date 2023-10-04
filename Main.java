import javax.swing.JOptionPane;
 
public class Main {
    public static void main(String[] args){
        String classeCarro= JOptionPane.showInputDialog("Digite a classe do carro (esportivo, esportivado, aspirado)");
        String marcaCarro= JOptionPane.showInputDialog("Digite a marca do carro (primeira letra maiúscula)");
        String anoCarro= JOptionPane.showInputDialog("Digite o ano do carro");
        String nomeCarro= JOptionPane.showInputDialog("Digite o nome do carro");
        String nomeMotor= JOptionPane.showInputDialog("Digite o nome do motor do carro");
    }
}
