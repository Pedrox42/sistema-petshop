package view;


public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
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

        filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 0), new java.awt.Dimension(10, 32767));
        jPanel1 = new javax.swing.JPanel();
        jLabelLogoInicio = new javax.swing.JLabel();
        jLabelTelaInicial = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuInicio = new javax.swing.JMenu();
        jMenuItemInicio = new javax.swing.JMenuItem();
        jMenuUsuarios = new javax.swing.JMenu();
        jMenuItemAdministrador = new javax.swing.JMenuItem();
        jMenuItemFuncionarios = new javax.swing.JMenuItem();
        jMenuAnimais = new javax.swing.JMenu();
        jMenuItemAnimais = new javax.swing.JMenuItem();
        jMenuTratamentos = new javax.swing.JMenu();
        jMenuItemTratamento = new javax.swing.JMenuItem();
        jMenuProdutos = new javax.swing.JMenu();
        jMenuItemProdutos = new javax.swing.JMenuItem();
        jMenuServicos = new javax.swing.JMenu();
        jMenuItemServicos = new javax.swing.JMenuItem();
        jMenuSair = new javax.swing.JMenu();
        jMenuItemSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        getContentPane().add(filler1);
        filler1.setBounds(510, 130, 10, 0);

        jPanel1.setLayout(null);

        jLabelLogoInicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLogoInicio.setIcon(new javax.swing.JLabel() {
            public javax.swing.Icon getIcon() {
                try {
                    return new javax.swing.ImageIcon(
                        new java.net.URL("https://i.ibb.co/2SR5B6b/logo.png")
                    );
                } catch (java.net.MalformedURLException e) {
                }
                return null;
            }
        }.getIcon());
        jPanel1.add(jLabelLogoInicio);
        jLabelLogoInicio.setBounds(0, 20, 270, 250);

        jLabelTelaInicial.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jLabelTelaInicial.setForeground(new java.awt.Color(102, 102, 102));
        jLabelTelaInicial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTelaInicial.setText("Bem vindo!");
        jPanel1.add(jLabelTelaInicial);
        jLabelTelaInicial.setBounds(250, -10, 150, 140);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 410, 280);

        jMenuInicio.setText("Inicio");

        jMenuItemInicio.setText("Inicio");
        jMenuItemInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInicioActionPerformed(evt);
            }
        });
        jMenuInicio.add(jMenuItemInicio);

        jMenuBar1.add(jMenuInicio);

        jMenuUsuarios.setText("Usuarios");

        jMenuItemAdministrador.setText("Administrador");
        jMenuItemAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAdministradorActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemAdministrador);

        jMenuItemFuncionarios.setText("Funcionarios");
        jMenuItemFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFuncionariosActionPerformed(evt);
            }
        });
        jMenuUsuarios.add(jMenuItemFuncionarios);

        jMenuBar1.add(jMenuUsuarios);

        jMenuAnimais.setText("Animais");

        jMenuItemAnimais.setText("Animais");
        jMenuItemAnimais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemAnimaisActionPerformed(evt);
            }
        });
        jMenuAnimais.add(jMenuItemAnimais);

        jMenuBar1.add(jMenuAnimais);

        jMenuTratamentos.setText("Tratamentos");

        jMenuItemTratamento.setText("Tratamentos");
        jMenuItemTratamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemTratamentoActionPerformed(evt);
            }
        });
        jMenuTratamentos.add(jMenuItemTratamento);

        jMenuBar1.add(jMenuTratamentos);

        jMenuProdutos.setText("Produtos");

        jMenuItemProdutos.setText("Produtos");
        jMenuItemProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemProdutosActionPerformed(evt);
            }
        });
        jMenuProdutos.add(jMenuItemProdutos);

        jMenuBar1.add(jMenuProdutos);

        jMenuServicos.setText("Servicos");

        jMenuItemServicos.setText("Servicos");
        jMenuItemServicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemServicosActionPerformed(evt);
            }
        });
        jMenuServicos.add(jMenuItemServicos);

        jMenuBar1.add(jMenuServicos);

        jMenuSair.setText("Sair");

        jMenuItemSair.setText("Sair");
        jMenuItemSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSairActionPerformed(evt);
            }
        });
        jMenuSair.add(jMenuItemSair);

        jMenuBar1.add(jMenuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(428, 343));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAdministradorActionPerformed
        TelaAdministrador tela = new TelaAdministrador();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemAdministradorActionPerformed

    private void jMenuItemServicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemServicosActionPerformed
        TelaServico tela = new TelaServico();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemServicosActionPerformed

    private void jMenuItemProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemProdutosActionPerformed
        TelaProduto tela = new TelaProduto();
        tela.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_jMenuItemProdutosActionPerformed

    private void jMenuItemSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jMenuItemSairActionPerformed

    private void jMenuItemAnimaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemAnimaisActionPerformed
        TelaAnimal tela = new TelaAnimal();
        tela.setVisible(true);
        dispose();
        
        
    }//GEN-LAST:event_jMenuItemAnimaisActionPerformed

    private void jMenuItemTratamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemTratamentoActionPerformed
        TelaTratamento tela = new TelaTratamento();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemTratamentoActionPerformed

    private void jMenuItemInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInicioActionPerformed
        TelaPrincipal tela = new TelaPrincipal();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemInicioActionPerformed

    private void jMenuItemFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFuncionariosActionPerformed
        TelaFuncionario tela = new TelaFuncionario();
        tela.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItemFuncionariosActionPerformed

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
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JLabel jLabelLogoInicio;
    private javax.swing.JLabel jLabelTelaInicial;
    private javax.swing.JMenu jMenuAnimais;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuInicio;
    private javax.swing.JMenuItem jMenuItemAdministrador;
    private javax.swing.JMenuItem jMenuItemAnimais;
    private javax.swing.JMenuItem jMenuItemFuncionarios;
    private javax.swing.JMenuItem jMenuItemInicio;
    private javax.swing.JMenuItem jMenuItemProdutos;
    private javax.swing.JMenuItem jMenuItemSair;
    private javax.swing.JMenuItem jMenuItemServicos;
    private javax.swing.JMenuItem jMenuItemTratamento;
    private javax.swing.JMenu jMenuProdutos;
    private javax.swing.JMenu jMenuSair;
    private javax.swing.JMenu jMenuServicos;
    private javax.swing.JMenu jMenuTratamentos;
    private javax.swing.JMenu jMenuUsuarios;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
