package arquivo;

import animal.Animal;
import animal.Cachorro;
import animal.Gato;
import animal.Papagaio;
import java.lang.reflect.Method;
import produto.Produto;
import servico.Servico;
import tratamento.Tratamento;
import usuario.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import usuario.Admnistrador;
import usuario.Funcionario;

public class Listagem {

    private static List<Produto> ProdutoList = new ArrayList<>();
    private static List<Servico> ServicoList = new ArrayList<>();
    private static List<Tratamento> TratamentoList = new ArrayList<>();
    private static List<Cachorro> CachorroList = new ArrayList<>();
    private static List<Gato> GatoList = new ArrayList<>();
    private static List<Papagaio> PapagaioList = new ArrayList<>();
    private static List<Usuario> UsuarioList = new ArrayList<>();


    public static List<Produto> getProdutoList() {
        if(ProdutoList != null){
            ProdutoList.sort(Comparator.comparing(Produto::getId));
        }

        return ProdutoList;
    }

    public static void setProdutoList(List<Produto> productList) {
        ProdutoList = productList;
    }

    public static List<Servico> getServicoList() {
        if(ServicoList != null){
            ServicoList.sort(Comparator.comparing(Servico::getId));
        }

        return ServicoList;
    }

    public static void setServicoList(List<Servico> servicoList) {
        ServicoList = servicoList;
    }

    public static List<Tratamento> getTratamentoList() {
        if(TratamentoList != null){
            TratamentoList.sort(Comparator.comparing(Tratamento::getId));
        }

        return TratamentoList;
    }

    public static void setTratamentoList(List<Tratamento> tratamentoList) {
        TratamentoList = tratamentoList;
    }

    public static List<Cachorro> getCachorroList() {
        if(CachorroList != null){
            CachorroList.sort(Comparator.comparing(Cachorro::getId));
        }

        return CachorroList;
    }

    public static void setCachorroList(List<Cachorro> cachorroList) {
        CachorroList = cachorroList;
    }

    public static List<Gato> getGatoList() {
        if(GatoList != null){
            GatoList.sort(Comparator.comparing(Gato::getId));
        }

        return GatoList;
    }

    public static void setGatoList(List<Gato> gatoList) {
        GatoList = gatoList;
    }

    public static List<Papagaio> getPapagaioList() {
        if(PapagaioList != null){
            PapagaioList.sort(Comparator.comparing(Papagaio::getId));
        }

        return PapagaioList;
    }

    public static void setPapagaioList(List<Papagaio> papagaioList) {
        PapagaioList = papagaioList;
    }

    public static List<Usuario> getUsuarioList() {
        if(UsuarioList != null){
            UsuarioList.sort(Comparator.comparing(Usuario::getId));
        }

        return UsuarioList;
    }

    public static void setUsuarioList(List<Usuario> usuarioList) {
        UsuarioList = usuarioList;
    }
    
    public static  <T> DefaultListModel<T> getModelList(List<T> listagem){
        DefaultListModel<T> modelList = new DefaultListModel<T>();
        try{
            for(T instance : listagem){
            modelList.addElement(instance);
        }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return modelList;
    }
    
    protected static <T> void addTo(DefaultListModel<T> from, DefaultListModel<T> to) {
        for (int index = 0; index < from.getSize(); index++) {
            to.addElement(from.getElementAt(index));
        }
    }
    
    protected static <T> void addToCombo(DefaultComboBoxModel<T> from, DefaultComboBoxModel<T> to) {
        for (int index = 0; index < from.getSize(); index++) {
            to.addElement(from.getElementAt(index));
        }
    }
    
    public static DefaultListModel<Tratamento> getTratamentoModel(){
        return Listagem.getModelList(TratamentoList);
    }
    
    public static DefaultListModel<Produto> getProdutoModel(){
        return Listagem.getModelList(ProdutoList);
    }
        
     public static DefaultListModel<Servico> getServicoModel(){
        return Listagem.getModelList(ServicoList);
    }   
     
    public static DefaultListModel<Cachorro> getCachorroModel(){
        return Listagem.getModelList(CachorroList);
    }
    
    public static DefaultListModel<Gato> getGatoModel(){
        return Listagem.getModelList(GatoList);
    }
    
    public static DefaultListModel<Papagaio> getPapagaioModel(){
        return Listagem.getModelList(PapagaioList);
    }
    
    public static <T extends Animal> DefaultListModel<T> getAnimalModel(){
        DefaultListModel<T> newList = new DefaultListModel<T>();
        try{
                Listagem.addTo((DefaultListModel<T>) Listagem.getCachorroModel(), newList);
                Listagem.addTo((DefaultListModel<T>) Listagem.getGatoModel(), newList);
                Listagem.addTo((DefaultListModel<T>) Listagem.getPapagaioModel(), newList);

        } catch(Exception ex){
            ex.printStackTrace();
        }
        return newList;
    }
    
          
    public static DefaultListModel<Usuario> getUsuarioModel(){
        return Listagem.getModelList(UsuarioList);
    }
    
    public static DefaultListModel<Funcionario> getFuncionarioModel(){
        DefaultListModel<Funcionario> newList = new DefaultListModel<>();
        for(Usuario usuario : Listagem.getUsuarioList()){
            if(!usuario.isAdmnistrador()){
                newList.addElement((Funcionario) usuario);
            }
        }
        return newList;
    }
    
    public static DefaultListModel<Admnistrador> getAdmnistradorModel(){
        DefaultListModel<Admnistrador> newList = new DefaultListModel<>();
        for(Usuario usuario : Listagem.getUsuarioList()){
            if(usuario.isAdmnistrador()){
                newList.addElement((Admnistrador) usuario);
            }
        }
        return newList;
    }
    
    public static  <T> DefaultComboBoxModel<T> getComboList(List<T> listagem){
        DefaultComboBoxModel<T> modelList = new DefaultComboBoxModel<T>();
        try{
            for(T instance : listagem){
            modelList.addElement(instance);
        }
        } catch(Exception ex){
            ex.printStackTrace();
        }
        return modelList;
    }
    
    public static DefaultComboBoxModel<Tratamento> getTratamentoCombo(){
        return Listagem.getComboList(TratamentoList);
    }
    
    public static DefaultComboBoxModel<Funcionario> getFuncionarioCombo(){
        DefaultComboBoxModel<Funcionario> newList = new DefaultComboBoxModel<>();
        for(Usuario usuario : Listagem.getUsuarioList()){
            if(!usuario.isAdmnistrador()){
                newList.addElement((Funcionario) usuario);
            }
        }
        return newList;
    }
    
    public static <T extends Animal> DefaultComboBoxModel<T> getAnimalCombo(){
        DefaultComboBoxModel<T> newList = new DefaultComboBoxModel<T>();
        try{
            Listagem.addToCombo((DefaultComboBoxModel<T>) Listagem.getComboList(CachorroList), newList);
            Listagem.addToCombo((DefaultComboBoxModel<T>) Listagem.getComboList(GatoList), newList);
            Listagem.addToCombo((DefaultComboBoxModel<T>) Listagem.getComboList(PapagaioList), newList);

        } catch(Exception ex){
            ex.printStackTrace();
        }
        return newList;
    }
    
}
