package prueba;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JugadorDAO {

	// Crear (Insertar)
	public void insertarJugador(String nombre, int puntos) throws SQLException {
		Connection conn = ConexionBBDD.obtenerConexion();
		PreparedStatement stmt = null;

		try {
			stmt = conn.prepareStatement("INSERT INTO Jugadores (nombre, puntaje) VALUES (?, ?)");
			stmt.setString(1, nombre);
			stmt.setInt(2, puntos);
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error al insertar el jugador en la base de datos.");
		} finally {
			ConexionBBDD.cerrarConexion(stmt, conn);
		}
	}

	// Leer
	public int obtenerPuntajePorNombre(String nombre) throws SQLException {
		Connection conn = ConexionBBDD.obtenerConexion();
		PreparedStatement stmt = null;
		ResultSet rs = null;
		int puntaje = -1;

		try {
			stmt = conn.prepareStatement("SELECT puntaje FROM Jugadores WHERE nombre = ?");
			stmt.setString(1, nombre);
			rs = stmt.executeQuery();

			if (rs.next()) {
				puntaje = rs.getInt("puntaje");
			}
		} catch (SQLException e) {
			System.out.println("Error al obtener puntaje.");
		} finally {
			ConexionBBDD.cerrarConexion(stmt, conn);
		}

		return puntaje;
	}

	// Actualizar
	public void actualizarPuntaje(String nombre, int nuevoPuntaje) throws SQLException {
		Connection conn = ConexionBBDD.obtenerConexion();
		PreparedStatement stmt = null;

		try {
			stmt = conn.prepareStatement("UPDATE Jugadores SET puntaje = ? WHERE nombre = ?");
			stmt.setInt(1, nuevoPuntaje);
			stmt.setString(2, nombre);
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error al actualizar puntaje.");
		} finally {
			ConexionBBDD.cerrarConexion(stmt, conn);
		}
	}

	// Eliminar
	public void eliminarJugador(String nombre) throws SQLException {
		Connection conn = ConexionBBDD.obtenerConexion();
		PreparedStatement stmt = null;

		try {
			stmt = conn.prepareStatement("DELETE FROM Jugadores WHERE nombre = ?");
			stmt.setString(1, nombre);
			stmt.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error al eliminar jugador.");
		} finally {
			ConexionBBDD.cerrarConexion(stmt, conn);
		}
	}

}
