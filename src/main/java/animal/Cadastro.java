package animal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro {
    private JPanel animalPanel;
    private JLabel nomeLabel;
    private JTextField nomeField;
    private JLabel corLabel;
    private JTextField corField;
    private JLabel sexoLabel;
    private JComboBox sexoField;
    private JLabel pesoLabel;
    private JTextField pesoField;
    private JLabel racaLabel;
    private JTextField racaField;
    private JLabel idadeLabel;
    private JTextField idadeField;
    private JLabel comprimentoLabel;
    private JTextField comprimentoField;
    private JButton btnanimal;

    public Cadastro()
    {
        btnanimal.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ImageIcon icon = new ImageIcon("img/cadastro.png");
                JOptionPane.showMessageDialog(null, "","Cadastro de Pet", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        });
    }

    public static void main(String[] args)
    {

        JFrame frame = new JFrame("Cadastro de Pet");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new Cadastro().animalPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
