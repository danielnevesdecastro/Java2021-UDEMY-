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

	// exception N�o checada
	static void geraErro1() {
		throw new RuntimeException("Ocorreu um Erro #01");// throw - lan�ar
	}

	// exception Checada
	static void geraErro2() throws Exception {// throw = exce��o checada, tem q ser tratada
		throw new Exception("Ocorrreu um Erro #02");
	}
}
