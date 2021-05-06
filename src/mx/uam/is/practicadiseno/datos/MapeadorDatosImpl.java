package mx.uam.is.practicadiseno.datos;

import java.util.ArrayList;
import java.util.List;

public class MapeadorDatosImpl implements MapeadorDatos {
	
	// La estructura que contiene los datos
	private List <String> datos = new ArrayList <String> ();
	
	/**
	 * Constructor que inicializa con algunos datos
	 */
	public MapeadorDatosImpl() {
		agrega("Entrada 1");
		agrega("Entrada 2");
		agrega("Entrada 3");
	}
	
	@Override
	/**
	 * Agrega un dato mientras no este vacio y no este ya en la lista
	 * @param dato el dato a agregar
	 * @return true si se agrego exitosamente false sino
	 */
	public boolean agrega(String dato) {
		if(!dato.equals("") && !datos.contains(dato)) {
			datos.add(dato);
			return true;
		}
		return false;
	}

	@Override
	/**
	 * Borra un dato de la list
	 * @param dato el dato a borrar
	 * @return true si se borro exitosamente, false sino
	 */
	public boolean borra(String dato) {
		return datos.remove(dato);
	}

	@Override
	/**
	 * Recupera los datos
	 * @return la lista de datos
	 */
	public String[] dameDatos() {
		// Convierte la lista a un arreglo de cadenas y lo regresa
		String arregloDatos [] = new String[datos.size()];
		datos.toArray(arregloDatos);
	    return arregloDatos;
	}

	@Override
	public boolean contiene(String dato) {
		// TODO Auto-generated method stub
		return false;
	}

}
