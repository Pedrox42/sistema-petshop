//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package usuario;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Scanner;

public class Dono extends Usuario{
    public Dono(String nome, String login, String senha) {
        this.setDono(true);
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
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
        String login = "Login";
        String senha = "Senha";
        Funcionario funcionario = new Funcionario(nome, login, senha, salario, cargaHoraria);
        return funcionario;
    }

    public void cadastrarAnimal(String animal, String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento)
    {
        try {
            Class<?> tipoDoAnimal = Class.forName("animal." + animal);
            Class[] args = {String.class, String.class, String.class, char.class, int.class, float.class, float.class};
            Method cadastrar = tipoDoAnimal.getMethod("cadastrar", args);;
            Object novoAnimal = tipoDoAnimal.newInstance();
            cadastrar.invoke(novoAnimal, new Object[] {nome, cor, raca, sexo, idade, peso, comprimento});
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cadastrarDono(String nome, String login, String senha){
        Dono novoDono = new Dono(nome, login, senha);
        Usuario.listAdd(novoDono);
    }

    public void cadastrarFuncionario(String nome, String login, String senha, float salario, int cargaHoraria){
        Funcionario novoFuncionario = new Funcionario(nome, login, senha, salario, cargaHoraria);
        Usuario.listAdd(novoFuncionario);
    }

    public boolean deletarUsuario(int id){
        if(id != this.getId()){
            try{
                Usuario.getAll().remove(Usuario.acessarLista(id));
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }
}
