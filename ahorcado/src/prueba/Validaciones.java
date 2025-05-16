package prueba;

import javax.swing.*;

public class Validaciones {

	// Método para validar el nombre ingresado
	public static boolean validarNombre(String nombre) {
		if (nombre == null || nombre.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Error: No has ingresado un nombre.", "Error de entrada",
					JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}

	// Método para validar el género elegido
	public static boolean validarGenero(String genero) {
		String[] generosValidos = { "Pop", "Peliculas", "Paises" };
		for (String g : generosValidos) {
			if (g.equalsIgnoreCase(genero)) {
				return true;
			}
		}
		JOptionPane.showMessageDialog(null, "Error: Género inválido. Debes elegir entre 'Pop', 'Peliculas' o 'Paises'.",
				"Error de selección", JOptionPane.ERROR_MESSAGE);
		return false;
	}

	// Método para validar la letra ingresada
	public static boolean validarLetra(String letra) {
		if (letra == null || letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
			JOptionPane.showMessageDialog(null, "Error: Debes ingresar solo una letra.", "Error de entrada",
					JOptionPane.WARNING_MESSAGE);
			return false;
		}
		return true;
	}
}
