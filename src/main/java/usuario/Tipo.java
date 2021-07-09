//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package usuario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tipo {
    private JPanel tipoUsuario;
    private JButton btnAdmin;
    private JButton btnFuncionario;

    public JPanel getTipoUsuario() {
        return tipoUsuario;
    }

    public Tipo()
    {
        btnAdmin.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                usuario.CadastroA.cadastroAdmin();
            }
        });

        btnFuncionario.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                usuario.CadastroF.cadastroFuncionario();
            }
        });
    }

    public static void tipoUsuario() {
        JFrame frame = new JFrame("Cadastro de Usuário");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new Tipo().getTipoUsuario());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}


