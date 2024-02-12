package Logic;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author JafetDG
 */
public class ValidadorUsuario {
    /**
     * Método para validar las credenciales del usuario.
     *
     * @param nombreUsuario Nombre de usuario.
     * @param contrasenna   Contraseña del usuario.
     * @return true si las credenciales son válidas, false de lo contrario.
     */
    public static boolean validarCredenciales(String nombreUsuario, String contrasenna) {
        // Lógica para verificar en la base de datos
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/apphotelgte", "root", "bagaces12345")) {
            String sql = "SELECT contrasena FROM Usuario WHERE nombre = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, nombreUsuario);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        byte[] contrasenaEncriptada = resultSet.getBytes("contrasena");

                        // Desencriptar la contraseña almacenada en la base de datos
                        String contrasenaDesencriptada = desencriptarContrasena(contrasenaEncriptada);

                        // Obtener el hash de la contraseña ingresada
                        String hashContrasenaIngresada = obtenerHashContrasenaIngresada(contrasenna);

                        // Comparar la contraseña ingresada con la contraseña desencriptada
                        return contrasenaDesencriptada.equals(hashContrasenaIngresada);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }

        // Si no se encontró el usuario, retorna false
        return false;
    }

    /**
     * Método para desencriptar la contraseña almacenada en la base de datos.
     *
     * @param contrasenaEncriptada Contraseña almacenada en formato VARBINARY.
     * @return Contraseña desencriptada.
     */
    private static String desencriptarContrasena(byte[] contrasenaEncriptada) {
        // Convierte el array de bytes a una cadena hexadecimal
        StringBuilder hexStringBuilder = new StringBuilder();
        for (byte b : contrasenaEncriptada) {
            hexStringBuilder.append(String.format("%02x", b));
        }

        // Retorna la cadena hexadecimal
        return hexStringBuilder.toString();
    }

    /**
     * Método para obtener el hash de la contraseña ingresada.
     *
     * @param contrasena Contraseña ingresada por el usuario.
     * @return Hash de la contraseña.
     */
    private static String obtenerHashContrasenaIngresada(String contrasena) {
        try {
            // Obtener una instancia del algoritmo de hash SHA-256
            MessageDigest digest = MessageDigest.getInstance("SHA-256");

            // Convertir la contraseña a bytes y aplicar el hash
            byte[] hashBytes = digest.digest(contrasena.getBytes(StandardCharsets.UTF_8));

            // Convertir el hash a una cadena hexadecimal
            StringBuilder hexStringBuilder = new StringBuilder();
            for (byte b : hashBytes) {
                hexStringBuilder.append(String.format("%02x", b));
            }

            // Retornar la cadena hexadecimal
            return hexStringBuilder.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            // Manejar la excepción según tus necesidades
            return null;
        }
    }
}
