package prueba;

import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Controlador controlador = new Controlador();
		JugadorDAO jugadorDAO = new JugadorDAO();

		// 📌 Registro del jugador
		System.out.println("Ingrese su nombre:");
		String nombre = scanner.nextLine();

		if (!Validaciones.validarNombre(nombre))
			return;

		// 🔍 Comprobamos si el jugador ya existe en la base de datos
		int puntaje = jugadorDAO.obtenerPuntajePorNombre(nombre);
		if (puntaje == -1) {
			System.out.println("Jugador nuevo, iniciando con 0 puntos.");
			jugadorDAO.insertarJugador(nombre, 0);
		} else {
			System.out.println("Jugador encontrado. Tu puntaje actual es: " + puntaje);
		}

		// 🏆 Selección de género
		System.out.println("Elige un género: Pop, Peliculas, Paises:");
		String genero = scanner.nextLine();

		if (!Validaciones.validarGenero(genero))
			return;

		// 🔄 Obtener palabras desde la BBDD o fichero
		ArrayList<String> palabras = controlador.obtenerPalabras(genero);
		if (palabras.isEmpty()) {
			System.out.println("Error: No hay palabras disponibles en la BBDD.");
			return;
		}

		// 🎭 Elegimos una palabra
		Ahorcado partida = new Ahorcado();
		partida.setPalabraOculta(palabras.get((int) (Math.random() * palabras.size())).toLowerCase());
		System.out.println("Palabra elegida: " + partida.mostrarPalabraAdivinada());

		// 🎮 Comenzar el juego
		while (partida.getIntentos() < 6 && partida.mostrarPalabraAdivinada().contains("_")) {
			System.out.println("Ingrese una letra:");
			String letra = scanner.nextLine();

			if (!Validaciones.validarLetra(letra)) {
				System.out.println("Letra inválida, intenta nuevamente.");
				continue;
			}

			partida.ahorcado(letra);
			System.out.println("Palabra actual: " + partida.mostrarPalabraAdivinada());
			System.out.println("Intentos restantes: " + (6 - partida.getIntentos()));
		}

		// ✅ Determinar el resultado
		if (partida.mostrarPalabraAdivinada().equals(partida.getPalabraOculta())) {
			System.out.println("¡Felicidades, has ganado!");
			puntaje += 10;
			jugadorDAO.actualizarPuntaje(nombre, puntaje);
		} else {
			System.out.println("Has perdido. La palabra era: " + partida.getPalabraOculta());
		}

		System.out.println("Tu puntaje final es: " + jugadorDAO.obtenerPuntajePorNombre(nombre));

	}
}
