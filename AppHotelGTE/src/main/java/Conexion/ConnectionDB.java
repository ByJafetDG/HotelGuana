package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JafetDG
 */
public class ConnectionDB {
    private static final String URL = "jdbc:mysql://localhost:3306/apphotelgte";
    private static final String USUARIO = "root";
    private static final String CONTRASEÑA = "bagaces12345";

    public static Connection obtenerConexion() throws SQLException {
        return DriverManager.getConnection(URL, USUARIO, CONTRASEÑA);
    }

              
    public static void cerrarConexion(Connection conexion) {
        if (conexion != null) {
            try {
                conexion.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
   
}
