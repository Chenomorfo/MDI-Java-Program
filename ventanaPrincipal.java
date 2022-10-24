package ProgramaMDI;

import java.util.ArrayList;
import javax.swing.JFileChooser;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cheno
 */
public class ventanaPrincipal extends javax.swing.JFrame {

     public static boolean ventanaAbierta = false;
     public static boolean CambiosActivos = false;
    
     public static ArrayList<Producto> listaProductos = new ArrayList<Producto>();
     public static ArrayList<Venta> listaVentas = new ArrayList<Venta>();
     public static ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
     
  
    /**
     * Creates new form ventanaPrincipal
     */
    public ventanaPrincipal() {
        initComponents();
        ConfigVentana();
    }

    public void ConfigVentana()
    {
    this.setSize(800,600);
    this.setExtendedState(MAXIMIZED_BOTH);
    }
    
   
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelInterno = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnVentas = new javax.swing.JMenu();
        btnCatalogos = new javax.swing.JMenu();
        btnClientes = new javax.swing.JMenuItem();
        btnProductos = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panelInterno.setBorder(new javax.swing.border.MatteBorder(null));
        panelInterno.setLayout(new java.awt.FlowLayout());
        getContentPane().add(panelInterno, java.awt.BorderLayout.CENTER);

        btnVentas.setText("Ventas");
        btnVentas.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnVentasMouseMoved(evt);
            }
        });
        btnVentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnVentasMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnVentas);

        btnCatalogos.setText("Catalogos");

        btnClientes.setText("Clientes");
        btnClientes.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                btnClientesMouseMoved(evt);
            }
        });
        btnClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClientesActionPerformed(evt);
            }
        });
        btnCatalogos.add(btnClientes);

        btnProductos.setText("Productos");
        btnProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProductosActionPerformed(evt);
            }
        });
        btnCatalogos.add(btnProductos);

        jMenuBar1.add(btnCatalogos);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClientesActionPerformed

        if (ventanaAbierta == true) {
             return;
         }
        ventanaClientes c = new ventanaClientes();
        panelInterno.add(c);
        c.setClosable(true);
        c.setVisible(true);
        
        
    }//GEN-LAST:event_btnClientesActionPerformed

    private void btnVentasMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseMoved
   
    }//GEN-LAST:event_btnVentasMouseMoved

    private void btnVentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnVentasMouseClicked
       if (ventanaAbierta == true) {
             return;
         }
        ventanaVentas vi = new ventanaVentas();
        panelInterno.add(vi);
       vi.setClosable(true);
      
        vi.setVisible(true);
        
    }//GEN-LAST:event_btnVentasMouseClicked

    private void btnProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProductosActionPerformed
      if (ventanaAbierta == true) {
             return;
         }
      
        ventanaProductos c = new ventanaProductos();
        panelInterno.add(c);
        c.setClosable(true);
        c.setVisible(true);
    }//GEN-LAST:event_btnProductosActionPerformed

    private void btnClientesMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClientesMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_btnClientesMouseMoved

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
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnCatalogos;
    private javax.swing.JMenuItem btnClientes;
    private javax.swing.JMenuItem btnProductos;
    private javax.swing.JMenu btnVentas;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JDesktopPane panelInterno;
    // End of variables declaration//GEN-END:variables
}
