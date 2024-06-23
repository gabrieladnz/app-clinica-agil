package dados.clinica;

import consulta.Consulta;
import paciente.Paciente;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 * The type Carregar dados.
 */
public class CarregarDados {
    private static final String PACIENTES_FILE = "pacientes.dat";
    private static final String CONSULTAS_FILE = "consultas.dat";

    /**
     * Carregar dados.
     */
    public static void carregarDados() {
        try (ObjectInputStream oisPacientes = new ObjectInputStream(new FileInputStream(PACIENTES_FILE));
             ObjectInputStream oisConsultas = new ObjectInputStream(new FileInputStream(CONSULTAS_FILE))) {
            Dados.pacientes = (ArrayList<Paciente>) oisPacientes.readObject();
            Dados.consultas = (ArrayList<Consulta>) oisConsultas.readObject();
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("\n ⚠\uFE0F Nenhum dado anterior encontrado ou erro ao carregar dados.");
        }
    }
}
