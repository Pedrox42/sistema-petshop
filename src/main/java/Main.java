//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

import arquivo.Arquivo;
import produto.Produto;
import usuario.Dono;
import animal.*;


public class Main {

    public static void main(String[] args) {
        Arquivo.preencherTodos();
        Dono dono = new Dono("Pedro2", "Pedrox", "1234");
        dono.cadastrarDono("Pedro2", "Pedrox", "1234");
        dono.cadastrarProduto("Shampoo", "Shampoo pra cachorro", 19.50f);
        dono.cadastrarFuncionario("teste", "teste", "teste",200, 8);
        dono.cadastrarAnimal("Cachorro", "Thor", "Preto", "Husky", 'm', 5, 12, 50);
        dono.cadastrarAnimal("Gato", "Picles", "Preto", "Gato", 'm', 5, 12, 50);
        dono.cadastrarAnimal("Papagaio", "Leko", "Verde", "Papagaio", 'm', 5, 12, 50);
        dono.cadastrarTratamento("Tratamento", 50, 59.90f, 8000);
        //Dono.cadastrar("Davi");

        Arquivo.salvarTodos();
    }
}
