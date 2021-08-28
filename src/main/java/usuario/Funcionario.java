//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package usuario;

public class Funcionario extends Usuario {

    public Funcionario(String nome, String login, String senha, float salario, int cargaHoraria) {
        this.setAdmnistrador(false);
        this.setNome(nome);
        this.setLogin(login);
        this.setSenha(senha);
        this.setId(Usuario.getNextId());
        this.setSalario(salario);
        this.setCargaHoraria(cargaHoraria);
    }

    public boolean editarFuncionario(String varNome, String varLogin, String varSenha, float varSalario, int varCargaHoraria){
        if(Usuario.getUsuarioList().contains(this)){
            try{

                this.setNome(varNome);
                this.setLogin(varLogin);
                this.setSenha(varSenha);
                this.setSalario(varSalario);
                this.setCargaHoraria(varCargaHoraria);

                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

}
