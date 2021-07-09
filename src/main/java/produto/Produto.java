//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package produto;

import animal.Papagaio;
import usuario.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Produto {
    String nome, descricao;
    float preco;
    int id;
    private static List<Produto> ProductList = new ArrayList<>();

    public Produto(String nome, String descricao, float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.setId(Produto.getNextId());
    }

    public static List<Produto> getAll() {

        if(ProductList != null){
            Collections.sort(ProductList, Comparator.comparing(Produto::getId));
        }

        return ProductList;
    }

    public static void listAdd(Produto produto) {
        ProductList.add(produto);
    }

    public static void listAddArray(List<Produto> lista) {
        if (lista != null) {
            for (Produto produto : lista) {
                ProductList.add(produto);
            }
        }

    }

    public static int getNextId(){
        if(ProductList.size() != 0){
            return ProductList.get(ProductList.size() - 1).getId() + 1;
        } else{
            return 1;
        }
    }

    public static Produto acessarLista(int id){
        for (Produto produto : Produto.getAll()) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public boolean deletar(){
        if(ProductList.contains(this)){
            try{
                ProductList.remove(this);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
