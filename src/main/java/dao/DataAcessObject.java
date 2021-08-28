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
            if(admLogado != null && admLogado.isAdmnistrador()){
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

    public static boolean editarCadastroAdmin(String nome, String login, String senha) {
        try {

            Usuario admLogado = usuarioLogado;
            if(admLogado != null && admLogado.isAdmnistrador()){
                Admnistrador adm2 = (Admnistrador) admLogado;
               // adm2.cadastrarAdmnistrador(nome, login, senha);
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

    public static boolean validacaoCadastroFuncionario(String nome, String login, String senha, float salario, int cargaHoraria) {

        try {
            Usuario admLogado = usuarioLogado;
            if(admLogado != null && admLogado.isAdmnistrador()){
                Admnistrador adm2 = (Admnistrador) admLogado;
                adm2.cadastrarFuncionario(nome, login, senha, salario, cargaHoraria);
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
                    if(usuario.isAdmnistrador()){
                        setUsuarioLogado(usuario);
                        TelaPrincipal tela = new TelaPrincipal();
                        tela.setVisible(true);
                        return true;
                    }
                    else{
                        setUsuarioLogado(usuario);
                        TelaPrincipalF tela = new TelaPrincipalF();
                        tela.setVisible(true);
                        return true;
                    }
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
            if(usuarioLogado != null){
                usuarioLogado.cadastrarAnimal(Cachorro.class, nome, cor, raca, sexo, idade, peso, comprimento);
                return true;
            } else{
                JOptionPane.showMessageDialog(null, "Voce precisa estar logado para realizar essa acao.");
                return false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }
    public static boolean validacaoCadastroGato(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {

        try {
            if(usuarioLogado != null){
                usuarioLogado.cadastrarAnimal(Gato.class, nome, cor, raca, sexo, idade, peso, comprimento);
                return true;
            } else{
                JOptionPane.showMessageDialog(null, "Voce precisa estar logado para realizar essa acao.");
                return false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }
    public static boolean validacaoCadastroPapagaio(String nome, String cor, String raca, char sexo, int idade, float peso, float comprimento) {

        try {
            if(usuarioLogado != null){
                usuarioLogado.cadastrarAnimal(Papagaio.class, nome, cor, raca, sexo, idade, peso, comprimento);
                return true;
            } else{
                JOptionPane.showMessageDialog(null, "Voce precisa estar logado para realizar essa acao.");
                return false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }
//fim funcoes para os animais
//inicio funcoes para os produto
    public static boolean validacaoCadastroProduto(String nome, String descricao, float preco) {

        try {
            if(usuarioLogado != null){
                usuarioLogado.cadastrarProduto(nome, descricao, preco);
                return true;
            } else{
                JOptionPane.showMessageDialog(null, "Voce precisa estar logado para realizar essa acao.");
                return false;
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }
//fim funcoes para os produto
//inicio funcoes para os tratamento
        public static boolean validacaoCadastroTratamento(String nome, int tempo, float preco, float lucro) {

        try {
            if(usuarioLogado != null){
                usuarioLogado.cadastrarTratamento(nome, tempo, preco, lucro);
                return true;
            } else{
                JOptionPane.showMessageDialog(null, "Voce precisa estar logado para realizar essa acao.");
                return false;
            }

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro: " + ex);
            return false;
        }
    }
//fim funcoes para os tratamento
//inicio funcoes para os servicos
        public static boolean validacaoCadastroServico(int funcionarioId, int animalId, String classeAnimal, int tratamentoId, List<Integer> listaProdutosId, String nome) {

        try {
            Usuario admLogado = usuarioLogado;
            System.out.println(admLogado);
            if(admLogado != null && admLogado.isAdmnistrador()){
                Admnistrador adm2 = (Admnistrador) admLogado;
                adm2.cadastrarServico(funcionarioId, animalId, classeAnimal, tratamentoId, listaProdutosId, nome);
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
}
