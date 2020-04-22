package vista;

import Login.control.VUsuarioController;
import Login.modelo.Usuario;
import Recursos.Reloj;
import java.awt.AWTException;
import java.awt.Color;
import java.awt.Component;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ventanaInicio extends JFrame {

    int x, y;

    panelMensajeEmergente panelEmergente;

    Usuario user;

    public ventanaInicio() {
        initComponents();

        new Reloj(txtReloj);

        setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelMenu = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnVehiculos = new javax.swing.JButton();
        btnFlotas = new javax.swing.JButton();
        btnUsuarios = new javax.swing.JButton();
        btnTalleres = new javax.swing.JButton();
        botonMenu = new javax.swing.JButton();
        panelFormularios = new javax.swing.JPanel();
        panelOpcionesPrincipal = new javax.swing.JPanel();
        panelLogin = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        txtPass = new javax.swing.JPasswordField();
        btnInicioSesion = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        panelOperacionesSecundario = new javax.swing.JPanel();
        panelCabecera = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rSLabelFecha1 = new rojeru_san.RSLabelFecha();
        txtReloj = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1310, 770));
        setName("FramePrincipal"); // NOI18N
        setUndecorated(true);
        setResizable(false);

        panelPrincipal.setBackground(new java.awt.Color(36, 69, 76));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(1310, 770));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        btnVehiculos.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/images/police_car_48px.png"))); // NOI18N
        btnVehiculos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnVehiculosMousePressed(evt);
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
            .addComponent(btnVehiculos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFlotas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnTalleres, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addComponent(btnVehiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFlotas, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnTalleres, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btnUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(-240, 5, 240, 780));
        panelMenu.getAccessibleContext().setAccessibleName("");
        panelMenu.getAccessibleContext().setAccessibleDescription("");

        botonMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu_rounded_64px.png"))); // NOI18N
        botonMenu.setToolTipText("Menú");
        botonMenu.setBorder(null);
        botonMenu.setContentAreaFilled(false);
        botonMenu.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botonMenu.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu_642px.png"))); // NOI18N
        botonMenu.setEnabled(false);
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
        panelPrincipal.add(botonMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 5, -1, -1));

        panelFormularios.setBackground(panelPrincipal.getBackground());
        panelFormularios.setName("panelFormularios"); // NOI18N

        panelOpcionesPrincipal.setName("cintaOpcionesPrincipal"); // NOI18N
        panelOpcionesPrincipal.setOpaque(false);
        panelOpcionesPrincipal.setLayout(new java.awt.FlowLayout(java.awt.FlowLayout.LEFT, 6, 0));

        panelLogin.setBackground(panelFormularios.getBackground());

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(206, 249, 34));
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/candado cerrado.png"))); // NOI18N

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(206, 249, 34));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/verified_account_48px.png"))); // NOI18N
        jLabel5.setToolTipText("");

        txtUsuario.setBackground(panelLogin.getBackground());
        txtUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtUsuario.setText("Usuario");
        txtUsuario.setBorder(null);
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

        btnInicioSesion.setBackground(new java.awt.Color(206, 249, 34));
        btnInicioSesion.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        btnInicioSesion.setForeground(new java.awt.Color(51, 51, 51));
        btnInicioSesion.setText("Iniciar sesión");
        btnInicioSesion.setBorder(null);
        btnInicioSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnInicioSesion.setEnabled(false);
        btnInicioSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioSesionActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLoginLayout = new javax.swing.GroupLayout(panelLogin);
        panelLogin.setLayout(panelLoginLayout);
        panelLoginLayout.setHorizontalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLoginLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );
        panelLoginLayout.setVerticalGroup(
            panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(panelLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelLoginLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(25, 25, 25)
                .addComponent(btnInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelOperacionesSecundario.setName("cintaOpcionesSecundaria"); // NOI18N
        panelOperacionesSecundario.setLayout(null);

        javax.swing.GroupLayout panelFormulariosLayout = new javax.swing.GroupLayout(panelFormularios);
        panelFormularios.setLayout(panelFormulariosLayout);
        panelFormulariosLayout.setHorizontalGroup(
            panelFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelOpcionesPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelOperacionesSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 1310, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelFormulariosLayout.createSequentialGroup()
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(360, 360, 360))
        );

        panelFormulariosLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {panelOpcionesPrincipal, panelOperacionesSecundario});

        panelFormulariosLayout.setVerticalGroup(
            panelFormulariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelFormulariosLayout.createSequentialGroup()
                .addComponent(panelOpcionesPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelOperacionesSecundario, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143)
                .addComponent(panelLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        panelFormulariosLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {panelOpcionesPrincipal, panelOperacionesSecundario});

        panelPrincipal.add(panelFormularios, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 1310, 670));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabeceraLayout.createSequentialGroup()
                .addGap(184, 184, 184)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabeceraLayout.createSequentialGroup()
                        .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelCabeceraLayout.createSequentialGroup()
                        .addComponent(txtReloj, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)))
                .addComponent(jLabel2)
                .addContainerGap())
        );
        panelCabeceraLayout.setVerticalGroup(
            panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelCabeceraLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelCabeceraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtReloj, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(rSLabelFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelPrincipal.add(panelCabecera, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 0, 1070, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
                botonMenu.setLocation(5, 0);
                panelMenu.setLocation(-240, 0);
            } else {

                panelMenu.setLocation(0, 0);
                botonMenu.setLocation(245, 0);
            }
        }
    }//GEN-LAST:event_botonMenuMousePressed

    private void btnInicioSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioSesionActionPerformed

        VUsuarioController vUsuarioController = new VUsuarioController();

        user = new Usuario(txtUsuario.getText(), String.valueOf(txtPass.getPassword(), 0, txtPass.getPassword().length), "", null);
        user = vUsuarioController.getUsuario(user);
        if (user != null) {

            panelLogin.setVisible(false);
            panelFormularios.setVisible(true);
            panelFormularios.repaint();
            panelEmergente = new panelMensajeEmergente(panelFormularios, "USUARIO AUTORIZADO: " + user.getNameUser());

            if (user.getTipo_Usuario().equals("Usuario")) {
                btnFlotas.setVisible(false);
                btnTalleres.setVisible(false);
                btnUsuarios.setVisible(false);
            }

            botonMenu.setEnabled(true);

        } else {
            panelEmergente = new panelMensajeEmergente(panelFormularios, "USUARIO NO AUTORIZADO");
        }

    }//GEN-LAST:event_btnInicioSesionActionPerformed

    private void txtPassCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtPassCaretUpdate
        if (evt.getDot() > 0 && txtUsuario.getText().length() > 0) {
            btnInicioSesion.setEnabled(true);
        } else {
            btnInicioSesion.setEnabled(false);
        }

    }//GEN-LAST:event_txtPassCaretUpdate

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        if (txtUsuario.getText().isEmpty()) {
            txtUsuario.setText("Usuario");
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        txtUsuario.setText("");

    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        txtPass.setText("");
    }//GEN-LAST:event_txtPassFocusGained

    private void txtPassFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusLost
        if (txtPass.getText().isEmpty()) {
            txtPass.setText("Contraseña");
        }
    }//GEN-LAST:event_txtPassFocusLost

    private void txtUsuarioCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txtUsuarioCaretUpdate
        if (evt.getDot() > 0 && txtPass.getPassword().length > 0) {
            btnInicioSesion.setEnabled(true);
        } else {
            btnInicioSesion.setEnabled(false);
        }
    }//GEN-LAST:event_txtUsuarioCaretUpdate

    private void btnVehiculosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVehiculosMousePressed
        if (evt.getButton() == 1) {
            List<String> nombreBotones = new ArrayList<>();
            nombreBotones.add("Gestión");
            nombreBotones.add("Mantenimientos");
            nombreBotones.add("Reparaciones");
            nombreBotones.add("Carburante");
            nombreBotones.add("I.T.V.");

            new cintaOpciones(panelOpcionesPrincipal, nombreBotones);    

            botonMenuMousePressed(evt);

        }

    }//GEN-LAST:event_btnVehiculosMousePressed
   

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
        //</editor-fold>

        /* Create and display the form */
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel panelCabecera;
    private javax.swing.JPanel panelFormularios;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JPanel panelMenu;
    private javax.swing.JPanel panelOpcionesPrincipal;
    private javax.swing.JPanel panelOperacionesSecundario;
    private javax.swing.JPanel panelPrincipal;
    private rojeru_san.RSLabelFecha rSLabelFecha1;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtReloj;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables

}
