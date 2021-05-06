package mx.uam.is.practicadiseno.negocio;

import java.util.ArrayList;

import mx.uam.is.practicadiseno.datos.MapeadorDatosImpl;

public class ManejadorImpl implements Manejador {
	
	private MapeadorDatosImpl mapeadorDatosImpl;
	//arreglo para los observadore
	private ArrayList<Observador> observadores = new ArrayList<Observador>();
	
	/**
	 *Constructor que recibe un mapeador 
	 * @param mapeadorDatosImpl
	 */
	public ManejadorImpl(MapeadorDatosImpl mapeadorDatosImpl) {
		this.mapeadorDatosImpl = mapeadorDatosImpl;
	}
	
	/**
	 * Recupera los datos
	 * @return la lista de datos
	 */
	public String[] dameDatos() {
		return mapeadorDatosImpl.dameDatos();
	}

	/**
	 * Agrega un dato mientras no este vacio y no este ya en la lista
	 * @param dato el dato a agregar
	 * @return true si se agrego exitosamente false sino
	 */
	public boolean agrega(String dato) {
		return mapeadorDatosImpl.agrega(dato);
	}

	/**
	 * Borra un dato de la list
	 * @param dato el dato a borrar
	 * @return true si se borro exitosamente, false sino
	 */
	public boolean borra(String dato) {
		return mapeadorDatosImpl.borra(dato);
	}

	/**
	 * Metodo llamado cuando se cierra la ventana
	 */
	public void finaliza() {
		//System.exit(0);
		System.out.println("Quedan " + observadores.size() + " Observadores");
	}
	
	/**
	 * Metodos para el observador
	 */
	@Override
	/**
	 * Agrega un observador a la lista de observadores
	 */
	public boolean agregarObservador(Observador o) {
			return observadores.add(o);
	}

	@Override
	/**
	 * Quita un observador de la lista de observadores
	 */
	public boolean quitaObservador(Observador o) {
		if(observadores.size()-1 == 0) {
			System.out.println("No hay mas observadores");
			System.out.println("PROGRAMA TERMINADO");
			System.exit(0);
		}else{
			System.out.println("Se ha eliminado un observador");
			return observadores.remove(o);
		}
		return false;
	}
	
	/**
	 * llamar actualiza() sobre los observadores
	 */
	public void notifica() {
		for (Observador observador : observadores) {
			observador.actualiza();
		}
	}
}
