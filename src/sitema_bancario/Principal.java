/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sitema_bancario;

import Conexao.HibernateUtil;
import classes.Conta;
import java.util.List;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import org.hibernate.Session;

/**
 *
 * @author carlo
 */
public class Principal extends javax.swing.JFrame{
    /**
     * Creates new form Principal
     */
    static int operacao;
    public Principal() {
        super("Princial");
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

        TelaInterna = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Operacoes = new javax.swing.JMenu();
        MSaque = new javax.swing.JMenuItem();
        MDeposito = new javax.swing.JMenuItem();
        MTransferencia = new javax.swing.JMenuItem();
        Opcoes = new javax.swing.JMenu();
        Extrato = new javax.swing.JMenuItem();
        Saldo = new javax.swing.JMenuItem();
        Sair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TelaInterna.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout TelaInternaLayout = new javax.swing.GroupLayout(TelaInterna);
        TelaInterna.setLayout(TelaInternaLayout);
        TelaInternaLayout.setHorizontalGroup(
            TelaInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 512, Short.MAX_VALUE)
        );
        TelaInternaLayout.setVerticalGroup(
            TelaInternaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 321, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        Operacoes.setText("Operacões");

        MSaque.setText("Saque");
        MSaque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MSaqueActionPerformed(evt);
            }
        });
        Operacoes.add(MSaque);

        MDeposito.setText("Deposito");
        MDeposito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MDepositoActionPerformed(evt);
            }
        });
        Operacoes.add(MDeposito);

        MTransferencia.setText("Transferência");
        MTransferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MTransferenciaActionPerformed(evt);
            }
        });
        Operacoes.add(MTransferencia);

        jMenuBar1.add(Operacoes);

        Opcoes.setText("Opcões");
        Opcoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcoesActionPerformed(evt);
            }
        });

        Extrato.setText("Extrato");
        Extrato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExtratoActionPerformed(evt);
            }
        });
        Opcoes.add(Extrato);

        Saldo.setText("Saldo");
        Saldo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaldoActionPerformed(evt);
            }
        });
        Opcoes.add(Saldo);

        Sair.setText("Sair");
        Sair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SairActionPerformed(evt);
            }
        });
        Opcoes.add(Sair);

        jMenuBar1.add(Opcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaInterna)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TelaInterna)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void MSaqueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MSaqueActionPerformed
        // TODO add your handling code here:
        Saque saque = new Saque();
        TelaInterna.add(saque);
        saque.setVisible(true);
        operacao = 1;
        //saque.setMaximum(true);
        /*try {   
            saque.setSelected(true);         
            saque.setMaximum(true);   
        } catch (java.beans.PropertyVetoException e) {}*/
    }//GEN-LAST:event_MSaqueActionPerformed

    private void MDepositoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MDepositoActionPerformed
        // TODO add your handling code here:
        Deposito deposito = new Deposito();
        TelaInterna.add(deposito);
        deposito.setVisible(true);
        operacao = 2;
        //saque.setMaximum(true);
//        try {   
//            deposito.setSelected(true);         
//            deposito.setMaximum(true);   
//        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_MDepositoActionPerformed


    private void MTransferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MTransferenciaActionPerformed
        // TODO add your handling code here:
        Transferencia transferencia = new Transferencia();
        TelaInterna.add(transferencia);
        transferencia.setVisible(true);
        operacao = 3;
        //saque.setMaximum(true);
//        try {   
//            transferencia.setSelected(true);         
//            transferencia.setMaximum(true);   
//        } catch (java.beans.PropertyVetoException e) {}
    }//GEN-LAST:event_MTransferenciaActionPerformed

    private void OpcoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcoesActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
        //login.setExtendedState(login.MAXIMIZED_BOTH);
    }//GEN-LAST:event_OpcoesActionPerformed

    private void SairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SairActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login login = new Login();
        login.setVisible(true);
    }//GEN-LAST:event_SairActionPerformed

    private void SaldoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaldoActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        Conta conta = new Conta();
        Session s = HibernateUtil.getSessionFactory().getCurrentSession();
        s.beginTransaction();
        List<Conta> lista = (List<Conta>)s.createQuery("From Conta").list();
        for(Conta c : lista){
            if(login.getCont().equals(c.getIdConta().toString())){
                JOptionPane.showMessageDialog(null, "Seu saldo é: R$ "+c.getValor());
                break;
            }
        }
        s.getTransaction().commit();
    }//GEN-LAST:event_SaldoActionPerformed

    private void ExtratoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExtratoActionPerformed
        // TODO add your handling code here:
        ExtratoP extrato = new ExtratoP();
        TelaInterna.add(extrato);
        extrato.setVisible(true);
    }//GEN-LAST:event_ExtratoActionPerformed

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new Principal().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Extrato;
    private javax.swing.JMenuItem MDeposito;
    private javax.swing.JMenuItem MSaque;
    private javax.swing.JMenuItem MTransferencia;
    private javax.swing.JMenu Opcoes;
    private javax.swing.JMenu Operacoes;
    private javax.swing.JMenuItem Sair;
    private javax.swing.JMenuItem Saldo;
    private javax.swing.JDesktopPane TelaInterna;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
