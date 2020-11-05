package matriz;

import java.util.Scanner;

public class matrizes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int l = sc.nextInt();
		int c = sc.nextInt();
		int mat[][] = new int[l][c];
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0;j<mat[i].length;j++) {
				mat[i][j] = sc.nextInt();
			}
		}
			
		int elemento = sc.nextInt();
		for (int i=0; i<mat.length; i++) {
			for (int j=0;j<mat[i].length;j++) {
				if (elemento == mat[i][j]) {
					System.out.println("Posição: "  + i + ", "+j + ":");
					
					if ((j-1) >= 0) {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					if ((j+1) < mat[i].length) {
					System.out.println("Direita: "  + mat[i][j+1]);
					}
					if ((i-1) >= 0) { 
					System.out.println("A cima: "   + mat[i-1][j]);
					}
					if ((i+1) < mat.length) {
					System.out.println("A baixo: "  + mat[i+1][j]);
					}
				}
			}
		}		
		

		sc.close();
	}
}
