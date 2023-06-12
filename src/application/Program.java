package application;

import java.util.Scanner;

import boardgame.Position;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Posicion (row): ");
		int row = sc.nextInt();
		System.out.print("Posicion (column): ");
		int column = sc.nextInt();
		Position position = new Position(row,column);
		
		System.out.println("Posiction: " + position);
		
		
		sc.close();
	}

}
