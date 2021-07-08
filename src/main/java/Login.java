import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    private JTextField emailField;
    private JPasswordField senhaField;
    private JButton btnLogin;
    private JPanel loginPanel;
    private JLabel emailLabel;
    private JLabel senhaLabel;

    public JPanel getLoginPanel() {
        return loginPanel;
    }

    public Login()
    {
        btnLogin.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                Home.homePetShop();
            }
        });
    }

    public static void login() {
        JFrame frame = new JFrame("Cadastro");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new Login().getLoginPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

}
