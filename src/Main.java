

public class Main {
	public static void main(String[] args) {
		
		// CREACION DE PARQUES
		Parque Epcot = new Parque();
		Parque Hollywood = new Parque();
		Parque MagicKingdom = new Parque();
		Parque AnimalKingdom = new Parque();
			
		
		//CREACION DE PAQUETES
		PaqueteExperienciaCompleta paseDeEmir = new PaqueteExperienciaCompleta();
		PaqueteParqueFav paseDeVani = new PaqueteParqueFav(AnimalKingdom);
		PaquetePorCant paseDeTobi = new PaquetePorCant(10);
		PaqueteInfantil paseDeLalo = new PaqueteInfantil();
		
		
		//CREACION DE ATRACCIONES
		Atraccion pulpitoGiratorio = new Atraccion();
		Atraccion simuladorSpiderman = new Atraccion();


		//CREACION DE RESTAURANTES
		Restaurant restoAvengers = new Restaurant(false);
		Restaurant restoAleman = new Restaurant(true);
		
		
		//INCLUIR ATRACCIONES EN PARQUES
		AnimalKingdom.Atracciones.add(pulpitoGiratorio);
		Hollywood.Atracciones.add(simuladorSpiderman);

		//INCLUIR RESTAURANTES EN PARQUES
		Hollywood.Restaurantes.add(restoAvengers);
		Epcot.Restaurantes.add(restoAleman);

		//SETEO DE ATRACCIONES Y RESTAURANTES APTAS PARA MENORES
		pulpitoGiratorio.setAptoInfantil();
		restoAvengers.setAptoInfantil();
		
		
		//CONTROL DE INGRESO
		System.out.println(paseDeVani.puedoIngresar(simuladorSpiderman));
		System.out.println(paseDeLalo.puedoIngresar(pulpitoGiratorio));
		System.out.println(paseDeLalo.puedoIngresar(simuladorSpiderman));
		System.out.println(paseDeEmir.puedoIngresar(restoAleman));
		
		
	}
}
