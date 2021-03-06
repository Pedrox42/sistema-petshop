//Anna Leticia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package animal;

import arquivo.Listagem;
import arquivo.Operacoes;
import usuario.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Gato extends Animal implements Operacoes {

    private static final List<Gato> ListaAnimais = Listagem.getGatoList();

    public Gato(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {
        super(nome, cor, raca, sexo, idade, peso, comprimento);
        this.setTipo(2);
        this.setId(Gato.getNextId());
    }

    public Gato(){};

    public static void listAdd(Gato gato) {
        ListaAnimais.add(gato);
    }

    public static void listAddArray(List<Gato> lista) {
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

    public static Gato acessarLista(int id){
        for (Gato gato : ListaAnimais) {
            if (gato.getId() == id) {
                return gato;
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
    public Gato cadastrar(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento){
        Gato novoGato = new Gato(nome, cor, raca, sexo, idade, peso, comprimento);
        Gato.listAdd(novoGato);
        return novoGato;
    }

}
