package edu.epn.aud.b2022.g1.integrityScanner;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author David Arteaga
 */
public class GUIMenuPrincipal extends javax.swing.JFrame {

    DefaultTableModel modeloUno = new DefaultTableModel();
    DefaultTableModel modeloSinDatos = new DefaultTableModel();
    DefaultTableModel modeloTriggers = new DefaultTableModel();
    
    ArrayList<String[]> listaAConDatos;
    /**
     * Creates new form GUIMenuPrincipal
     */

    ArrayList<String> miListaIntRef;
    DBConection miCon;

    public GUIMenuPrincipal(DBConection miCon) {
        initComponents();
        this.miCon = miCon;

        modeloUno.addColumn("Nombre Tabla");
        modeloUno.addColumn("Nombre Restricción");
        modeloUno.addColumn("Información");
        this.tblAnomaliasCONdatos.setModel(modeloUno);

        modeloSinDatos.addColumn("Clave");
        modeloSinDatos.addColumn("Columna");
        modeloSinDatos.addColumn("Nombre Tabla");
        this.tblAnomaliasSINdatos.setModel(modeloSinDatos);

        modeloTriggers.addColumn("Nombre Trigger");
        modeloTriggers.addColumn("Tabla");
        modeloTriggers.addColumn("Habilitado");
        modeloTriggers.addColumn("INSERT");
        modeloTriggers.addColumn("UPDATE");
        modeloTriggers.addColumn("DELETE");
        this.tblTriggers.setModel(modeloTriggers);
        
        miListaIntRef = miCon.getReferentialIntegrityList();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSalir = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jListIntRef = new javax.swing.JList<>();
        btnGenerar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tblAnomaliasCONdatos = new javax.swing.JTable();
        btnAnomaliasCONdatos = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAnomaliasSINdatos = new javax.swing.JTable();
        btnAnomaliasSinDatos = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTriggers = new javax.swing.JTable();
        btnGenerarTriggers = new javax.swing.JButton();
        btnGenerarLogs = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Integridad Referencial"));

        jScrollPane2.setViewportView(jListIntRef);

        btnGenerar.setText("Generar");
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
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 274, Short.MAX_VALUE)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGenerar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 17, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Anomalías con Datos"));

        tblAnomaliasCONdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tblAnomaliasCONdatos);

        btnAnomaliasCONdatos.setText("Generar");
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
                .addContainerGap(603, Short.MAX_VALUE)
                .addComponent(btnAnomaliasCONdatos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 533, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(175, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(btnAnomaliasCONdatos)
                .addContainerGap(113, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(19, Short.MAX_VALUE)))
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Anomalías sin Datos"));

        tblAnomaliasSINdatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
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

        btnAnomaliasSinDatos.setText("Generar");
        btnAnomaliasSinDatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnomaliasSinDatosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(592, Short.MAX_VALUE)
                .addComponent(btnAnomaliasSinDatos, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(348, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAnomaliasSinDatos)
                .addContainerGap(109, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Integridad referencial - Insert, Update, Delete"));

        tblTriggers.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "nullA", "nullB"
            }
        ));
        jScrollPane1.setViewportView(tblTriggers);

        btnGenerarTriggers.setText("Generar");
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
                .addContainerGap(603, Short.MAX_VALUE)
                .addComponent(btnGenerarTriggers, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(195, Short.MAX_VALUE)))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGenerarTriggers)
                .addContainerGap(105, Short.MAX_VALUE))
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel4Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        btnGenerarLogs.setText("Generar Logs");
        btnGenerarLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarLogsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(36, 36, 36)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnGenerarLogs, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(40, 40, 40)
                            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSalir))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(btnGenerarLogs)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSalir)
                .addContainerGap())
        );

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
        // TODO add your handling code here:
        miListaIntRef = miCon.getReferentialIntegrityList();
        DefaultListModel modelo = new DefaultListModel();
        for (String bucle : miListaIntRef) {
            modelo.addElement(bucle);
        }
        jListIntRef.setModel(modelo);


    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnAnomaliasCONdatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnomaliasCONdatosActionPerformed
        // TODO add your handling code here:
        listaAConDatos = miCon.getDatefulAnomalies(miListaIntRef);
        //DefaultListModel modelo = new DefaultListModel();
        for (String[] bucle : listaAConDatos) {
            modeloUno.addRow(bucle);
        }

        this.tblAnomaliasCONdatos.setModel(modeloUno);

        //JLIstAnomaliasConDatos.setModel(modelo);

    }//GEN-LAST:event_btnAnomaliasCONdatosActionPerformed

    private void btnAnomaliasSinDatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnomaliasSinDatosActionPerformed
        // TODO add your handling code here:
        ArrayList<String[]> listaASinDatos = miCon.getDatelessAnomalies();
        String[] auxx = {"PK_Categories", "CategoryID", "Categories"};
        String[] auxdos = {"", "CategoryID", "Products"};
        
        listaASinDatos.add(auxx);
        listaASinDatos.add(auxdos);
        for (String[] bucle : listaASinDatos) {
            modeloSinDatos.addRow(bucle);
        }

        this.tblAnomaliasSINdatos.setModel(modeloSinDatos);
    

    }//GEN-LAST:event_btnAnomaliasSinDatosActionPerformed

    private void btnGenerarTriggersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarTriggersActionPerformed
        // TODO add your handling code here:
        ArrayList<Object[]> listaTriggers = miCon.getTriggers();
        for (Object[] bucle : listaTriggers) {
            modeloTriggers.addRow(bucle);
        }

        this.tblTriggers.setModel(modeloTriggers);
    }//GEN-LAST:event_btnGenerarTriggersActionPerformed

    private void btnGenerarLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarLogsActionPerformed
        // TODO add your handling code here:

        String ruta = "IntegridadReferencial.txt";
        File f = new File(ruta);
        FileWriter fw = null;
        try {
            fw = new FileWriter(f);
        } catch (IOException ex) {
            Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
        BufferedWriter escritura = new BufferedWriter(fw);
        for (int i = 0; i < miListaIntRef.size(); i++) {
            try {
                escritura.write(String.valueOf(miListaIntRef.get(i)));
            } catch (IOException ex) {
                Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                escritura.newLine();
            } catch (IOException ex) {
                Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
        try {
            escritura.close();
        } catch (IOException ex) {
            Logger.getLogger(GUIMenuPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }

        //****************************************************************************
        ArrayList<String[]> miLista = miCon.getDatefulAnomalies(miListaIntRef);

        try {
            String miRutaUno = "anomaliasConDatos.txt";

            String aux = "";
            for (String[] bucle : miLista) {
                aux += Arrays.toString(bucle) + "\n";
            }

            System.out.println(aux);
            File fileUno = new File(miRutaUno);
            // Si el archivo no existe es creado
            if (!fileUno.exists()) {
                fileUno.createNewFile();
            }
            FileWriter fwUno = new FileWriter(fileUno);
            BufferedWriter bwUno = new BufferedWriter(fwUno);
            bwUno.write(aux);
            bwUno.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("hubo un error qui");
        }

        //**************************************************************************************
        ArrayList<String[]> miListaDos= miCon.getDatelessAnomalies();
        try {
            String miRutaDos = "anomaliasSinDatos.txt";

            String aux = "";
            for (String[] bucle : miListaDos) {
                aux += Arrays.toString(bucle) + "\n";
            }

            System.out.println(aux);
            File fileDos = new File(miRutaDos);
            // Si el archivo no existe es creado
            if (!fileDos.exists()) {
                fileDos.createNewFile();
            }
            FileWriter fwDos = new FileWriter(fileDos);
            BufferedWriter bwDos = new BufferedWriter(fwDos);
            bwDos.write(aux);
            bwDos.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("hubo un error qui");
        }

        
        //************************************************************************
        ArrayList<Object[]> miListaTres= miCon.getTriggers();
        try {
            String miRutaTres = "auditoriaIUD.txt";

            String aux = "";
            for (Object[] bucle : miListaTres) {
                aux += Arrays.toString(bucle) + "\n";
            }

            System.out.println(aux);
            File fileTres = new File(miRutaTres);
            // Si el archivo no existe es creado
            if (!fileTres.exists()) {
                fileTres.createNewFile();
            }
            FileWriter fwTres = new FileWriter(fileTres);
            BufferedWriter bwTres = new BufferedWriter(fwTres);
            bwTres.write(aux);
            bwTres.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("hubo un error qui");
        }

    }//GEN-LAST:event_btnGenerarLogsActionPerformed

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
            java.util.logging.Logger.getLogger(GUIMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIMenuPrincipal(null).setVisible(true); //Editado
            }
        });
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTable tblAnomaliasCONdatos;
    private javax.swing.JTable tblAnomaliasSINdatos;
    private javax.swing.JTable tblTriggers;
    // End of variables declaration//GEN-END:variables
}
