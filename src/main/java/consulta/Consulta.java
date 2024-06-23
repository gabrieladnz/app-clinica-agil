package consulta;

import paciente.Paciente;

import java.io.Serializable;

/**
 * The type Consulta.
 */
public class Consulta implements Serializable {
    private Paciente paciente;
    private String dia;
    private String hora;
    private String especialidade;

    /**
     * Instantiates a new Consulta.
     *
     * @param paciente      the paciente
     * @param dia           the dia
     * @param hora          the hora
     * @param especialidade the especialidade
     */
    public Consulta(Paciente paciente, String dia, String hora, String especialidade) {
        this.paciente = paciente;
        this.dia = dia;
        this.hora = hora;
        this.especialidade = especialidade;
    }

    /**
     * Gets paciente.
     *
     * @return the paciente
     */
    public Paciente getPaciente() {
        return paciente;
    }

    /**
     * Gets dia.
     *
     * @return the dia
     */
    public String getDia() {
        return dia;
    }

    /**
     * Gets hora.
     *
     * @return the hora
     */
    public String getHora() {
        return hora;
    }

    /**
     * Gets especialidade.
     *
     * @return the especialidade
     */
    public String getEspecialidade() {
        return especialidade;
    }

    public String toString() {
        return "Paciente: " + paciente.getNome() + ", Data: " + dia + ", Hora: " + hora + ", Especialidade: " + especialidade;
    }
}
