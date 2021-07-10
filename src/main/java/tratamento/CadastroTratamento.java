//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package tratamento;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroTratamento {
    private JPanel cadastroTratamentoPanel;
    private JTextField nomeField;
    private JTextField tempoField;
    private JTextField precoField;
    private JTextField lucroField;
    private JButton btnTratamento;
    private JLabel lucroLabel;
    private JLabel precoLabel;
    private JLabel tempoLabel;
    private JLabel nomeLabel;

    public JPanel getCadastroTratamentoPanel() {
        return cadastroTratamentoPanel;
    }

    public CadastroTratamento()
    {
        btnTratamento.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ImageIcon icon = new ImageIcon("img/cadastro.png");
                JOptionPane.showMessageDialog(null, "","Cadastro de Pet", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        });
    }

    public static void cadastrarTratamento() {
        JFrame frame = new JFrame("Cadastro de Administrador");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new CadastroTratamento().getCadastroTratamentoPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
