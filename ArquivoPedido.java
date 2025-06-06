import java.io.*;
import java.util.ArrayList;

public class ArquivoPedido {

    // Constante com a pasta e o nome do arquivo para persistir o objeto
    private static final String CAMINHO_ARQUIVO = "pedidos.dat";

    // Escreve uma lista de objetos no arquivo
    public static void salvarLista(ArrayList<Pedido> pedidos) {
        FileOutputStream f;
        try {

            File arq = new File(CAMINHO_ARQUIVO);

            if (!arq.exists()) {

                arq.createNewFile();

            }

            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(arq));

            oos.writeObject(pedidos);

            oos.close();

            System.out.println("Lista de pedidos salva com sucesso.");

        } catch (FileNotFoundException e) {

            System.err.println("Erro ao salvar lista: " + e.getMessage());

        } catch (IOException e) {

            System.err.println("Erro ao salvar lista: " + e.getMessage());

        }
    }

        // Lê uma lista de objetos do arquivo
    public static ArrayList<Pedido> lerLista() {
        ArrayList<Pedido> lista = new ArrayList<>();
        try  {
            File arq = new File(CAMINHO_ARQUIVO);
            if (arq.exists()) {
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream(CAMINHO_ARQUIVO));
                lista = (ArrayList<Pedido>) ois.readObject();
                ois.close();
            }
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Erro ao ler lista: " + e.getMessage());
        }
        return lista;
    }

    // Adiciona uma nova pessoa à lista e regrava o arquivo
    public static void adicionarPessoa(Pedido novoPedido) {
        ArrayList<Pedido> pedidos = lerLista();
        pedidos.add(novoPedido);
        salvarLista(pedidos);
    }
}
