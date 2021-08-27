//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package animal;

import arquivo.Listagem;
import arquivo.Operacoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Cachorro extends Animal implements Operacoes {

    private static final List<Cachorro> ListaAnimais = Listagem.getCachorroList();

    public Cachorro(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {
        super(nome, cor, raca, sexo, idade, peso, comprimento);
        this.setTipo(1);
        this.setId(Cachorro.getNextId());
    }

    public Cachorro(){}

    public static void listAdd(Cachorro cachorro) {
        ListaAnimais.add(cachorro);
    }

    public static void listAddArray(List<Cachorro> lista) {
        if (lista != null) {
            ListaAnimais.addAll(lista);
        }

    }

    public static int getNextId(){
        if(ListaAnimais.size() != 0){
            return ListaAnimais.get(ListaAnimais.size() - 1).getId() + 1;
        } else{
            return 1;
        }
    }

    public static Cachorro acessarLista(int id){
        for (Cachorro cachorro : ListaAnimais) {
            if (cachorro.getId() == id) {
                return cachorro;
            }
        }
        return null;
    }

    public boolean deletar(){
        if(ListaAnimais.contains(this)){
            try{
                ListaAnimais.remove(this);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public boolean editar(String varNome, String varCor, String varRaca, char varSexo, int varIdade, float varPeso, float varComprimento){
        if(ListaAnimais.contains(this)){
            try{
                this.setNome(varNome);
                this.setCor(varCor);
                this.setRaca(varRaca);
                this.setSexo(varSexo);
                this.setIdade(varIdade);
                this.setPeso(varPeso);
                this.setComprimento(varComprimento);

                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
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

    @Override
    public Cachorro cadastrar(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento){
        Cachorro novoCachorro = new Cachorro(nome, cor, raca, sexo, idade, peso, comprimento);
        Cachorro.listAdd(novoCachorro);
        return novoCachorro;
    }
}
