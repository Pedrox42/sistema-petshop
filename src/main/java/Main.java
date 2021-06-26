//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

import usuario.Funcionario;
import usuario.Dono;

public class Main {
    public static void main(String[] args) {
        Dono dono = new Dono("Pedro", 1);
        System.out.println(dono);
        Funcionario funcionario = dono.cadastrarFuncionario();
        System.out.println(funcionario);
        dono.cadastrarAnimal(1, "Toto", "Branco", "Vira-lata", 'm', 5, 25, 55);
        dono.cadastrarAnimal(2, "Picles", "Preto e Branco", "Vira-lata", 'm', 5, 3.2f, 33);
        dono.cadastrarAnimal(3, "Leco", "Verde", "Papagaio", 'm', 5, 0.3f, 15);
    }
}
