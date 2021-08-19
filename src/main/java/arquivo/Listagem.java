package arquivo;

import animal.Cachorro;
import animal.Gato;
import animal.Papagaio;
import produto.Produto;
import servico.Servico;
import tratamento.Tratamento;
import usuario.Usuario;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
}
