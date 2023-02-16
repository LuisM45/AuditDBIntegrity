package edu.epn.aud.b2022.g1.integrityscanner;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class GUIMenuPrincipal extends javax.swing.JFrame {
    private static String filepath = "./";
    
    transient IntegrityManager dbConnection;

    public GUIMenuPrincipal(IntegrityManager dbConnection) {
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
        
        return newTableModel;
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
        btnFillConstraints = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblDatefulAnomalies = new javax.swing.JTable();
        btnFillDatefulAnomalies = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblKeysAnomalies = new javax.swing.JTable();
        btnFillKeysAnomalies = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTriggers = new javax.swing.JTable();
        btnFillTriggers = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        tblDatalessAnomalies = new javax.swing.JTable();
        btnFillDatalessAnomalies = new javax.swing.JButton();

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
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Contraints existentes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N

        jScrollPane2.setViewportView(jListIntRef);

        btnFillConstraints.setBackground(new java.awt.Color(0, 78, 191));
        btnFillConstraints.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        btnFillConstraints.setForeground(new java.awt.Color(255, 255, 255));
        btnFillConstraints.setText("GENERAR");
        btnFillConstraints.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFillConstraints.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFillConstraintsActionPerformed(evt);
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
                .addComponent(btnFillConstraints, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(btnFillConstraints, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Integridad Referencial", jPanel5);

        jPanel6.setBackground(new java.awt.Color(70, 107, 148));

        jPanel2.setBackground(new java.awt.Color(7, 91, 147));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Anomalías con Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblDatefulAnomalies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Tabla", "Nombre Restricción", "Información"
            }
        ));
        jScrollPane5.setViewportView(tblDatefulAnomalies);

        btnFillDatefulAnomalies.setBackground(new java.awt.Color(0, 78, 191));
        btnFillDatefulAnomalies.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        btnFillDatefulAnomalies.setForeground(new java.awt.Color(255, 255, 255));
        btnFillDatefulAnomalies.setText("GENERAR");
        btnFillDatefulAnomalies.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFillDatefulAnomalies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFillDatefulAnomaliesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(518, Short.MAX_VALUE)
                .addComponent(btnFillDatefulAnomalies, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnFillDatefulAnomalies, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(49, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Anomalías con datos", jPanel6);

        jPanel7.setBackground(new java.awt.Color(70, 107, 148));

        jPanel3.setBackground(new java.awt.Color(7, 91, 147));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Claves potencialmente repetidas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblKeysAnomalies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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
        jScrollPane3.setViewportView(tblKeysAnomalies);

        btnFillKeysAnomalies.setBackground(new java.awt.Color(0, 78, 191));
        btnFillKeysAnomalies.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        btnFillKeysAnomalies.setForeground(new java.awt.Color(255, 255, 255));
        btnFillKeysAnomalies.setText("GENERAR");
        btnFillKeysAnomalies.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFillKeysAnomalies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFillKeysAnomaliesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(515, Short.MAX_VALUE)
                .addComponent(btnFillKeysAnomalies, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnFillKeysAnomalies, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Claves Potencialmente repetidas", jPanel7);

        jPanel8.setBackground(new java.awt.Color(70, 107, 148));

        jPanel4.setBackground(new java.awt.Color(7, 91, 147));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Integridad referencial - Insert, Update, Delete", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblTriggers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

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

        btnFillTriggers.setBackground(new java.awt.Color(0, 78, 191));
        btnFillTriggers.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        btnFillTriggers.setForeground(new java.awt.Color(255, 255, 255));
        btnFillTriggers.setText("GENERAR");
        btnFillTriggers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFillTriggers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFillTriggersActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(508, Short.MAX_VALUE)
                .addComponent(btnFillTriggers, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addComponent(btnFillTriggers, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Integridad Referencial - Crud", jPanel8);

        jPanel9.setBackground(new java.awt.Color(70, 107, 148));

        jPanel10.setBackground(new java.awt.Color(7, 91, 147));
        jPanel10.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Anomalias sin datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Cascadia Mono", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N

        tblDatalessAnomalies.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Tabla", "Falta de Restricción", "Descripción"
            }
        ));
        jScrollPane6.setViewportView(tblDatalessAnomalies);

        btnFillDatalessAnomalies.setBackground(new java.awt.Color(0, 78, 191));
        btnFillDatalessAnomalies.setFont(new java.awt.Font("Cascadia Mono", 1, 12)); // NOI18N
        btnFillDatalessAnomalies.setForeground(new java.awt.Color(255, 255, 255));
        btnFillDatalessAnomalies.setText("GENERAR");
        btnFillDatalessAnomalies.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnFillDatalessAnomalies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFillDatalessAnomaliesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnFillDatalessAnomalies, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(btnFillDatalessAnomalies, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(153, Short.MAX_VALUE))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(7, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Anomalías sin datos", jPanel9);

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
        this.setVisible(false);
        GUILogin miLogin = new GUILogin();
        miLogin.setVisible(true);

    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnFillConstraintsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFillConstraintsActionPerformed
        try {
            DefaultListModel modelo = new DefaultListModel();
            modelo.addAll(dbConnection.getConstraints());
            jListIntRef.setModel(modelo);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage(), "Error con la base de datos",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFillConstraintsActionPerformed

    private void btnFillDatefulAnomaliesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFillDatefulAnomaliesActionPerformed
        try {
            DefaultTableModel tableModel = getNewTableModel(tblDatefulAnomalies.getModel());
            for (DatefulAnomaly anomaly : dbConnection.getDatefulAnomalies())
                tableModel.addRow(new String[]{anomaly.constraint,anomaly.table,anomaly.where});
            
            this.tblDatefulAnomalies.setModel(tableModel);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage(), "Error con la base de datos",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFillDatefulAnomaliesActionPerformed

    private void btnFillKeysAnomaliesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFillKeysAnomaliesActionPerformed
        try {
            DefaultTableModel tableModel = getNewTableModel(this.tblKeysAnomalies.getModel());
            for (DatefulAnomaly anomaly : dbConnection.getDupedKeynames())
                tableModel.addRow(new String[]{anomaly.constraint,anomaly.table,anomaly.where});
                
            this.tblKeysAnomalies.setModel(tableModel);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage(), "Error con la base de datos",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFillKeysAnomaliesActionPerformed

    private void btnFillTriggersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFillTriggersActionPerformed
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
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage(), "Error con la base de datos",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFillTriggersActionPerformed

    private void btnGenerarLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarLogsActionPerformed
        try {
            dbConnection.writeConstraintsLog(filepath);
            dbConnection.writeDatefulAnomaliesLog(filepath);
            dbConnection.writeKeysAnomaliesLog(filepath);
            dbConnection.writeDatalessAnomaliesLog(filepath);
            dbConnection.writeTriggersLog(filepath);
        } catch (IOException ex) {
            Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage(), "Error con la escritura del log",JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage(), "Error con la base de datos",JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnGenerarLogsActionPerformed

    private void btnFillDatalessAnomaliesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFillDatalessAnomaliesActionPerformed
                try {
            DefaultTableModel tableModel = getNewTableModel(tblDatalessAnomalies.getModel());
            for(DatalessAnomaly anomaly: dbConnection.getDatalessAnomalies()){
                tableModel.addRow(new String[]{
                        anomaly.table,
                        anomaly.constraintExpected,
                        anomaly.description
                    });
            }
            
            this.tblDatalessAnomalies.setModel(tableModel);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,ex.getLocalizedMessage(), "Error con la base de datos",JOptionPane.ERROR_MESSAGE);
            Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnFillDatalessAnomaliesActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnFillConstraints;
    private javax.swing.JButton btnFillDatalessAnomalies;
    private javax.swing.JButton btnFillDatefulAnomalies;
    private javax.swing.JButton btnFillKeysAnomalies;
    private javax.swing.JButton btnFillTriggers;
    private javax.swing.JButton btnGenerarLogs;
    private javax.swing.JButton btnSalir;
    private javax.swing.JList<String> jListIntRef;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tblDatalessAnomalies;
    private javax.swing.JTable tblDatefulAnomalies;
    private javax.swing.JTable tblKeysAnomalies;
    private javax.swing.JTable tblTriggers;
    // End of variables declaration//GEN-END:variables
}
