//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package usuario;


import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import animal.Animal;
import arquivo.Listagem;
import arquivo.Operacoes;
import produto.Produto;
import tratamento.Tratamento;

public class Usuario implements Operacoes {
    private boolean admnistrador;
    private String nome, login, senha;
    private int id;
    private static final List<Usuario> UsuarioList = Listagem.getUsuarioList();
    private int cargaHoraria;
    private float salario;

    public static void listAdd(Usuario usuario) {
        UsuarioList.add(usuario);
    }

    public static void listAddArray(List<Usuario> lista) {
        if (lista != null) {
            UsuarioList.addAll(lista);
        }

    }
    
    @Override
    public String toString() {
        return this.getNome();
    }

    public static List<Usuario> getUsuarioList() {
        return UsuarioList;
    }

    public static int getNextId(){
        if(UsuarioList.size() != 0){
            return UsuarioList.get(UsuarioList.size() - 1).getId() + 1;
        } else{
            return 1;
        }
    }

    public static Usuario acessarLista(int id){
        for (Usuario usuario : UsuarioList) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public boolean deletar(){
        if(UsuarioList.contains(this)){
            try{
                UsuarioList.remove(this);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean isAdmnistrador() {
        return admnistrador;
    }

    public void setAdmnistrador(boolean admnistrador) {
        this.admnistrador = admnistrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public int getCargaHoraria() { return cargaHoraria; }

    public void setCargaHoraria(int cargaHoraria) { this.cargaHoraria = cargaHoraria; }

    public float getSalario() { return salario; }

    public void setSalario(float salario) { this.salario = salario; }

    public String cargo()
    {
        if (this.isAdmnistrador())
            return "Administrador";
        else
            return "Funcionario";
    }

    public Produto cadastrarProduto(String nome, String descricao, float preco){
        Produto novoProduto = new Produto(nome, descricao, preco);
        Produto.listAdd(novoProduto);
        return novoProduto;
    }

    public Tratamento cadastrarTratamento(String nome, int tempo, float preco, float lucro){
        Tratamento novoTratamento = new Tratamento(nome, tempo, preco, lucro);
        Tratamento.listAdd(novoTratamento);
        return novoTratamento;
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

}
