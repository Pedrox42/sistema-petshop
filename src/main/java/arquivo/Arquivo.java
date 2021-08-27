//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package arquivo;

import Vendors.RuntimeTypeAdapterFactory;
import com.google.gson.GsonBuilder;
import servico.Servico;
import animal.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import produto.Produto;
import tratamento.Tratamento;
import usuario.Admnistrador;
import usuario.Funcionario;
import usuario.Usuario;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Type;


public class Arquivo {

    private static Gson SERIALIZADOR;

    public static void preencherTodos(){
        Usuario.listAddArray(Arquivo.acessar(Usuario.class, "usuarios"));
        Cachorro.listAddArray(Arquivo.acessar(Cachorro.class, "cachorros"));
        Gato.listAddArray(Arquivo.acessar(Gato.class, "gatos"));
        Papagaio.listAddArray(Arquivo.acessar(Papagaio.class, "papagaios"));
        Produto.listAddArray(Arquivo.acessar(Produto.class, "produtos"));
        Tratamento.listAddArray(Arquivo.acessar(Tratamento.class, "tratamentos"));
        Servico.listAddArray(Arquivo.acessar(Servico.class, "servicos"));
    }

    public static void salvarTodos(){
        Arquivo.salvar(Listagem.getUsuarioList(), "usuarios");
        Arquivo.salvar(Listagem.getCachorroList(), "cachorros");
        Arquivo.salvar(Listagem.getGatoList(), "gatos");
        Arquivo.salvar(Listagem.getPapagaioList(), "papagaios");
        Arquivo.salvar(Listagem.getProdutoList(), "produtos");
        Arquivo.salvar(Listagem.getTratamentoList(), "tratamentos");
        Arquivo.salvar(Listagem.getServicoList(), "servicos");
    }

    public static void salvar(List<?> lista, String nomeArquivo){
        SERIALIZADOR = new Gson();

        String filePath = new File("src/main/Jsons/").getAbsolutePath();
        try ( FileWriter writer = new FileWriter(filePath + "/" + nomeArquivo + ".json")) {
            SERIALIZADOR.toJson(lista, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static <T> List<T> acessar(Class<T> classe, String nomeArquivo) {
        List<T> classeLista = new ArrayList<>();
        String filePath = new File("src/main/Jsons/").getAbsolutePath();

        try {
            Gson gson = new Gson();

            //para transformar para as devidas classses de usuário
            RuntimeTypeAdapterFactory<Usuario> runtimeTypeAdapterFactory = RuntimeTypeAdapterFactory
                    .of(Usuario.class, "admnistrador")
                    .registerSubtype(Funcionario.class, "false")
                    .registerSubtype(Admnistrador.class, "true");

            gson = new GsonBuilder().registerTypeAdapterFactory(runtimeTypeAdapterFactory).create();

            FileReader arq = new FileReader(filePath + "/" + nomeArquivo + ".json"); //classe para leitura
            BufferedReader lerArq = new BufferedReader(arq);
            Type typeOfT = TypeToken.getParameterized(List.class, classe).getType();

            classeLista = gson.fromJson(lerArq, typeOfT);
            lerArq.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return classeLista;
    }

}
