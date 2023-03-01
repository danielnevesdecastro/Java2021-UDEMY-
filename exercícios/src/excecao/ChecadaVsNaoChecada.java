package excecao;

//218 - Exceptions 
public class ChecadaVsNaoChecada {
	public static void main(String[] args) {

		try {
			geraErro1();
		} catch (Exception e) {
			System.out.println(e.getMessage());// tratando o erro
		}

		try {
			geraErro2();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		System.out.println("Fim...");
	}

	// exception Não checada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um Erro #01");// throw - lançar
	}

	// exception Checada
	static void geraErro2() throws Exception {// throw = exceção checada, tem q ser tratada
		throw new Exception("Ocorrreu um Erro #02");
	}
}
