
public class SistemaCadastro {
	public static void main(String[] args) {
		// Criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("02529766142", "Luiz");
		
		// Definimos o endereco de marcos
		marcos.setEndereco("RUA DAS MARIAS");
		
		// como definir o nome e cpf dop marcos ?
		
		
		// imprimindo o marcos sem o nome e cpf
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}

}
