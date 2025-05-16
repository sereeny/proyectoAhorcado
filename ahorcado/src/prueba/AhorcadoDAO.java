package prueba;

import java.sql.*;
import java.util.ArrayList;

public class AhorcadoDAO {
	public ArrayList<String> obtenerPalabrasPorCategoria(String categoria) {
		ArrayList<String> palabras = new ArrayList<>();
		String sql = "SELECT palabra FROM PalabrasAhorcado WHERE categoria = ?";

		try (Connection conn = ConexionBBDD.obtenerConexion(); PreparedStatement stmt = conn.prepareStatement(sql)) {

			stmt.setString(1, categoria);
			ResultSet rs = stmt.executeQuery();

			while (rs.next()) {
				palabras.add(rs.getString("palabra"));
			}

		} catch (SQLException e) {
			System.out.println("Error al consultar la base de datos.");
		}
		return palabras;
	}
}
