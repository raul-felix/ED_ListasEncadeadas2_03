package view;

import br.edu.fateczl.listaEncadeada.ListaEncadeada;
import br.edu.fateczl.listaEncadeada.Node;
import controller.ListaController;

public class Main {
	
	public static void main(String[] args) {
		
		int[] vetA = { 3, 5, 8, 12, 9, 7, 16 };
		int[] vetB = { 9, 6, 2, 3, 7 };
		
		ListaEncadeada<Integer> listaA = new ListaEncadeada<>();
		ListaEncadeada<Integer> listaB = new ListaEncadeada<>();
		ListaEncadeada<Integer> listaI = new ListaEncadeada<>();
		ListaEncadeada<Integer> listaU = new ListaEncadeada<>();
		
		for (int i : vetA) {
			try {
				listaA.addLast(i);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		for (int i : vetB) {
			try {
				listaB.addLast(i);
			} catch (Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		ListaController<Integer> listaController = new ListaController<Integer>();
		try {
			listaI = listaController.interseccaoListas(listaA, listaB);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		try {
			listaU = listaController.uniaoListas(listaA, listaB);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
