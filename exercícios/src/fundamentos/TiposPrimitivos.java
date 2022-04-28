package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//Informa��es do funcion�rio
		
		//tipos num�ricos inteiros
		byte anosEmpresa = 23;
		short nVoos = 542;
		int id = 56789;
		long ptsAcumulados = 3_234_845_223L;// o L no final do valor liteal indica que ele deve ser considerado long e n�o inteiro
		
		// Tipos num�ricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// Tipo Booleano
		boolean ferias = false; //ou true; 
		
		// Tipo Caractere
		char status = 'A';// A = Ativo, tipo caractere s� aceita um �nica letra, ou c�digo da tabela unicode;
		
		
		System.out.println("Ano de Empresa : " + anosEmpresa * 365);
		System.out.println("N�meros de V�os : "+ nVoos);
		System.out.println("Pontos Acumulados : "+ptsAcumulados/vendasAcumuladas);
		System.out.println(id + " ganha -> "+salario);
		System.out.println("F�rias ? "+ ferias);
		System.out.println("Status : "+ status);
	
	}
	
}
