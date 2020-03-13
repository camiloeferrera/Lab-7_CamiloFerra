package lab7_camiloferrera;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Programa extends javax.swing.JFrame {

    public Programa() {
        initComponents();
        this.setLocationRelativeTo(null);
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
                
            } else {
                try {
                    int edad = Integer.parseInt(JOptionPane.showInputDialog(Registro, "Ingrese su edad:"));
                    String nombre = tf_nombreregistro.getText();
                    String user = tf_userregistro.getText();
                    String pass = pf_passregistro.getText();
                    
                    registrados.add(new Usuario (nombre,user,pass,edad));
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
        RegistroBanda.setVisible(false);
        Registro.setVisible(false);
        LimpiarRegistro();
        LimpiarRegistroBanda();
    }//GEN-LAST:event_jButton5MouseClicked

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
    private javax.swing.JDialog Registro;
    private javax.swing.JDialog RegistroBanda;
    private javax.swing.JDialog RegistroSolista;
    private javax.swing.JLabel Solista;
    private javax.swing.JLabel Solista1;
    private javax.swing.JComboBox<String> cb_generobanda;
    private javax.swing.JComboBox<String> cb_generosolista;
    private javax.swing.JComboBox<String> cb_tipousuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField pf_pass;
    private javax.swing.JPasswordField pf_passregistro;
    private javax.swing.JSpinner sp_edadsolista;
    private javax.swing.JSpinner sp_numbanda;
    private javax.swing.JTextField tf_nombreregistro;
    private javax.swing.JTextField tf_user;
    private javax.swing.JTextField tf_userregistro;
    // End of variables declaration//GEN-END:variables
    ArrayList registrados = new ArrayList();
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
}
