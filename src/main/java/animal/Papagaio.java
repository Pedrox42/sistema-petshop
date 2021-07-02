//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Papagaio extends Animal{

    private static List<Papagaio> ListaAnimais = new ArrayList<>();

    public Papagaio(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {
        super(nome, cor, raca, sexo, idade, peso, comprimento);
        this.setTipo(3);
        this.setId(Papagaio.getNextId());
    }

    public static List<Papagaio> getAll() {

        if(ListaAnimais != null){
            Collections.sort(ListaAnimais, Comparator.comparing(Papagaio::getId));
        }

        return ListaAnimais;
    }

    public static void listAdd(Papagaio papagaio) {
        ListaAnimais.add(papagaio);
    }

    public static void listAddArray(List<Papagaio> lista) {
        if (lista != null) {
            for (Papagaio papagaio : lista) {
                ListaAnimais.add(papagaio);
            }
        }

    }

    public static int getNextId(){
        if(ListaAnimais.size() != 0){
            return ListaAnimais.get(ListaAnimais.size() - 1).getId() + 1;
        } else{
            return 1;
        }
    }

    @Override
    public String saudavel() {
        if(this.getPeso() >= 0.3 && this.getPeso() <= 0.5)
            return "Peso ideal";
        else if(this.getPeso() < 0.3)
            return "Abaixo do peso ideal";
        else
            return "Acima do peso ideal";
    }

    public static Papagaio cadastrar(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento){
        Papagaio novo_papagaio = new Papagaio(nome, cor, raca, sexo, idade, peso, comprimento);
        Papagaio.listAdd(novo_papagaio);
        return novo_papagaio;
    }
    
}
