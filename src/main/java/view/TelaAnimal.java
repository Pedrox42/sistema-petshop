//Anna Leticia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package view;

import animal.Animal;
import animal.Cachorro;
import animal.Gato;
import animal.Papagaio;
import arquivo.Arquivo;
import arquivo.Listagem;
import dao.DataAcessObject;

import javax.swing.*;
import produto.Produto;
import usuario.Admnistrador;

public class TelaAnimal extends javax.swing.JFrame {

    /**
     * Creates new form CadastroAnimal
     */
    public TelaAnimal() {
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

        jPanelAnimal = new javax.swing.JPanel();
        jLabelTipo = new javax.swing.JLabel();
        jComboBoxTipo = new javax.swing.JComboBox<>();
        jLabelNome = new javax.swing.JLabel();
        jTextFieldNome = new javax.swing.JTextField();
        jLabelCor = new javax.swing.JLabel();
        jTextFieldCor = new javax.swing.JTextField();
        jLabelRaca = new javax.swing.JLabel();
        jLabelSexo = new javax.swing.JLabel();
        jComboBoxSexo = new javax.swing.JComboBox<>();
        jLabelIdade = new javax.swing.JLabel();
        jTextFieldIdade = new javax.swing.JTextField();
        jLabelPeso = new javax.swing.JLabel();
        jTextFieldPeso = new javax.swing.JTextField();
        jLabelComprimento = new javax.swing.JLabel();
        jTextFieldComprimento = new javax.swing.JTextField();
        jButtonSalvar = new javax.swing.JButton();
        jButtonEditar = new javax.swing.JButton();
        jButtonExcluir = new javax.swing.JButton();
        jButtonVoltar = new javax.swing.JButton();
        jTextFieldRaca = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanelAnimal.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Cadastro de Animais", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION));

        jLabelTipo.setText("Tipo:");

        jComboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Cachorro", "Gato", "Papagaio" }));

        jLabelNome.setText("Nome:");

        jTextFieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNomeActionPerformed(evt);
            }
        });

        jLabelCor.setText("Cor:");

        jTextFieldCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCorActionPerformed(evt);
            }
        });

        jLabelRaca.setText("Raca:");

        jLabelSexo.setText("Sexo:");

        jComboBoxSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "Femea", "Macho" }));
        jComboBoxSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSexoActionPerformed(evt);
            }
        });

        jLabelIdade.setText("Idade:");

        jLabelPeso.setText("Peso(kg):");

        jLabelComprimento.setText("Comprimento(cm):");

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

        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVoltarActionPerformed(evt);
            }
        });

        jTextFieldRaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldRacaActionPerformed(evt);
            }
        });

        jList1.setModel(Listagem.getAnimalModel());
        jList1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jList1.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                jList1ValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        javax.swing.GroupLayout jPanelAnimalLayout = new javax.swing.GroupLayout(jPanelAnimal);
        jPanelAnimal.setLayout(jPanelAnimalLayout);
        jPanelAnimalLayout.setHorizontalGroup(
            jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAnimalLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelSexo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBoxSexo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelPeso, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabelIdade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldIdade)
                                    .addComponent(jLabelComprimento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jComboBoxTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelTipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabelCor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabelNome, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextFieldNome, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextFieldRaca, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelRaca, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAnimalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButtonSalvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonExcluir)
                        .addGap(101, 101, 101))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAnimalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonVoltar)
                .addContainerGap())
        );
        jPanelAnimalLayout.setVerticalGroup(
            jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAnimalLayout.createSequentialGroup()
                .addComponent(jButtonVoltar)
                .addGap(12, 12, 12)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanelAnimalLayout.createSequentialGroup()
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelTipo)
                            .addComponent(jLabelNome))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelCor)
                            .addComponent(jLabelRaca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldRaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelSexo)
                            .addComponent(jLabelIdade))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jComboBoxSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabelPeso)
                            .addComponent(jLabelComprimento))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextFieldPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldComprimento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanelAnimalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalvar)
                    .addComponent(jButtonEditar)
                    .addComponent(jButtonExcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAnimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelAnimal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(555, 427));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarActionPerformed
         if(DataAcessObject.getUsuarioLogado() != null){
            int selectedIndex = this.jList1.getSelectedIndex();
                try{
                    if (selectedIndex != -1) {                      
                       Animal animal = this.jList1.getModel().getElementAt(selectedIndex);
                       if(animal.getTipo() == this.jComboBoxTipo.getSelectedIndex()){
                            switch(animal.getTipo()){
                             case 1:
                                 Cachorro cachorro = (Cachorro) animal;
                                 cachorro.editar
                                     (
                                         jTextFieldNome.getText(),
                                         jTextFieldCor.getText(),
                                         jTextFieldRaca.getText(),
                                         jComboBoxSexo.getSelectedIndex() == 1 ? 'F' : 'M',
                                         Integer.parseInt(jTextFieldIdade.getText()),
                                         Float.parseFloat(jTextFieldPeso.getText()),
                                         Float.parseFloat(jTextFieldComprimento.getText())
                                     );
                             break;

                             case 2:
                                 Gato gato = (Gato) animal;
                                 gato.editar
                                     (
                                         jTextFieldNome.getText(),
                                         jTextFieldCor.getText(),
                                         jTextFieldRaca.getText(),
                                         jComboBoxSexo.getSelectedIndex() == 1 ? 'F' : 'M',
                                         Integer.parseInt(jTextFieldIdade.getText()),
                                         Float.parseFloat(jTextFieldPeso.getText()),
                                         Float.parseFloat(jTextFieldComprimento.getText())
                                     );
                             break;

                             case 3:
                                 Papagaio papagaio = (Papagaio) animal;
                                 papagaio.editar
                                     (
                                         jTextFieldNome.getText(),
                                         jTextFieldCor.getText(),
                                         jTextFieldRaca.getText(),
                                         jComboBoxSexo.getSelectedIndex() == 1 ? 'F' : 'M',
                                         Integer.parseInt(jTextFieldIdade.getText()),
                                         Float.parseFloat(jTextFieldPeso.getText()),
                                         Float.parseFloat(jTextFieldComprimento.getText())
                                     );
                             break;
                         }
                        this.jList1.setModel(Listagem.getAnimalModel());
                        this.repaint();
                        Arquivo.salvarTodos();
                        this.jList1.setSelectedIndex(selectedIndex);
                    }
                } else{
                    JOptionPane.showMessageDialog(this, "Erro: Por favor nao altere o tipo do animal selecionado!");
                }
            } catch(Exception ex){
                 JOptionPane.showMessageDialog(this, "Erro: Os campos nao foram preenchidos corretamente!");
            }
        } else{
             JOptionPane.showMessageDialog(this, "Erro: Voce nao tem permissao para essa acao!");
        }
    }//GEN-LAST:event_jButtonEditarActionPerformed

    private void jButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSalvarActionPerformed
        TelaPrincipal telalogin = new TelaPrincipal();
        boolean validacao = false;
        switch(jComboBoxTipo.getSelectedIndex()){
            case 1:
                validacao = DataAcessObject.validacaoCadastroCachorro
                    (
                            jTextFieldNome.getText(),
                            jTextFieldCor.getText(),
                            jTextFieldRaca.getText(),
                            jComboBoxSexo.getSelectedIndex() == 1 ? 'F' : 'M',
                            Integer.parseInt(jTextFieldIdade.getText()),
                            Float.parseFloat(jTextFieldPeso.getText()),
                            Float.parseFloat(jTextFieldComprimento.getText())
                    );
            break;
            case 2:
                validacao = DataAcessObject.validacaoCadastroGato
                        (
                                jTextFieldNome.getText(),
                                jTextFieldCor.getText(),
                                jTextFieldRaca.getText(),
                                jComboBoxSexo.getSelectedIndex() == 1 ? 'F' : 'M',
                                Integer.parseInt(jTextFieldIdade.getText()),
                                Float.parseFloat(jTextFieldPeso.getText()),
                                Float.parseFloat(jTextFieldComprimento.getText())
                        );
                break;
            case 3:
                validacao = DataAcessObject.validacaoCadastroPapagaio
                        (
                                jTextFieldNome.getText(),
                                jTextFieldCor.getText(),
                                jTextFieldRaca.getText(),
                                jComboBoxSexo.getSelectedIndex() == 1 ? 'F' : 'M',
                                Integer.parseInt(jTextFieldIdade.getText()),
                                Float.parseFloat(jTextFieldPeso.getText()),
                                Float.parseFloat(jTextFieldComprimento.getText())
                        );
                break;
        }

        if (validacao) {
            //this.setVisible(false);
            //telalogin.setVisible(true);
            this.jList1.setModel(Listagem.getAnimalModel());
            this.repaint();
            Arquivo.salvarTodos();
        } else {
            JOptionPane.showMessageDialog(this, "Erro: Os campos nao foram preenchidos corretamente. Tente novamente!");
        }
    }//GEN-LAST:event_jButtonSalvarActionPerformed

    private void jComboBoxSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxSexoActionPerformed

    private void jTextFieldCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCorActionPerformed

    private void jTextFieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNomeActionPerformed

    private void jTextFieldRacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldRacaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldRacaActionPerformed


    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
            TelaPrincipal tela = new TelaPrincipal();
            tela.setVisible(true);
            dispose();
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExcluirActionPerformed
        if(DataAcessObject.getUsuarioLogado() != null){
            int selectedIndex = this.jList1.getSelectedIndex();
            try{
               if (selectedIndex != -1) {
                   DefaultListModel<Animal> model = (DefaultListModel<Animal>) this.jList1.getModel();
                   Animal animal = model.get(selectedIndex);

                   switch(animal.getTipo()){
                        case 1:
                           Cachorro cachorro = (Cachorro) animal;
                           cachorro.deletar();
                           break;

                        case 2:
                            Gato gato = (Gato) animal;
                            gato.deletar();
                            break;
                        case 3:
                            Papagaio papagaio = (Papagaio) animal;
                            papagaio.deletar();
                            break;
                   }

                   this.jList1.setModel(Listagem.getAnimalModel());
                   this.repaint();
                   Arquivo.salvarTodos();
               }
            } catch(Exception ex){
                 JOptionPane.showMessageDialog(this, "Erro: Por favor selecione um Produto valido!");
            }
        } else{
            JOptionPane.showMessageDialog(this, "Erro: Os campos nao foram preenchidos corretamente. Tente novamente!");
        }
    }//GEN-LAST:event_jButtonExcluirActionPerformed

    private void jList1ValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_jList1ValueChanged
        int selectedIndex = this.jList1.getSelectedIndex();

        try{
            if (selectedIndex != -1) {
                Animal animal = this.jList1.getModel().getElementAt(selectedIndex);
                this.jTextFieldNome.setText(animal.getNome());
                this.jTextFieldComprimento.setText(String.valueOf(animal.getComprimento()));
                this.jTextFieldCor.setText(animal.getCor());
                this.jTextFieldIdade.setText(String.valueOf(animal.getIdade()));
                this.jTextFieldPeso.setText(String.valueOf(animal.getPeso()));
                this.jTextFieldRaca.setText(animal.getRaca());
                this.jComboBoxSexo.setSelectedIndex(animal.getSexo() == 'F' ? 1 : 2);
                this.jComboBoxTipo.setSelectedIndex(animal.getTipo());
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
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAnimal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonEditar;
    private javax.swing.JButton jButtonExcluir;
    private javax.swing.JButton jButtonSalvar;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JComboBox<String> jComboBoxSexo;
    private javax.swing.JComboBox<String> jComboBoxTipo;
    private javax.swing.JLabel jLabelComprimento;
    private javax.swing.JLabel jLabelCor;
    private javax.swing.JLabel jLabelIdade;
    private javax.swing.JLabel jLabelNome;
    private javax.swing.JLabel jLabelPeso;
    private javax.swing.JLabel jLabelRaca;
    private javax.swing.JLabel jLabelSexo;
    private javax.swing.JLabel jLabelTipo;
    private javax.swing.JList<? extends Animal> jList1;
    private javax.swing.JPanel jPanelAnimal;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextFieldComprimento;
    private javax.swing.JTextField jTextFieldCor;
    private javax.swing.JTextField jTextFieldIdade;
    private javax.swing.JTextField jTextFieldNome;
    private javax.swing.JTextField jTextFieldPeso;
    private javax.swing.JTextField jTextFieldRaca;
    // End of variables declaration//GEN-END:variables
}
