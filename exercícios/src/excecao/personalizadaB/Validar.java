package excecao.personalizadaB;

import excecao.Aluno;

//221 - Exception personalizada, Checadas 
public class Validar {

	private Validar() {
	}
	//221 - Exception tem que ser lan�ada explicamente; pq herda de exception e nao runtime 
	public static void aluno(Aluno aluno) throws StringVaziaException,NumeroForaIntervaloException {
			
		if (aluno == null) {
			throw new IllegalArgumentException("O aluno est� Nulo");
		}
		if (aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		if (aluno.nota <0 || aluno.nota > 10 ) {
			throw new NumeroForaIntervaloException("Nota");
		}
	}

}
