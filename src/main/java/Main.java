//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

import arquivo.Arquivo;


public class Main {
    public static void main(String[] args) {
        Arquivo.preencherTodos();

        //Dono dono = Dono.cadastrar("Pedro2");
        //Funcionario funcionario = Funcionario.cadastrar("teste", 200, 8);
        //Dono.cadastrar("Davi");
        //Cachorro.cadastrar("Toto", "Branco", "Vira-lata", 'm', 5, 25, 55);
        //Gato.cadastrar("Picles", "Preto e Branco", "Gato", 'm', 5, 3.2f, 33);
        //Papagaio.cadastrar("Leco", "Verde", "Papagaio", 'm', 5, 0.3f, 15);

        Arquivo.salvarTodos();
    }
}
