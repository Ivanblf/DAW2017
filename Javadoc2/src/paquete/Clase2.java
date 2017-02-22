package paquete;

/**
 * Esta clase representa una {@code pelicula} y tiene los siguientes atributos:
 * {@code atributo1} - Este atributo hace referencia al titulo de la pelicula y es de tipo {@code String}.
 * {@code atributo2} - Este atributo hace referencia a la duracion de la pelicula y es de tipo {@code entero}.
 * {@code atributo3} - Este atributo hace referencia al genero de la pelicula y es de tipo {@code String}.
 * {@code atributo4} - Este atributo representa si la pelicula esta rebobinada o no y es de tipo {@code boolean}.
 * @author Iván Blanco
 * @version 17/02/2017
 */
public class Clase2 {
	
	private String atributo1;
	private int atributo2;
	private String atributo3;
	private boolean atributo4;
	
	
	/**
	 * Este constructor inicializa los tres primeros atributos segun el parametro y el cuarto a {@code false}.
	 * @param t parametro String para el atributo1
	 * @param d parametro entero para el atributo2
	 * @param g parametro String para el atributo3
	 */
	public Clase2(String t, int d, String g){
		
		this.atributo1 = t;
		this.atributo2 = d;
		this.atributo3 = g;
		atributo4 = true;
	}
	
	
	/**
	 * Devuelve el valor del atributo1
	 * @return atributo1
	 * 
	 */
	public String metodo1(){
		
		return atributo1;
	}
	
	/**
	 * Devuelve el valor del atributo2
	 * @return atributo2
	 */
	public int metodo2(){
		
		return atributo2;
	}
	
	/**
	 * Devuelve el valor del atributo3
	 * @return atributo3
	 */
	public String metodo3(){
		
		return atributo3;
	}
	
	/**
	 * Devuelve el valor del atributo4
	 * @return atributo4
	 */
	public boolean metodo4(){
		
		return atributo4;
	}
	
	/**
	 * Cambia el valor del atributo4 a {@code true}
	 */
	public void metodo5(){
		
		atributo4 = true;
	}

}
