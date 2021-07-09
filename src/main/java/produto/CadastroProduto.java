package produto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroProduto {
    private JPanel cadastroProdutoPanel;
    private JTextField nomeField;
    private JTextArea descricaoField;
    private JTextField precoField;
    private JButton btnProduto;
    private JLabel nomeLabel;
    private JLabel descricaoLabel;
    private JLabel precoLabel;

    public JPanel getCadastroProdutoPanel() {
        return cadastroProdutoPanel;
    }

    public CadastroProduto()
    {
        btnProduto.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ImageIcon icon = new ImageIcon("img/cadastro.png");
                JOptionPane.showMessageDialog(null, "","Cadastro de Pet", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        });
    }

    public static void cadastrarProduto() {
        JFrame frame = new JFrame("Cadastro de Administrador");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new CadastroProduto().getCadastroProdutoPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
