/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Formularios;

import Clases.Metodos;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author alfre
 */
public class MayusYMinus extends javax.swing.JFrame {

    int contador = 0;
    
    String ejerciciosMM [] = {"Escribe correctamente: lA caSa BlANca",
    "Escribe correctamente: estados unidos mexicanos",
    "Escribe correctamente: La Casa De Manuel",
    "Escribe la palabra errónea: No Soy Luis",
    "Escribe la palabra errónea: Vamos con la Abuela"};
    
    String respuestasMM [] = {"La Casa Blanca",
    "Estados Unidos Mexicanos",
    "La casa de Manuel",
    "Soy",
    "Abuela"};
    
    /**
     * Creates new form Ortografia
     */
    public MayusYMinus() {
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
        jLabelNumPregunta = new javax.swing.JLabel();
        jLabelPregunta = new javax.swing.JLabel();
        jButtonComprobar = new javax.swing.JButton();
        jTextRespuesta = new javax.swing.JTextField();
        jButtonMenu = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PALABREANDO");

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("____________________________________________________________________");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(193, 193, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APRENDER MAYUSCULAS Y MINUSCULAS");

        jLabelNumPregunta.setFont(new java.awt.Font("Segoe Print", 3, 16)); // NOI18N
        jLabelNumPregunta.setForeground(new java.awt.Color(193, 193, 255));
        jLabelNumPregunta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNumPregunta.setText("Pregunta 1 de 10");

        jLabelPregunta.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelPregunta.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPregunta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPregunta.setText("¿Pregunta?");

        jButtonComprobar.setBackground(new java.awt.Color(0, 29, 191));
        jButtonComprobar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonComprobar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonComprobar.setText("COMPROBAR");
        jButtonComprobar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jButtonComprobar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComprobarActionPerformed(evt);
            }
        });

        jTextRespuesta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jTextRespuesta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextRespuestaActionPerformed(evt);
            }
        });

        jButtonMenu.setBackground(new java.awt.Color(0, 29, 191));
        jButtonMenu.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonMenu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonMenu.setText("MENU");
        jButtonMenu.setToolTipText("Volver al Menú Principal");
        jButtonMenu.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 5, true));
        jButtonMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMenuActionPerformed(evt);
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
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 574, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNumPregunta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jTextRespuesta)
                            .addGap(18, 18, 18)
                            .addComponent(jButtonComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
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
                .addGap(18, 18, 18)
                .addComponent(jLabelNumPregunta)
                .addGap(18, 18, 18)
                .addComponent(jLabelPregunta)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextRespuesta)
                    .addComponent(jButtonComprobar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 157, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprobarActionPerformed
        
        //BOTON COMPROBAR
        if(respuestasMM[contador].equals(this.jTextRespuesta.getText())){
            JOptionPane.showMessageDialog(null, "Respuesta correcta");
            contador++;
        }
        else{
            JOptionPane.showMessageDialog(null, "Respuesta incorrecta, intenta de nuevo");
        }
        if(contador < ejerciciosMM.length){
            this.jTextRespuesta.setText("");
            this.jLabelNumPregunta.setText(Metodos.numEjercicio(contador+1,ejerciciosMM.length));
            this.jLabelPregunta.setText(ejerciciosMM[contador]);
        }
        else{
            JOptionPane.showMessageDialog(null, "¡FELICIDADES, HAS COMPLETADO EL NIVEL DE MAYÚSCULAS Y MINÚSCULAS!\nPresiona ACEPTAR para volver al Menú");
            this.jButtonMenuActionPerformed(null);
        }
        
    }//GEN-LAST:event_jButtonComprobarActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed

        //BOTON MENU
        MenuPrincipal oMP = new MenuPrincipal();
        oMP.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void jButtonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalirActionPerformed

        //BOTON SALIR
        if(JOptionPane.showConfirmDialog(null, "¿Seguro que quieres salir del juego?") == 0)
            this.dispose();
        
    }//GEN-LAST:event_jButtonSalirActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //EVENTO ABRIR VENTANA
        this.jLabelNumPregunta.setText(Metodos.numEjercicio(contador+1,ejerciciosMM.length));
        this.jLabelPregunta.setText(ejerciciosMM[contador]);
        JOptionPane.showMessageDialog(null, "INSTRUCCIONES:\n"
                + "1. Utiliza las mayúsculas y minúsculas según corresponda\n"
                + "2. No dejes espacios al inicio o al final de la respuesta\n"
                + "3. Utiliza los acentos y espacios correctamente");
        
    }//GEN-LAST:event_formWindowOpened

    private void jTextRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRespuestaActionPerformed
        
        //EVENTO ENTER
        this.jButtonComprobarActionPerformed(null);
        
    }//GEN-LAST:event_jTextRespuestaActionPerformed

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
            java.util.logging.Logger.getLogger(MayusYMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MayusYMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MayusYMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MayusYMinus.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MayusYMinus().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonComprobar;
    private javax.swing.JButton jButtonMenu;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelNumPregunta;
    private javax.swing.JLabel jLabelPregunta;
    private javax.swing.JTextField jTextRespuesta;
    // End of variables declaration//GEN-END:variables
}
