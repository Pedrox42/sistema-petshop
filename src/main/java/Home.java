//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B


import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home {
    private JPanel homePanel;
    private JButton btnUsuario;
    private JButton btnPet;

    public JPanel getHomePanel() {
        return homePanel;
    }

    public Home()
    {
        btnUsuario.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                usuario.Tipo.tipoUsuario();
            }
        });

        btnPet.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                animal.Cadastro.cadastroPet();
            }
        });
    }

    public static void homePetShop() {
        JFrame frame = new JFrame("Cadastro");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new Home().getHomePanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
