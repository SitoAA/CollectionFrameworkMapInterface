package com.example;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 
 */
public class App {
    public static void main(String[] args) {
        /*¿que es un map interface o un mapa simplemente?
         * 
         * Es una coleccion aunque no hereda de la interface collection pero se puede tratar como
         * tal, utilizando las collection views(vistas de coleciones que veremos en breve)
         * 
         * Concretamente un mapa es una colecion que tambien un objeto que relaciona 
         * clave con valores, antiguamente se llamaba, un estructurra hash (clave valor)
         * donde, las claves no pueden repetirse. 
         * 
         * Los metodos de ordenamiento y de busqueda que son aplicables a las interfaces 
         * que heredan de collection no son aplicables  a la interface map, por ejemplo, 
         * el metodo sort no se le puede aplicar a un mapa.
         * 
         * En resumen, una interface Map, mapea (relaciona) claves con valor en un contenedor
         * que se puede crear y recorrer de varias formas */
    	
    	/*
    	 * Crear una collection Map Interface, que almacena la frecuencia de repeticion de un array 
    	 * de palabras que se recibe como parametros en el metodo main , cuando se lanza la aplicacion.*/
    	
    	// Primero comprobar si estamos recibiendo el array de nombres, en la variable args. 
    	// cuando se lanza la aplicacion
    	
    	List<String> listadoDeArgumentos = Arrays.asList(args);
    	listadoDeArgumentos.forEach(System.out::println);
    	
    	
    	Map<String, Integer> m = new HashMap<>();
    	
    	Integer frecuenciaOcurrencia = null ;
    	
    	for (String nombre : listadoDeArgumentos) {
    		
    		// comprobar si el nombre, aparece en la lista.
    		
    		frecuenciaOcurrencia = m.get(nombre);
    		
    		m.put(nombre, frecuenciaOcurrencia == null ? 1 : ++frecuenciaOcurrencia);
    		
    	}
    	
    	System.out.println("Mapa resultante : " + m);
    }
}
