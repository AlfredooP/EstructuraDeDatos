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
public class EscrituraCorrecta extends javax.swing.JFrame {

    int contador = 0; int puntuacion = 0;
    
    String ejerciciosEC [] = {"Ordena la palabra: FTEEELAN",
    "Escribe en 1ra Persona: YO QUIERES COMIÓ PIZZA",
    "Escribe la palabra errónea: ANA LLEGAR A LAS 3:00PM",
    "Ordena la frase: LE ÁNGEL NO PASTEL DADO A HAN",
    "Completa la frase: EL PROFESOR NO DEJÓ ? PARA MAÑANA"};
    
    String respuestasEC [] = {"ELEFANTE",
    "YO QUIERO COMER PIZZA",
    "LLEGAR",
    "A ÁNGEL NO LE HAN DADO PASTEL",
    "TAREA"};
    
    String respMinsEC [] = {"elefante",
    "yo quiero comer pizza",
    "llegar",
    "a ángel no le han dado pastel",
    "tarea"};
    
    /**
     * Creates new form Ortografia
     */
    public EscrituraCorrecta() {
        initComponents();
        Color color = new Color(50,105,75);
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

        jLabelEjercicio = new javax.swing.JLabel();
        jButtonComprobar = new javax.swing.JButton();
        jTextRespuesta = new javax.swing.JTextField();
        jButtonMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNumEjercicio = new javax.swing.JLabel();
        jLabelVida1 = new javax.swing.JLabel();
        jLabelVida2 = new javax.swing.JLabel();
        jLabelVida3 = new javax.swing.JLabel();
        jLabelNumPregunta1 = new javax.swing.JLabel();
        jLabelNumPregunta2 = new javax.swing.JLabel();
        jLabelPuntuacion = new javax.swing.JLabel();
        jButtonSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabelEjercicio.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jLabelEjercicio.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEjercicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelEjercicio.setText("EJERCICIO");

        jButtonComprobar.setBackground(new java.awt.Color(0, 60, 10));
        jButtonComprobar.setFont(new java.awt.Font("Comic Sans MS", 1, 18)); // NOI18N
        jButtonComprobar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonComprobar.setText("COMPROBAR");
        jButtonComprobar.setToolTipText("Comprueba tu respuesta");
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

        jButtonMenu.setBackground(new java.awt.Color(0, 60, 10));
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

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Titulo.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Franklin Gothic Demi", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("__________________________________________________________");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jLabel3.setFont(new java.awt.Font("Comic Sans MS", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 85));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("APRENDER ESCRITURA CORRECTA");

        jLabelNumEjercicio.setFont(new java.awt.Font("Segoe Print", 3, 16)); // NOI18N
        jLabelNumEjercicio.setForeground(new java.awt.Color(255, 255, 85));
        jLabelNumEjercicio.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNumEjercicio.setText("Ejercicio i de n");

        jLabelVida1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vidas.png"))); // NOI18N

        jLabelVida2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vidas.png"))); // NOI18N

        jLabelVida3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Vidas.png"))); // NOI18N

        jLabelNumPregunta1.setFont(new java.awt.Font("Segoe Print", 3, 16)); // NOI18N
        jLabelNumPregunta1.setForeground(new java.awt.Color(255, 255, 85));
        jLabelNumPregunta1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNumPregunta1.setText("Vidas:");

        jLabelNumPregunta2.setFont(new java.awt.Font("Segoe Print", 3, 16)); // NOI18N
        jLabelNumPregunta2.setForeground(new java.awt.Color(255, 255, 85));
        jLabelNumPregunta2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelNumPregunta2.setText("Puntuación:");

        jLabelPuntuacion.setFont(new java.awt.Font("Comic Sans MS", 1, 16)); // NOI18N
        jLabelPuntuacion.setForeground(new java.awt.Color(255, 255, 255));
        jLabelPuntuacion.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabelPuntuacion.setText("0");

        jButtonSalir.setBackground(new java.awt.Color(100, 0, 0));
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 574, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelEjercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jTextRespuesta, javax.swing.GroupLayout.DEFAULT_SIZE, 387, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(jButtonComprobar, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelNumEjercicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelNumPregunta2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelPuntuacion, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNumPregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelVida1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelVida2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelVida3)))))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(40, 40, 40)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jLabelNumEjercicio)
                .addGap(18, 18, 18)
                .addComponent(jLabelEjercicio)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextRespuesta)
                    .addComponent(jButtonComprobar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelVida1)
                    .addComponent(jLabelVida2)
                    .addComponent(jLabelVida3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelNumPregunta1)
                        .addComponent(jLabelNumPregunta2)
                        .addComponent(jLabelPuntuacion)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonComprobarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComprobarActionPerformed
        
        //BOTON COMPROBAR
        if(Metodos.verificarMayusRespuesta(this.jTextRespuesta.getText())){
            if(respuestasEC[contador].equals(this.jTextRespuesta.getText())){
                JOptionPane.showMessageDialog(null, "Respuesta correcta, +10 puntos");
                contador++;
                puntuacion += 10;
            }
            else{
                JOptionPane.showMessageDialog(null, "Respuesta incorrecta, pierdes una vida");
            }
        }
        else {
            if(respMinsEC[contador].equals(this.jTextRespuesta.getText())){
                JOptionPane.showMessageDialog(null, "Respuesta correcta pero en formato incorrecto, +5 puntos");
                contador++;
                puntuacion += 5;
            }
            else{
                    JOptionPane.showMessageDialog(null, "Respuesta incorrecta, pierdes unas vida");
                }
        }
        if(contador < ejerciciosEC.length){
                this.jTextRespuesta.setText("");
                this.jLabelNumEjercicio.setText(Metodos.numEjercicio(contador+1,ejerciciosEC.length));
                this.jLabelEjercicio.setText(ejerciciosEC[contador]);
                this.jLabelPuntuacion.setText(Integer.toString(puntuacion));
            }
        else{
            JOptionPane.showMessageDialog(null, "¡FELICIDADES, HAS COMPLETADO EL NIVEL DE ESCRITURA CORRECTA!\nPresiona ACEPTAR para volver al Menú");
            this.jButtonMenuActionPerformed(null);
        }
        
    }//GEN-LAST:event_jButtonComprobarActionPerformed

    private void jButtonMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMenuActionPerformed

        //BOTON MENU
        MenuPrincipal oMP = new MenuPrincipal();
        oMP.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jButtonMenuActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        
        //EVENTO ABRIR VENTANA
        this.jLabelNumEjercicio.setText(Metodos.numEjercicio(contador+1,ejerciciosEC.length));
        this.jLabelEjercicio.setText(ejerciciosEC[contador]);
        JOptionPane.showMessageDialog(null, "INSTRUCCIONES:\n"
                + "1. Contesta todo con mayúsculas\n"
                + "2. No dejes espacios al inicio o al final de la respuesta\n"
                + "3. Utiliza los acentos y espacios correctamente");
        
    }//GEN-LAST:event_formWindowOpened

    private void jTextRespuestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextRespuestaActionPerformed
        
        //EVENTO ENTER
        this.jButtonComprobarActionPerformed(null);
        
    }//GEN-LAST:event_jTextRespuestaActionPerformed

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
            java.util.logging.Logger.getLogger(EscrituraCorrecta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EscrituraCorrecta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EscrituraCorrecta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EscrituraCorrecta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EscrituraCorrecta().setVisible(true);
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
    private javax.swing.JLabel jLabelEjercicio;
    private javax.swing.JLabel jLabelNumEjercicio;
    private javax.swing.JLabel jLabelNumPregunta1;
    private javax.swing.JLabel jLabelNumPregunta2;
    private javax.swing.JLabel jLabelPuntuacion;
    private javax.swing.JLabel jLabelVida1;
    private javax.swing.JLabel jLabelVida2;
    private javax.swing.JLabel jLabelVida3;
    private javax.swing.JTextField jTextRespuesta;
    // End of variables declaration//GEN-END:variables
}
