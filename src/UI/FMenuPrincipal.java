package UI;

import helpdesk.Cola;
import helpdesk.Tiquete;
import javax.swing.JOptionPane;

public class FMenuPrincipal extends javax.swing.JFrame {

    private Tiquete tiquete;
    private Cola laCola;
    
    public FMenuPrincipal(Cola laCola, Tiquete tiquete) {
        this.tiquete = tiquete;
        this.laCola = laCola;
        initComponents();
        setLocationRelativeTo(null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ManejoIncidentes = new javax.swing.JTextField();
        BotonHelpDesk = new javax.swing.JButton();
        Version = new javax.swing.JTextField();
        Imagen1 = new javax.swing.JLabel();
        BotonUsuario = new javax.swing.JButton();
        Imagen2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("HelpDesk - Menu Principal");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");

        ManejoIncidentes.setFont(new java.awt.Font("Trebuchet MS", 1, 36)); // NOI18N
        ManejoIncidentes.setForeground(new java.awt.Color(0, 51, 204));
        ManejoIncidentes.setText("MANEJO DE INCIDENTES");
        ManejoIncidentes.setBorder(null);

        BotonHelpDesk.setBackground(new java.awt.Color(255, 255, 255));
        BotonHelpDesk.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        BotonHelpDesk.setForeground(new java.awt.Color(0, 51, 204));
        BotonHelpDesk.setText("MENU HELPDESK");
        BotonHelpDesk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonHelpDeskActionPerformed(evt);
            }
        });

        Version.setText("Version 1.01");

        Imagen1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helpdesk/imagenes/pc.JPG"))); // NOI18N

        BotonUsuario.setBackground(new java.awt.Color(255, 255, 255));
        BotonUsuario.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        BotonUsuario.setForeground(new java.awt.Color(0, 51, 204));
        BotonUsuario.setText("MENU USUARIO");
        BotonUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonUsuarioActionPerformed(evt);
            }
        });

        Imagen2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/helpdesk/imagenes/USER.JPG"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonHelpDesk)
                    .addComponent(Imagen1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BotonUsuario)
                    .addComponent(Imagen2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(ManejoIncidentes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(302, 302, 302)
                        .addComponent(Version, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(ManejoIncidentes, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(Imagen1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(Imagen2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonHelpDesk, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(Version, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BotonUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonUsuarioActionPerformed
        this.dispose();
        MenuUsuario menuUsuario = new MenuUsuario(laCola, tiquete);
        menuUsuario.setVisible(true);
    }//GEN-LAST:event_BotonUsuarioActionPerformed

    private void BotonHelpDeskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonHelpDeskActionPerformed
        this.dispose();
        MenuHelpdesk menuHD = new MenuHelpdesk(laCola, tiquete);
        menuHD.setVisible(true);
    }//GEN-LAST:event_BotonHelpDeskActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonHelpDesk;
    private javax.swing.JButton BotonUsuario;
    private javax.swing.JLabel Imagen1;
    private javax.swing.JLabel Imagen2;
    private javax.swing.JTextField ManejoIncidentes;
    private javax.swing.JTextField Version;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
