package produto;

import javax.swing.*;

public class ViewProduto
{
    public static void ListagemProduto()
    {
        JFrame frame = new JFrame("Produtos Cadastrados");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable table = viewProduto();
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static JTable viewProduto()
    {
        String[] columnNames = {"Tipo", "Nome", "Cor", "Raça", "Sexo", "Idade", "Peso", "Comprimento"};
        Object[][] data = {{"Cachorro","Thor", "Preto", "Husky", "m", "5", "12", "50"},
                {"Cachorro","Thor", "Preto", "Husky", "m", "5", "12", "50"}};
        JTable table = new JTable(data, columnNames);
        table.setFillsViewportHeight(true);

        return table;
    }
}


