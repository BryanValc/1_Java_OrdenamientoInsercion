import java.util.Arrays;

class Ordenador{
	
	public void ordenarInsercion(int[]numeros) {
		int aux;
		
		for (int i = 1; i < numeros.length; i++) {
			aux=numeros[i];
			
			for (int j=i-1; j>=0&&numeros[j]>aux ; j--) {
				
				numeros[j+1]=numeros[j];
				numeros[j]=aux;
				System.out.println(Arrays.toString(numeros));
				
			}//segundo for
			
		}//primer for
		
	}//metodo ordenarInsercion
	
}

public class PruebaOrdenamientoInsercion {

	public static void main(String[] args) {
		
		int[] numeros = {5,7,11,15,4,12,23,3,4,2,1,45,13};
		
		System.out.println("Numeros desordenados: "+Arrays.toString(numeros));
		
		System.out.println("==================Inicio ordenamiento===================");
		Ordenador ord = new Ordenador();//instancia
		ord.ordenarInsercion(numeros);//llamada al metodo
		System.out.println("==================Fin ordenamiento===================");
		
		System.out.println("Numeros ordenados: "+Arrays.toString(numeros));
		
	}

}
