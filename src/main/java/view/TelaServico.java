/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import animal.*;
import animal.Papagaio;
import servico.Servico.*;
import arquivo.Arquivo;
import arquivo.Listagem;
import dao.DataAcessObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import javax.swing.*;
import produto.Produto;
import servico.Servico;
import tratamento.Tratamento;
import usuario.Admnistrador;
import usuario.Funcionario;

public class TelaServico extends javax.swing.JFrame {

    /**
     * Creates new form TelaServico
     */
    
    public TelaServico() {
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

        jScrollPane3 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jPanelServico = new javax.swing.JPanel();
        jLabelNome = new javax.swing.JLabel();
        jLabelFuncionario = new javax.swing.JLabel();
        jLabelAnimal = new javax.swing.JLabel();
        jLabelTratamento = new javax.swing.JLabel();
        jLabelListaProduto = new javax.swing.JLabel();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jTextFieldNome = new javax.swing.JTextField();
        jPanelListagem = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButtonVoltar = new javax.swing.JButton();
        jComboBoxTratamento = new javax.swing.JComboBox<>();
        jComboBoxAnimal = new javax.swing.JComboBox<>();
        jComboBoxFuncionario = new javax.swing.JComboBox<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jListProduto = new javax.swing.JList<>();

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanelServico.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Servicos", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabelNome.setText("Nome:");

        jLabelFuncionario.setText("Funcionario:");

        jLabelAnimal.setText("Animal:");

        jLabelTratamento.setText("Tratamento:");

        jLabelListaProduto.setText("Lista de Produto:");

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

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jList1.setModel(Listagem.getServicoModel());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jList1);

        javax.swing.GroupLayout jPanelListagemLayout = new javax.swing.GroupLayout(jPanelListagem);
        jPanelListagem.setLayout(jPanelListagemLayout);
        jPanelListagemLayout.setHorizontalGroup(
            jPanelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelListagemLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 34, Short.MAX_VALUE))
        );
        jPanelListagemLayout.setVerticalGroup(
            jPanelListagemLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelListagemLayout.createSequentialGroup()
                .addGap(0, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jComboBoxTratamento.setModel(Listagem.getTratamentoCombo());

        jComboBoxAnimal.setModel(Listagem.getAnimalCombo());

        jComboBoxFuncionario.setModel(Listagem.getFuncionarioCombo());

        jListProduto.setModel(Listagem.getProdutoModel());
        jScrollPane4.setViewportView(jListProduto);

        javax.swing.GroupLayout jPanelServicoLayout = new javax.swing.GroupLayout(jPanelServico);
        jPanelServico.setLayout(jPanelServicoLayout);
        jPanelServicoLayout.setHorizontalGroup(
            jPanelServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServicoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanelListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanelServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelServicoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonVoltar)
                        .addGap(2, 2, 2))
                    .addGroup(jPanelServicoLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelServicoLayout.createSequentialGroup()
                                .addGroup(jPanelServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelServicoLayout.createSequentialGroup()
                                        .addComponent(jLabelNome, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(149, 149, 149)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanelServicoLayout.createSequentialGroup()
                                .addGroup(jPanelServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanelServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabelTratamento, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                        .addComponent(jComboBoxTratamento, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(jPanelServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanelServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabelAnimal, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                                            .addComponent(jComboBoxAnimal, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelServicoLayout.createSequentialGroup()
                                            .addGroup(jPanelServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jLabelFuncionario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jComboBoxFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGap(17, 17, 17))))
                                .addGap(20, 20, 20)
                                .addGroup(jPanelServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelListaProduto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(jPanelServicoLayout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 11, Short.MAX_VALUE)))
                                .addGap(18, 18, 18))))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelServicoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonEditar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonExcluir)
                .addGap(48, 48, 48))
        );
        jPanelServicoLayout.setVerticalGroup(
            jPanelServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelServicoLayout.createSequentialGroup()
                .addComponent(jButtonVoltar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelNome)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(jPanelServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanelServicoLayout.createSequentialGroup()
                        .addComponent(jLabelAnimal)
                        .addGap(11, 11, 11)
                        .addComponent(jComboBoxAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTratamento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxTratamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabelFuncionario)
                        .addGap(11, 11, 11)
                        .addComponent(jComboBoxFuncionario))
                    .addGroup(jPanelServicoLayout.createSequentialGroup()
                        .addComponent(jLabelListaProduto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane4)))
                .addGap(33, 33, 33)
                .addGroup(jPanelServicoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelServicoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelListagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanelServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jPanelServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
        if(DataAcessObject.getUsuarioLogado() != null && DataAcessObject.getUsuarioLogado().isAdmnistrador()){
            int selectedIndex = this.jList1.getSelectedIndex();
            try{
                if (selectedIndex != -1) {
                    Servico servico = this.jList1.getModel().getElementAt(selectedIndex);
                    servico.editar  
                    (
                        this.jComboBoxFuncionario.getModel().getElementAt(this.jComboBoxFuncionario.getSelectedIndex()).getId(),
                        this.jComboBoxAnimal.getModel().getElementAt(this.jComboBoxAnimal.getSelectedIndex()).getId(),
                        this.jComboBoxAnimal.getModel().getElementAt(this.jComboBoxAnimal.getSelectedIndex()).getClass().getName(),
                        this.jComboBoxTratamento.getModel().getElementAt(this.jComboBoxTratamento.getSelectedIndex()).getId(),
                        this.getElementsAt(this.jListProduto.getSelectedIndices(), this.jListProduto),
                        this.jTextFieldNome.getText()
                    );
                    
                    this.jList1.setModel(Listagem.getServicoModel());
                    this.repaint();
                    Arquivo.salvarTodos();
                }
            } catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Erro: Os campos nao foram preenchidos corretamente!");
            }
        } else{
            JOptionPane.showMessageDialog(this, "Erro: Voce nao tem permissao para essa acao!");
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed
    
    private static List<Integer> getElementsAt(int[] lista, javax.swing.JList<Produto> jlist){
        try{
            List<Integer> newList = new ArrayList<>();
            for(int valor : lista){
                newList.add(jlist.getModel().getElementAt(valor).getId());
            }
            return newList;
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return null;
    }
    
    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {
        TelaPrincipal telalogin = new TelaPrincipal();
        boolean validacao = DataAcessObject.validacaoCadastroServico
            (
                this.jComboBoxFuncionario.getModel().getElementAt(this.jComboBoxFuncionario.getSelectedIndex()).getId(),
                this.jComboBoxAnimal.getModel().getElementAt(this.jComboBoxAnimal.getSelectedIndex()).getId(),
                this.jComboBoxAnimal.getModel().getElementAt(this.jComboBoxAnimal.getSelectedIndex()).getClass().getName(),
                this.jComboBoxTratamento.getModel().getElementAt(this.jComboBoxTratamento.getSelectedIndex()).getId(),
                this.getElementsAt(this.jListProduto.getSelectedIndices(), this.jListProduto),
                this.jTextFieldNome.getText()
            );

        if (validacao) {
            //this.setVisible(false);
            //telalogin.setVisible(true);
            this.jList1.setModel(Listagem.getServicoModel());
            this.repaint();
            Arquivo.salvarTodos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro: Os campos nao foram preenchidos corretamente. Tente novamente!");
        }
//GEN-FIRST:event_jButtonSalvarActionPerformed
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
                if(DataAcessObject.getUsuarioLogado() != null && DataAcessObject.getUsuarioLogado().isAdmnistrador()){
            int selectedIndex = this.jList1.getSelectedIndex();
            try{
                if (selectedIndex != -1) {
                    Servico servico = this.jList1.getModel().getElementAt(selectedIndex);
                    servico.deletar();
                    this.jList1.setModel(Listagem.getServicoModel());
                    this.repaint();
                    Arquivo.salvarTodos();
                }
            } catch(Exception ex){
                JOptionPane.showMessageDialog(this, "Erro: Os campos nao foram preenchidos corretamente!");
            }
        } else{
            JOptionPane.showMessageDialog(this, "Erro: Voce nao tem permissao para essa acao!");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private static <T> int getComboBoxElement(int id, javax.swing.JComboBox<T> lista, Class classe){
        try{
            Method metodo = classe.getMethod("getId", new Class<?>[0]);
            for(int i = 0; i < lista.getModel().getSize(); i++){
               if((int) metodo.invoke(lista.getModel().getElementAt(i)) == id){
                   return i;
               }
           }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return -1;
    }
    
        private static <T> int getListElement(int id, javax.swing.JList<T> lista, Class classe){
        try{
            Method metodo = classe.getMethod("getId", new Class<?>[0]);
            for(int i = 0; i < lista.getModel().getSize(); i++){
               if((int) metodo.invoke(lista.getModel().getElementAt(i)) == id){
                   return i;
               }
           }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return -1;
    }
    
    public int[] selectElementsProdutos(List<Integer> lista){
       int[] indices = new int[lista.size()];
       int i = 0;
        for(Integer valor : lista){
            indices[i] = this.getListElement(valor, this.jListProduto, Produto.class);
            i++;
        }
        
        return indices;
    }
    
    
    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        int selectedIndex = this.jList1.getSelectedIndex();
            
        try{
            if (selectedIndex != -1) {
                Servico servico = this.jList1.getModel().getElementAt(selectedIndex);
                this.jTextFieldNome.setText(servico.getNome());
                this.jComboBoxTratamento.setSelectedIndex(this.getComboBoxElement(servico.getTratamentoId(), this.jComboBoxTratamento, Tratamento.class));
                this.jComboBoxAnimal.setSelectedIndex(this.getComboBoxElement(servico.getAnimalId(), this.jComboBoxAnimal, Animal.class));
                this.jComboBoxFuncionario.setSelectedIndex(this.getComboBoxElement(servico.getFuncionarioId(), this.jComboBoxFuncionario, Funcionario.class));
                this.jListProduto.setSelectedIndices(this.selectElementsProdutos(servico.getListaProdutosId()));
                
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
            java.util.logging.Logger.getLogger(TelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaServico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaServico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<? extends Animal> jComboBoxAnimal;
    private javax.swing.JComboBox<Funcionario> jComboBoxFuncionario;
    private javax.swing.JComboBox<Tratamento> jComboBoxTratamento;
    private javax.swing.JLabel jLabelAnimal;
    private javax.swing.JLabel jLabelFuncionario;
    private javax.swing.JLabel jLabelListaProduto;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelTratamento;
    private javax.swing.JList<Servico> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JList<Produto> jListProduto;
    private javax.swing.JPanel jPanelListagem;
    private javax.swing.JPanel jPanelServico;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextFieldNome;
    // End of variables declaration//GEN-END:variables
}
