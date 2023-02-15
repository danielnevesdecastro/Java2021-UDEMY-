package desafios.oo.encapsulamento;

//aula 164 - Getters e Setters
public class PessoaTest {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();

		// exponnso o objeto
		// p1.idade = 30; // alterar
		// System.out.println(p1.idade);//ler

		// getters e setters
		// lendo e alterando atributos com com métodos
		p1.setIdade(30);// alterar
		System.out.println(p1.getIdade());// ler

		p1.setNome("Daniel");// alterar
		p1.setSobrenome("Neves");// alterar
		System.out.println(p1.getNome());// ler
		
		System.out.println(p1.toString());
		
		System.out.println(p1.nomeCompleto());
	}
}