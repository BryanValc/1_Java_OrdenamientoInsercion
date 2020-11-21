
class Ordenador{
	
	public void ordenarInsercion(int[]numeros) {
		int aux;
		
		for (int i = 1; i < numeros.length; i++) {
			aux=numeros[i];
			
			for (int j=i-1; j>=0&&numeros[j]>aux ; j--) {
				
				numeros[j+1]=numeros[j];
				numeros[j]=aux;
				
			}//segundo for
			
		}//primer for
		
	}//metodo ordenarInsercion
	
}

public class PruebaOrdenamientoInsercion {

	public static void main(String[] args) {
		
		
		
	}

}
