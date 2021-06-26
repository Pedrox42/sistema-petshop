package animal;

public class Cachorro extends Animal {

    public Cachorro(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {
        super(nome, cor, raca, sexo, idade, peso, comprimento);
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
}
