package mx.uam.is.practicadiseno.negocio;

public class ManejadorProxy implements Manejador {
	
	Manejador manejador;
	
	public ManejadorProxy(Manejador manejador) {
		this.manejador = manejador;
	}

	@Override
	public String[] dameDatos() {
		// TODO Auto-generated method stub
		System.out.println("Se invoco al metodo dameDatos()");
		return manejador.dameDatos();
	}

	@Override
	public boolean agrega(String dato) {
		// TODO Auto-generated method stub
		System.out.println("Se invoco al metodo agrega(String dato)");
		return manejador.agrega(dato);
	}

	@Override
	public boolean borra(String dato) {
		// TODO Auto-generated method stub
		System.out.println("Se invoco al metodo borra(String dato)");
		return manejador.borra(dato);
	}

	@Override
	public void finaliza() {
		// TODO Auto-generated method stub
		System.out.println("Se invoco al metodo finaliza()");
		manejador.finaliza();
	}

	@Override
	public boolean agregarObservador(Observador o) {
		// TODO Auto-generated method stub
		System.out.println("Se invoco al metodo agregaObservador(Observador o)");
		return manejador.agregarObservador(o);
	}

	@Override
	public boolean quitaObservador(Observador o) {
		// TODO Auto-generated method stub
		System.out.println("Se invoco al metodo quitaObservador(Observador o)");
		return manejador.quitaObservador(o);
	}

	@Override
	public void notifica() {
		// TODO Auto-generated method stub
		System.out.println("Se invoco al metodo notifica()");
		manejador.notifica();
	}

}
