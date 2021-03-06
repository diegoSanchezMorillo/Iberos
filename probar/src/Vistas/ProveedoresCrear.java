/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;


import Controladores.OperacionesProveedores;

import Modelos.Clientes;

import Modelos.Proveedores;


/**
 *
 * @author Diego
 */
public class ProveedoresCrear extends javax.swing.JFrame {

    /**
     * Creates new form ProductosCrear
     */
    public ProveedoresCrear() {
        initComponents();
        
       
      
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldIdentificacion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldPoblacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldCodPostal = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldEmail = new javax.swing.JTextField();
        jButtonGuardar = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldNombre = new javax.swing.JTextField();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldTelefono = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuAlmacen = new javax.swing.JMenu();
        jMenuItemProductos = new javax.swing.JMenuItem();
        jMenuItemCategorias = new javax.swing.JMenuItem();
        jMenuClientes = new javax.swing.JMenu();
        jMenuProveedores = new javax.swing.JMenu();
        jMenuFacturas = new javax.swing.JMenu();
        jMenuUsuarios = new javax.swing.JMenu();

        setTitle("Crear producto");

        jLabel1.setText("Nombre:");

        jLabel2.setText("Dirección:");

        jLabel3.setText("Identificación:");

        jTextFieldIdentificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldIdentificacionActionPerformed(evt);
            }
        });

        jLabel5.setText("Población:");

        jLabel6.setText("Código Postal:");

        jTextFieldCodPostal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCodPostalActionPerformed(evt);
            }
        });

        jLabel7.setText("Email:");

        jButtonGuardar.setBackground(new java.awt.Color(51, 153, 255));
        jButtonGuardar.setText("Guardar");
        jButtonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGuardarActionPerformed(evt);
            }
        });

        jButtonCancelar.setBackground(new java.awt.Color(255, 0, 51));
        jButtonCancelar.setText("Cancelar");

        jLabel8.setText("Teléfono:");

        jMenuInicio.setText("Inicio");
        jMenuInicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuInicioMouseClicked(evt);
            }
        });
        jMenuInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuInicioActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenuInicio);

        jMenuAlmacen.setText("Almacén");
        jMenuAlmacen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAlmacenMouseClicked(evt);
            }
        });

        jMenuItemProductos.setText("Productos");
        jMenuItemProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemProductosMouseClicked(evt);
            }
        });
        jMenuItemProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProductosActionPerformed(evt);
            }
        });
        jMenuAlmacen.add(jMenuItemProductos);

        jMenuItemCategorias.setText("Categorias");
        jMenuItemCategorias.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemCategoriasMouseClicked(evt);
            }
        });
        jMenuItemCategorias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCategoriasActionPerformed(evt);
            }
        });
        jMenuAlmacen.add(jMenuItemCategorias);

        jMenuBar1.add(jMenuAlmacen);

        jMenuClientes.setText("Clientes");
        jMenuClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuClientesMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuClientes);

        jMenuProveedores.setText("Proveedores");
        jMenuProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuProveedoresMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuProveedores);

        jMenuFacturas.setText("Facturas");
        jMenuBar1.add(jMenuFacturas);

        jMenuUsuarios.setText("Usuarios");
        jMenuUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuUsuariosMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuUsuarios);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jButtonCancelar)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonGuardar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(62, 62, 62))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                                    .addComponent(jTextFieldIdentificacion))))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextFieldDireccion)
                            .addComponent(jTextFieldEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE)
                            .addComponent(jTextFieldPoblacion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextFieldCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 92, Short.MAX_VALUE)))
                        .addContainerGap(27, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldIdentificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jTextFieldPoblacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldCodPostal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextFieldEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonGuardar)
                    .addComponent(jButtonCancelar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButtonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGuardarActionPerformed
        // TODO add your handling code here:
        
       
       OperacionesProveedores operaciones = new OperacionesProveedores();

       String nombre = jTextFieldNombre.getText();
       String apellidos = jTextFieldDireccion.getText();
       String identificacion = jTextFieldIdentificacion.getText();
       String direccion = jTextFieldDireccion.getText();
       String poblacion = jTextFieldPoblacion.getText();
       String cod_postal = jTextFieldCodPostal.getText();
       int codigo_postal = Integer.valueOf(cod_postal);
       String telf = jTextFieldTelefono.getText();
       int telefono = Integer.valueOf(telf);
       String email = jTextFieldEmail.getText();
       
       
       Proveedores proveedor = new Proveedores(nombre,direccion,identificacion,poblacion,codigo_postal,telefono,email);
       operaciones.guardaProveedor(proveedor);
    }//GEN-LAST:event_jButtonGuardarActionPerformed

    private void jTextFieldCodPostalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCodPostalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCodPostalActionPerformed

    private void jTextFieldIdentificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldIdentificacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldIdentificacionActionPerformed

    private void jMenuInicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuInicioMouseClicked
        // TODO add your handling code here:
        Principal principal = new Principal();
        principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuInicioMouseClicked

    private void jMenuInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuInicioActionPerformed
        // TODO add your handling code here
    }//GEN-LAST:event_jMenuInicioActionPerformed

    private void jMenuItemProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemProductosMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItemProductosMouseClicked

    private void jMenuItemProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProductosActionPerformed
        // TODO add your handling code here:
        ProductosVer prodV = new ProductosVer();
        prodV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemProductosActionPerformed

    private void jMenuItemCategoriasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemCategoriasMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuItemCategoriasMouseClicked

    private void jMenuItemCategoriasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCategoriasActionPerformed
        // TODO add your handling code here:
        CategoriasVer catV = new CategoriasVer();
        catV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItemCategoriasActionPerformed

    private void jMenuAlmacenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAlmacenMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_jMenuAlmacenMouseClicked

    private void jMenuClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuClientesMouseClicked
        // TODO add your handling code here:
        ClientesVer cliVer = new ClientesVer();
        cliVer.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuClientesMouseClicked

    private void jMenuProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuProveedoresMouseClicked
        // TODO add your handling code here:
        ProveedoresVer proveedoresV = new ProveedoresVer();
        proveedoresV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuProveedoresMouseClicked

    private void jMenuUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuUsuariosMouseClicked
        // TODO add your handling code here:
        UsuariosVer userV = new UsuariosVer();
        userV.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuUsuariosMouseClicked

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
            java.util.logging.Logger.getLogger(ProveedoresCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProveedoresCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProveedoresCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProveedoresCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProveedoresCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenuAlmacen;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuClientes;
    private javax.swing.JMenu jMenuFacturas;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItemCategorias;
    private javax.swing.JMenuItem jMenuItemProductos;
    private javax.swing.JMenu jMenuProveedores;
    private javax.swing.JMenu jMenuUsuarios;
    private javax.swing.JTextField jTextFieldCodPostal;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldEmail;
    private javax.swing.JTextField jTextFieldIdentificacion;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPoblacion;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
