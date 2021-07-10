package tratamento;

import javax.swing.*;

public class ViewTratamento
{
    public static void ListagemTratamento()
    {
        JFrame frame = new JFrame("Tratamentos Cadastrados");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable table = viewTratamento();
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static JTable viewTratamento()
    {
        String[] columnNames = {"Tipo", "Nome", "Cor", "Raça", "Sexo", "Idade", "Peso", "Comprimento"};
        Object[][] data = {{"Cachorro","Thor", "Preto", "Husky", "m", "5", "12", "50"},
                {"Cachorro","Thor", "Preto", "Husky", "m", "5", "12", "50"}};
        JTable table = new JTable(data, columnNames);
        table.setFillsViewportHeight(true);

        return table;
    }
}

