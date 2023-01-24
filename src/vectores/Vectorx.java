package vectores;

import java.util.Arrays;

public class Vectorx {

	private int[] datos;
	private int elementos;
	
	public Vectorx() {
		
		datos = new int[10];
		elementos = 0;
	}

	
	
	/**
	 * rellena aleatoriamente el vector de vectorx
	 */
	public void aleatorio() {
		
		elementos = datos.length;
		for(int i=0;i<datos.length;i++) {
			
			datos[i] = (int)(Math.random()*100);
		}
		
	}
	
	
	
	
	
	public MaxMin getMaxMin() {
		
		MaxMin devolver = new MaxMin();

		devolver.setMax(getMaximo());
		devolver.setMin(getMinimo());
		
		return devolver;
	}
	
	
	
	
	
	private int getMinimo() {
		
		int minimo = 10000;
		
		for(int i=0;i<elementos;i++) {
			
			if(minimo>datos[i]) {
				minimo = datos[i];
			}
		}
		return minimo;
		
	}	
	
	
	
	
	private int getMaximo() {
		
		int maximo = -10000;
		
		for(int i=0;i<elementos;i++) {
			
			if(maximo<datos[i]) {
				maximo = datos[i];
			}
		}
		return maximo;
	}
	
	
	
	
	/**
	 * añadimos un número al vector que hay en vectorx
	 * @param numero
	 */
	public void add(int numero) {
		
		datos[elementos] = numero;
		elementos++;
		
		if(elementos==datos.length) {
			elementos = 0;
		}
	}
	
	
	
	public int buscar(int numero,int donde) {
		
		int i = donde;
		boolean encontrado = false;
		while(i<datos.length&&(!encontrado)) {
			
			if(numero==datos[i]) {
				
				encontrado = true;
			}
			else i++;
		}
		if(encontrado) return i; else return -1;
	}
	
	
	
	
	 
	
	/**
	 * nosotrtos controlmos el toString, decidiendo qué
	 * sale en ese String
	 */
	@Override
	public String toString() {
		
		String devolver = "[";
		
		for(int i=0;i<datos.length;i++) {
			
			devolver += datos[i]+",";
		}
		//devolver += datos[elementos-1];
		devolver+="]";
		
		return devolver;
		
	}
	
	
	
	
	
}
