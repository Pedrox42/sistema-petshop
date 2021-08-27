/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import animal.*;
import produto.*;
import servico.*;
import tratamento.*;
import usuario.*;
import view.*;
import arquivo.*;
import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class DataAcessObject {

    private static Usuario usuarioLogado;

    public static Usuario getUsuarioLogado() {
        return usuarioLogado;
    }
    
    public static void setUsuarioLogado(Usuario usuarioLogado) {
        DataAcessObject.usuarioLogado = usuarioLogado;
    }
    
    public static boolean validacaoCadastroAdmin(String nome, String email, String senha) {

        try {
            Usuario admLogado = DataAcessObject.getUsuarioLogado();
            System.out.println(admLogado);
            if(admLogado.isAdmnistrador()){
                Admnistrador adm2 = (Admnistrador) admLogado;
                adm2.cadastrarAdmnistrador(nome, email, senha);
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Esse usuario nao tem permissao para realizar essa acao.");
                return false;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }
//    public static boolean editarCadastroAdmin(String nome, String login, String senha) {
//        try {
//
//            DataAcessObject.getUsuarioLogado().setNome(nome);
//            DataAcessObject.getUsuarioLogado().setLogin(login);
//            DataAcessObject.getUsuarioLogado().setSenha(senha);
//            
//            return true;
//
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, "Erro: " + ex);
//            
//            return false;
//        }
//    }
    public static boolean validacaoCadastroFuncionario(String nome, String login, String senha, float salario, int cargaHoraria) {

        try {
            Usuario funcionario = new Funcionario(nome, login, senha, salario, cargaHoraria);
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }
    
//    public static boolean editarCadastroFuncionario(String nome, String login, String senha, float salario, int cargaHoraria) {
//        try {
//
//            DataAcessObject.getUsuarioLogado().setNome(nome);
//            DataAcessObject.getUsuarioLogado().setLogin(login);
//            DataAcessObject.getUsuarioLogado().setSenha(senha);
//            //DataAcessObject.getUsuarioLogado().setSalario(salario);
//            //DataAcessObject.getUsuarioLogado().setcargaHoraria(cargaHoraria);
//            
//            return true;
//
//        } catch (Exception ex) {
//            JOptionPane.showMessageDialog(null, "Erro: " + ex);
//            
//            return false;
//        }
//    }
    
    public static boolean autenticarLogin(String login, String senha) {
        try {
            for (int i = 0; i < Listagem.getUsuarioList().size(); i++) {
                Usuario usuario = Listagem.getUsuarioList().get(i);
                if (usuario.getLogin().equals(login) && usuario.getSenha().equals(senha)) {
                    setUsuarioLogado(usuario);
                    return true;
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
        }
        return false;
    }
//fim funcoes para os usuarios
//inicio funcoes para os animais
    public static boolean validacaoCadastroCachorro(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {

        try {
            Cachorro cachorro = new Cachorro(nome, cor, raca, sexo, idade, peso, comprimento);
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }
    public static boolean validacaoCadastroGato(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {

        try {
            Gato gato = new Gato(nome, cor, raca, sexo, idade, peso, comprimento);
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }
    public static boolean validacaoCadastroPapagaio(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {

        try {
            Papagaio papagaio = new Papagaio(nome, cor, raca, sexo, idade, peso, comprimento);
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }
//fim funcoes para os animais
//inicio funcoes para os produto
    public static boolean validacaoCadastroProduto(String nome, String descricao, float preco) {

        try {
            Produto produto = new Produto(nome, descricao, preco);
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }
//fim funcoes para os produto
//inicio funcoes para os tratamento
        public static boolean validacaoCadastroTratamento(String nome, int tempo, float preco, float lucro) {

        try {
            Tratamento tratamento = new Tratamento(nome, tempo, preco, lucro);
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }
//fim funcoes para os tratamento
//inicio funcoes para os servicos
        public static boolean validacaoCadastroServico(int funcionarioId, int animalId, String classeAnimal, int tratamentoId, List<Integer> listaProdutosId, String nome) {

        try {
            Servico servico = new Servico(funcionarioId, animalId, classeAnimal, tratamentoId, listaProdutosId, nome);
            return true;

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }
}
