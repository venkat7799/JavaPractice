package patterns;

import java.util.Scanner;

public class NumberPattern {

	public static void main(String[] args) {
		int rows,i,j;
		//Scanner sc = new Scanner(System.in);
		rows=8;
		for(i=1;i<=rows;i++) {
			for(j=1;j<=i;j++) {
				System.out.print(i+ " ");
			}
			System.out.println();
		}
	}

}
