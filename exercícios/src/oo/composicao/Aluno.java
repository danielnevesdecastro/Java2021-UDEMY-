package oo.composicao;

import java.util.ArrayList;
import java.util.List;

//Aula 143 - OO - Composição n pra n
public class Aluno {
	final String nome;
	// constante aqui é o endereço de memoria da lista , nao o conteudo
	final List<Curso> cursos = new ArrayList<>();// array lista

	// Construtor pra forçar
	Aluno(String nome) {
		this.nome = nome;

	}
	//relacionamento bidirecional com curso
	void adicionarCurso(Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}

	// herança
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
