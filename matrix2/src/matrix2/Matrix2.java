/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matrix2;

import java.util.Scanner;

/**
 *
 * @author Usuário
 */
public class Matrix2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		int m = sc.nextInt();
                int n = sc.nextInt();
		int[][] mat = new int[m][n];
                
                
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
                System.out.print("número de interesse: ");
                int num =sc.nextInt();
                
                for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
                            
				if(mat[i][j]==num){
                                    System.out.printf("position %d,%d %n",i,j);
                                    if (j-1>=0){
                                              System.out.printf("left: %d%n", mat[i][j-1]);
        }
                                     if (j+1<n){
                                              System.out.printf("Right: %d%n", mat[i][j+1]);
        }
                                 if (i+1<m){
                                              System.out.printf("Down: %d%n", mat[i+1][j]);
        }    
                                 if (i-1>=0){
                                              System.out.printf("Up: %d%n", mat[i-1][j]);
        }    
                                    
                                }
			}
		}
                
    }
    
}
