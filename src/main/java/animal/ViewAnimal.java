//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package animal;

import produto.CadastroProduto;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewAnimal
{
    public static void ListagemAnimal()
    {
        JFrame frame = new JFrame("Animais Cadastrados");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTable table = viewAnimal();
        JScrollPane scrollPane = new JScrollPane(table);
        frame.getContentPane().add(scrollPane);
        frame.pack();
        frame.setVisible(true);
    }

    public static JTable viewAnimal()
    {
        String[] columnNames = {"Tipo", "Nome", "Cor", "Raça", "Sexo", "Idade", "Peso", "Comprimento"};
        Object[][] data = {{"Cachorro","Thor", "Preto", "Husky", "m", "5", "12", "50"},
                {"Cachorro","Thor", "Preto", "Husky", "m", "5", "12", "50"}};
        JTable table = new JTable(data, columnNames);
        table.setFillsViewportHeight(true);

        return table;
    }
}


