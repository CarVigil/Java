import java.util.Scanner;

public class OrdenInverso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int[] num = new int[10];
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Ingrese un numero");
			num[i]=sc.nextInt();
		}
		System.out.println("En sentido inverso...");
		
		for (int i = 9; i >=0; i--) {
			System.out.println(num[i]);
		}
		
		sc.close();
		

	}

}
