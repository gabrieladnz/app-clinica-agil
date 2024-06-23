package paciente;

import java.io.Serializable;

/**
 * The type Paciente.
 */
public class Paciente implements Serializable {
    private final String nome;
    private final String telefone;

    /**
     * Instantiates a new Paciente.
     *
     * @param nome     the nome
     * @param telefone the telefone
     */
    public Paciente(String nome, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
    }

    /**
     * Gets nome.
     *
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * Gets telefone.
     *
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }
}
