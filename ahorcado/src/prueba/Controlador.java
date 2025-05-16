package prueba;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Controlador {
//    private AhorcadoDAO ahorcadoDAO = new AhorcadoDAO();

//Tener aqui solo metodos que lean y escriban en ficheros y los demas metodos iran en jugador, ahorcado y en los daos
    
    public ArrayList<String> obtenerPalabras(String categoria) {
        ArrayList<String> palabras = ahorcadoDAO.obtenerPalabrasPorCategoria(categoria);
        
        if (palabras.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Error: No hay palabras registradas en la base de datos para esta categoría.", "Error de BBDD", JOptionPane.ERROR_MESSAGE);
        }
        return palabras;
    }

    // Manejar archivos
    public void escribirJugador(String nombre, int puntos) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("jugadorDatos.txt", true))) {
            writer.write(nombre + "," + puntos);
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Error al escribir en el fichero.");
        }
    }

    public void cargarJugadores() {
        try (BufferedReader reader = new BufferedReader(new FileReader("jugadorDatos.txt"))) {
            String linea;
            JugadorDAO jugadorDAO = new JugadorDAO();
            
            while ((linea = reader.readLine()) != null) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                int puntos = Integer.parseInt(datos[1]);
                jugadorDAO.insertarJugador(nombre, puntos);
            }
        } catch (IOException e) {
            System.out.println("Error al leer el fichero.");
        }
    }
}
