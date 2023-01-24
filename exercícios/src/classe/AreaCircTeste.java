package classe;

//Aula 104 , Menbros de Classe vs Objeto
public class AreaCircTeste {
	public static void main(String[] args) {

		// pi = menbro da classe
		AreaCirc a1 = new AreaCirc(5.6);
		System.out.println("PI: " + AreaCirc.PI + " Raio:" +
				a1.raio + " Area:" + a1.area());

		AreaCirc a2 = new AreaCirc(10);
		// a2.pi = 10; mudando valor de pi pra todo da classe agora
		// pi , raio= menbro da instancia anteriormente abaixo
		// AreaCirc.pi = 10; virou constante nao pode ser mais acessado para modifica��o
		double areaResul = a2.area();
		System.out.println("PI: " + AreaCirc.PI + " Raio:" + a2.raio +
				 " Area:" + areaResul);
		//out = mrnbro de classe . math classe , PI = atributo / membro da classe 
		System.out.println(Math.PI);
		
		//m�todo menbro da classe 
		System.out.println("�rea Static :"+ AreaCirc.area(a2.raio));
		System.out.println("�rea Static :"+ AreaCirc.area(100));
	}
}
