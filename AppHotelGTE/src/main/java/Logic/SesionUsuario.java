package Logic;

/**
 *
 * @author JafetDG
 */
public class SesionUsuario {
    private static SesionUsuario instanciaUnica;
    private String nombreUsuario;

    private SesionUsuario() {
        // Constructor privado para seguir el patrón Singleton
    }

    public static SesionUsuario obtenerInstancia() {
        if (instanciaUnica == null) {
            instanciaUnica = new SesionUsuario();
        }
        return instanciaUnica;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

//    public void destroy() {
//        nombreUsuario = null;
//    }
    
}
