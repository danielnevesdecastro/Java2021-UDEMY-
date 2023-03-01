package excecao;

//217 - Exception , Básico
public class Basico {
	public static void main(String[] args) {
		Aluno a1 = null;

		try {
			imprimirAluno(a1);
		} catch (NullPointerException e) {
			System.out.println("ocorreu um erro na " 
					+ "impressão do nome do Usuário ");
		}

		try {

			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Não existe divisão por 0: " + e.getMessage());
			// e.printStackTrace(); imprime o stack trace
		}
		System.out.println("Fim... ");
	}

	public static void imprimirAluno(Aluno aluno) {
		System.out.println(aluno.nome);

	}
}
