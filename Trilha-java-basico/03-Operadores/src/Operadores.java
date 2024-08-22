public class Operadores {
    public static void main(String[] args) throws Exception {
        String meuNome = "Luiz Fernando";
        int idade = 36;
        double peso = 93.6;
        char sexo = 'F';
        boolean doadorSangue = false;
        // Date dataNascimento = new Date();x

        // Aritmeticos
        double soma = 10.5 + 15.7;
        int subtracao = 113 - 25;
        int multiplicao = 20 * 7;
        int divisao = 15 / 3;
        int modulo = 18 % 3;
        double resultado = (10 * 7) + (20 / 4);

        System.out.print(modulo);

        String nomeJunto = " Luiz " + "Fernando";

        System.out.println(nomeJunto);

        // x repetição 
        int numero = 5;

        // numero + 1 incrementar
        System.out.println(numero ++);
        System.out.println(numero);

        // numero - 1 decrementar
        System.out.println(numero --);
        System.out.println(numero);

        // negando valor booleano
        boolean variavel = true;

        System.out.println(!variavel);
        System.out.println(variavel);
        variavel = !variavel;

        System.out.println(variavel);

        int a, b;

        a = 5;
        b = 6;

        String saida = "";
        String ternario = a==b ?"verdadeiro" : "falso";
        if(a==b)
            saida = "veradeiro";
        else
            saida = "falso";
        System.out.println(saida);
        System.out.println(ternario);

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;
        System.out.println("Numero 1 e igual numero 2?" + simNao);

        if(numero1 > numero2)
            System.out.println("Numero 1 maior que numero 2");
        if(numero1 < numero2)
            System.out.println("Numero 1 menor que numero 2");

        String nomeUm = "Luiz";
        String nomeDois = "Luiz";

        System.out.println(nomeUm.equals(nomeDois));
        // operadores logicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        if(condicao1 || condicao2){
            System.out.println("Uma das condições e verdadeiras");
        }
        System.out.println("Fim");
        
    }
}
