package produto;

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
