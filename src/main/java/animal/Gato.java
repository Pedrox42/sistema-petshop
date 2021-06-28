//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package animal;

public class Gato extends Animal{
    public Gato(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {
        super(nome, cor, raca, sexo, idade, peso, comprimento);
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
}
