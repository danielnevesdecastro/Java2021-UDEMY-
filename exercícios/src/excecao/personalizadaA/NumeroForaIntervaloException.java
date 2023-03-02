package excecao.personalizadaA;

//220 - Exception Personalizada , n�o checadas
@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {
	String nomeatributo;

	public NumeroForaIntervaloException(String nomeAtributo) {
		this.nomeatributo = nomeAtributo;
	}

	public String getMessage() {
		return String.format("O Atributo '%s' est� fora do intervalo.", nomeatributo);
	}
}
