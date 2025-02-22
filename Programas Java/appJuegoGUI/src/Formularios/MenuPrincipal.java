/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author alfre
 */
public class MenuPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal() {
        initComponents();
        Color color = new Color(40,60,130);
        this.getContentPane().setBackground(color);
        this.setLocationRelativeTo(null);
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
        jLabel4 = new javax.swing.JLabel();
        jButtonIngles = new javax.swing.JButton();
        jButtonMayusYMinus = new javax.swing.JButton();
        jButtonOrtografia = new javax.swing.JButton();
        jButtonEscrituraCorrecta = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(40, 60, 130));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PALABREANDO");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("____________________________________________________________________");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(193, 193, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("MENÚ PRINCIPAL");

        jLabel4.setFont(new java.awt.Font("Segoe Print", 3, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(193, 193, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("¿Qué quieres aprender hoy?");

        jButtonIngles.setBackground(new java.awt.Color(0, 29, 191));
        jButtonIngles.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonIngles.setForeground(new java.awt.Color(255, 255, 255));
        jButtonIngles.setText("INGLÉS");
        jButtonIngles.setToolTipText("Aprender Inglés Básico");
        jButtonIngles.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jButtonIngles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonInglesActionPerformed(evt);
            }
        });

        jButtonMayusYMinus.setBackground(new java.awt.Color(0, 29, 191));
        jButtonMayusYMinus.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonMayusYMinus.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMayusYMinus.setText("MAYUS Y MINUS");
        jButtonMayusYMinus.setToolTipText("Aprender el uso correcto de las Mayúsculas y Minúsculas");
        jButtonMayusYMinus.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jButtonMayusYMinus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMayusYMinusActionPerformed(evt);
            }
        });

        jButtonOrtografia.setBackground(new java.awt.Color(0, 29, 191));
        jButtonOrtografia.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonOrtografia.setForeground(new java.awt.Color(255, 255, 255));
        jButtonOrtografia.setText("ORTOGRAFIA");
        jButtonOrtografia.setToolTipText("Aprender y mejorar la Ortografía");
        jButtonOrtografia.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jButtonOrtografia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOrtografiaActionPerformed(evt);
            }
        });

        jButtonEscrituraCorrecta.setBackground(new java.awt.Color(0, 29, 191));
        jButtonEscrituraCorrecta.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonEscrituraCorrecta.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEscrituraCorrecta.setText("ESCRITURA CORRECTA");
        jButtonEscrituraCorrecta.setToolTipText("Aprender las distintas reglas de Escritura");
        jButtonEscrituraCorrecta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jButtonEscrituraCorrecta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEscrituraCorrectaActionPerformed(evt);
            }
        });

        jButtonSalir.setBackground(new java.awt.Color(150, 0, 0));
        jButtonSalir.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonSalir.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSalir.setText("SALIR");
        jButtonSalir.setToolTipText("Salir del Juego");
        jButtonSalir.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jButtonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonIngles, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButtonOrtografia, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButtonEscrituraCorrecta, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                .addComponent(jButtonMayusYMinus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 568, Short.MAX_VALUE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonIngles, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMayusYMinus, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonOrtografia, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonEscrituraCorrecta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonInglesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonInglesActionPerformed

        //BOTON INGLES
        Ingles oI = new Ingles();
        oI.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonInglesActionPerformed

    private void jButtonMayusYMinusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMayusYMinusActionPerformed
        
        //BOTON MAYUS Y MINS
        MayusYMinus oMM = new MayusYMinus();
        oMM.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonMayusYMinusActionPerformed

    private void jButtonOrtografiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOrtografiaActionPerformed
        
        //BOTON ORTOGRAFIA
        Ortografia oO = new Ortografia();
        oO.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonOrtografiaActionPerformed

    private void jButtonEscrituraCorrectaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEscrituraCorrectaActionPerformed
        
        //BOTON ESCRITURA CORRECTA
        EscrituraCorrecta oEC = new EscrituraCorrecta();
        oEC.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_jButtonEscrituraCorrectaActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed
        
        //BOTON SALIR
        if(JOptionPane.showConfirmDialog(null, "¿Seguro que quieres salir del juego?") == 0)
            this.dispose();
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEscrituraCorrecta;
    private javax.swing.JButton jButtonIngles;
    private javax.swing.JButton jButtonMayusYMinus;
    private javax.swing.JButton jButtonOrtografia;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
