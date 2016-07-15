import java.util.Scanner;
public class GuardarMayores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int num,aux, cont=0;
		int[] arreglo = new int[20];
		System.out.println("Ingrese un numero cualquiera");
		num = Integer.parseInt(sc.nextLine());
		
		System.out.println("Ingrese una lista de 20 numeros (Solo los mayores al numero ingresado se guardaran)");

		for (int i = 0; i < 20; i++) {
			aux = sc.nextInt();
			if (aux>=num){
				arreglo[i]=aux;	
				cont++;}			
		}
		
		for (int i = 0; i < cont; i++) {
			System.out.println(arreglo[i]);
		}
		sc.close();
	}

}
