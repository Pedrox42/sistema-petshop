//Anna Leticia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package tratamento;

import arquivo.Listagem;
import arquivo.Operacoes;
import produto.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tratamento implements Operacoes  {
    private String nome;
    private int id, tempo;
    private float preco, lucro;
    private static final List<Tratamento> TratamentoList = Listagem.getTratamentoList();

    public Tratamento(String nome, int tempo, float preco, float lucro) {
        this.nome = nome;
        this.tempo = tempo;
        this.preco = preco;
        this.lucro = lucro;
        this.setId(Tratamento.getNextId());
    }
    
    @Override
    public String toString() {
        return this.getNome();
    }
    
    public static void listAdd(Tratamento tratamento) {
        TratamentoList.add(tratamento);
    }

    public static void listAddArray(List<Tratamento> lista) {
        if (lista != null) {
            TratamentoList.addAll(lista);
        }

    }

    public static int getNextId(){
        if(TratamentoList.size() != 0){
            return TratamentoList.get(TratamentoList.size() - 1).getId() + 1;
        } else{
            return 1;
        }
    }

    public static Tratamento acessarLista(int id){
        for (Tratamento tratamento : TratamentoList) {
            if (tratamento.getId() == id) {
                return tratamento;
            }
        }
        return null;
    }

    public boolean deletar(){
        if(TratamentoList.contains(this)){
            try{
                TratamentoList.remove(this);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean editar(String varNome, int varTempo, float varPreco, float varLucro){
        if(TratamentoList.contains(this)){
            try{

                this.setNome(varNome);
                this.setTempo(varTempo);
                this.setPreco(varPreco);
                this.setLucro(varLucro);

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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTempo() {
        return tempo;
    }

    public void setTempo(int tempo) {
        this.tempo = tempo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public float getLucro() {
        return lucro;
    }

    public void setLucro(float lucro) {
        this.lucro = lucro;
    }

}



