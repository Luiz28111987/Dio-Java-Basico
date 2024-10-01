public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepFormatado = formatarCep("7122554");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("O CEP não corresponde as regras de negocio");
        }
        
    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
        throw new CepInvalidoException();

        // Simulando um cep formatado
        return "71.693-010";
    }
}
