package prueba;

import java.util.ArrayList;
import java.util.Arrays;

public class Ahorcado {
	private static final ArrayList<String> artistasPop = new ArrayList<String>();
	private static final ArrayList<String> peliculasFamosas = new ArrayList<String>();
	private static final ArrayList<String> paises = new ArrayList<String>();
	private String palabraOculta;
	private char[] palabra2;
	private char[] palabraAdivinada;
	private int intentos = 0;
	private String letrasAdivinadas = "";
	private String genero;

	public String getGenero() {
		return genero;
	}

	public char[] getPalabra2() {
		return palabra2;
	}

	public void setPalabra2(char[] palabra2) {
		this.palabra2 = palabra2;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPalabraOculta() {
		return palabraOculta;
	}

	public void setPalabraOculta(String palabraOculta) {
		this.palabraOculta = palabraOculta.toLowerCase();
	}

	public int getIntentos() {
		return intentos;
	}

	public void setIntentos(int intentos) {
		this.intentos = intentos;
	}

	public String getLetrasAdivinadas() {
		return letrasAdivinadas;
	}

	public void setLetrasAdivinadas(String letrasAdivinadas) {
		this.letrasAdivinadas = letrasAdivinadas;
	}

	public char[] getPalabraAdivinada() {
		return palabraAdivinada;
	}

	public void setPalabraAdivinada(char[] palabraAdivinada) {
		this.palabraAdivinada = palabraAdivinada;
	}

//constructores
	public Ahorcado(String palabraOculta, int intentos, String letrasAdivinadas, String genero) {
		super();
		this.palabraOculta = palabraOculta;
		this.intentos = intentos;
		this.letrasAdivinadas = letrasAdivinadas;
		this.genero = genero;

		// Array de adivinacion al inicializar el constructor
		palabraAdivinada = new char[palabraOculta.length()];
		Arrays.fill(palabraAdivinada, '_');// se fillea con guiones bajos
	}

	public Ahorcado() {
		super();
	}

	@Override
	public String toString() {
		return "Ahorcado [palabraOculta=" + palabraOculta + ", intentos=" + intentos + ", letrasAdivinadas="
				+ letrasAdivinadas + ", genero=" + genero + "]";
	}

	public String escogerGenero(String generoAhorcado) {

		int gen = 0;
		if (generoAhorcado.equalsIgnoreCase("Pop")) {

			artistasPop.add("The Kid Laroi");
			artistasPop.add("Clairo");
			artistasPop.add("The Marias");
			artistasPop.add("Olivia Rodrigo");
			artistasPop.add("Billie Eilish");
			artistasPop.add("Dua Lipa");
			artistasPop.add("Harry Styles");
			artistasPop.add("Taylor Swift");
			artistasPop.add("Charlie Puth");
			artistasPop.add("Doja Cat");
			artistasPop.add("Tate McRae");
			artistasPop.add("Rauw Alejandro");
			artistasPop.add("Rosalia");
			artistasPop.add("Conan Gray");
			artistasPop.add("Sabrina Carpenter");
			artistasPop.add("Shawn Mendes");
			artistasPop.add("The Weeknd");
			artistasPop.add("Selena Gomez");
			artistasPop.add("Troye Sivan");
			artistasPop.add("SZA");
			artistasPop.add("Ariana Grande");
			artistasPop.add("Khalid");
			artistasPop.add("Lana Del Rey");
			artistasPop.add("Gracie Abrams");
			artistasPop.add("Emma Cazot");
			genero = "Pop";

			gen = 1;
		} else if (generoAhorcado.equalsIgnoreCase("Peliculas")) {

			// Acción
			peliculasFamosas.add("John Wick");
			peliculasFamosas.add("Mad Max");
			peliculasFamosas.add("Gladiador");
			peliculasFamosas.add("El Caballero Oscuro");
			peliculasFamosas.add("Duro de Matar");
			peliculasFamosas.add("Terminator");
			peliculasFamosas.add("Rápidos y Furiosos");
			peliculasFamosas.add("Matrix");
			peliculasFamosas.add("Origen");
			peliculasFamosas.add("Misión Imposible");

			// Ciencia ficción
			peliculasFamosas.add("Interestelar");
			peliculasFamosas.add("Blade Runner");
			peliculasFamosas.add("Star Wars");
			peliculasFamosas.add("Marte");
			peliculasFamosas.add("Avatar");
			peliculasFamosas.add("Duna");
			peliculasFamosas.add("Parque Jurásico");
			peliculasFamosas.add("Al Filo del Mañana");
			peliculasFamosas.add("Ex Machina");
			peliculasFamosas.add("Elysium");

			// Terror
			peliculasFamosas.add("El Conjuro");
			peliculasFamosas.add("It");
			peliculasFamosas.add("Halloween");
			peliculasFamosas.add("Un Lugar en Silencio");
			peliculasFamosas.add("Hereditary");
			peliculasFamosas.add("Huye");
			peliculasFamosas.add("El Exorcista");
			peliculasFamosas.add("Saw");
			peliculasFamosas.add("Sinister");
			peliculasFamosas.add("Scream");

			// Comedia
			peliculasFamosas.add("Supercool");
			peliculasFamosas.add("¿Qué Pasó Ayer?");
			peliculasFamosas.add("Tonto y Retonto");
			peliculasFamosas.add("Deadpool");
			peliculasFamosas.add("Hermanos por Pelotas");
			peliculasFamosas.add("El Reportero");
			peliculasFamosas.add("Damas en Guerra");
			peliculasFamosas.add("El Gran Hotel Budapest");
			peliculasFamosas.add("El Día Libre de Ferris Bueller");

			// Drama
			peliculasFamosas.add("Forrest Gump");
			peliculasFamosas.add("Sueños de Fuga");
			peliculasFamosas.add("Titanic");
			peliculasFamosas.add("En Busca de la Felicidad");
			peliculasFamosas.add("Una Mente Brillante");
			peliculasFamosas.add("Mente Indomable");
			peliculasFamosas.add("Milagros Inesperados");
			peliculasFamosas.add("El Renacido");
			peliculasFamosas.add("Guasón");

			// Animación
			peliculasFamosas.add("Toy Story");
			peliculasFamosas.add("Shrek");
			peliculasFamosas.add("Buscando a Nemo");
			peliculasFamosas.add("Spider-Man: Un Nuevo Universo");
			peliculasFamosas.add("Frozen");
			peliculasFamosas.add("El Rey León");
			peliculasFamosas.add("Coco");
			peliculasFamosas.add("Up");
			peliculasFamosas.add("IntensaMente");
			peliculasFamosas.add("Encanto");
			genero = "Peliculas";
			gen = 2;
		} else if (generoAhorcado.equalsIgnoreCase("Paises")) {

			// América
			paises.add("Argentina");
			paises.add("Brasil");
			paises.add("Chile");
			paises.add("Colombia");
			paises.add("México");
			paises.add("Perú");
			paises.add("Estados Unidos");
			paises.add("Canadá");
			paises.add("Venezuela");
			paises.add("Ecuador");

			// Europa
			paises.add("España");
			paises.add("Francia");
			paises.add("Italia");
			paises.add("Alemania");
			paises.add("Reino Unido");
			paises.add("Portugal");
			paises.add("Países Bajos");
			paises.add("Suecia");
			paises.add("Grecia");
			paises.add("Noruega");

			// Asia
			paises.add("Japón");
			paises.add("China");
			paises.add("Corea del Sur");
			paises.add("India");
			paises.add("Tailandia");
			paises.add("Vietnam");
			paises.add("Filipinas");
			paises.add("Indonesia");
			paises.add("Arabia Saudita");
			paises.add("Turquía");

			// África
			paises.add("Sudáfrica");
			paises.add("Egipto");
			paises.add("Nigeria");
			paises.add("Marruecos");
			paises.add("Argelia");
			paises.add("Kenia");
			paises.add("Etiopía");
			paises.add("Senegal");
			paises.add("Ghana");
			paises.add("Tanzania");

			// Oceanía
			paises.add("Australia");
			paises.add("Nueva Zelanda");
			paises.add("Fiji");
			paises.add("Papúa Nueva Guinea");
			paises.add("Samoa");
			paises.add("Islas Salomón");
			genero = "Paises";
			gen = 3;

		} else {
			System.out.println("Genero no valido");
		}

		return genero;
	}

	public void escogerPalabra() {
		int random = 0;
		switch (genero) {
		case "Pop":
			random = (int) (Math.random() * artistasPop.size());
			palabraOculta = (artistasPop.get(random));
			palabraOculta = palabraOculta.toLowerCase();
			break;
		case "Peliculas":
			random = (int) (Math.random() * peliculasFamosas.size());
			palabraOculta = (peliculasFamosas.get(random));
			palabraOculta = palabraOculta.toLowerCase();
			break;
		case "Paises":
			random = (int) (Math.random() * paises.size());
			palabraOculta = paises.get(random);
			palabraOculta = palabraOculta.toLowerCase();
			break;
		}

		palabra2 = palabraOculta.toCharArray();// convierte mi String a un array[] de caracteres
		palabraAdivinada = new char[palabraOculta.length()];

		// aca controlamos los espacios en blanco
		for (int i = 0; i < palabraOculta.length(); i++) {
			if (palabraOculta.charAt(i) == ' ') {
				palabraAdivinada[i] = ' ';
			} else {
				palabraAdivinada[i] = '_';
			}
		}
	}

//empezamos los metodos
	// este metodo es privado pq solo lo utilizara la clase para ver si la letra
	// introducida por el usuario es correcta o no, en caso contrario
	// el metodo de ahorcado
	private boolean mirarLetra(String letra) {
		boolean letraCorrecta = false;
		for (int i = 0; i < palabraOculta.length(); i++) {// si la letra se encuentra en alguna pos de mi String, = true
			// ignoramos los espacios en blanco de palabraOculta
			if (palabraOculta.charAt(i) == letra.charAt(0) && palabraOculta.charAt(i) != ' ') {
				letraCorrecta = true;
				break;
			} else {
				letraCorrecta = false;
			}

		}
		return letraCorrecta;
	}

	public void ahorcado(String letra) {
		// verificamos que la letra no sea ni nula, que su longitud sea de 1 unicamente
		// y que no sea un espacio en blanco...
		if (letra == null || letra.length() != 1) {
			System.out.println("Error, ingrese un solo caracter");
			return;// no avanza el programa ya que da error
		}

		// como convertimos palabraOculta a minusculas, la letra tambien para que el
		// usuario no tenga que diferenciar

		letra = letra.toLowerCase();

		if (mirarLetra(letra))// si true
		{
			for (int i = 0; i < palabraOculta.length(); i++) {
				if (palabraOculta.charAt(i) == letra.charAt(0)) {
					palabraAdivinada[i] = letra.charAt(0);// guardamos la letra en nuestro array de char[], verificamos
					// que nuestro array tenga la longitud de la palabra elegida
				}
			}
		} else {
			intentos++;// si false, sumamos a los intentos
			System.out.println("Fallaste, ingresa otra letra, llevas: " + intentos + " intentos de 5");
		}
	}

	public String mostrarPalabraAdivinada() {// convierte char[] palabra2 a un String para manejarlo mas facilmente
		return String.valueOf(palabraAdivinada);
	}

}
