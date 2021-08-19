//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package servico;

import animal.Animal;
import arquivo.Listagem;
import arquivo.Operacoes;
import produto.Produto;
import tratamento.Tratamento;
import usuario.Funcionario;
import usuario.Usuario;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Servico implements Operacoes {

    private int funcionarioId;
    private int animalId;
    private String classeAnimal;
    private int tratamentoId;
    private List<Integer> listaProdutosId = new ArrayList<>();
    private static final List<Servico> ServicoList = Listagem.getServicoList();
    private int id;
    private String nome;


    public Servico(int funcionarioId, int animalId, String classeAnimal, int tratamentoId, List<Integer> listaProdutosId, String nome) {
        this.setFuncionarioId(funcionarioId);
        this.classeAnimal = classeAnimal;
        this.setAnimalId(animalId);
        this.setAnimalId(tratamentoId);
        this.setListaProdutosId(listaProdutosId);
        this.setId(Servico.getNextId());
        this.nome = nome;
    }

    public static void listAdd(Servico servico) {
        ServicoList.add(servico);
    }

    public static void listAddArray(List<Servico> lista) {
        if (lista != null) {
            ServicoList.addAll(lista);
        }

    }

    public static int getNextId(){
        if(ServicoList.size() != 0){
            return ServicoList.get(ServicoList.size() - 1).getId() + 1;
        } else{
            return 1;
        }
    }

    public static Servico acessarLista(int servicoId){
        for (Servico servico : ServicoList) {
            if (servico.getId() == servicoId) {
                return servico;
            }
        }
        return null;
    }

    public boolean deletar(){
        if(ServicoList.contains(this)){
            try{
                ServicoList.remove(this);
                return true;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getFuncionarioId() {
        return funcionarioId;
    }

    public void setFuncionarioId(int funcionarioId) {
        if(Funcionario.acessarLista(funcionarioId) != null){
            this.funcionarioId = funcionarioId;
        }
    }

    public int getAnimalId() {
        return animalId;
    }

    public void setAnimalId(int animalId) {
        if(this.classeAnimal != null){
            try{
                Method acessar = this.getClasse().getMethod("acessarLista", int.class);
                if(acessar.invoke(this.classeAnimal, animalId) != null){
                    this.animalId = animalId;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public int getTratamentoId() {
        return tratamentoId;
    }

    public void setTratamentoId(int tratamentoId) {
        if(Tratamento.acessarLista(tratamentoId) != null){
            this.tratamentoId = tratamentoId;
        }
    }

    public List<Integer> getListaProdutosId() {
        return listaProdutosId;
    }

    public void setListaProdutosId(List<Integer> listaProdutosId) {
        if(listaProdutosId != null && !listaProdutosId.isEmpty()){
            this.listaProdutosId = new ArrayList<>();
            for(Integer produtoId : listaProdutosId){
                this.addProduto(produtoId);
            }
        }
    }

    public String getClasseAnimal() {
        return classeAnimal;
    }

    public void setClasseAnimal(String classeAnimal) {
        this.classeAnimal = classeAnimal;
    }

    public Class<? extends Animal> getClasse(){
        try{
            return (Class<? extends Animal>) Class.forName(this.classeAnimal);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public void addProdutoObj(Produto produto){
        this.listaProdutosId.add(produto.getId());
    }

    public void addProduto(Integer produtoId){
        if(Produto.acessarLista(produtoId) != null){
            this.listaProdutosId.add(produtoId);
        }
    }

    public void removeProduto(Produto produto){
        if(this.listaProdutosId.contains(produto.getId())){
            this.listaProdutosId.remove(produto.getId());
        }
    }

    public Produto acessarListaProdutos(int produtoId){
       if(this.listaProdutosId.contains(produtoId)){
           return Produto.acessarLista(produtoId);
        }
        return null;
    }

    public Usuario getFuncionario(){
        return Usuario.acessarLista(this.funcionarioId);
    }

    public <T extends Animal> T getAnimal(){
        try{
            Method acessar = this.getClasse().getMethod("acessarLista", int.class);
            return (T) acessar.invoke(classeAnimal, this.animalId);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Tratamento getTratamento(){
        return Tratamento.acessarLista(this.tratamentoId);
    }

    public List<Produto> getProdutos(){
        List<Produto> lista = new ArrayList<>();
        for(Integer produtoId : listaProdutosId){
            Produto produto = Produto.acessarLista(produtoId);
            if(produto != null){
                lista.add(produto);
            }
        }
        return lista;
    }

}
