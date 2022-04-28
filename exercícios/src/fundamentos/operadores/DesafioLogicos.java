package fundamentos.operadores;
//Aula 47-48 Desafio Lógico

/*Proposta de Trabalho na Terça e na Quinta 
 * Se os dois trabalhos derem certo (&&) = comprar tv de 50 polegadas no fim de semana  
 * Se um dos dois trabalhos derem certo (||) = comprar tv de 32 
 * Comprando qualquer uma das tvs = Sorvete em familia . 
 *  Se nenhum trabalho de certo = ficar em casa sem tv e sem sorvete , porém mais saudavel  
 *  
 *  EX: boolean  = trabalho 1 = false 
 */
public class DesafioLogicos {

	public static void main(String[] args) {
		
		boolean jobterca = true; 
		boolean jobQuinta = true;  
		
		boolean tv50 = jobterca && jobQuinta ;
		boolean tv32 = jobterca ^ jobQuinta ;
		boolean sorvete = jobterca || jobQuinta ;
		boolean saudavel = !tv50 && ! tv32  ;
		
		System.out.println (" Comprou Tv 50\"?" + tv50 );
		System.out.println (" Comprou Tv 32\" ? " + tv32 );
		System.out.println (" Tomou Sorvete \" ? " + sorvete );
		System.out.println (" Está saudável  \" ? " + saudavel );
		 
	}
}
