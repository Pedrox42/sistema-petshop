//Anna Letícia Franco Monteiro - 202065106A
//Davi Esteves dos Santos - 202065504B
//Pedro Campos Lima - 202065521B

package arquivo;

import animal.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import produto.Produto;
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
        Usuario.listAddArray(Arquivo.Acessar(Usuario.class, "usuarios"));
        Cachorro.listAddArray(Arquivo.Acessar(Cachorro.class, "cachorros"));
        Gato.listAddArray(Arquivo.Acessar(Gato.class, "gatos"));
        Papagaio.listAddArray(Arquivo.Acessar(Papagaio.class, "papagaios"));
        Produto.listAddArray(Arquivo.Acessar(Produto.class, "produtos"));
    }

    public static void salvarTodos(){
        Arquivo.Salvar(Usuario.getAll(), "usuarios");
        Arquivo.Salvar(Cachorro.getAll(), "cachorros");
        Arquivo.Salvar(Gato.getAll(), "gatos");
        Arquivo.Salvar(Papagaio.getAll(), "papagaios");
        Arquivo.Salvar(Produto.getAll(), "produtos");
    }

    public static void Salvar(List<?> lista, String nomeArquivo){
        SERIALIZADOR = new Gson();
        String filePath = new File("src/main/Jsons/").getAbsolutePath();
        try ( FileWriter writer = new FileWriter(filePath + "/" + nomeArquivo + ".json")) {
            SERIALIZADOR.toJson(lista, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static <T> List<T> Acessar(Class<T> classe, String nomeArquivo) {
        List<T> classeLista = new ArrayList<>();
        String filePath = new File("src/main/Jsons/").getAbsolutePath();

        try {
            Gson gson = new Gson();
            FileReader arq = new FileReader(filePath + "/" + nomeArquivo + ".json"); //classe para leitura
            BufferedReader lerArq = new BufferedReader(arq);
            Type typeOfT = TypeToken.getParameterized(List.class, classe).getType();
            classeLista = new Gson().fromJson(lerArq, typeOfT);
            lerArq.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return classeLista;
    }

}
