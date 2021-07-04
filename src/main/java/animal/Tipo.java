package animal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Tipo {
    private JPanel tipoAnimalPanel;
    private JLabel tipoLabel;

    private JButton btntipo;
    private JComboBox comboBox1;

    public Tipo()
    {
        btntipo.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ImageIcon icon = new ImageIcon("img/cadastro.png");
                //ao inves da mensagem aqui vai abrir o outro form
                JOptionPane.showMessageDialog(null, "","Cadastro de Pet", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        });
    }

    public static void main(String[] args)
    {

        JFrame frame = new JFrame("Cadastro de Pet");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new Tipo().tipoAnimalPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);


    }
}
