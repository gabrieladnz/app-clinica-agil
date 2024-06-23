package dados.clinica;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * The type Salvar dados.
 */
public class SalvarDados {
    private static final String PACIENTES_FILE = "pacientes.dat";
    private static final String CONSULTAS_FILE = "consultas.dat";

    /**
     * Salvar dados.
     */
    public static void salvarDados() {
        try (ObjectOutputStream oosPacientes = new ObjectOutputStream(new FileOutputStream(PACIENTES_FILE));
             ObjectOutputStream oosConsultas = new ObjectOutputStream(new FileOutputStream(CONSULTAS_FILE))) {
            oosPacientes.writeObject(Dados.pacientes);
            oosConsultas.writeObject(Dados.consultas);
        } catch (IOException e) {
            System.out.println("\n ⚠\uFE0F Erro ao salvar dados: " + e.getMessage());
        }
    }
}