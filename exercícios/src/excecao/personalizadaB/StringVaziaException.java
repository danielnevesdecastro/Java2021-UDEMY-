package excecao.personalizadaB;

//221 - Exception personalizada, Checadas 
@SuppressWarnings("serial")
public class StringVaziaException extends Exception {
	String nomeatributo;

	public StringVaziaException(String nomeAtributo) {
		this.nomeatributo = nomeAtributo;
	}

	public String getMessage() {
		return String.format("O Atributo '%s' está Vazio", nomeatributo);
	}
}
