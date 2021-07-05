//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package usuario;

import java.util.Scanner;

public class Dono extends Usuario{
    public Dono(String nome, int id, String login, String senha) {
        this.setDono(true);
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
        this.setId(id);
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
        String login = "Login";
        String senha = "Senha";
        Funcionario funcionario = new Funcionario(nome, login, senha, id, salario, cargaHoraria);
        return funcionario;
    }
}
