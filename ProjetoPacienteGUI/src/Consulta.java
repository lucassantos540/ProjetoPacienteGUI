import javax.swing.JOptionPane;

public class Consulta {
   
    public String nome;
    public String sexo;
    public int idade;
    public double VLConsulta;
    
    public double CalcularPromoção(){
        
        if (this.idade >= 50) {
            double promocao = VLConsulta * 0.5;
            double valorComDesconto = VLConsulta - promocao;
            JOptionPane.showMessageDialog(null, "Com o desconto de 50%, o valor total é: " + valorComDesconto);
            return valorComDesconto;
        } else {
            JOptionPane.showMessageDialog(null, "Não há desconto, pois não tem 50 anos!");
            JOptionPane.showMessageDialog(null, "O valor total é: " + VLConsulta);
            return VLConsulta;
        }
    }
    
}
