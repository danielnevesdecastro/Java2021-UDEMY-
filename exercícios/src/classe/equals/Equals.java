package classe.equals;

//Aula 126,127 , equals e Hashcode
//Hash code ser� implementado em outra aula ;
public class Equals {
	public static void main(String[] args) {

		Usuario u1 = new Usuario();
		u1.nome = "Pedro Silva";
		u1.email = "pedrosilva@gmail.com.br";

		Usuario u2 = new Usuario();
		u2.nome = "Pedro Silva";
		u2.email = "pedrosilva@gmail.com.br";

		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1.equals(u2));
		// teste
		// System.out.println(u2.equals(new Date()));

	}

}
