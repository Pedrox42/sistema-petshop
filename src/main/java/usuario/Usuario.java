//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package usuario;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Usuario {
    private boolean dono;
    private String nome, login, senha;
    private int id;
    private static List<Usuario> UserList = new ArrayList<>();

    public static List<Usuario> getAll() {

        if(UserList != null){
            Collections.sort(UserList, Comparator.comparing(Usuario::getId));
        }

        return UserList;
    }

    public static void listAdd(Usuario usuario) {
        UserList.add(usuario);
    }

    public static void listAddArray(List<Usuario> lista) {
        if (lista != null) {
            for (Usuario usuario : lista) {
                UserList.add(usuario);
            }
        }

    }

    public static int getNextId(){
        if(UserList.size() != 0){
            return UserList.get(UserList.size() - 1).getId() + 1;
        } else{
            return 1;
        }
    }

    public boolean isDono() {
        return dono;
    }

    public void setDono(boolean dono) {
        this.dono = dono;
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

    public String cargo()
    {
        if (this.isDono())
            return "Dono";
        else
            return "Funcionario";
    }

}
