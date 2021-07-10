//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package usuario;

import servico.Servico;
import animal.Animal;

import java.lang.reflect.Method;
import java.util.List;
import java.util.Scanner;

public class Admnistrador extends Usuario{
    public Admnistrador(String nome, String login, String senha) {
        this.setAdmnistrador(true);
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

    public <T extends Animal> T cadastrarAnimal(Class<T> tipoDoAnimal, String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento)
    {
        try {
            Class[] args = {String.class, String.class, String.class, char.class, int.class, float.class, float.class};
            Method cadastrar = tipoDoAnimal.getMethod("cadastrar", args);
            T novoAnimal = tipoDoAnimal.newInstance();
            return (T) cadastrar.invoke(novoAnimal, new Object[] {nome, cor, raca, sexo, idade, peso, comprimento});
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public Admnistrador cadastrarDono(String nome, String login, String senha){
        Admnistrador novoAdmnistrador = new Admnistrador(nome, login, senha);
        Usuario.listAdd(novoAdmnistrador);
        return novoAdmnistrador;
    }

    public Funcionario cadastrarFuncionario(String nome, String login, String senha, float salario, int cargaHoraria){
        Funcionario novoFuncionario = new Funcionario(nome, login, senha, salario, cargaHoraria);
        Usuario.listAdd(novoFuncionario);
        return novoFuncionario;
    }

    public Servico cadastrarServico(int funcionarioId, int animalId, String classeAnimal, int tratamentoId, List<Integer> listaProdutosId, String nome){
        Servico novoServico = new Servico(funcionarioId, animalId, classeAnimal, tratamentoId, listaProdutosId, nome);
        Servico.listAdd(novoServico);
        return novoServico;
    }

    public boolean deletarInstancia(Class<?> classe, int id){

        if(id != this.getId()){
            try {
                Method acessar = classe.getMethod("acessarLista", int.class);
                Method deletar = classe.getMethod("deletar", new Class<?>[0]);
                Object obj = acessar.invoke(classe, id);
                if (obj != null){
                    try {
                        deletar.invoke(obj, new Class<?>[0]);
                        return true;
                    } catch (Exception e) {
                        e.printStackTrace();
                        return false;
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }

        }
        return false;
    }
}
