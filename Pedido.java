import java.io.Serializable;
import java.sql.Date;


public class Pedido implements Serializable {
    
    private static final long serialVersionUID = 1L;

    private String nome;
    private Date data_emissao;

    public Pedido(String nome, Date data_emissao) {

        this.nome = nome;
        this.data_emissao = data_emissao;

    }

    public String getNome() {

        return nome;

    }

    public void setNome(String nome) {

        this.nome = nome;

    }

    public Date getEmissao() {

        return data_emissao;

    }

    public void setEmissao(Date date_emissao) {

        this.data_emissao = date_emissao;

    }

    /**
     * Método toString para facilitar a visualização dos objetos
     * @return string contendo o nome e o cpf da pessoa
     */
    @Override
    public String toString() {

        return "Pessoa: " + nome + " - data de emissao: " + data_emissao;

    }
}
