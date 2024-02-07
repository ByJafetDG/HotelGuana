package Frames;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author JafetDG
 */
public class FrmHabitaciones extends javax.swing.JFrame{

   
    public FrmHabitaciones() {
        initComponents();
        setLocationRelativeTo(null);
        /*Al ejecutar el programa se abrirá en pantalla completa*/
        setExtendedState(MAXIMIZED_BOTH);
        
        // Agrega un MouseListener al JLabel
        lblN1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen(lblN1, opcionSeleccionada);
                }
            }
        });
        lblN2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen2(lblN2, opcionSeleccionada);
                }
            }
        });
        lblN3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen3(lblN3, opcionSeleccionada);
                }
            }
        });
        lblN4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen4(lblN4, opcionSeleccionada);
                }
            }
        });
        lblN5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen5(lblN5, opcionSeleccionada);
                }
            }
        });
        lblN7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen7(lblN7, opcionSeleccionada);
                }
            }
        });
        lblN8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen8(lblN8, opcionSeleccionada);
                }
            }
        });
        lblN9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen9(lblN9, opcionSeleccionada);
                }
            }
        });
        lblN10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen10(lblN10, opcionSeleccionada);
                }
            }
        });
        lblN11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen11(lblN11, opcionSeleccionada);
                }
            }
        });
        lblN12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen12(lblN12, opcionSeleccionada);
                }
            }
        });
        lblN13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen13(lblN13, opcionSeleccionada);
                }
            }
        });
        lblN14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen14(lblN14, opcionSeleccionada);
                }
            }
        });
        lblN15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen15(lblN15, opcionSeleccionada);
                }
            }
        });
        lblN16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen16(lblN16, opcionSeleccionada);
                }
            }
        });
        lblN17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen17(lblN17, opcionSeleccionada);
                }
            }
        });
        lblN18.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen18(lblN18, opcionSeleccionada);
                }
            }
        });
        lblN19.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen19(lblN19, opcionSeleccionada);
                }
            }
        });
        lblN20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen20(lblN20, opcionSeleccionada);
                }
            }
        });
        lblN21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen21(lblN21, opcionSeleccionada);
                }
            }
        });
        lblN22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen22(lblN22, opcionSeleccionada);
                }
            }
        });
        lblN23.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen23(lblN23, opcionSeleccionada);
                }
            }
        });
        lblN24.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen24(lblN24, opcionSeleccionada);
                }
            }
        });
        lblN25.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen25(lblN25, opcionSeleccionada);
                }
            }
        });
        lblN26.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen26(lblN26, opcionSeleccionada);
                }
            }
        });
        lblN27.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen27(lblN27, opcionSeleccionada);
                }
            }
        });
        lblN28.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen28(lblN28, opcionSeleccionada);
                }
            }
        });
        lblN29.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                // Abre un JOptionPane con las opciones
                String[] opciones = {"Mantenimiento", "Ocupada", "Limpieza", "Varios días", "Reservada", "Disponible"};
                String opcionSeleccionada = (String) JOptionPane.showInputDialog(
                        FrmHabitaciones.this,
                        "Selecciona el estado de la habitación:",
                        "Estado de la Habitación",
                        JOptionPane.QUESTION_MESSAGE,
                        null,
                        opciones,
                        opciones[0]);

                // Actualiza la imagen según la opción seleccionada
                if (opcionSeleccionada != null) {
                    actualizarImagen29(lblN29, opcionSeleccionada);
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

        lblN3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n3_figma.png"))); // NOI18N
        lblN3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n2_figma.png"))); // NOI18N
        lblN2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblN1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/habitaciones/n1_figma.png"))); // NOI18N
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
    
    

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n1Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n1Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n1Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n1Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n1Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n1_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }

        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen2(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n2Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n2Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n2Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n2Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n2Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n2_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }

        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen3(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n3Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n3Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n3Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n3Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n3Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n3_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }

        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen4(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n4Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n4Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n4Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n4Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n4Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n4_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }

        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen5(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n5Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n5Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n5Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n5Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n5Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n5_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }

        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen7(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n7Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n7Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n7Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n7Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n7Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n7_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }

        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen8(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n8Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n8Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n8Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n8Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n8Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n8_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }

        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen9(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n9Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n9Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n9Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n9Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n9Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n9_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }

        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen10(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n10Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n10Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n10Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n10Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n10Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n10_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen11(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n11Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n11Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n11Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n11Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n11Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n11_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen12(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n12Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n12Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n12Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n12Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n12Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n12_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen13(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n13Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n13Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n13Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n13Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n13Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n13_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen14(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n14Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n14Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n14Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n14Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n14Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n14_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen15(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n15Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n15Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n15Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n15Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n15Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n15_figma.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen16(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n16Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n16Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n16Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n16Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n16Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n16.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen17(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n17Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n17Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n17Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n17Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n17Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n17.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen18(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n18Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n18Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n18Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n18Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n18Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n18.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen19(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n19Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n19Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n19Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n19Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n19Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n19.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen20(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n20Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n20Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n20Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n20Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n20Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n20.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen21(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n21Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n21Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n21Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n21Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n21Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n21.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen22(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n22Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n22Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n22Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n22Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n22Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n22.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen23(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n23Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n23Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n23Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n23Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n23Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n23.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen24(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n24Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n24Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n24Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n24Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n24Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n24.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen25(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n25Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n25Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n25Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n25Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n25Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n25.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen26(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n26Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n26Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n26Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n26Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n26Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n26.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen27(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n27Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n27Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n27Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n27Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n27Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n27.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen28(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n28Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n28Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n28Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n28Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n28Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n28.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
        // Actualiza la imagen del JLabel
        label.setIcon(new ImageIcon(getClass().getResource(rutaImagen)));
    }

    // Método para actualizar la imagen del JLabel según la opción seleccionada
    private void actualizarImagen29(JLabel label, String opcion) {
        // Define las rutas de las imágenes según las opciones
        String rutaImagen = "";
        switch (opcion) {
            case "Mantenimiento":
                rutaImagen = "/habitaciones_rojo/n29Rojo.png";
                break;
            case "Ocupada":
                rutaImagen = "/habitaciones_verde/n29Verde.png";
                break;
            case "Limpieza":
                rutaImagen = "/habitaciones_morado/n29Morado.png";
                break;
            case "Varios días":
                rutaImagen = "/habitaciones_amarillo/n29Amarillo.png";
                break;
            case "Reservada":
                rutaImagen = "/habitaciones_celeste/n29Celeste.png";
                break;
            case "Disponible":
                rutaImagen = "/habitaciones/n29.png";
                break;
            default:
                // En caso de una opción no reconocida, no hace nada
                return;
        }
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
