package paquete;
import java.util.Random;
import java.util.ArrayList;
/**
 * Esta clase representa un {@code videoclub} y tiene los siguientes atributos:
 * {@code atributo1} - Este atributo hace referencia a una coleccion de objetos {@code Clase2}.
 * {@code atributo2} - Este atributo hace referencia a la cantidad de peliculas alquiladas y es de tipo {@code entero}.
 * @author Iván Blanco
 * @version 17/02/2017
 */
public class Clase1 {
	
	private ArrayList<Clase2> atributo1;
	private int atributo2;
	
	/**
	 * Este constructor crea una serie de objetos {@code Clase2} y los añade en el atributo1, ademas inicializa el atributo2 a 0.
	 */
	public Clase1(){
		
		Clase2 p1 = new Clase2("La Cenicienta", 120, "Fantasia");
		Clase2 p2 = new Clase2("La Bella Durmiente", 110, "Fantasia");
		Clase2 p3 = new Clase2("La Bella y La Bestia", 90, "Fantasia");
		Clase2 p4 = new Clase2("La Sirenita", 115, "Fantasia");
		Clase2 p5 = new Clase2("El Libro de La Selva", 95, "Fantasia");
		atributo1.add(p1);
		atributo1.add(p2);
		atributo1.add(p3);
		atributo1.add(p4);
		atributo1.add(p5);
		atributo2 = 0;
	}
	
	/**
	 * Este metodo muetsra por pantalla una lista de las peliculas disponibles en el videoclub.
	 */
	public void metodo1(){
		
		for (int i = 0; i < atributo1.size(); i++){
			//Cambiar esto
			
			System.out.println(i +1+ ") " + atributo1.get(i));
		}
	}
	
	/**
	 * Este metodo te devuelve la pelicula que hayas elegido de la lista segun el numero entero introducido en el parametro, despues la borra de la lista y suma 1 al atributo2
	 * @param p numero entero que indica la pelicula que quieres alquilar
	 * @return la pelicula seleccionada
	 */
	public Clase2 metodo2(int p){
		
		Clase2 p6 = atributo1.get(p);
		atributo1.remove(p);
		atributo2++;
		
		return p6;
	}
	
	/**
	 * Este metodo devuelve a la lista la pelicula que tu le introduzcas como parametro
	 * @param p objeto de tipo Clase2 a añadir
	 */
	public void metodo3(Clase2 p){
		
		atributo1.add(p);
	}
	
	/**
	 * Comprueba si la pelicula ha sido ya rebobinada, y si no la rebobina cambiando el valor del atributo4 de la Clase2 a {@code true}
	 * @param p objeto de tipo Clase2 a comprobar
	 */
	public void metodo4(Clase2 p){
		
		if (p.metodo4() == false){
			p.metodo5();
		}
	}
	
	/**
	 * Muetsra por pantalla la factura por el alquiler de la pelicula
	 */
	public void metodo5(){
		Random g = new Random();
		int pc = g.nextInt(20) + 11;
		System.out.println("La factura asciende a " + pc + "€. ¡Gracias por su visita!");
	}
	
	/**
	 * Devuelve el numero de epliculas que han sido alquiladas desde la apertura del videoclub.
	 * @return atributo2
	 */
	public int metodo6(){
		
		return atributo2;
	}

}
