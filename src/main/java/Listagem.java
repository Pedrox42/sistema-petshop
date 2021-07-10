//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Listagem {
    private JButton btnUsuario;
    private JButton btnPet;
    private JButton btnTratamento;
    private JButton btnProduto;
    private JPanel listagemPanel;

    public JPanel getListagemPanel() {
        return listagemPanel;
    }

    public Listagem()
    {
        btnUsuario.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                usuario.ViewAdmin.ListagemAdministrador();
                usuario.ViewFuncionario.ListagemFuncionario();
            }
        });

        btnPet.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                animal.ViewAnimal.ListagemAnimal();
            }
        });

        btnTratamento.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                tratamento.ViewTratamento.ListagemTratamento();
            }
        });
        btnProduto.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                produto.ViewProduto.ListagemProduto();
            }
        });

    }

    public static void listagem() {
        JFrame frame = new JFrame("Cadastro");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new Listagem().getListagemPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
