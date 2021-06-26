//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

import usuario.Funcionario;
import usuario.Dono;

public class Main {
    public static void main(String[] args) {
        Dono gerente = new Dono("Pedro", 1);
        System.out.println(gerente);
        Funcionario funcionario = gerente.cadastrarFuncionario();
        System.out.println(funcionario);
    }
}
