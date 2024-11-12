

public class PaquetePorCant extends Paquete {
	
	private int cantRestante = 0;

	public PaquetePorCant (int usosComprados) {
		this.cantRestante = usosComprados;
		}

	@Override
	public boolean puedoIngresar(Servicio servicioAIngresar) {
		boolean validacion = false;
		if (this.cantRestante >0) {
			validacion = true;
			this.cantRestante --;
		}
		return validacion;
	}
	
	public void comprarMasUsos (int usosComprados) { // Esto justifica el if en puedoIngresar, así el atributo no llega a numeros negativos y la persona con el paquete puede seguir comprando.
		this.cantRestante =+ usosComprados;	
	}
}
