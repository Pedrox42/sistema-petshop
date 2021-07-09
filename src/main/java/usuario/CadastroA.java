//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CadastroA {
    private JPanel cadastroAdministrador;
    private JTextField nomeField;
    private JLabel nomeLabel;
    private JTextField emailField;
    private JPasswordField senhaField;
    private JLabel emailLabel;
    private JLabel senhaLabel;
    private JButton btnAdmin;

    public JPanel getCadastroAdministrador() {
        return cadastroAdministrador;
    }
    public CadastroA()
    {
        btnAdmin.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ImageIcon icon = new ImageIcon("img/cadastro.png");
                JOptionPane.showMessageDialog(null, "","Cadastro de Pet", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        });
    }

    public static void cadastroAdmin() {
        JFrame frame = new JFrame("Cadastro de Administrador");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new CadastroA().getCadastroAdministrador());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
