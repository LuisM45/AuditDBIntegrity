package edu.epn.aud.b2022.g1.integrityScanner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GUIMenuPrincipal extends javax.swing.JFrame {
    private static String filepath = "./";
    
    DBConection dbConnection;

    public GUIMenuPrincipal(DBConection dbConnection) {
        initComponents();
        this.dbConnection = dbConnection;
    }

    private static DefaultTableModel getNewTableModel(String... columNames){
        return new DefaultTableModel(columNames, 0);
    }
    
    private static DefaultTableModel getNewTableModel(TableModel tableModel){
        final int count = tableModel.getColumnCount();
        
        DefaultTableModel newTableModel = new DefaultTableModel();
        for(int i = 0;i<count;i++)
            newTableModel.addColumn(tableModel.getColumnName(i));
        
        return new DefaultTableModel();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        btnGenerarLogs = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListIntRef = new javax.swing.JList<>();
        btnGenerar = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblAnomaliasCONdatos = new javax.swing.JTable();
        btnAnomaliasCONdatos = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAnomaliasSINdatos = new javax.swing.JTable();
        btnAnomaliasSinDatos = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTriggers = new javax.swing.JTable();
        btnGenerarTriggers = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(7, 91, 147));

        btnSalir.setBackground(new java.awt.Color(0, 78, 191));
        btnSalir.setFont(new java.awt.Font("Cascadia Mono", 1, 14)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setText("SALIR");
        btnSalir.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnGenerarLogs.setBackground(new java.awt.Color(0, 78, 191));
        btnGenerarLogs.setFont(new java.awt.Font("Cascadia Mono", 1, 14)); // NOI18N
        btnGenerarLogs.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarLogs.setText("GENERAR LOGS");
        btnGenerarLogs.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerarLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarLogsActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(7, 91, 147));
        jTabbedPane1.setForeground(new java.awt.Color(255, 255, 255));

        jPanel5.setBackground(new java.awt.Color(70, 107, 148));

        jPanel1.setBackground(new java.awt.Color(7, 91, 147));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Integridad Referencial", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N

        jScrollPane2.setViewportView(jListIntRef);

        btnGenerar.setBackground(new java.awt.Color(0, 78, 191));
        btnGenerar.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setText("GENERAR");
        btnGenerar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(63, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(51, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Integridad Referencial", jPanel5);

        jPanel6.setBackground(new java.awt.Color(70, 107, 148));

        jPanel2.setBackground(new java.awt.Color(7, 91, 147));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Anomalías con Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblAnomaliasCONdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Tabla", "Nombre Restricción", "Información"
            }
        ));
        jScrollPane5.setViewportView(tblAnomaliasCONdatos);

        btnAnomaliasCONdatos.setBackground(new java.awt.Color(0, 78, 191));
        btnAnomaliasCONdatos.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        btnAnomaliasCONdatos.setForeground(new java.awt.Color(255, 255, 255));
        btnAnomaliasCONdatos.setText("GENERAR");
        btnAnomaliasCONdatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnomaliasCONdatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnomaliasCONdatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(518, Short.MAX_VALUE)
                .addComponent(btnAnomaliasCONdatos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(163, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addComponent(btnAnomaliasCONdatos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(105, 105, 105))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Anomalías con datos", jPanel6);

        jPanel7.setBackground(new java.awt.Color(70, 107, 148));

        jPanel3.setBackground(new java.awt.Color(7, 91, 147));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Anomalías sin Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblAnomaliasSINdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Clave", "Columna", "Nombre Tabla"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblAnomaliasSINdatos);

        btnAnomaliasSinDatos.setBackground(new java.awt.Color(0, 78, 191));
        btnAnomaliasSinDatos.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        btnAnomaliasSinDatos.setForeground(new java.awt.Color(255, 255, 255));
        btnAnomaliasSinDatos.setText("GENERAR");
        btnAnomaliasSinDatos.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnAnomaliasSinDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnomaliasSinDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(515, Short.MAX_VALUE)
                .addComponent(btnAnomaliasSinDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(176, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(138, 138, 138)
                .addComponent(btnAnomaliasSinDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 299, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Anomalías sin datos", jPanel7);

        jPanel8.setBackground(new java.awt.Color(70, 107, 148));

        jPanel4.setBackground(new java.awt.Color(7, 91, 147));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Integridad referencial - Insert, Update, Delete", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblTriggers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nombre Trigger", "Tabla", "Habilitado", "Operacion"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTriggers);

        btnGenerarTriggers.setBackground(new java.awt.Color(0, 78, 191));
        btnGenerarTriggers.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        btnGenerarTriggers.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarTriggers.setText("GENERAR");
        btnGenerarTriggers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGenerarTriggers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarTriggersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(508, Short.MAX_VALUE)
                .addComponent(btnGenerarTriggers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(156, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(btnGenerarTriggers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(154, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 325, Short.MAX_VALUE)
                    .addContainerGap()))
        );

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(37, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Integridad Referencial - Crud", jPanel8);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 715, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGenerarLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerarLogs)
                    .addComponent(btnSalir))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Anomalías sin datos");
        jTabbedPane1.getAccessibleContext().setAccessibleDescription("Anomalías con datos");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        GUILogin miLogin = new GUILogin();
        miLogin.setVisible(true);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        try {
            DefaultListModel modelo = new DefaultListModel();
            modelo.addAll(dbConnection.getConstraints());
            jListIntRef.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnAnomaliasCONdatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnomaliasCONdatosActionPerformed
        try {
            DefaultTableModel tableModel = getNewTableModel(tblAnomaliasCONdatos.getModel());
            for (DatefulAnomaly anomaly : dbConnection.getDatefulAnomalies())
                tableModel.addRow(new String[]{anomaly.constraint,anomaly.table,anomaly.where});
            
            this.tblAnomaliasCONdatos.setModel(tableModel);
        } catch (SQLException ex) {
            Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnomaliasCONdatosActionPerformed

    private void btnAnomaliasSinDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnomaliasSinDatosActionPerformed
        try {
            DefaultTableModel tableModel = getNewTableModel(this.tblAnomaliasSINdatos.getModel());
            for (DatefulAnomaly anomaly : dbConnection.getDatelessAnomalies())
                tableModel.addRow(new String[]{anomaly.constraint,anomaly.table,anomaly.where});
                
            this.tblAnomaliasSINdatos.setModel(tableModel);
        } catch (SQLException ex) {
            Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnAnomaliasSinDatosActionPerformed

    private void btnGenerarTriggersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarTriggersActionPerformed
        try {
            DefaultTableModel tableModel = getNewTableModel(tblTriggers.getModel());
            for(Trigger trigger: dbConnection.getTriggers()){
                tableModel.addRow(new String[]{
                        trigger.name,
                        trigger.table,
                        String.valueOf(trigger.isEnabled),
                        trigger.triggerType.toString()
                    });
            }
            
            this.tblTriggers.setModel(tableModel);
        } catch (SQLException ex) {
            Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnGenerarTriggersActionPerformed

    private void btnGenerarLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarLogsActionPerformed
        writeConstraintsLog();
        writeDatefulAnomaliesLog();
        writeDatelessAnomaliesLog();
        writeTriggersLog();
    }//GEN-LAST:event_btnGenerarLogsActionPerformed
    
    private void writeConstraintsLog(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath+"constraints.log"));){
            for(String constraint: dbConnection.getConstraints()){
                bw.write(constraint);
                bw.write("\n");
            }
            bw.write(filepath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    private void writeDatefulAnomaliesLog(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath+"dateful_anomalies.log"));){
            for(DatefulAnomaly anomaly: dbConnection.getDatefulAnomalies()){
                String newLine = List.of(anomaly.constraint,anomaly.table,anomaly.where)
                        .stream()
                        .collect(Collectors.joining(",", "", "\n"));
                bw.write(newLine);
            }
            bw.write(filepath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void writeDatelessAnomaliesLog(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath+"dateless_anomalies.log"));){
            for(DatefulAnomaly anomaly: dbConnection.getDatelessAnomalies()){
                String newLine = List.of(anomaly.constraint,anomaly.table,anomaly.where)
                        .stream()
                        .collect(Collectors.joining(",", "", "\n"));
                bw.write(newLine);
            }
            bw.write(filepath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void writeTriggersLog(){
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filepath+"dateless_anomalies.log"));){
            for(Trigger trigger: dbConnection.getTriggers()){
                String newLine = List.of(trigger.name,trigger.table,trigger.isEnabled,trigger.triggerType)
                        .stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(",", "", "\n"));
                bw.write(newLine);
            }
            bw.write(filepath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAnomaliasCONdatos;
    private javax.swing.JButton btnAnomaliasSinDatos;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JButton btnGenerarLogs;
    private javax.swing.JButton btnGenerarTriggers;
    private javax.swing.JButton btnSalir;
    private javax.swing.JList<String> jListIntRef;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblAnomaliasCONdatos;
    private javax.swing.JTable tblAnomaliasSINdatos;
    private javax.swing.JTable tblTriggers;
    // End of variables declaration//GEN-END:variables
}
