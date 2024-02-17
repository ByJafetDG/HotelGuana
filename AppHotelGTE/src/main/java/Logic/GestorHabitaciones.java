package Logic;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author JafetDG
 */
public class GestorHabitaciones {

    private static final String BASE_URL = "jdbc:mysql://apphotelgte.c7200s4s22kf.us-east-2.rds.amazonaws.com/apphotelgte";
    private static final String USERNAME = "admin";  //Cambiar cuando se vaya a instalar en el hotel
    private static final String PASSWORD = "bagaces12345"; //Cambiar cuando se vaya a instalar en el hotel

    public static String obtenerEstadoHabitacion(String numeroHabitacion) {
        String estado = null;

        try (Connection connection = DriverManager.getConnection(BASE_URL, USERNAME, PASSWORD)) {
            String sql = "SELECT estado FROM Habitaciones WHERE id_Habitacion = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, numeroHabitacion);

                try (ResultSet resultSet = statement.executeQuery()) {
                    if (resultSet.next()) {
                        estado = resultSet.getString("estado");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return estado;
    }

    public static void actualizarEstadoHabitacion(String numeroHabitacion, String nuevoEstado) {
        try (Connection connection = DriverManager.getConnection(BASE_URL, USERNAME, PASSWORD)) {
            String sql = "UPDATE Habitaciones SET estado = ? WHERE id_Habitacion = ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setString(1, nuevoEstado);
                statement.setString(2, numeroHabitacion);
                statement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void manejarClicHabitacion(JLabel label, String numeroHabitacion) {
        String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
        String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                label,
                "Selecciona el estado de la habitación:",
                "Estado de la Habitación",
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]);

        if (opcionSeleccionada != null) {
            String estadoHabitacion = obtenerEstadoHabitacion(numeroHabitacion);
            actualizarImagen(label, opcionSeleccionada, numeroHabitacion);
        }
    }

    public static void actualizarImagen(JLabel label, String opcion, String numeroHabitacion) {
        String carpetaBase = obtenerCarpetaBase(opcion);
        String rutaImagen = carpetaBase + "n" + numeroHabitacion + opcion.substring(0, 1).toUpperCase() + opcion.substring(1) + ".png";

        System.out.println("Ruta de la imagen: " + rutaImagen);

        label.setIcon(new ImageIcon(GestorHabitaciones.class.getResource(rutaImagen)));
        actualizarEstadoHabitacion(numeroHabitacion, opcion);
    }

    private static String obtenerCarpetaBase(String opcion) {
        switch (opcion) {
            case "Mantenimiento":
                return "/habitaciones_rojo/";
            case "Ocupada":
                return "/habitaciones_verde/";
            case "Limpieza":
                return "/habitaciones_morado/";
            case "Varios días":
                return "/habitaciones_amarillo/";
            case "Reservada":
                return "/habitaciones_celeste/";
            case "Disponible":
                return "/habitaciones/";
            default:
                return "";
        }
    }

    public static void cargarImagenSegunEstado(JLabel label, String numeroHabitacion) {
        String estadoActual = obtenerEstadoHabitacion(numeroHabitacion);
        String carpetaBase = obtenerCarpetaBase(estadoActual);
        String rutaImagen = carpetaBase + "n" + numeroHabitacion + estadoActual.substring(0, 1).toUpperCase() + estadoActual.substring(1) + ".png";

        System.out.println("Ruta de la imagen: " + rutaImagen);

        label.setIcon(new ImageIcon(GestorHabitaciones.class.getResource(rutaImagen)));
    }
}
