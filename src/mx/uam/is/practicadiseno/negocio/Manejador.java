package mx.uam.is.practicadiseno.negocio;

//Clase que sera el observable
public interface Manejador {

	/**
	 * Recupera los datos
	 *
	 * @return la lista de datos
	 */
	public String[] dameDatos();

	/**
	 * Agrega un dato mientras no este vacio y no este ya en la lista
	 *
	 * @param dato el dato a agregar
	 * @return true si se agrego exitosamente false sino
	 */
	public boolean agrega(String dato);

	/**
	 * Borra un dato de la list
	 *
	 * @param dato el dato a borrar
	 * @return true si se borro exitosamente, false sino
	 */
	public boolean borra(String dato);

	/**
	 * Metodo llamado cuando se cierra la ventana
	 *
	 */
	public void finaliza();
	
	/**
	 * Agrega un observador a la lista de observadores
	 * @param o
	 * @return
	 */
	public boolean agregarObservador(Observador o);
	
	/**
	 * Quita un observador de la lista de observadores
	 * @param o
	 * @return
	 */
	public boolean quitaObservador(Observador o);
	
	public void notifica();

}
