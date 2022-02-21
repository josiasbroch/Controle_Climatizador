
import br.upf.appaula.domain.ArCondicionado;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author renan
 */
public class tela extends javax.swing.JFrame {
    ArCondicionado ar = new ArCondicionado();
    /**
     * Creates new form tela
     */
    public tela() {
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

        botaoLigar = new javax.swing.JButton();
        botaoDesligar = new javax.swing.JButton();
        campoModos = new javax.swing.JLabel();
        botaoAuto = new javax.swing.JButton();
        botaoAquecer = new javax.swing.JButton();
        botaoResfriar = new javax.swing.JButton();
        botaoDesumidificar = new javax.swing.JButton();
        aumentarTemperatura = new javax.swing.JButton();
        diminuirTemperatura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botaoLigar.setText("Ligar");
        botaoLigar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoLigarActionPerformed(evt);
            }
        });

        botaoDesligar.setText("Desligar");
        botaoDesligar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDesligarActionPerformed(evt);
            }
        });

        campoModos.setText("Modos:");

        botaoAuto.setText("Auto");
        botaoAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoAutoActionPerformed(evt);
            }
        });

        botaoAquecer.setText("Aquecer");

        botaoResfriar.setText("Resfriar");
        botaoResfriar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoResfriarActionPerformed(evt);
            }
        });

        botaoDesumidificar.setText("Desumidificar");
        botaoDesumidificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoDesumidificarActionPerformed(evt);
            }
        });

        aumentarTemperatura.setText("+");
        aumentarTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aumentarTemperaturaActionPerformed(evt);
            }
        });

        diminuirTemperatura.setText("-");
        diminuirTemperatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diminuirTemperaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(botaoAuto)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(aumentarTemperatura)
                                .addGap(18, 22, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botaoLigar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(botaoDesligar)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(diminuirTemperatura))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botaoDesumidificar)
                        .addGap(24, 24, 24)))
                .addGap(30, 30, 30))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(botaoResfriar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(80, 80, 80)
                            .addComponent(campoModos))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(61, 61, 61)
                            .addComponent(botaoAquecer))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoLigar)
                    .addComponent(botaoDesligar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(aumentarTemperatura)
                    .addComponent(diminuirTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoModos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAuto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoAquecer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoResfriar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoDesumidificar)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botaoLigarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoLigarActionPerformed
        try {
            ar.ligar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_botaoLigarActionPerformed

    private void botaoDesligarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDesligarActionPerformed
        try {
            ar.desligar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }
    }//GEN-LAST:event_botaoDesligarActionPerformed

    private void botaoAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoAutoActionPerformed
        
    }//GEN-LAST:event_botaoAutoActionPerformed

    private void botaoResfriarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoResfriarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoResfriarActionPerformed

    private void aumentarTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aumentarTemperaturaActionPerformed
        
   
    }//GEN-LAST:event_aumentarTemperaturaActionPerformed

    private void botaoDesumidificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoDesumidificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botaoDesumidificarActionPerformed

    private void diminuirTemperaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diminuirTemperaturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_diminuirTemperaturaActionPerformed

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
            java.util.logging.Logger.getLogger(tela.claaumentarTemperaturame()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aumentarTemperatura;
    private javax.swing.JButton botaoAquecer;
    private javax.swing.JButton botaoAuto;
    private javax.swing.JButton botaoDesligar;
    private javax.swing.JButton botaoDesumidificar;
    private javax.swing.JButton botaoLigar;
    private javax.swing.JButton botaoResfriar;
    private javax.swing.JLabel campoModos;
    private javax.swing.JButton diminuirTemperatura;
    // End of variables declaration//GEN-END:variables
}