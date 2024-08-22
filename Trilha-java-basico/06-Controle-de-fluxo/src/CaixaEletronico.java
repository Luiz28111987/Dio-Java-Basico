public class CaixaEletronico {
    public static void main(String[] args) throws Exception {

        double saldo = 25.0;
        double valorSolicitado = 20.0;

        if(valorSolicitado < saldo){
            // Quando tiver mais de uma execução no bloco tem que ser colocado entre chaves {}
            saldo = saldo - valorSolicitado;
            System.out.println("Seu saldo e de " + saldo);

        }else
            System.out.println("Saldo insuficiente");

        

    }
}
