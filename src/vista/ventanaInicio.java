package vista;

import Animacion.Animacion;
import Login.control.VUsuarioController;
import Login.modelo.Usuario;
import Recursos.Reloj;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import jdk.nashorn.internal.codegen.CompilerConstants;

public class ventanaInicio extends JFrame {

    int x, y;

//    panelMensajeEmergente panelEmergente;
    PanelEmergente panelEmergente;

    Usuario user;

    public ventanaInicio() {
        initComponents();

        new Reloj(txtReloj);

        switchPanels(panelLogin);

        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        botonMenu = new javax.swing.JButton();
        panelCabecera = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        txtReloj = new javax.swing.JTextField();
        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVehiculos = new javax.swing.JButton();
        btnFlotas = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnTalleres = new javax.swing.JButton();
        panelFormularios = new javax.swing.JPanel();
        panelInformativo = new javax.swing.JPanel();
        lblMensajeInformativo = new javax.swing.JLabel();
        contenedorFormularios = new javax.swing.JLayeredPane();
        panelLogin = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnInicioSesion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        panelPresentacion = new JPanel();
        lbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1310, 769));
        setMinimumSize(new java.awt.Dimension(1310, 769));
        setName("FramePrincipal"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(36, 69, 76));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1310, 769));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(1310, 769));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(1310, 769));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonMenu.setBackground(new java.awt.Color(36, 69, 76));
        botonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu_rounded_64px.png"))); // NOI18N
        botonMenu.setToolTipText("Menú");
        botonMenu.setBorder(null);
        botonMenu.setContentAreaFilled(false);
        botonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMenu.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu_642px.png"))); // NOI18N
        botonMenu.setEnabled(false);
        botonMenu.setMargin(new java.awt.Insets(2, 2, 2, 2));
        botonMenu.setMaximumSize(new java.awt.Dimension(60, 60));
        botonMenu.setMinimumSize(new java.awt.Dimension(60, 60));
        botonMenu.setOpaque(true);
        botonMenu.setPreferredSize(new java.awt.Dimension(60, 60));
        botonMenu.setRolloverEnabled(false);
        botonMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                botonMenuMousePressed(evt);
            }
        });
        botonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonMenuActionPerformed(evt);
            }
        });
        panelPrincipal.add(botonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        panelCabecera.setBackground(panelPrincipal.getBackground());
        panelCabecera.setRequestFocusEnabled(false);
        panelCabecera.setVerifyInputWhenFocusTarget(false);
        panelCabecera.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                panelCabeceraMouseDragged(evt);
            }
        });
        panelCabecera.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelCabeceraMousePressed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(206, 249, 34));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit_32px.png"))); // NOI18N
        jLabel2.setToolTipText("Salir");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Verdana Pro Black", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(206, 249, 34));
        jLabel3.setText("GESTIÓN MATERIAL MÓVIL");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        rSLabelFecha1.setForeground(new java.awt.Color(206, 249, 34));
        rSLabelFecha1.setFont(new java.awt.Font("Roboto Bold", 1, 16)); // NOI18N

        txtReloj.setEditable(false);
        txtReloj.setBackground(panelCabecera.getBackground());
        txtReloj.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txtReloj.setForeground(new java.awt.Color(206, 249, 34));
        txtReloj.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtReloj.setText("jTextField1");
        txtReloj.setBorder(null);
        txtReloj.setRequestFocusEnabled(false);
        txtReloj.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout panelCabeceraLayout = new javax.swing.GroupLayout(panelCabecera);
        panelCabecera.setLayout(panelCabeceraLayout);
        panelCabeceraLayout.setHorizontalGroup(
            panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelCabeceraLayout.createSequentialGroup()
                        .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75)
                        .addComponent(jLabel2)
                        .addContainerGap())
                    .addGroup(panelCabeceraLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(230, 230, 230)
                        .addComponent(txtReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
        );
        panelCabeceraLayout.setVerticalGroup(
            panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraLayout.createSequentialGroup()
                .addGroup(panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCabeceraLayout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel3))
                    .addGroup(panelCabeceraLayout.createSequentialGroup()
                        .addGroup(panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rSLabelFecha1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtReloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 46, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 10, 870, 110));

        panelMenu.setBackground(new java.awt.Color(206, 249, 34));
        panelMenu.setFocusable(false);
        panelMenu.setMaximumSize(new java.awt.Dimension(240,780));
        panelMenu.setMinimumSize(new java.awt.Dimension(240,780));
        panelMenu.setPreferredSize(new java.awt.Dimension(240, 780));
        panelMenu.setRequestFocusEnabled(false);
        panelMenu.setVerifyInputWhenFocusTarget(false);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ESCUDOATGCCOLOR64.png"))); // NOI18N
        jLabel1.setFocusable(false);
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        btnVehiculos.setBackground(new java.awt.Color(204, 204, 204));
        btnVehiculos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnVehiculos.setForeground(new java.awt.Color(102, 102, 102));
        btnVehiculos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/police_car_482px.png"))); // NOI18N
        btnVehiculos.setText("VEHÍCULOS");
        btnVehiculos.setBorder(null);
        btnVehiculos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVehiculos.setIconTextGap(20);
        btnVehiculos.setName("VEHICULOS"); // NOI18N
        btnVehiculos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/police_car_48px.png"))); // NOI18N
        btnVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVehiculosMousePressed(evt);
            }
        });
        btnVehiculos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVehiculosActionPerformed(evt);
            }
        });

        btnFlotas.setBackground(new java.awt.Color(204, 204, 204));
        btnFlotas.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnFlotas.setForeground(new java.awt.Color(102, 102, 102));
        btnFlotas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parking_48px.png"))); // NOI18N
        btnFlotas.setText("FLOTAS");
        btnFlotas.setToolTipText("");
        btnFlotas.setBorder(null);
        btnFlotas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFlotas.setIconTextGap(25);
        btnFlotas.setInheritsPopupMenu(true);
        btnFlotas.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/parking_48blue.png"))); // NOI18N

        btnUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        btnUsuarios.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUsuarios.setForeground(new java.awt.Color(102, 102, 102));
        btnUsuarios.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_account_48px.png"))); // NOI18N
        btnUsuarios.setText("USUARIOS");
        btnUsuarios.setBorder(null);
        btnUsuarios.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUsuarios.setIconTextGap(20);
        btnUsuarios.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/user_account_48blue.png"))); // NOI18N

        btnTalleres.setBackground(new java.awt.Color(204, 204, 204));
        btnTalleres.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnTalleres.setForeground(new java.awt.Color(102, 102, 102));
        btnTalleres.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car_service_482px.png"))); // NOI18N
        btnTalleres.setText("   TALLERES");
        btnTalleres.setToolTipText("");
        btnTalleres.setBorder(null);
        btnTalleres.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnTalleres.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/car_service_48px.png"))); // NOI18N

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnVehiculos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
            .addComponent(btnFlotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTalleres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(219, 219, 219)
                .addComponent(btnVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFlotas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTalleres, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(70, 70, 70))
        );

        panelPrincipal.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-270, 0, 270, 770));
        panelMenu.getAccessibleContext().setAccessibleName("");
        panelMenu.getAccessibleContext().setAccessibleDescription("");

        panelFormularios.setBackground(new java.awt.Color(36, 69, 76));
        panelFormularios.setForeground(new java.awt.Color(102, 255, 102));
        panelFormularios.setMaximumSize(new java.awt.Dimension(1310, 650));
        panelFormularios.setMinimumSize(new java.awt.Dimension(1310, 650));
        panelFormularios.setName(""); // NOI18N
        panelFormularios.setPreferredSize(new java.awt.Dimension(1310, 650));
        panelFormularios.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelInformativo.setBackground(new java.awt.Color(153, 255, 153));
        panelInformativo.setMaximumSize(new java.awt.Dimension(400, 33));
        panelInformativo.setMinimumSize(new java.awt.Dimension(400, 33));
        panelInformativo.setName(""); // NOI18N
        panelInformativo.setRequestFocusEnabled(false);
        panelInformativo.setLayout(new java.awt.BorderLayout());

        lblMensajeInformativo.setBackground(new java.awt.Color(36, 69, 76));
        lblMensajeInformativo.setFont(lblMensajeInformativo.getFont().deriveFont(lblMensajeInformativo.getFont().getStyle() | java.awt.Font.BOLD, lblMensajeInformativo.getFont().getSize()+5));
        lblMensajeInformativo.setForeground(new java.awt.Color(206, 249, 34));
        lblMensajeInformativo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMensajeInformativo.setText("jLabel5");
        lblMensajeInformativo.setAlignmentY(0.0F);
        lblMensajeInformativo.setIconTextGap(0);
        lblMensajeInformativo.setOpaque(true);
        panelInformativo.add(lblMensajeInformativo, java.awt.BorderLayout.CENTER);

        panelFormularios.add(panelInformativo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 615, -1, -1));

        contenedorFormularios.setBackground(new java.awt.Color(255, 204, 153));
        contenedorFormularios.setMaximumSize(new java.awt.Dimension(1310, 650));
        contenedorFormularios.setMinimumSize(new java.awt.Dimension(1310, 650));
        contenedorFormularios.setOpaque(true);
        contenedorFormularios.setPreferredSize(new java.awt.Dimension(1310, 650));
        contenedorFormularios.setLayout(new java.awt.CardLayout());

        panelLogin.setBackground(new java.awt.Color(36, 69, 76));
        panelLogin.setMaximumSize(new java.awt.Dimension(1310, 650));
        panelLogin.setMinimumSize(new java.awt.Dimension(1310, 650));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(206, 249, 34));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/50px-lock-7.png"))); // NOI18N

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(206, 249, 34));
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/50px-user.png"))); // NOI18N
        jLabel7.setToolTipText("");
        jLabel7.setRequestFocusEnabled(false);

        txtUsuario.setBackground(panelLogin.getBackground());
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Usuario");
        txtUsuario.setBorder(null);
        txtUsuario.setOpaque(false);
        txtUsuario.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtUsuarioCaretUpdate(evt);
            }
        });
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });

        txtPass.setBackground(panelLogin.getBackground());
        txtPass.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtPass.setForeground(new java.awt.Color(255, 255, 255));
        txtPass.setText("Contrase");
        txtPass.setBorder(null);
        txtPass.setOpaque(false);
        txtPass.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txtPassCaretUpdate(evt);
            }
        });
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPassFocusLost(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });

        btnInicioSesion.setBackground(new java.awt.Color(206, 249, 34));
        btnInicioSesion.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnInicioSesion.setForeground(new java.awt.Color(51, 51, 51));
        btnInicioSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/acep_norm.png"))); // NOI18N
        btnInicioSesion.setBorder(null);
        btnInicioSesion.setBorderPainted(false);
        btnInicioSesion.setContentAreaFilled(false);
        btnInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicioSesion.setEnabled(false);
        btnInicioSesion.setFocusPainted(false);
        btnInicioSesion.setIconTextGap(0);
        btnInicioSesion.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnInicioSesion.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/acep_press.png"))); // NOI18N
        btnInicioSesion.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/images/acep_roll.png"))); // NOI18N
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                .addContainerGap(553, Short.MAX_VALUE)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnInicioSesion)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1)
                            .addComponent(txtPass)
                            .addComponent(jSeparator2)
                            .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(497, 497, 497))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGap(224, 224, 224)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel7))
                .addGap(42, 42, 42)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addComponent(btnInicioSesion)
                .addContainerGap(191, Short.MAX_VALUE))
        );

        panelLoginLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtPass, txtUsuario});

        contenedorFormularios.add(panelLogin, "card3");

        panelPresentacion.setBackground(new java.awt.Color(36, 69, 76));
        panelPresentacion.setMaximumSize(new java.awt.Dimension(1310, 650));
        panelPresentacion.setMinimumSize(new java.awt.Dimension(1310, 650));

        lbl.setFont(new java.awt.Font("Verdana", 1, 36)); // NOI18N
        lbl.setText("BIENVENIDO AL APLICATIVO DE GESTIÓN DE FLOTA");

        javax.swing.GroupLayout panelPresentacionLayout = new javax.swing.GroupLayout(panelPresentacion);
        panelPresentacion.setLayout(panelPresentacionLayout);
        panelPresentacionLayout.setHorizontalGroup(
            panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPresentacionLayout.createSequentialGroup()
                .addGap(116, 116, 116)
                .addComponent(lbl)
                .addContainerGap(124, Short.MAX_VALUE))
        );
        panelPresentacionLayout.setVerticalGroup(
            panelPresentacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPresentacionLayout.createSequentialGroup()
                .addGap(140, 140, 140)
                .addComponent(lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(450, Short.MAX_VALUE))
        );

        contenedorFormularios.add(panelPresentacion, "card2");

        panelFormularios.add(contenedorFormularios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1310, 650));

        panelPrincipal.add(panelFormularios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 1310, 650));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 769, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void switchPanels(JPanel panel) {
        contenedorFormularios.removeAll();
        contenedorFormularios.add(panel);
        contenedorFormularios.repaint();
        contenedorFormularios.revalidate();

    }


    private void botonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonMenuActionPerformed

    }//GEN-LAST:event_botonMenuActionPerformed

    private void panelCabeceraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCabeceraMousePressed
        x = evt.getX();
        y = evt.getY();
    }//GEN-LAST:event_panelCabeceraMousePressed

    private void panelCabeceraMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelCabeceraMouseDragged
        this.setLocation(this.getLocation().x + evt.getX() - x, this.getLocation().y + evt.getY() - y);
    }//GEN-LAST:event_panelCabeceraMouseDragged

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        System.exit(0);
    }//GEN-LAST:event_jLabel2MousePressed

    private void botonMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonMenuMousePressed

        //MUEVE EL PANEL DESLIZABLE DE MENÚS
        if (evt.getButton() == 1 && evt.getComponent().isEnabled()) {
            int posicion = botonMenu.getX();
            if (posicion > 5) {
                moverPanelMenu(0); //escoden el menú

            } else {

                moverPanelMenu(1);
            }

        }
    }//GEN-LAST:event_botonMenuMousePressed

    public void moverPanelMenu(int direccion) {

        if (direccion == 0) {
            Animacion.mover_izquierda(0, -270, 1, 2, panelMenu);
            Animacion.mover_izquierda(270, 0, 1, 2, botonMenu);

        } else {
            Animacion.mover_derecha(-270, 0, 1, 2, panelMenu);
            Animacion.mover_derecha(0, 270, 1, 2, botonMenu);

        }
    }

    private void btnVehiculosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehiculosMousePressed
        moverPanelMenu(0);

    }//GEN-LAST:event_btnVehiculosMousePressed


    private void txtUsuarioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtUsuarioCaretUpdate
        if (evt.getDot() > 0 && txtPass.getPassword().length > 0) {
            btnInicioSesion.setEnabled(true);
        } else {
            btnInicioSesion.setEnabled(false);
        }
    }//GEN-LAST:event_txtUsuarioCaretUpdate

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        txtUsuario.setText("");
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Usuario");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtPassCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPassCaretUpdate
        if (evt.getDot() > 0 && txtUsuario.getText().length() > 0) {
            btnInicioSesion.setEnabled(true);
        } else {
            btnInicioSesion.setEnabled(false);
        }
    }//GEN-LAST:event_txtPassCaretUpdate

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        txtPass.setText("");
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        if (txtPass.getText().isEmpty()) {
            txtPass.setText("Contraseña");
        }
    }//GEN-LAST:event_txtPassFocusLost

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed

        validarSesion();

    }//GEN-LAST:event_btnInicioSesionActionPerformed
    public void validarSesion() {
        
        VUsuarioController vUsuarioController = new VUsuarioController();

        user = new Usuario(txtUsuario.getText(), String.valueOf(txtPass.getPassword(), 0, txtPass.getPassword().length), "", null);
        user = vUsuarioController.getUsuario(user);
        if (user != null) {

            switchPanels(panelPresentacion);
            lblMensajeInformativo.setText("USUARIO AUTORIZADO: " + user.getNameUser());
            Animacion.mover_izquierda(1310, 1310-lblMensajeInformativo.getPreferredSize().width-20, 1, 2, panelInformativo);
            Thread suspendeReloj=new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i=0;i<3;i++){
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ventanaInicio.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                    Animacion.mover_derecha(1310-lblMensajeInformativo.getPreferredSize().width-20, 1310, 2, 1, panelInformativo);
                }
            });
            suspendeReloj.start();
            
            if (user.getTipo_Usuario().equals("Usuario")) {
                btnFlotas.setVisible(false);
                btnTalleres.setVisible(false);
                btnUsuarios.setVisible(false);
            }
//
            botonMenu.setEnabled(true);
           
        } else {
            
            lblMensajeInformativo.setText("USUARIO NO AUTORIZADO:");
            Animacion.mover_izquierda(1310, 1310-lblMensajeInformativo.getPreferredSize().width-20, 1, 2, panelInformativo);
        }
    }
    private void btnVehiculosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVehiculosActionPerformed


    }//GEN-LAST:event_btnVehiculosActionPerformed

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        if (evt.getKeyCode() == 10) { //return
            if (!txtUsuario.getText().isEmpty() && txtPass.getPassword().length != 0) {
                validarSesion();
            }
        }
    }//GEN-LAST:event_txtPassKeyPressed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }

        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ventanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaInicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaInicio().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonMenu;
    private javax.swing.JButton btnFlotas;
    private javax.swing.JButton btnInicioSesion;
    private javax.swing.JButton btnTalleres;
    private javax.swing.JButton btnUsuarios;
    private javax.swing.JButton btnVehiculos;
    private javax.swing.JLayeredPane contenedorFormularios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lbl;
    private javax.swing.JLabel lblMensajeInformativo;
    private javax.swing.JPanel panelCabecera;
    private javax.swing.JPanel panelFormularios;
    private javax.swing.JPanel panelInformativo;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelPresentacion;
    private javax.swing.JPanel panelPrincipal;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtReloj;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
