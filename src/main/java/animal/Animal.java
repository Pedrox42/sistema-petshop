//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package animal;

import usuario.Dono;
import usuario.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Animal {
    private String nome, cor, raca;
    private char sexo;
    private int idade;
    private float peso, comprimento; //peso em kg, comprimento em cm
    private int tipo;
    private int id;

    public Animal(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {
        this.nome = nome;
        this.cor = cor;
        this.raca = raca;
        this.sexo = sexo;
        this.idade = idade;
        this.peso = peso;
        this.comprimento = comprimento;
    }

    public Animal(){}

    public int getId() { return id; }

    public void setId(int id) { this.id = id; }

    public int getTipo() { return tipo; }

    public void setTipo(int tipo) { this.tipo = tipo; }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", raca='" + raca + '\'' +
                ", sexo=" + sexo +
                ", idade=" + idade +
                ", peso=" + peso +
                ", comprimento=" + comprimento +
                '}';
    }

    public abstract String saudavel();

    public abstract <T extends Animal> T cadastrar(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento);
}
