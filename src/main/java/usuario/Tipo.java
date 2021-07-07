package usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tipo {
    private JPanel tipoPanel;
    private JButton btnAdmin;
    private JButton btnFuncionario;


    public Tipo()
    {
        btnAdmin.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //abrir cadastro de admin
            }
        });

        btnFuncionario.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                //abrir cadastro de funcionario
            }
        });
    }

    public static void tipoUsuario() {
        JFrame frame = new JFrame("Cadastro de Pet");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new Tipo().getTipoPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public JPanel getTipoPanel() { return tipoPanel;}
}


