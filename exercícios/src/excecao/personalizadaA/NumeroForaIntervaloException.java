package excecao.personalizadaA;

//220 - Exception Personalizada 
@SuppressWarnings("serial")
public class NumeroForaIntervaloException extends RuntimeException {
	String nomeatributo;

	public NumeroForaIntervaloException(String nomeAtributo) {
		this.nomeatributo = nomeAtributo;
	}

	public String getMessage() {
		return String.format("O Atributo '%s' está fora do intervalo.", nomeatributo);
	}
}
