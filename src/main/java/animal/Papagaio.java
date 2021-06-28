//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package animal;

public class Papagaio extends Animal{
    public Papagaio(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {
        super(nome, cor, raca, sexo, idade, peso, comprimento);
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
}
