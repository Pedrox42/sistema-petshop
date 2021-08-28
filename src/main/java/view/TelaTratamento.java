/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import arquivo.Arquivo;
import arquivo.Listagem;
import dao.DataAcessObject;
import java.awt.Component;
import java.awt.PopupMenu;
import java.util.List;

import javax.swing.*;
import produto.Produto;
import tratamento.Tratamento;
import usuario.Admnistrador;

public class TelaTratamento extends javax.swing.JFrame {

    /**
     * Creates new form TelaTratamento
     */
    public TelaTratamento() {
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelTratamento = new javax.swing.JPanel();
        jLabelTempoDuracao = new javax.swing.JLabel();
        jTextFieldTempoDuracao = new javax.swing.JTextField();
        jLabelPreco = new javax.swing.JLabel();
        jTextFieldPreco = new javax.swing.JTextField();
        jLabelLucro = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonCancelar = new javax.swing.JButton();
        jTextFieldLucro = new javax.swing.JTextField();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelTratamento.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Tratamentos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabelTempoDuracao.setText("Tempo de duracao:");

        jTextFieldTempoDuracao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldTempoDuracaoActionPerformed(evt);
            }
        });

        jLabelPreco.setText("Preco:");

        jTextFieldPreco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPrecoActionPerformed(evt);
            }
        });

        jLabelLucro.setText("Lucro:");

        jButtonSalvar.setText("Salvar");
        jButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSalvarActionPerformed(evt);
            }
        });

        jButtonEditar.setText("Editar");
        jButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarActionPerformed(evt);
            }
        });

        jButtonExcluir.setText("Excluir");
        jButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExcluirActionPerformed(evt);
            }
        });

        jButtonCancelar.setText("Cancelar");

        jTextFieldLucro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLucroActionPerformed(evt);
            }
        });

        jLabelNome.setText("Nome:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jList1.setModel(Listagem.getTratamentoModel());
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTratamentoLayout = new javax.swing.GroupLayout(jPanelTratamento);
        jPanelTratamento.setLayout(jPanelTratamentoLayout);
        jPanelTratamentoLayout.setHorizontalGroup(
            jPanelTratamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTratamentoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelTratamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTratamentoLayout.createSequentialGroup()
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonCancelar))
                    .addGroup(jPanelTratamentoLayout.createSequentialGroup()
                        .addGroup(jPanelTratamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelPreco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldPreco)
                            .addComponent(jLabelNome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanelTratamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jTextFieldTempoDuracao, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldLucro, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelLucro, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTempoDuracao, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTratamentoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVoltar)
                .addContainerGap())
        );
        jPanelTratamentoLayout.setVerticalGroup(
            jPanelTratamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTratamentoLayout.createSequentialGroup()
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanelTratamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTratamentoLayout.createSequentialGroup()
                        .addGroup(jPanelTratamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelTratamentoLayout.createSequentialGroup()
                                .addComponent(jLabelTempoDuracao)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldTempoDuracao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelTratamentoLayout.createSequentialGroup()
                                .addComponent(jLabelNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelTratamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPreco)
                            .addComponent(jLabelLucro))
                        .addGap(10, 10, 10)
                        .addGroup(jPanelTratamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldLucro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanelTratamentoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir)
                    .addComponent(jButtonCancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, 538, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldLucroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLucroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLucroActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        TelaPrincipal telalogin = new TelaPrincipal();

        boolean validacao = DataAcessObject.validacaoCadastroTratamento
        (
            jTextFieldNome.getText(),
            Integer.parseInt(jTextFieldTempoDuracao.getText()),
            Float.parseFloat(jTextFieldPreco.getText()),
            Float.parseFloat(jTextFieldLucro.getText())
        );

        if (validacao) {
            jList1.setModel(Listagem.getTratamentoModel());
            repaint();
            Arquivo.salvarTodos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro: Os campos nao foram preenchidos corretamente. Tente novamente!");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        if(DataAcessObject.getUsuarioLogado() != null){
            int selectedIndex = jList1.getSelectedIndex();
            try{
               if (selectedIndex != -1) {
                   ListModel<Tratamento> model = jList1.getModel();
                   Tratamento tratamento = model.getElementAt(selectedIndex);
                   tratamento.editar
                   (
                        jTextFieldNome.getText(),
                        Integer.parseInt(jTextFieldTempoDuracao.getText()),
                        Float.parseFloat(jTextFieldPreco.getText()),
                        Float.parseFloat(jTextFieldLucro.getText())
                   );
                   jList1.setModel(Listagem.getTratamentoModel());
                   repaint();
                   Arquivo.salvarTodos();
                   jList1.setSelectedIndex(selectedIndex);
               }
            } catch(Exception ex){
                 JOptionPane.showMessageDialog(this, "Erro: Os campos nao foram preenchidos corretamente!");
            }
        } else{
            JOptionPane.showMessageDialog(this, "Erro: Voce nao tem permissao para essa acao!");
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jTextFieldTempoDuracaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldTempoDuracaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldTempoDuracaoActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(DataAcessObject.getUsuarioLogado() != null){
            int selectedIndex = jList1.getSelectedIndex();
            try{
               if (selectedIndex != -1) {
                   DefaultListModel<Tratamento> model = (DefaultListModel<Tratamento>) jList1.getModel();
                   Tratamento tratamento = model.get(selectedIndex);
                   tratamento.deletar();
                   jList1.setModel(Listagem.getTratamentoModel());
                   repaint();
                   Arquivo.salvarTodos();
               }
            } catch(Exception ex){
                 JOptionPane.showMessageDialog(this, "Erro: Por favor selecione um Produto valido!");
            }
        } else{
            JOptionPane.showMessageDialog(this, "Erro: Voce nao tem permissao para essa acao!");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        int selectedIndex = jList1.getSelectedIndex();
        try{
            if (selectedIndex != -1) {
                Tratamento tratamento = jList1.getModel().getElementAt(selectedIndex);
                jTextFieldNome.setText(tratamento.getNome());
                jTextFieldLucro.setText(String.valueOf(tratamento.getLucro()));
                jTextFieldPreco.setText(String.valueOf(tratamento.getPreco()));
                jTextFieldTempoDuracao.setText(String.valueOf(tratamento.getTempo()));
            }
        } catch(Exception ex){
             JOptionPane.showMessageDialog(this, "Erro: Selecione um campo valido!");
        }
    }//GEN-LAST:event_jList1ValueChanged
    
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
            java.util.logging.Logger.getLogger(TelaTratamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaTratamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaTratamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaTratamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaTratamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCancelar;
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabelLucro;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPreco;
    private javax.swing.JLabel jLabelTempoDuracao;
    private javax.swing.JList<Tratamento> jList1;
    private javax.swing.JPanel jPanelTratamento;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextFieldLucro;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPreco;
    private javax.swing.JTextField jTextFieldTempoDuracao;
    // End of variables declaration//GEN-END:variables

}
