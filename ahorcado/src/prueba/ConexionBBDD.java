package prueba;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class ConexionBBDD {
	private static final String URL = "jdbc:mysql://localhost:3306/ahorcado";
	private static final String USER = "root";
	private static final String PASSWORD = "password";

	public static Connection obtenerConexion() throws SQLException {
		return DriverManager.getConnection(URL, USER, PASSWORD);
	}

	public static void cerrarConexion(PreparedStatement stmt, Connection conn) {
		try {
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			System.out.println("Error al cerrar la conexión.");
		}
	}

}
