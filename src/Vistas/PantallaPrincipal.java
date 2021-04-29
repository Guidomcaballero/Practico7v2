/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vistas;

import caballero.practico7v2.*;
import java.util.HashSet;

/**
 *
 * @author Guido Caballero
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    private static HashSet<Materia> listaMaterias;
    private static HashSet<Alumno> listaAlumnos;

    public PantallaPrincipal() {
        this.listaMaterias = new HashSet<>();
        this.listaAlumnos = new HashSet<>();
        initComponents();
    }

    public static HashSet<Materia> getListaMaterias() {
        return listaMaterias;
    }
    public static void setListaMaterias(HashSet<Materia> listaMaterias) {
        PantallaPrincipal.listaMaterias = listaMaterias;
    }

    public static HashSet<Alumno> getListaAlumnos() {
        return listaAlumnos;
    }
    public static void setListaAlumnos(HashSet<Alumno> listaAlumnos) {
        PantallaPrincipal.listaAlumnos = listaAlumnos;
    }
    


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        viewEsc = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmNuevoAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmNuevaMateria = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmFormulario = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout viewEscLayout = new javax.swing.GroupLayout(viewEsc);
        viewEsc.setLayout(viewEscLayout);
        viewEscLayout.setHorizontalGroup(
            viewEscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        viewEscLayout.setVerticalGroup(
            viewEscLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 277, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumnos");

        jmNuevoAlumno.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jmNuevoAlumno.setText("Alta de Alumno");
        jmNuevoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNuevoAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmNuevoAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materias");

        jmNuevaMateria.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jmNuevaMateria.setText("Alta de materias");
        jmNuevaMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmNuevaMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(jmNuevaMateria);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Incripciones");

        jmFormulario.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jmFormulario.setText("Formulario de inscipcion");
        jmFormulario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioActionPerformed(evt);
            }
        });
        jMenu3.add(jmFormulario);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Opciones");

        jMenuItem3.setFont(new java.awt.Font("Leelawadee UI Semilight", 0, 14)); // NOI18N
        jMenuItem3.setText("jMenuItem3");
        jMenu4.add(jMenuItem3);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewEsc)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(viewEsc)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmNuevaMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNuevaMateriaActionPerformed
        viewEsc.removeAll();
        viewEsc.repaint();
        VistaMateria vm = new VistaMateria();
        viewEsc.add(vm);
        vm.setVisible(true);
    }//GEN-LAST:event_jmNuevaMateriaActionPerformed

    private void jmFormularioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioActionPerformed
        viewEsc.removeAll();
        viewEsc.repaint();
        VistaInscripcion vi = new VistaInscripcion();
        viewEsc.add(vi);
        vi.setVisible(true);
    }//GEN-LAST:event_jmFormularioActionPerformed

    private void jmNuevoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmNuevoAlumnoActionPerformed
        viewEsc.removeAll();
        viewEsc.repaint();
        VistaAlumno va = new VistaAlumno();
        viewEsc.add(va);
        va.setVisible(true);
    }//GEN-LAST:event_jmNuevoAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jmFormulario;
    private javax.swing.JMenuItem jmNuevaMateria;
    private javax.swing.JMenuItem jmNuevoAlumno;
    private javax.swing.JDesktopPane viewEsc;
    // End of variables declaration//GEN-END:variables
}
