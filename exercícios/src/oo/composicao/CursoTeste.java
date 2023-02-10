package oo.composicao;

//Aula 143 - OO - Composição n pra n
public class CursoTeste {
	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("Daniel Neves");
		Aluno aluno2 = new Aluno("Mari");
		Aluno aluno3 = new Aluno("Pedro");

		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("WEB Completo");

		aluno1.adicionarCurso(curso1);
		aluno2.adicionarCurso(curso2);

		curso2.adicionarAluno(aluno3);
		curso2.adicionarAluno(aluno1);

		System.out.println(aluno1.cursos);

		// percorrendo alunos de um curso
		for (Aluno aluno : curso2.alunos) {
			System.out.println("Curso " + curso1.nome + ": " + aluno.nome);
		}
		// percorrendo cursos de um aluno
		for (Curso curso : aluno3.cursos) {
			System.out.println(aluno3.nome + " está matriculado no Curso :" + curso.nome);
		}
		// a paritr do aluno peguei seus cursos, e quem tava matriculado nele
		System.out.println(aluno1.cursos.get(1).alunos);
		System.out.println(curso1.alunos.get(0).cursos);

		Curso cursoEncontrado = aluno1.obterCursoporNome("web completo");

		if (cursoEncontrado != null) {
			System.out.println("\n\n"+cursoEncontrado.nome);
			System.out.println(cursoEncontrado.alunos);
		} else {
			System.out.println("Nenhum curso Encontrado!!!");
		}

	}
}
