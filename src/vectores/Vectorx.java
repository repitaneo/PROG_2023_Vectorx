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
		
		for(int i=0;i<datos.length;i++) {
			
			datos[i] = (int)(Math.random()*100);
		}
		
	}
	
	
	
	
	
	/**
	 * añadimos un número al vector que hay en vectorx
	 * @param numero
	 */
	public void add(int numero) {
		
		if(elementos<datos.length) {
			
			datos[elementos] = numero;
			elementos++;
		}
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
		devolver+="]";
		
		return devolver;
		
	}
	
	
	
	
	
}
