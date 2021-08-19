//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package produto;

import animal.Papagaio;
import arquivo.Listagem;
import arquivo.Operacoes;
import usuario.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Produto implements Operacoes  {
    String nome, descricao;
    float preco;
    int id;
    private static final List<Produto> ProdutoList = Listagem.getProdutoList();

    public Produto(String nome, String descricao, float preco) {
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.setId(Produto.getNextId());
    }

    public static void listAdd(Produto produto) {
        ProdutoList.add(produto);
    }

    public static void listAddArray(List<Produto> lista) {
        if (lista != null) {
            ProdutoList.addAll(lista);
        }

    }

    public static int getNextId(){
        if(ProdutoList.size() != 0){
            return ProdutoList.get(ProdutoList.size() - 1).getId() + 1;
        } else{
            return 1;
        }
    }

    public static Produto acessarLista(int id){
        for (Produto produto : ProdutoList) {
            if (produto.getId() == id) {
                return produto;
            }
        }
        return null;
    }

    public boolean deletar(){
        if(ProdutoList.contains(this)){
            try{
                ProdutoList.remove(this);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean editar(String varNome, String varDescricao, float varPreco){
        if(ProdutoList.contains(this)){
            try{
                this.setNome(varNome);
                this.setDescricao(varDescricao);
                this.setPreco(varPreco);
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
