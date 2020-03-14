package lab7_camiloferrera;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Programa extends javax.swing.JFrame {

    public Programa() {
        initComponents();
        this.setLocationRelativeTo(null);
        Usuario x = new Usuario ("Leo Banegas", "leobanegas","99" ,21);
        x.setAdministrador(true);
        registrados.add(x);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Registro = new javax.swing.JDialog();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cb_tipousuario = new javax.swing.JComboBox<>();
        pf_passregistro = new javax.swing.JPasswordField();
        tf_userregistro = new javax.swing.JTextField();
        tf_nombreregistro = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        RegistroSolista = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        Solista = new javax.swing.JLabel();
        sp_edadsolista = new javax.swing.JSpinner();
        cb_generosolista = new javax.swing.JComboBox<>();
        RegistroBanda = new javax.swing.JDialog();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        Solista1 = new javax.swing.JLabel();
        sp_numbanda = new javax.swing.JSpinner();
        cb_generobanda = new javax.swing.JComboBox<>();
        App = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_tablaeventos = new javax.swing.JTable();
        jButton6 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jt_conciertos = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        pb_concierto = new javax.swing.JProgressBar();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_artistas = new javax.swing.JTable();
        jButton8 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jl_registrados = new javax.swing.JList<>();
        jButton10 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jm_agregarevento = new javax.swing.JMenu();
        AgregarEvento = new javax.swing.JDialog();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        sp_capacidad = new javax.swing.JSpinner();
        tf_ciudad = new javax.swing.JTextField();
        dc_fecha = new com.toedter.calendar.JDateChooser();
        tf_lugar = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tf_user = new javax.swing.JTextField();
        pf_pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        Registro.setResizable(false);

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("Usuario:");

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("Contraseña;");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel7.setText("Tipo:");

        cb_tipousuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Solista", "Banda", "Usuario" }));

        jButton3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton3.setText("Siguiente");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel8.setText("Registro");

        javax.swing.GroupLayout RegistroLayout = new javax.swing.GroupLayout(Registro.getContentPane());
        Registro.getContentPane().setLayout(RegistroLayout);
        RegistroLayout.setHorizontalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, RegistroLayout.createSequentialGroup()
                                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cb_tipousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(pf_passregistro, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                        .addComponent(tf_userregistro))))
                            .addGroup(RegistroLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(tf_nombreregistro, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(RegistroLayout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jButton3)))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        RegistroLayout.setVerticalGroup(
            RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel8)
                .addGap(42, 42, 42)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_nombreregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tf_userregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_passregistro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(27, 27, 27)
                .addGroup(RegistroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_tipousuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(26, 26, 26)
                .addComponent(jButton3)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        RegistroSolista.setResizable(false);

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("Genero:");

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel10.setText("Edad:");

        jButton4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton4.setText("Registrarse");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        Solista.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Solista.setText("Solista");

        sp_edadsolista.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        cb_generosolista.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reggaeton (Nivel Dios)", "Pop", "Rock", "Hip-Hop", "Jazz", "Reggae", "Musica Clasica", "Electronica" }));

        javax.swing.GroupLayout RegistroSolistaLayout = new javax.swing.GroupLayout(RegistroSolista.getContentPane());
        RegistroSolista.getContentPane().setLayout(RegistroSolistaLayout);
        RegistroSolistaLayout.setHorizontalGroup(
            RegistroSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroSolistaLayout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cb_generosolista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RegistroSolistaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Solista)))
                .addGap(0, 73, Short.MAX_VALUE))
            .addGroup(RegistroSolistaLayout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addComponent(sp_edadsolista, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        RegistroSolistaLayout.setVerticalGroup(
            RegistroSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroSolistaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Solista)
                .addGap(44, 44, 44)
                .addGroup(RegistroSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(cb_generosolista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(RegistroSolistaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(sp_edadsolista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(jButton4)
                .addContainerGap(49, Short.MAX_VALUE))
        );

        RegistroBanda.setResizable(false);

        jLabel11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel11.setText("Genero:");

        jLabel12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel12.setText("Integrantes:");

        jButton5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton5.setText("Registrarse");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        Solista1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        Solista1.setText("Banda");

        sp_numbanda.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        cb_generobanda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Reggaeton (Nivel Dios)", "Pop", "Rock", "Hip-Hop", "Jazz", "Reggae", "Musica Clasica", "Electronica" }));

        javax.swing.GroupLayout RegistroBandaLayout = new javax.swing.GroupLayout(RegistroBanda.getContentPane());
        RegistroBanda.getContentPane().setLayout(RegistroBandaLayout);
        RegistroBandaLayout.setHorizontalGroup(
            RegistroBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroBandaLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(RegistroBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(RegistroBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5)
                    .addComponent(cb_generobanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(RegistroBandaLayout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Solista1))
                    .addComponent(sp_numbanda, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 73, Short.MAX_VALUE))
        );
        RegistroBandaLayout.setVerticalGroup(
            RegistroBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RegistroBandaLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Solista1)
                .addGap(44, 44, 44)
                .addGroup(RegistroBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cb_generobanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(RegistroBandaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sp_numbanda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jButton5)
                .addContainerGap(58, Short.MAX_VALUE))
        );

        jTabbedPane1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTabbedPane1MouseClicked(evt);
            }
        });

        jt_tablaeventos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Ciudad", "Lugar", "Capacidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_tablaeventos);
        if (jt_tablaeventos.getColumnModel().getColumnCount() > 0) {
            jt_tablaeventos.getColumnModel().getColumn(0).setResizable(false);
            jt_tablaeventos.getColumnModel().getColumn(1).setResizable(false);
            jt_tablaeventos.getColumnModel().getColumn(2).setResizable(false);
            jt_tablaeventos.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton6.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton6.setText("Asistir");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jButton6)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54)
                .addComponent(jButton6)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Eventos", jPanel1);

        jt_conciertos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Ciudad", "Lugar", "Capacidad"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jt_conciertos);
        if (jt_conciertos.getColumnModel().getColumnCount() > 0) {
            jt_conciertos.getColumnModel().getColumn(0).setResizable(false);
            jt_conciertos.getColumnModel().getColumn(1).setResizable(false);
            jt_conciertos.getColumnModel().getColumn(2).setResizable(false);
            jt_conciertos.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton7.setText("Simular");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pb_concierto, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 698, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(jButton7)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(203, 203, 203)
                .addComponent(pb_concierto, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton7)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Simular Concierto", jPanel2);

        jt_artistas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Genero", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jt_artistas);
        if (jt_artistas.getColumnModel().getColumnCount() > 0) {
            jt_artistas.getColumnModel().getColumn(0).setResizable(false);
            jt_artistas.getColumnModel().getColumn(1).setResizable(false);
            jt_artistas.getColumnModel().getColumn(2).setResizable(false);
        }

        jButton8.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton8.setText("Seguir");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(328, 328, 328)
                        .addComponent(jButton8)))
                .addContainerGap(34, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jButton8)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Seguir Artistas", jPanel3);

        jl_registrados.setModel(new DefaultListModel());
        jScrollPane4.setViewportView(jl_registrados);

        jButton10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton10.setText("Eliminar");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jButton10)))
                .addContainerGap(293, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(jButton10)
                .addGap(58, 58, 58))
        );

        jTabbedPane1.addTab("Eliminar", jPanel4);

        jMenu1.setText("Agregar Cancion");
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu1MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jm_agregarevento.setText("Agregar Evento");
        jm_agregarevento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jm_agregareventoMouseClicked(evt);
            }
        });
        jMenuBar1.add(jm_agregarevento);

        App.setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout AppLayout = new javax.swing.GroupLayout(App.getContentPane());
        App.getContentPane().setLayout(AppLayout);
        AppLayout.setHorizontalGroup(
            AppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        AppLayout.setVerticalGroup(
            AppLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AppLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        AgregarEvento.setTitle("Agregar Evento");
        AgregarEvento.setResizable(false);

        jLabel14.setText("Fecha:");

        jLabel15.setText("Ciudad:");

        jLabel16.setText("Lugar:");

        jLabel17.setText("Capacidad:");

        sp_capacidad.setModel(new javax.swing.SpinnerNumberModel(10000L, 10000L, null, 10000L));

        jButton9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton9.setText("Agregar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout AgregarEventoLayout = new javax.swing.GroupLayout(AgregarEvento.getContentPane());
        AgregarEvento.getContentPane().setLayout(AgregarEventoLayout);
        AgregarEventoLayout.setHorizontalGroup(
            AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarEventoLayout.createSequentialGroup()
                .addGroup(AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(AgregarEventoLayout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel15))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dc_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                            .addComponent(tf_ciudad)
                            .addComponent(tf_lugar)
                            .addComponent(sp_capacidad)))
                    .addGroup(AgregarEventoLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(jButton9)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        AgregarEventoLayout.setVerticalGroup(
            AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(AgregarEventoLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(dc_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(tf_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(tf_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(AgregarEventoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(sp_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(jButton9)
                .addGap(29, 29, 29))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Usuario:");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel3.setText("Lab#7 Camilo Ferrera");

        jButton1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jButton1.setText("Iniciar Sesión");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setText("Registrarse");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1))))))
                .addContainerGap(65, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel3)
                .addGap(87, 87, 87)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_user, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pf_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(89, 89, 89)
                .addComponent(jButton2)
                .addContainerGap(81, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if (tf_user.getText().isEmpty() || pf_pass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Hay campos vacios.");
        } else {
            boolean login = LogIn(tf_user.getText(),pf_pass.getText());
            if (login == true) {
                this.setVisible(false);
                LimpiarLogIn();
                App.pack();
                App.setLocationRelativeTo(this);
                App.setVisible(true);
                
                if (registrados.get(flag) instanceof Usuario) {
                    if (((Usuario)registrados.get(flag)).isAdministrador() == false) {
                        jMenuBar1.setVisible(false);
                        jPanel4.setVisible(false);
                    }
                        
                } else if (registrados.get(flag) instanceof Banda) {
                    jPanel4.setVisible(false);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Usuario y/o Contraseña incorrecto/s.");
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        Registro.pack();
        Registro.setModal(true);
        Registro.setLocationRelativeTo(this);
        Registro.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        if (tf_userregistro.getText().isEmpty() || pf_passregistro.getText().isEmpty()
                || tf_nombreregistro.getText().isEmpty()) {
            JOptionPane.showMessageDialog(Registro, "Hay campos vacios.");
        } else {
            if (cb_tipousuario.getSelectedIndex() == 0) {
                RegistroSolista.pack();
                RegistroSolista.setModal(true);
                RegistroSolista.setLocationRelativeTo(Registro);
                RegistroSolista.setVisible(true);
            } else if (cb_tipousuario.getSelectedIndex() == 1) {
                RegistroBanda.pack();
                RegistroBanda.setModal(true);
                RegistroBanda.setLocationRelativeTo(Registro);
                RegistroBanda.setVisible(true);
            } else {
                try {
                    int edad = Integer.parseInt(JOptionPane.showInputDialog(Registro, "Ingrese su edad:"));
                    String nombre = tf_nombreregistro.getText();
                    String user = tf_userregistro.getText();
                    String pass = pf_passregistro.getText();
                    
                    registrados.add(new Usuario (nombre,user,pass,edad));
                    Thread.sleep(5000);
                    JOptionPane.showMessageDialog(Registro, "Usuario Creado con Exito!");
                    EscribirBinario(new Usuario (nombre,user,pass,edad));
                    Registro.setVisible(false);
                    LimpiarRegistro();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(Registro, "Error, intente de nuevo.");
                }
                    
                
            }
        }
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        String nombre = tf_nombreregistro.getText();
        String user = tf_userregistro.getText();
        String pass = pf_passregistro.getText();
        int edad = (int)sp_edadsolista.getValue();
        String genero = (String) cb_generosolista.getSelectedItem();
        registrados.add(new Solista (nombre,user,pass,genero,edad));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(RegistroSolista, "Solista registrado con exito!");
        ModeloTablaArtistas(jt_artistas);
        try {
            EscribirBinario(new Solista (nombre,user,pass,genero,edad));
        } catch (IOException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
        RegistroSolista.setVisible(false);
        Registro.setVisible(false);
        LimpiarRegistro();
        LimpiarRegistroSolista();
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        String nombre = tf_nombreregistro.getText();
        String user = tf_userregistro.getText();
        String pass = pf_passregistro.getText();
        int n = (int)sp_numbanda.getValue();
        String genero = (String) cb_generobanda.getSelectedItem();
        registrados.add(new Banda (n,nombre,user,pass,genero));
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
        JOptionPane.showMessageDialog(RegistroBanda, "Banda registrada con exito!");
        try {
            EscribirBinario(new Banda (n,nombre,user,pass,genero));
        } catch (IOException ex) {
            Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
        }
        RegistroBanda.setVisible(false);
        Registro.setVisible(false);
        LimpiarRegistro();
        LimpiarRegistroBanda();
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        if (tf_ciudad.getText().isEmpty() || tf_lugar.getText().isEmpty()) {
            JOptionPane.showMessageDialog(AgregarEvento, "Hay campos vacios.");
        } else {
            Date fecha = dc_fecha.getDate();
            String ciudad = tf_ciudad.getText();
            String lugar = tf_lugar.getText();
            long cap = (long)sp_capacidad.getValue();
            ArrayList <Cancion> setlist = ((Artista) registrados.get(flag)).getCanciones();

            eventos.add(new Evento (fecha,ciudad,lugar,cap));
            try {
                EscribirBinario (new Evento (fecha,ciudad,lugar,cap));
            } catch (IOException ex) {
                Logger.getLogger(Programa.class.getName()).log(Level.SEVERE, null, ex);
            }
            ModeloTablaEventos (jt_tablaeventos);
            ModeloTablaEventos (jt_conciertos);
            JOptionPane.showMessageDialog(AgregarEvento, "Evento Agregado Exitosamente!");
            AgregarEvento.setVisible(false);
            LimpiarAgregarEvento();
        }
            
    }//GEN-LAST:event_jButton9MouseClicked

    private void jm_agregareventoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jm_agregareventoMouseClicked
        AgregarEvento.pack();
        AgregarEvento.setModal(true);
        AgregarEvento.setLocationRelativeTo(App);
        AgregarEvento.setVisible(true);
    }//GEN-LAST:event_jm_agregareventoMouseClicked

    private void jMenu1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu1MouseClicked
        try {
            String nombre = JOptionPane.showInputDialog(App,"Ingrese nombre:");
            int duracion = Integer.parseInt(JOptionPane.showInputDialog(App, "Ingrese duracion (en segundos):"));
            ((Artista)registrados.get(flag)).getCanciones().add(new Cancion (nombre,duracion));
            Thread.sleep(3000);
            JOptionPane.showMessageDialog(AgregarEvento, "Se ha agregado la cancion!");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(AgregarEvento, "Ha ocurrido un error, intente de nuevo.");
        }
            
    }//GEN-LAST:event_jMenu1MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        
        hiloConcierto x = new hiloConcierto(pb_concierto,eventos.get(0));
        x.start();
        
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        if (jt_tablaeventos.getSelectedRowCount() > 0) {
            int x = jt_tablaeventos.getSelectedRow();
            ((Usuario)registrados.get(flag)).getEventos().add(eventos.get(x));
            JOptionPane.showMessageDialog(App, "Se ha añadido a tus eventos!");
        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jTabbedPane1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTabbedPane1MouseClicked
        ModeloLista(jl_registrados);
    }//GEN-LAST:event_jTabbedPane1MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        registrados.remove(jl_registrados.getSelectedIndex());
        DefaultListModel modelo = (DefaultListModel) jl_registrados.getModel();
        modelo.remove(jl_registrados.getSelectedIndex());
        ModeloTablaArtistas(jt_artistas);

    }//GEN-LAST:event_jButton10MouseClicked

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
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Programa.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Programa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDialog AgregarEvento;
    private javax.swing.JFrame App;
    private javax.swing.JDialog Registro;
    private javax.swing.JDialog RegistroBanda;
    private javax.swing.JDialog RegistroSolista;
    private javax.swing.JLabel Solista;
    private javax.swing.JLabel Solista1;
    private javax.swing.JComboBox<String> cb_generobanda;
    private javax.swing.JComboBox<String> cb_generosolista;
    private javax.swing.JComboBox<String> cb_tipousuario;
    private com.toedter.calendar.JDateChooser dc_fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JList<String> jl_registrados;
    private javax.swing.JMenu jm_agregarevento;
    private javax.swing.JTable jt_artistas;
    private javax.swing.JTable jt_conciertos;
    private javax.swing.JTable jt_tablaeventos;
    private javax.swing.JProgressBar pb_concierto;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JPasswordField pf_passregistro;
    private javax.swing.JSpinner sp_capacidad;
    private javax.swing.JSpinner sp_edadsolista;
    private javax.swing.JSpinner sp_numbanda;
    private javax.swing.JTextField tf_ciudad;
    private javax.swing.JTextField tf_lugar;
    private javax.swing.JTextField tf_nombreregistro;
    private javax.swing.JTextField tf_user;
    private javax.swing.JTextField tf_userregistro;
    // End of variables declaration//GEN-END:variables
    ArrayList registrados = new ArrayList();
    ArrayList <Evento> eventos = new ArrayList();
    
    File archivo = new File ("./Datos.txt");
    int flag;
    
    public void LimpiarLogIn(){
        tf_user.setText("");
        pf_pass.setText("");
    }
    public void LimpiarRegistro(){
        tf_nombreregistro.setText("");
        tf_userregistro.setText("");
        pf_passregistro.setText("");
        cb_tipousuario.setSelectedIndex(0);
    }
    public void LimpiarRegistroSolista(){
        cb_generosolista.setSelectedIndex(0);
        sp_edadsolista.setValue(0);
    }
    public void LimpiarRegistroBanda(){
        cb_generobanda.setSelectedIndex(0);
        sp_numbanda.setValue(0);
    }
    public void LimpiarAgregarEvento(){
        tf_ciudad.setText("");
        tf_lugar.setText("");
        sp_capacidad.setValue(10000);
    }
    public void ModeloTablaEventos (JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();       
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(0);
        }
        for (int i = 0; i < eventos.size(); i++) {
            Object[] row = {eventos.get(i).getFecha(),eventos.get(i).getCiudad(),eventos.get(i).getLugar(),eventos.get(i).getCapacidad()};
            modelo.addRow(row);
        }
        
    }
    public void ModeloTablaArtistas (JTable tabla){
        DefaultTableModel modelo = (DefaultTableModel) tabla.getModel();       
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(0);
        }
        for (int i = 0; i < registrados.size(); i++) {
            if (registrados.get(i) instanceof Artista) {
                String x = "";
                if (registrados.get(i) instanceof Solista) {
                    x = "Solista";
                } else {
                    x = "Banda";
                }
                Object[] row = {(Artista)registrados.get(i), ((Artista)registrados.get(i)).getGenero(),x};
                modelo.addRow(row);
            }
                
        }
        
    }
    public void ModeloLista (JList lista){
        DefaultListModel modelo = (DefaultListModel) lista.getModel();
        for (int i = 0; i < modelo.getSize(); i++) {
            modelo.removeElementAt(0);
        }
        
        for (int i = 0; i < registrados.size(); i++) {
            modelo.addElement(registrados.get(i));
        }
        
        
    }
    public boolean LogIn(String user, String pass){
        boolean flag = false;
        for (int i = 0; i < registrados.size(); i++) {
            if (registrados.get(i) instanceof Artista) {
                if (user.equals(((Artista) registrados.get(i)).getUsuario()) && pass.equals(((Artista) registrados.get(i)).getContraseña())) {
                    flag = true;
                    this.flag = i;
                    break;
                }
            } else if (registrados.get(i) instanceof Usuario){
                if (user.equals(((Usuario) registrados.get(i)).getUsuario()) && pass.equals(((Usuario) registrados.get(i)).getContraseña())) {
                    flag = true;
                    this.flag = i;
                    break;
                }
            }
        }
        
        return flag;
    }
    public void EscribirBinario(Object x) throws FileNotFoundException, IOException{
        FileOutputStream fo = new FileOutputStream (archivo,true);
        ObjectOutputStream oo = new ObjectOutputStream(fo);
        
        oo.writeObject(x + "\n");
        oo.close();
        fo.close();
        
    }
    
    
}
