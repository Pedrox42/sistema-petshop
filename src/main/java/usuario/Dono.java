//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package usuario;

import animal.Cachorro;
import animal.Gato;
import animal.Papagaio;

import java.util.Scanner;

public class Dono extends Usuario{
    public Dono(String nome) {
        this.setDono(true);
        this.setNome(nome);
        this.setId(Usuario.getNextId());
    }

    @Override
    public String toString() {
        return "Dono{" +
                "Nome:" + this.getNome() +
                ", ID:" + this.getId() +
                ", Cargo:" + this.cargo() +"}";
    }

    public Funcionario cadastrarFuncionario()
    {
        Scanner teclado = new Scanner(System.in);
        String nome = teclado.nextLine();
        int id = teclado.nextInt();
        float salario = teclado.nextFloat();
        int cargaHoraria = teclado.nextInt();
        Funcionario funcionario = new Funcionario(nome, salario, cargaHoraria);
        return funcionario;
    }

    public void cadastrarAnimal(int tipo, String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento)
    {
        if (tipo == 1)
        {
            Cachorro cachorro = new Cachorro(nome, cor, raca, sexo, idade, peso, comprimento);
            System.out.println(cachorro.toString());
            System.out.println(cachorro.saudavel());
        }
        if (tipo == 2)
        {
            Gato gato = new Gato(nome, cor, raca, sexo, idade, peso, comprimento);
            System.out.println(gato.toString());
            System.out.println(gato.saudavel());
        }
        if (tipo == 3)
        {
            Papagaio papagaio = new Papagaio(nome, cor, raca, sexo, idade, peso, comprimento);
            System.out.println(papagaio.toString());
            System.out.println(papagaio.saudavel());
        }
    }

    public static Dono cadastrar(String nome){
        Dono novo_dono = new Dono(nome);
        Usuario.listAdd(novo_dono);
        return novo_dono;
    }
}
