/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import javax.swing.JFrame;

/**
 *
 * @author ismae
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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

        jdpprincipal = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        locadores = new javax.swing.JMenu();
        locador = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        locatario = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        aluguel = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        apartamento = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        contratos = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        mensalidade = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        condominio = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CondominoRussano");
        setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jdpprincipalLayout = new javax.swing.GroupLayout(jdpprincipal);
        jdpprincipal.setLayout(jdpprincipalLayout);
        jdpprincipalLayout.setHorizontalGroup(
            jdpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 848, Short.MAX_VALUE)
        );
        jdpprincipalLayout.setVerticalGroup(
            jdpprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 465, Short.MAX_VALUE)
        );

        locadores.setText("Locadores");
        locadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locadoresActionPerformed(evt);
            }
        });

        locador.setText("Gerenciar locadores");
        locador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locadorActionPerformed(evt);
            }
        });
        locadores.add(locador);

        jMenuBar1.add(locadores);

        jMenu2.setText("Locatarios");

        locatario.setText("Gerenciar locatarios");
        locatario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locatarioActionPerformed(evt);
            }
        });
        jMenu2.add(locatario);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Aluguéis");

        aluguel.setText("Gerenciar aluguéis");
        aluguel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aluguelActionPerformed(evt);
            }
        });
        jMenu3.add(aluguel);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Apartamentos");

        apartamento.setText("Gerenciar apartamentos");
        apartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apartamentoActionPerformed(evt);
            }
        });
        jMenu4.add(apartamento);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Contratos");

        contratos.setText("Gerenciar contratos");
        contratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contratosActionPerformed(evt);
            }
        });
        jMenu5.add(contratos);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Mensalidades");

        mensalidade.setText("Gerenciar mensalidades");
        mensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mensalidadeActionPerformed(evt);
            }
        });
        jMenu6.add(mensalidade);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Condominios");

        condominio.setText("Gerenciar condominio");
        condominio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                condominioActionPerformed(evt);
            }
        });
        jMenu7.add(condominio);

        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpprincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpprincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        setBounds(0, 0, 864, 525);
    }// </editor-fold>//GEN-END:initComponents

    private void locadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locadoresActionPerformed

    }//GEN-LAST:event_locadoresActionPerformed

    private void locadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locadorActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        frame.setContentPane(new FormLocador());
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_locadorActionPerformed

    private void apartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apartamentoActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        frame.setContentPane(new FormApartamento());
        //S frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_apartamentoActionPerformed

    private void locatarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locatarioActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        frame.setContentPane(new FormLocatario());
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_locatarioActionPerformed

    private void aluguelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aluguelActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        frame.setContentPane(new FormAluguel());
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_aluguelActionPerformed

    private void contratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contratosActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        frame.setContentPane(new FormContrato());
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_contratosActionPerformed

    private void mensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mensalidadeActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        frame.setContentPane(new FormMensalidade());
        // frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_mensalidadeActionPerformed

    private void condominioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_condominioActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame();
        frame.setContentPane(new FormCondominio());
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }//GEN-LAST:event_condominioActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aluguel;
    private javax.swing.JMenuItem apartamento;
    private javax.swing.JMenuItem condominio;
    private javax.swing.JMenuItem contratos;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JDesktopPane jdpprincipal;
    private javax.swing.JMenuItem locador;
    private javax.swing.JMenu locadores;
    private javax.swing.JMenuItem locatario;
    private javax.swing.JMenuItem mensalidade;
    // End of variables declaration//GEN-END:variables
}
