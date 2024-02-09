package Frames;

import static Conexion.ConnectionDB.obtenerConexion;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
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
public class FrmHabitaciones extends javax.swing.JFrame {

    String numeroHabitacion = "1";
    String numeroHabitacion2 = "2";
    String numeroHabitacion3 = "3";

    public FrmHabitaciones() {
        initComponents();
        setLocationRelativeTo(null);
        /*Al ejecutar el programa se abrirá en pantalla completa*/
        setExtendedState(MAXIMIZED_BOTH);

        cargarImagenSegunEstado(lblN1, numeroHabitacion);
        cargarImagenSegunEstado(lblN2, numeroHabitacion2);
        cargarImagenSegunEstado(lblN3, numeroHabitacion3);
        
        // Agrega un MouseListener al JLabel
        lblN1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Obtén el número de habitación del JLabel
                String numeroHabitacion = "1"; // Cambia esto por la lógica que uses para obtener el número de habitación

                // Muestra el JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Si se selecciona una opción, actualiza la imagen
                if (opcionSeleccionada != null) {
                    // Consulta a la base de datos para obtener el estado de la habitación
                    String estadoHabitacion = obtenerEstadoHabitacionDesdeBaseDeDatos(numeroHabitacion);

                    // Actualiza la imagen según la opción seleccionada
                    actualizarImagen(lblN1, opcionSeleccionada, numeroHabitacion);
                }
            }
        });
        // Agrega un MouseListener al JLabel
        lblN2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Obtén el número de habitación del JLabel
                String numeroHabitacion = "2"; // Cambia esto por la lógica que uses para obtener el número de habitación

                // Muestra el JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Si se selecciona una opción, actualiza la imagen
                if (opcionSeleccionada != null) {
                    // Consulta a la base de datos para obtener el estado de la habitación
                    String estadoHabitacion = obtenerEstadoHabitacionDesdeBaseDeDatos(numeroHabitacion);

                    // Actualiza la imagen según la opción seleccionada
                    actualizarImagen(lblN2, opcionSeleccionada, numeroHabitacion);
                }
            }
        });
        // Agrega un MouseListener al JLabel
        lblN3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Obtén el número de habitación del JLabel
                String numeroHabitacion = "3"; // Cambia esto por la lógica que uses para obtener el número de habitación

                // Muestra el JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Si se selecciona una opción, actualiza la imagen
                if (opcionSeleccionada != null) {
                    // Consulta a la base de datos para obtener el estado de la habitación
                    String estadoHabitacion = obtenerEstadoHabitacionDesdeBaseDeDatos(numeroHabitacion);

                    // Actualiza la imagen según la opción seleccionada
                    actualizarImagen(lblN3, opcionSeleccionada, numeroHabitacion);
                }
            }
        });

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lblLogo = new javax.swing.JLabel();
        lblMantenimiento = new javax.swing.JLabel();
        lblOcupada = new javax.swing.JLabel();
        lblLimpieza = new javax.swing.JLabel();
        lblVariosDias = new javax.swing.JLabel();
        lblReservada = new javax.swing.JLabel();
        lblHabitaciones = new javax.swing.JLabel();
        panelHabitaciones = new javax.swing.JPanel();
        scrollHabitaciones = new javax.swing.JScrollPane();
        panelScrollHab = new javax.swing.JPanel();
        panelPrimeraFila = new javax.swing.JPanel();
        lblN5 = new javax.swing.JLabel();
        lblN4 = new javax.swing.JLabel();
        lblN3 = new javax.swing.JLabel();
        lblN2 = new javax.swing.JLabel();
        lblN1 = new javax.swing.JLabel();
        panelSegundaFila = new javax.swing.JPanel();
        lblN10 = new javax.swing.JLabel();
        lblN9 = new javax.swing.JLabel();
        lblN8 = new javax.swing.JLabel();
        lblN7 = new javax.swing.JLabel();
        lblN6 = new javax.swing.JLabel();
        panelTerceraFila = new javax.swing.JPanel();
        lblN15 = new javax.swing.JLabel();
        lblN14 = new javax.swing.JLabel();
        lblN13 = new javax.swing.JLabel();
        lblN12 = new javax.swing.JLabel();
        lblN11 = new javax.swing.JLabel();
        panelCuartaFila = new javax.swing.JPanel();
        lblN20 = new javax.swing.JLabel();
        lblN19 = new javax.swing.JLabel();
        lblN18 = new javax.swing.JLabel();
        lblN17 = new javax.swing.JLabel();
        lblN16 = new javax.swing.JLabel();
        panelCuartaFila1 = new javax.swing.JPanel();
        lblN25 = new javax.swing.JLabel();
        lblN24 = new javax.swing.JLabel();
        lblN23 = new javax.swing.JLabel();
        lblN22 = new javax.swing.JLabel();
        lblN21 = new javax.swing.JLabel();
        panelCuartaFila2 = new javax.swing.JPanel();
        lblN29 = new javax.swing.JLabel();
        lblN28 = new javax.swing.JLabel();
        lblN27 = new javax.swing.JLabel();
        lblN26 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        lblLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/logo (Personalizado).png"))); // NOI18N

        lblMantenimiento.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estados/mantenimiento_figma.png"))); // NOI18N

        lblOcupada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estados/ocupada_figma.png"))); // NOI18N

        lblLimpieza.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estados/limpieza_figma.png"))); // NOI18N

        lblVariosDias.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estados/variosdias_figma.png"))); // NOI18N

        lblReservada.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estados/reservada_figma.png"))); // NOI18N

        lblHabitaciones.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        lblHabitaciones.setForeground(new java.awt.Color(0, 0, 0));
        lblHabitaciones.setIcon(new javax.swing.ImageIcon(getClass().getResource("/labels/Habitaciones.png"))); // NOI18N

        panelHabitaciones.setBackground(new java.awt.Color(255, 255, 255));

        scrollHabitaciones.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        panelScrollHab.setBackground(new java.awt.Color(255, 255, 255));

        panelPrimeraFila.setBackground(new java.awt.Color(255, 255, 255));

        lblN5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n5_figma.png"))); // NOI18N
        lblN5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n4_figma.png"))); // NOI18N
        lblN4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n3Disponible.png"))); // NOI18N
        lblN3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n2Disponible.png"))); // NOI18N
        lblN2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n1Disponible.png"))); // NOI18N
        lblN1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelPrimeraFilaLayout = new javax.swing.GroupLayout(panelPrimeraFila);
        panelPrimeraFila.setLayout(panelPrimeraFilaLayout);
        panelPrimeraFilaLayout.setHorizontalGroup(
            panelPrimeraFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrimeraFilaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblN1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 23, Short.MAX_VALUE)
                .addComponent(lblN2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(lblN3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 23, Short.MAX_VALUE)
                .addComponent(lblN4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(lblN5)
                .addGap(25, 25, 25))
        );
        panelPrimeraFilaLayout.setVerticalGroup(
            panelPrimeraFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrimeraFilaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelPrimeraFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblN5)
                    .addGroup(panelPrimeraFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblN4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelSegundaFila.setBackground(new java.awt.Color(255, 255, 255));

        lblN10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n10_figma.png"))); // NOI18N
        lblN10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n9_figma.png"))); // NOI18N
        lblN9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n8_figma.png"))); // NOI18N
        lblN8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n7_figma.png"))); // NOI18N
        lblN7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n6_figma.png"))); // NOI18N
        lblN6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelSegundaFilaLayout = new javax.swing.GroupLayout(panelSegundaFila);
        panelSegundaFila.setLayout(panelSegundaFilaLayout);
        panelSegundaFilaLayout.setHorizontalGroup(
            panelSegundaFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSegundaFilaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblN6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(lblN7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lblN8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(lblN9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lblN10)
                .addGap(25, 25, 25))
        );
        panelSegundaFilaLayout.setVerticalGroup(
            panelSegundaFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelSegundaFilaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelSegundaFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblN10)
                    .addGroup(panelSegundaFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblN9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN6)))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panelTerceraFila.setBackground(new java.awt.Color(255, 255, 255));

        lblN15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n15_figma.png"))); // NOI18N
        lblN15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n14_figma.png"))); // NOI18N
        lblN14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n13_figma.png"))); // NOI18N
        lblN13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n12_figma.png"))); // NOI18N
        lblN12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n11_figma.png"))); // NOI18N
        lblN11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelTerceraFilaLayout = new javax.swing.GroupLayout(panelTerceraFila);
        panelTerceraFila.setLayout(panelTerceraFilaLayout);
        panelTerceraFilaLayout.setHorizontalGroup(
            panelTerceraFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTerceraFilaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblN11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(lblN12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lblN13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(lblN14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lblN15)
                .addGap(25, 25, 25))
        );
        panelTerceraFilaLayout.setVerticalGroup(
            panelTerceraFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTerceraFilaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelTerceraFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblN15)
                    .addGroup(panelTerceraFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblN14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN11)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        panelCuartaFila.setBackground(new java.awt.Color(255, 255, 255));

        lblN20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n20.png"))); // NOI18N
        lblN20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n19.png"))); // NOI18N
        lblN19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n18.png"))); // NOI18N
        lblN18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n17.png"))); // NOI18N
        lblN17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n16.png"))); // NOI18N
        lblN16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelCuartaFilaLayout = new javax.swing.GroupLayout(panelCuartaFila);
        panelCuartaFila.setLayout(panelCuartaFilaLayout);
        panelCuartaFilaLayout.setHorizontalGroup(
            panelCuartaFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartaFilaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblN16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(lblN17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lblN18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(lblN19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lblN20)
                .addGap(25, 25, 25))
        );
        panelCuartaFilaLayout.setVerticalGroup(
            panelCuartaFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartaFilaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelCuartaFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblN20)
                    .addGroup(panelCuartaFilaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblN19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN16)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        panelCuartaFila1.setBackground(new java.awt.Color(255, 255, 255));

        lblN25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n25.png"))); // NOI18N
        lblN25.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n24.png"))); // NOI18N
        lblN24.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n23.png"))); // NOI18N
        lblN23.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n22.png"))); // NOI18N
        lblN22.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n21.png"))); // NOI18N
        lblN21.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelCuartaFila1Layout = new javax.swing.GroupLayout(panelCuartaFila1);
        panelCuartaFila1.setLayout(panelCuartaFila1Layout);
        panelCuartaFila1Layout.setHorizontalGroup(
            panelCuartaFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartaFila1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblN21)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(lblN22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addComponent(lblN23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 20, Short.MAX_VALUE)
                .addComponent(lblN24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(lblN25)
                .addGap(25, 25, 25))
        );
        panelCuartaFila1Layout.setVerticalGroup(
            panelCuartaFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartaFila1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelCuartaFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblN25)
                    .addGroup(panelCuartaFila1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblN24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblN21)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        panelCuartaFila2.setBackground(new java.awt.Color(255, 255, 255));

        lblN29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n29.png"))); // NOI18N
        lblN29.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n28.png"))); // NOI18N
        lblN28.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n27.png"))); // NOI18N
        lblN27.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n26.png"))); // NOI18N
        lblN26.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout panelCuartaFila2Layout = new javax.swing.GroupLayout(panelCuartaFila2);
        panelCuartaFila2.setLayout(panelCuartaFila2Layout);
        panelCuartaFila2Layout.setHorizontalGroup(
            panelCuartaFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartaFila2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(lblN26)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblN27)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblN28)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblN29)
                .addGap(48, 48, 48))
        );
        panelCuartaFila2Layout.setVerticalGroup(
            panelCuartaFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCuartaFila2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(panelCuartaFila2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblN29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblN28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblN27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblN26))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout panelScrollHabLayout = new javax.swing.GroupLayout(panelScrollHab);
        panelScrollHab.setLayout(panelScrollHabLayout);
        panelScrollHabLayout.setHorizontalGroup(
            panelScrollHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrimeraFila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelScrollHabLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelScrollHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelSegundaFila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelTerceraFila, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCuartaFila, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCuartaFila1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelCuartaFila2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        panelScrollHabLayout.setVerticalGroup(
            panelScrollHabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelScrollHabLayout.createSequentialGroup()
                .addComponent(panelPrimeraFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelSegundaFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelTerceraFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelCuartaFila, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCuartaFila1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panelCuartaFila2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        scrollHabitaciones.setViewportView(panelScrollHab);

        javax.swing.GroupLayout panelHabitacionesLayout = new javax.swing.GroupLayout(panelHabitaciones);
        panelHabitaciones.setLayout(panelHabitacionesLayout);
        panelHabitacionesLayout.setHorizontalGroup(
            panelHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scrollHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 1200, Short.MAX_VALUE)
        );
        panelHabitacionesLayout.setVerticalGroup(
            panelHabitacionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelHabitacionesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, 510, Short.MAX_VALUE))
        );

        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/botones/btnRegresar.png"))); // NOI18N
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblMantenimiento)
                    .addComponent(lblOcupada))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblVariosDias)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lblLimpieza)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblReservada)))
                .addGap(18, 18, 18)
                .addComponent(lblHabitaciones)
                .addContainerGap())
            .addComponent(panelHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblMantenimiento)
                                        .addComponent(lblLimpieza, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(lblReservada))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblOcupada)
                                    .addComponent(lblVariosDias)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(lblHabitaciones, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                                .addComponent(btnRegresar)
                                .addGap(29, 29, 29)))))
                .addComponent(panelHabitaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        FrmPrincipal princi = new FrmPrincipal();
        princi.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    // Método para obtener el estado de la habitación desde la base de datos
    private String obtenerEstadoHabitacionDesdeBaseDeDatos(String numeroHabitacion) {
        String estado = null;

        // Establecer la conexión a la base de datos
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/apphotelgte", "root", "bagaces12345")) {
            // Consulta SQL para obtener el estado de la habitación
            String sql = "SELECT estado FROM Habitaciones WHERE id_Habitacion = ?";

            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                // Establecer el número de habitación como parámetro
                statement.setString(1, numeroHabitacion);

                // Ejecutar la consulta
                try (ResultSet resultSet = statement.executeQuery()) {
                    // Verificar si hay resultados
                    if (resultSet.next()) {
                        // Obtener el estado de la habitación
                        estado = resultSet.getString("estado");
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Manejar la excepción según tu necesidad
        }

        // Retornar el estado obtenido (puede ser null si no se encontró la habitación)
        return estado;
    }

    private void actualizarImagen(JLabel label, String opcion, String numeroHabitacion) {
        // Define la carpeta base según la opción seleccionada
        String carpetaBase = "";
        switch (opcion) {
            case "Mantenimiento":
                carpetaBase = "/habitaciones_rojo/";
                break;
            case "Ocupada":
                carpetaBase = "/habitaciones_verde/";
                break;
            case "Limpieza":
                carpetaBase = "/habitaciones_morado/";
                break;
            case "Varios días":
                carpetaBase = "/habitaciones_amarillo/";
                break;
            case "Reservada":
                carpetaBase = "/habitaciones_celeste/";
                break;
            case "Disponible":
                carpetaBase = "/habitaciones/";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }

        // Construye la ruta completa de la imagen
        String rutaImagen = carpetaBase + "n" + numeroHabitacion + opcion.substring(0, 1).toUpperCase() + opcion.substring(1) + ".png";

        // Imprime la ruta en la consola
        System.out.println("Ruta de la imagen: " + rutaImagen);

        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));

        // Actualiza el estado en la base de datos
        actualizarEstadoHabitacionEnBaseDeDatos(numeroHabitacion, opcion);
    }

    // Método para actualizar el estado de la habitación en la base de datos
    private void actualizarEstadoHabitacionEnBaseDeDatos(String numeroHabitacion, String nuevoEstado) {
        // Aquí deberías tener la lógica para actualizar el estado en la base de datos
        // Utiliza un PreparedStatement para evitar problemas de SQL injection
        try {
            Connection connection = obtenerConexion(); // Obtén la conexión a la base de datos
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

    private void cargarImagenSegunEstado(JLabel label, String numeroHabitacion) {
        // Consulta el estado actual de la habitación en la base de datos
        String estadoActual = obtenerEstadoHabitacionDesdeBaseDeDatos(numeroHabitacion);

        // Define la carpeta base según el estado obtenido
        String carpetaBase = "";
        switch (estadoActual) {
            case "Mantenimiento":
                carpetaBase = "/habitaciones_rojo/";
                break;
            case "Ocupada":
                carpetaBase = "/habitaciones_verde/";
                break;
            case "Disponible":
                carpetaBase = "/habitaciones/";
                break;
            case "Limpieza":
                carpetaBase = "/habitaciones_morado/";
                break;
            case "Reservada":
                carpetaBase = "/habitaciones_celeste/";
                break;
            case "Varios días":
                carpetaBase = "/habitaciones_amarillo/";
                break;
        }

        // Construye la ruta completa de la imagen
        String rutaImagen = carpetaBase + "n" + numeroHabitacion + estadoActual.substring(0, 1).toUpperCase() + estadoActual.substring(1) + ".png";

        // Imprime la ruta en la consola (opcional)
        System.out.println("Ruta de la imagen: " + rutaImagen);

        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHabitaciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHabitaciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel lblHabitaciones;
    private javax.swing.JLabel lblLimpieza;
    private javax.swing.JLabel lblLogo;
    private javax.swing.JLabel lblMantenimiento;
    private javax.swing.JLabel lblN1;
    private javax.swing.JLabel lblN10;
    private javax.swing.JLabel lblN11;
    private javax.swing.JLabel lblN12;
    private javax.swing.JLabel lblN13;
    private javax.swing.JLabel lblN14;
    private javax.swing.JLabel lblN15;
    private javax.swing.JLabel lblN16;
    private javax.swing.JLabel lblN17;
    private javax.swing.JLabel lblN18;
    private javax.swing.JLabel lblN19;
    private javax.swing.JLabel lblN2;
    private javax.swing.JLabel lblN20;
    private javax.swing.JLabel lblN21;
    private javax.swing.JLabel lblN22;
    private javax.swing.JLabel lblN23;
    private javax.swing.JLabel lblN24;
    private javax.swing.JLabel lblN25;
    private javax.swing.JLabel lblN26;
    private javax.swing.JLabel lblN27;
    private javax.swing.JLabel lblN28;
    private javax.swing.JLabel lblN29;
    private javax.swing.JLabel lblN3;
    private javax.swing.JLabel lblN4;
    private javax.swing.JLabel lblN5;
    private javax.swing.JLabel lblN6;
    private javax.swing.JLabel lblN7;
    private javax.swing.JLabel lblN8;
    private javax.swing.JLabel lblN9;
    private javax.swing.JLabel lblOcupada;
    private javax.swing.JLabel lblReservada;
    private javax.swing.JLabel lblVariosDias;
    private javax.swing.JPanel panelCuartaFila;
    private javax.swing.JPanel panelCuartaFila1;
    private javax.swing.JPanel panelCuartaFila2;
    private javax.swing.JPanel panelHabitaciones;
    private javax.swing.JPanel panelPrimeraFila;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JPanel panelScrollHab;
    private javax.swing.JPanel panelSegundaFila;
    private javax.swing.JPanel panelTerceraFila;
    private javax.swing.JScrollPane scrollHabitaciones;
    // End of variables declaration//GEN-END:variables
}
