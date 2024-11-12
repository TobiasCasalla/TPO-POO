public class Restaurant extends Servicio{

    private boolean vegano;
    
    public Restaurant (boolean esVegano) {
    	
    	this.setVegano(esVegano);
		
	}

	public boolean isVegano() {
		return vegano;
	}

	public void setVegano(boolean vegano) {
		this.vegano = vegano;
	}


}
