//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package animal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Cadastro {
    private JPanel animalPanel;
    private JLabel tipoLabel;
    private JComboBox tipoField;
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
    private JButton btnAnimal;

    public Cadastro()
    {
        btnAnimal.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                ImageIcon icon = new ImageIcon("img/cadastro.png");
                JOptionPane.showMessageDialog(null, "","Cadastro de Pet", JOptionPane.INFORMATION_MESSAGE, icon);
            }
        });
    }

    public static void cadastroPet() {
        JFrame frame = new JFrame("Cadastro de Pet");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new Cadastro().getAnimalPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        cadastroPet();
    }
    public JPanel getAnimalPanel() {
        return animalPanel;
    }

}
