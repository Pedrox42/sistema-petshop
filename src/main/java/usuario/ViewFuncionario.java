//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package usuario;

import javax.swing.*;

public class ViewFuncionario
{
    public static void ListagemFuncionario()
    {
        JFrame frame = new JFrame("Funcionários Cadastrados");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable table = viewFuncionario();
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static JTable viewFuncionario()
    {
        String[] columnNames = {"Tipo", "Nome", "Cor", "Raça", "Sexo", "Idade", "Peso", "Comprimento"};
        Object[][] data = {{"Cachorro","Thor", "Preto", "Husky", "m", "5", "12", "50"},
                {"Cachorro","Thor", "Preto", "Husky", "m", "5", "12", "50"}};
        JTable table = new JTable(data, columnNames);
        table.setFillsViewportHeight(true);

        return table;
    }
}


