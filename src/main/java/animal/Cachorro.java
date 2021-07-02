//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package animal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cachorro extends Animal {

    private static List<Cachorro> ListaAnimais = new ArrayList<>();

    public Cachorro(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {
        super(nome, cor, raca, sexo, idade, peso, comprimento);
        this.setTipo(1);
        this.setId(Cachorro.getNextId());
    }

    public static List<Cachorro> getAll() {

        if(ListaAnimais != null){
            Collections.sort(ListaAnimais, Comparator.comparing(Cachorro::getId));
        }

        return ListaAnimais;
    }

    public static void listAdd(Cachorro cachorro) {
        ListaAnimais.add(cachorro);
    }

    public static void listAddArray(List<Cachorro> lista) {
        if (lista != null) {
            for (Cachorro cachorro : lista) {
                ListaAnimais.add(cachorro);
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
        float peso = this.getPeso();
        float comprimento = this.getComprimento();
        if(comprimento <= 33)
        {
            if (peso >= 0.5 && peso <= 6)
                return "Peso ideal";
            else if (peso < 0.5)
                return "Abaixo do peso ideal";
            else
                return "Acima do peso ideal";
        }
        else if (comprimento > 33 && comprimento <= 43)
        {
            if (peso >= 6 && peso <= 15)
                return "Peso ideal";
            else if (peso < 6)
                return "Abaixo do peso ideal";
            else
                return "Acima do peso ideal";
        }
        else if (comprimento > 43 && comprimento <= 60)
        {
            if (peso >= 15 && peso <= 25)
                return "Peso ideal";
            else if (peso < 15)
                return "Abaixo do peso ideal";
            else
                return "Acima do peso ideal";
        }
        else if(comprimento > 60 && comprimento <= 70)
        {
            if (peso >= 25 && peso <= 45)
                return "Peso ideal";
            else if (peso < 25)
                return "Abaixo do peso ideal";
            else
                return "Acima do peso ideal";
        }
        else
        {
            if (peso >= 45 && peso <= 90)
                return "Peso ideal";
            else if (peso < 25)
                return "Abaixo do peso ideal";
            else
                return "Acima do peso ideal";
        }
    }

    public static Cachorro cadastrar(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento){
        Cachorro novo_cachorro = new Cachorro(nome, cor, raca, sexo, idade, peso, comprimento);
        Cachorro.listAdd(novo_cachorro);
        return novo_cachorro;
    }

}
