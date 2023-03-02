package excecao.personalizadaB;

import excecao.Aluno;

//221 - Exception personalizada, Checadas 
public class Testevalidacoes {

	public static void main(String[] args) {
		try {
		Aluno aluno1 = new Aluno("Ana", 7);
		
			Validar.aluno(aluno1);
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		}catch (NumeroForaIntervaloException | IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
		
		
		System.out.println("Fim.. :)");
		
	}
}
