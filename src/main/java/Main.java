//Anna Leticia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

import arquivo.Arquivo;
import arquivo.Listagem;
import produto.Produto;
import tratamento.Tratamento;
import usuario.Admnistrador;
import java.util.ArrayList;
import java.util.List;
import animal.*;
import usuario.Funcionario;
import view.*;
import usuario.Usuario;
import usuario.Admnistrador;
import view.*;


public class Main {

    public static void main(String[] args) {

        Arquivo.preencherTodos();

        TelaLogin tela = new TelaLogin();
        tela.setVisible(true);

        Arquivo.salvarTodos();

    }

}
