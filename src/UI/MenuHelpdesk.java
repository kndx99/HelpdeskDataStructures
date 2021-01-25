package UI;

import Estructuras.Lista;
import Estructuras.NodoLista;
import helpdesk.Tiquete;
import helpdesk.Cola;
import helpdesk.NodoColaTiquete;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MenuHelpdesk extends javax.swing.JFrame {

    private Lista listaTiquetes;
    private Tiquete tiquete;
    private Cola laCola;

    public MenuHelpdesk(Cola laCola, Tiquete tiquete) {
        listaTiquetes = new Lista();
        this.tiquete = tiquete;
        this.laCola = laCola;
        initComponents();
//        cargarData();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TituloPanelHelpDesk = new javax.swing.JTextField();
        Version = new javax.swing.JTextField();
        AsignaProridad = new javax.swing.JLabel();
        ComboBoxPrioridad = new javax.swing.JComboBox<>();
        BotonCambiar = new javax.swing.JButton();
        BotonCargarTktGeneral = new javax.swing.JButton();
        DetalleTktHD = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        DetallestktHelpdesk = new javax.swing.JTextArea();
        BotonCargartktHelpDesk = new javax.swing.JButton();
        Estado = new javax.swing.JLabel();
        ComboBoxEstado = new javax.swing.JComboBox<>();
        TextFieldIngresarNota = new javax.swing.JTextField();
        btnCerrar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        BotonActualizar = new javax.swing.JButton();
        Estado1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setTitle("Panel Usuario");

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setToolTipText("");

        TituloPanelHelpDesk.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        TituloPanelHelpDesk.setForeground(new java.awt.Color(0, 51, 204));
        TituloPanelHelpDesk.setText("PANEL HELPDESK");
        TituloPanelHelpDesk.setBorder(null);

        Version.setText("Version 1.01");

        AsignaProridad.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        AsignaProridad.setText("Asignar Prioridad");

        ComboBoxPrioridad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4" }));
        ComboBoxPrioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxPrioridadActionPerformed(evt);
            }
        });

        BotonCambiar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        BotonCambiar.setText("Guardar Cambios");
        BotonCambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCambiarActionPerformed(evt);
            }
        });

        BotonCargarTktGeneral.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        BotonCargarTktGeneral.setText("Cargar");
        BotonCargarTktGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargarTktGeneralActionPerformed(evt);
            }
        });

        DetalleTktHD.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        DetalleTktHD.setText("Detalles");

        DetallestktHelpdesk.setColumns(20);
        DetallestktHelpdesk.setRows(5);
        jScrollPane3.setViewportView(DetallestktHelpdesk);

        BotonCargartktHelpDesk.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        BotonCargartktHelpDesk.setText("Cargar");

        Estado.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Estado.setText("Estado");

        ComboBoxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Creado", "En progreso", "En espera", "Finalizado" }));

        TextFieldIngresarNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldIngresarNotaActionPerformed(evt);
            }
        });

        btnCerrar.setText("Cerrar");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Empleado", "Nombre", "Prioridad", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        BotonActualizar.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        BotonActualizar.setText("Actualizar");
        BotonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarActionPerformed(evt);
            }
        });

        Estado1.setFont(new java.awt.Font("Trebuchet MS", 0, 12)); // NOI18N
        Estado1.setText("Agregar Nota:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(357, 357, 357)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(ComboBoxPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Estado1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(Estado, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(ComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(TextFieldIngresarNota, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(273, 273, 273)
                            .addComponent(Version, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(104, 104, 104)
                            .addComponent(btnCerrar))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(123, 123, 123)
                            .addComponent(BotonCargartktHelpDesk)
                            .addGap(220, 220, 220)
                            .addComponent(BotonCambiar)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DetalleTktHD, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(TituloPanelHelpDesk, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 586, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(BotonCargarTktGeneral)
                        .addGap(167, 167, 167)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(AsignaProridad, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonActualizar))))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TituloPanelHelpDesk, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCargarTktGeneral)
                    .addComponent(BotonActualizar))
                .addGap(49, 49, 49)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(AsignaProridad)
                            .addComponent(ComboBoxPrioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(DetalleTktHD))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Estado)
                            .addComponent(ComboBoxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(Estado1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldIngresarNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonCargartktHelpDesk)
                    .addComponent(BotonCambiar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Version, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCerrar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
        FMenuPrincipal fmp = new FMenuPrincipal(laCola, tiquete);
        fmp.setVisible(true);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void TextFieldIngresarNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldIngresarNotaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldIngresarNotaActionPerformed

    private void BotonCargarTktGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargarTktGeneralActionPerformed
        try {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//            System.out.println(laCola.atiende().getTiquete().toStringDetallado());
            enlistar(laCola);
            NodoLista aux = listaTiquetes.getCabeza();
            
            while (aux != null) {
             Object[] tiquete = {aux.getTiquete().getIdEmpleado(), aux.getTiquete().getNombreEmpleado(), aux.getTiquete().getPrioridad(), aux.getTiquete().getEstado()};
            model.addRow(tiquete);
            aux = aux.getNext();
                                 
            }
            
            //
//            while (listaTiquetes.getCabeza().getNext()!=null) {                
//                
//            }
            
//            Tiquete tkt = laCola.atiende().getTiquete();
//            model.addRow(new Object[]{tkt.getIdEmpleado(), tkt.getNombreEmpleado(), tkt.getPrioridad(), tkt.getEstado()});
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay data para mostrar");
        }

    }//GEN-LAST:event_BotonCargarTktGeneralActionPerformed

    private void BotonCambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCambiarActionPerformed
        
          DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int filaseleccionada = jTable1.getSelectedRow();
            
            int empleado = Integer.parseInt(model.getValueAt(filaseleccionada, 0).toString());
            
            
            
            Tiquete tiquetemodifica = listaTiquetes.buscar(empleado);
            tiquetemodifica.setPrioridad(Integer.parseInt((String) ComboBoxPrioridad.getSelectedItem()));
            tiquetemodifica.setEstado((String) ComboBoxEstado.getSelectedItem());
           
            String descri = tiquete.getDescripcionProblema();
            tiquetemodifica.setDescripcionProblema(descri += TextFieldIngresarNota.getText() + "\n ");
          listaTiquetes.modifica(tiquetemodifica);
        
   
       
        JOptionPane.showMessageDialog(null, "Caso actualizado exitosamente");
//        DetallestktHelpdesk.setText(null);
//        TextFieldIngresarNota.setText(null);
    
        
         if ("Finalizado".equals(tiquetemodifica.getEstado())) {
         listaTiquetes.elimina(empleado);
        }
       
       
    }//GEN-LAST:event_BotonCambiarActionPerformed

    private void ComboBoxPrioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxPrioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxPrioridadActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        try{    
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            int filaseleccionada = jTable1.getSelectedRow();
            
            int empleado = Integer.parseInt(model.getValueAt(filaseleccionada, 0).toString());
            
//            System.out.println(empleado);
            
            
            DetallestktHelpdesk.setText(listaTiquetes.buscar(empleado).toStringDetallado());
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No hay nada en cola");
        }
        
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void BotonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarActionPerformed
           DefaultTableModel model = (DefaultTableModel) jTable1.getModel();  
           
            int a = jTable1.getRowCount() -1;
        for (int i = a; i >= 0; i--) {          
        model.removeRow(model.getRowCount()-1);
        }
          NodoLista aux = listaTiquetes.getCabeza();
            
            while (aux != null) {
             Object[] tiquete = {aux.getTiquete().getIdEmpleado(), aux.getTiquete().getNombreEmpleado(), aux.getTiquete().getPrioridad(), aux.getTiquete().getEstado()};
            model.addRow(tiquete);
            aux = aux.getNext();
                                 
            }
        
        
        
        //        try {
            //            if (tiquete.getPrioridad() == 0) {
                //                DetallestktHelpdesk.setText(tiquete.toString());
                //
                //            }
            //            DetallestktHelpdesk.setText(tiquete.toStringDetallado());
            //        } catch (Exception e) {
            //            JOptionPane.showMessageDialog(null, "No hay nada en cola");
            //        }
    }//GEN-LAST:event_BotonActualizarActionPerformed

//    private void cargarData() {
//        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
//        System.out.println(laCola.atiende().getTiquete().toStringDetallado());
//
//        Tiquete tkt = laCola.atiende().getTiquete();
////        System.out.println(tkt.toStringDetallado());
////    
////     model.addRow(new Object []{tkt.getNombreEmpleado(), tkt.getIdEmpleado(), tkt.getPrioridad(), tkt.getEstado()});
//
//        model.addRow(new Object[]{tkt.getIdEmpleado(), tkt.getNombreEmpleado(), tkt.getPrioridad(), tkt.getEstado()});
//    }

    private void enlistar(Cola colaTiquetes) {
        NodoColaTiquete aux = colaTiquetes.getFrente();
//        Tiquete tk = aux.getTiquete();
////        System.out.println(tk);
//        listaTiquetes.insert(aux.getTiquete());
        while (aux != null) {
            listaTiquetes.insert(aux.getTiquete());
            aux = aux.getAtras() ;
        }
        
        System.out.println(listaTiquetes);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AsignaProridad;
    private javax.swing.JButton BotonActualizar;
    private javax.swing.JButton BotonCambiar;
    private javax.swing.JButton BotonCargarTktGeneral;
    private javax.swing.JButton BotonCargartktHelpDesk;
    private javax.swing.JComboBox<String> ComboBoxEstado;
    private javax.swing.JComboBox<String> ComboBoxPrioridad;
    private javax.swing.JLabel DetalleTktHD;
    private javax.swing.JTextArea DetallestktHelpdesk;
    private javax.swing.JLabel Estado;
    private javax.swing.JLabel Estado1;
    private javax.swing.JTextField TextFieldIngresarNota;
    private javax.swing.JTextField TituloPanelHelpDesk;
    private javax.swing.JTextField Version;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
