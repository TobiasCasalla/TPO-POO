

public class PaqueteParqueFav extends Paquete {
	
	private Parque parqueFav;

	public PaqueteParqueFav (Parque parqueElegido) {
		this.parqueFav = parqueElegido;
	}
	
	
	public boolean puedoIngresar(Servicio servicioAIngresar) {
		return parqueFav.Atracciones.contains(servicioAIngresar) || parqueFav.Restaurantes.contains(servicioAIngresar);
		 
	}

}
