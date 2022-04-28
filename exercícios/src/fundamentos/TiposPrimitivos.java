package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informações do funcionário
		
		//tipos numéricos inteiros
		byte anosEmpresa = 23;
		short nVoos = 542;
		int id = 56789;
		long ptsAcumulados = 3_234_845_223L;// o L no final do valor liteal indica que ele deve ser considerado long e não inteiro
		
		// Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo Booleano
		boolean ferias = false; //ou true; 
		
		// Tipo Caractere
		char status = 'A';// A = Ativo, tipo caractere só aceita um única letra, ou código da tabela unicode;
		
		
		System.out.println("Ano de Empresa : " + anosEmpresa * 365);
		System.out.println("Números de Vôos : "+ nVoos);
		System.out.println("Pontos Acumulados : "+ptsAcumulados/vendasAcumuladas);
		System.out.println(id + " ganha -> "+salario);
		System.out.println("Férias ? "+ ferias);
		System.out.println("Status : "+ status);
	
	}
	
}
