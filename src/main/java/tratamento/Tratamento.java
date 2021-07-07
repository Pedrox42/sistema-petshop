//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package tratamento;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Tratamento {
    private String nome;
    private int id, tempo;
    private float preco, lucro;
    private static List<Tratamento> TreatmentList = new ArrayList<>();

    public Tratamento(String nome, int tempo, float preco, float lucro) {
        this.nome = nome;
        this.tempo = tempo;
        this.preco = preco;
        this.lucro = lucro;
        this.setId(Tratamento.getNextId());
    }

    public static void listAdd(Tratamento tratamento) {
        TreatmentList.add(tratamento);
    }

    public static void listAddArray(List<Tratamento> lista) {
        if (lista != null) {
            for (Tratamento tratamento : lista) {
                TreatmentList.add(tratamento);
            }
        }

    }

    public static int getNextId(){
        if(TreatmentList.size() != 0){
            return TreatmentList.get(TreatmentList.size() - 1).getId() + 1;
        } else{
            return 1;
        }
    }

    public static List<Tratamento> getAll() {

        if(TreatmentList != null){
            Collections.sort(TreatmentList, Comparator.comparing(Tratamento::getId));
        }

        return TreatmentList;
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



