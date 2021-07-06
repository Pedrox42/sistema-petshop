//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gato extends Animal{

    private static List<Gato> ListaAnimais = new ArrayList<>();

    public Gato(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {
        super(nome, cor, raca, sexo, idade, peso, comprimento);
        this.setTipo(2);
        this.setId(Gato.getNextId());
    }

    public Gato(){}

    public static List<Gato> getAll() {

        if(ListaAnimais != null){
            Collections.sort(ListaAnimais, Comparator.comparing(Gato::getId));
        }

        return ListaAnimais;
    }

    public static void listAdd(Gato gato) {
        ListaAnimais.add(gato);
    }

    public static void listAddArray(List<Gato> lista) {
        if (lista != null) {
            for (Gato gato : lista) {
                ListaAnimais.add(gato);
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
        if (this.getSexo() == 'm')
        {
            if(this.getPeso() >= 3.2 && this.getPeso() <= 6)
                return "Peso ideal";
            else if(this.getPeso() < 3.2)
                return "Abaixo do peso ideal";
            else
                return "Acima do peso ideal";
        }
        else
        {
            if (this.getPeso() >= 2.4 && this.getPeso() <= 4.8)
                return "Peso ideal";
            else if(this.getPeso() < 2.4)
                return "Abaixo do peso ideal";
            else
                return "Acima do peso ideal";
        }
    }

    @Override
    public void cadastrar(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento){
        Gato novoGato = new Gato(nome, cor, raca, sexo, idade, peso, comprimento);
        Gato.listAdd(novoGato);
    }
}
