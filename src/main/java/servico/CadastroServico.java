package servico;

import tratamento.CadastroTratamento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroServico {
    private JPanel cadastroServicoPanel;
    private JComboBox funcionarioIdField;
    private JComboBox animalIdField;
    private JComboBox classeAnimalField;
    private JComboBox tratamentoIdField;
    private JButton btnServico;
    private JTextField nomeField;
    private JTextArea listaProdutoField;
    private JLabel nomeLabel;
    private JLabel funcionarioIdLabel;
    private JLabel animalIdLabel;
    private JLabel classeAnimalLabel;
    private JLabel tratamentoIdLabel;
    private JLabel listaProdutoLabel;

    public JPanel getCadastroServicoPanel() {
        return cadastroServicoPanel;
    }

    public CadastroServico()
    {
        btnServico.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ImageIcon icon = new ImageIcon("img/cadastro.png");
                JOptionPane.showMessageDialog(null, "","Cadastro de Pet", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        });
    }

    public static void main(String[] args) {
        cadastrarServico();
    }
    public static void cadastrarServico() {
        JFrame frame = new JFrame("Cadastro de Administrador");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new CadastroServico().getCadastroServicoPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
