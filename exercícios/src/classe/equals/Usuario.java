package classe.equals;

//Aula 126,127 , equals e Hashcode
public class Usuario {
	String nome;
	String email;

	// Este é o método equals da classe Usuário.
	// Ele compara se o objeto "outro" passado como parâmetro é igual ao objeto
	// atual.
	public boolean equals(Object objeto) {

		if (objeto instanceof Usuario) {
			// A primeira linha faz o cast do objeto passado para o tipo Usuário,
			// armazenando-o na variável "outro".
			Usuario outro = (Usuario) objeto;
			// A segunda linha compara se o nome do objeto "outro" é igual ao nome do objeto
			// atual,armazenando o resultado na variável "nomeIgual".
			boolean nomeIgual = outro.nome.equals(this.nome);
			// A terceira linha compara se o email do objeto "outro" é igual ao email do
			// objeto atual,armazenando o resultado na variável "emailIgual".
			boolean emailIgual = outro.email.equals(this.email);

			// Finalmente,a última linha retorna o resultado
			// da comparação de ambos nomes e emails serem iguais (usando operador &&).
			return nomeIgual && emailIgual;
		} else {
			return false;
		}

	}

	public int hashCode() {
	return this.nome.length();//1 ou 0
}
}
