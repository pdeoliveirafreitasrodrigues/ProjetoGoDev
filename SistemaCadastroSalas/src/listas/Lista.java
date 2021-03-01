package listas;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import javax.swing.JOptionPane;


import cadastros.Pessoa;

public class Lista {

	Object lista [];
	Object coluna[];
	int tamanho; //Serve para controlar o índice
	
	public Lista() {
		lista = new Object[10];
		coluna = new Object[10];
		tamanho = 0;
	}
	
	
//---------------------------------------------------------------------------\\

	public boolean estaVazia() {
		return tamanho == 0;
	}
	
//---------------------------------------------------------------------------\\

	public boolean estaCheia() {
		return tamanho == lista.length;
	}
	
//---------------------------------------------------------------------------\\	

	public void inserirInicioLista(Object valor) {
		if (!estaCheia()) {
			for (int i = tamanho; i >= 1; i--) {
				lista[i] = lista[i -1];

			}
		}
		lista[0] = valor;
		tamanho ++;
	}

//---------------------------------------------------------------------------\\	

	public void mostrar() {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null) {
				System.out.println("Posição " + i + " = " + lista[i] + " /// " + coluna[i]);
			}
		}
		System.out.println("");
	}
	
	
//---------------------------------------------------------------------------\\	
	
		
	public void inserirFinalLista(Object valor, Object coluna) {
		if (!estaCheia()) {

			lista[tamanho] = valor;
			this.coluna[tamanho] = coluna;
			tamanho++;

			
		}		
	}
	
//---------------------------------------------------------------------------\\	
	
	public void inserirQualquerPosicao(Object valor, int posicao) {
		if (posicao > lista.length - 1) {
			
			System.out.println("Posição Inválida");
		}else {
			
			lista[posicao] = valor;

		}
		
	}
	
//---------------------------------------------------------------------------\\	

	public void removerInicioLista() {
		if (tamanho > 0) {
			for (int i = 0; i < tamanho; i++) {
				if (i != lista.length - 1) {
					lista[i] = lista[i+1];
					coluna[i] = coluna[i+1];
				}
			}
			
			lista[tamanho - 1] = "";
			coluna[tamanho - 1] = "";
			tamanho--;
		}
		
		
	}
	
//---------------------------------------------------------------------------\\	

	public void removerFinalLista() {
		
		for (int i = lista.length -1; i >=0 ; i--) {
			if (lista[i] != null && lista[i] != "") {
				lista[i] = "";
				break;
			}
			
		}
		
	}
	
//---------------------------------------------------------------------------\\	

	public int qtdeElementos() {
		
		int contador = 0;
		
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] != null && lista[i] != "") {
				contador ++;
			}
			
		}		
		return contador;
	}
	


	

		
	}	
	
