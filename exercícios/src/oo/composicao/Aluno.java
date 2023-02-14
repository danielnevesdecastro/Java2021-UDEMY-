package oo.composicao;

import java.util.ArrayList;
import java.util.List;

//Aula 143 - OO - Composi��o n pra n
public class Aluno {
	final String nome;
	// constante aqui � o endere�o de memoria da lista , nao o conteudo
	final List<Curso> cursos = new ArrayList<>();// array lista

	// Construtor pra for�ar
	Aluno(String nome) {
		this.nome = nome;

	}
	//relacionamento bidirecional com curso
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	// heran�a
	public String toString() {
		return nome;
	}

	Curso obterCursoporNome(String nome) {
		Curso procurado = null;
		for (Curso curso : this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
			return curso; 
			}
		}
		return procurado;// retorna null se nao encontra nada 
		
	}
}
