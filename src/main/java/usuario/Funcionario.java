//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package usuario;

public class Funcionario extends Usuario {

    private int cargaHoraria;
    private float salario;

    public Funcionario(String nome, int id, float salario, int cargaHoraria) {
        this.setDono(false);
        this.setNome(nome);
        this.setId(id);
        this.salario = salario;
        this.cargaHoraria = cargaHoraria;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Funcionario{" + "Id:" + this.getId() +
                ", Nome:" + this.getNome() +
                ", Cargo:" + this.cargo() +
                ", cargaHoraria=" + cargaHoraria +
                ", salario=" + salario +
                '}';
    }
}