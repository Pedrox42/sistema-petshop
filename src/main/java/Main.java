//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

import animal.*;
import usuario.Funcionario;
import usuario.Dono;
import Arquivo.Arquivo;
import usuario.Usuario;

import javax.swing.*;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Arquivo.preencherTodos();

        JFrame frame = new JFrame("Cadastro de Pet");
        frame.setIconImage(new ImageIcon("img/logo.png").getImage());
        frame.setContentPane(new Cadastro().getAnimalPanel());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);

        //Dono dono = Dono.cadastrar("Pedro2");
        //Funcionario funcionario = Funcionario.cadastrar("teste", 200, 8);
        //Dono.cadastrar("Davi");
        //Cachorro.cadastrar("Toto", "Branco", "Vira-lata", 'm', 5, 25, 55);
        //Gato.cadastrar("Picles", "Preto e Branco", "Gato", 'm', 5, 3.2f, 33);
        //Papagaio.cadastrar("Leco", "Verde", "Papagaio", 'm', 5, 0.3f, 15);

        Arquivo.salvarTodos();

    }
}
