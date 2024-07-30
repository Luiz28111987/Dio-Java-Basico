public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        double salarioMinimo = 2500.33;
        int idade = 35;
        long cpf = 98711100100L; // precisa encerrar com L
        String cpf_1 = "02529766142"; // se começar com zero tem que ser tipo string
        float pi = 3.14F; // precisa encerrar com F

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;

        int numero = 1;

        numero = 2;

        System.out.println(numero);

        // Constantes são variaveis imutaveis e escrita em CAIXA ALTA
        final double VALOR_DE_PI = 3.14;

    }
}
