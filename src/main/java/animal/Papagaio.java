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

public class Papagaio extends Animal implements Operacoes {

    private static final List<Papagaio> ListaAnimais = Listagem.getPapagaioList();

    public Papagaio(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {
        super(nome, cor, raca, sexo, idade, peso, comprimento);
        this.setTipo(3);
        this.setId(Papagaio.getNextId());
    }

    public Papagaio(){}

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

    public static Papagaio acessarLista(int id){
        for (Papagaio papagaio : Papagaio.getAll()) {
            if (papagaio.getId() == id) {
                return papagaio;
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
        if(this.getPeso() >= 0.3 && this.getPeso() <= 0.5)
            return "Peso ideal";
        else if(this.getPeso() < 0.3)
            return "Abaixo do peso ideal";
        else
            return "Acima do peso ideal";
    }

    @Override
    public Papagaio cadastrar(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento){
        Papagaio novoPapagaio = new Papagaio(nome, cor, raca, sexo, idade, peso, comprimento);
        Papagaio.listAdd(novoPapagaio);
        return novoPapagaio;
    }
    
}
