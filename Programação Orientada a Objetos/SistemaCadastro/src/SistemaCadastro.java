public class SistemaCadastro {

	public static void main(String[] args) {
		//criamos uma pessoa no sistema
		Pessoa marcos = new Pessoa("123", "Marcos");
		
		System.out.println(marcos.getNome() + "-" + marcos.getCpf());
	}
}
