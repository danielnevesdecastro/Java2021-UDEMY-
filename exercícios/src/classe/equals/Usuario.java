package classe.equals;

//Aula 126,127 , equals e Hashcode
public class Usuario {
	String nome;
	String email;

	// Este � o m�todo equals da classe Usu�rio.
	// Ele compara se o objeto "outro" passado como par�metro � igual ao objeto
	// atual.
	public boolean equals(Object objeto) {

		if (objeto instanceof Usuario) {
			// A primeira linha faz o cast do objeto passado para o tipo Usu�rio,
			// armazenando-o na vari�vel "outro".
			Usuario outro = (Usuario) objeto;
			// A segunda linha compara se o nome do objeto "outro" � igual ao nome do objeto
			// atual,armazenando o resultado na vari�vel "nomeIgual".
			boolean nomeIgual = outro.nome.equals(this.nome);
			// A terceira linha compara se o email do objeto "outro" � igual ao email do
			// objeto atual,armazenando o resultado na vari�vel "emailIgual".
			boolean emailIgual = outro.email.equals(this.email);

			// Finalmente,a �ltima linha retorna o resultado
			// da compara��o de ambos nomes e emails serem iguais (usando operador &&).
			return nomeIgual && emailIgual;
		} else {
			return false;
		}

	}

	public int hashCode() {
	return this.nome.length();//1 ou 0
}
}
