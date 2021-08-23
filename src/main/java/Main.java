//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

import servico.Servico;
import arquivo.Arquivo;
import produto.Produto;
import tratamento.Tratamento;
import usuario.Admnistrador;

import java.util.ArrayList;
import java.util.List;
import animal.*;
import usuario.Funcionario;


public class Main {

    public static void main(String[] args) {

        Arquivo.preencherTodos();

        Admnistrador admnistrador = new Admnistrador("Pedro3", "Pedrox", "1234");

        Produto produto = admnistrador.cadastrarProduto("Shampoo", "Shampoo pra cachorro", 19.50f);
        List<Integer> listaProdutos = new ArrayList<>();
        listaProdutos.add(produto.getId());
        Funcionario funcionario = admnistrador.cadastrarFuncionario("teste", "teste", "teste",200, 8);
        Cachorro cachorro = admnistrador.cadastrarAnimal(Cachorro.class, "Thor", "Preto", "Husky", 'm', 5, 12, 50);
        Tratamento tramento = admnistrador.cadastrarTratamento("Tratamento", 50, 59.90f, 8000);

        Servico servico = admnistrador.cadastrarServico(funcionario.getId(),  cachorro.getId() , "animal.Cachorro" , tramento.getId(), listaProdutos, "Servico1");

        System.out.println(servico.getProdutos());


        Arquivo.salvarTodos(); 
    }

}
