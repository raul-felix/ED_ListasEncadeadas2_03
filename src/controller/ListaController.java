package controller;

import br.edu.fateczl.listaEncadeada.ListaEncadeada;
import br.edu.fateczl.listaEncadeada.Node;

public class ListaController<T> {
	
	public ListaEncadeada<T> interseccaoListas(ListaEncadeada<T> listA, ListaEncadeada<T> listB) throws Exception {
		ListaEncadeada<T> listaIntersec = new ListaEncadeada<T>();
		Node<T> nodeA = listA.getNode(0);
		while (nodeA != null) {
			T valor = nodeA.getDado();
			
			Node<T> nodeB = listB.getNode(0);
			while (nodeB != null) {
				if (valor == nodeB.getDado()) {
					listaIntersec.addLast(valor);
					break;
				}
				nodeB = nodeB.getProximo();
			}
			nodeA = nodeA.getProximo();
		}
		
		Node<T> node = listaIntersec.getNode(0);
		System.out.println("LISTA INTERSECÇÃO");
		while (node != null) {
			System.out.println(node.toString());
			node = node.getProximo();
		}
		
		return listaIntersec;
	}
	
	public ListaEncadeada<T> uniaoListas(ListaEncadeada<T> listA, ListaEncadeada<T> listB) throws Exception {
		ListaEncadeada<T> listaUniao = new ListaEncadeada<T>();
		Node<T> nodeA = listA.getNode(0);
		while (nodeA != null) {
			T valor = nodeA.getDado();
			listaUniao.addLast(valor);
			nodeA = nodeA.getProximo();
		}
		
		Node<T> nodeB = listB.getNode(0);
		while (nodeB != null) {
			T valor = nodeB.getDado();
			listaUniao.addLast(valor);
			nodeB = nodeB.getProximo();
		}
		
		Node<T> node = listaUniao.getNode(0);
		System.out.println("LISTA UNIÃO");
		while (node != null) {
			System.out.println(node.toString());
			node = node.getProximo();
		}
		
		return listaUniao;
	}

}
