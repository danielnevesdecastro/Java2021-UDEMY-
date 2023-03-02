package excecao.personalizadaA;

//220 - Exception Personalizada 
@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {
	String nomeatributo;

	public StringVaziaException(String nomeAtributo) {
		this.nomeatributo = nomeAtributo;
	}

	public String getMessage() {
		return String.format("O Atributo '%s' está Vazio", nomeatributo);
	}
}
