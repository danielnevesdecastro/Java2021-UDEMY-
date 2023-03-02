package excecao.personalizadaB;

//221 - Exception personalizada, Checadas 
@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends Exception {
	String nomeatributo;

	public NumeroForaIntervaloException(String nomeAtributo) {
		this.nomeatributo = nomeAtributo;
	}

	public String getMessage() {
		return String.format("O Atributo '%s' está fora do intervalo.", nomeatributo);
	}
}
