public class Principal {

	public static void main(String[] args) throws Exception {
		Persona persona1 = new Persona();
		persona1.setCi("44024677");
		persona1.setNombre("María Perez");
		persona1.setPais("Uruguay");
		persona1.setHabilitado(true);

		Persona persona2 = new Persona();
		persona2.setNombre("Santiago Diaz");
		persona2.setPais("Chile");
		persona2.setHabilitado(true);

		Persona persona3 = new Persona();
		persona3.setCi("33786754");
		persona3.setNombre("Jose Martin");
		persona3.setCredencial("AZA34579");
		persona3.setPais("Uruguay");
		persona3.setHabilitado(false);

		Persona persona4 = new Persona();
		persona4.setCi("24568976");
		persona4.setNombre("Juan Rodriguez");
		persona4.setCredencial("CPA57564");
		persona4.setPais("Uruguay");
		persona4.setHabilitado(true);

		try {
			if (persona1.puedeVotar()) {
				System.out.printf("%s está habiliado para votar\r\n", persona1.getNombre());
			}
		} catch (NoVotaException nve) {
			System.out.printf("%s %s", persona1.getNombre(), nve.getMessage());
		}

		try {
			if (persona2.puedeVotar()) {
				System.out.printf("%s está habiliado para votar\r\n", persona2.getNombre());
			}
		} catch (NoVotaException nve) {
			System.out.printf("%s %s", persona2.getNombre(), nve.getMessage());
		}

		try {
			if (persona3.puedeVotar()) {
				System.out.printf("%s está habiliado para votar\r\n", persona3.getNombre());
			}
		} catch (NoVotaException nve) {
			System.out.printf("%s %s", persona3.getNombre(), nve.getMessage());
		}

		try {
			if (persona4.puedeVotar()) {
				System.out.printf("%s está habiliado para votar\r\n", persona4.getNombre());
			}
		} catch (NoVotaException nve) {
			System.out.printf("%s %s", persona4.getNombre(), nve.getMessage());
		}

	}

}
