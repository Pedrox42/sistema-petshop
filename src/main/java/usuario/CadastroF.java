//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroF {
    private JPanel cadastroFuncionario;
    private JLabel nomeLabel;
    private JTextField nomeField;
    private JLabel emailLabel;
    private JTextField emailField;
    private JLabel senhaLabel;
    private JPasswordField senhaField;
    private JLabel salarioLabel;
    private JTextField salarioField;
    private JLabel cargaHLabel;
    private JButton btnFuncionario;
    private JTextField cargaHField;

    public JPanel getCadastroFuncionario() {
        return cadastroFuncionario;
    }

    public CadastroF()
    {
        btnFuncionario.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ImageIcon icon = new ImageIcon("img/cadastro.png");
                JOptionPane.showMessageDialog(null, "","Cadastro de Pet", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        });
    }

    public static void cadastroFuncionario() {
        JFrame frame = new JFrame("Cadastro de Funcionário");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new CadastroF().getCadastroFuncionario());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
