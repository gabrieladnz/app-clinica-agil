package paciente;

import static dados.clinica.Dados.pacientes;
import static org.example.Main.scanner;

/**
 * The type Cadastro paciente.
 */
public class CadastroPaciente {
    /**
     * Cadastrar paciente.
     */
    public static void cadastrarPaciente() {
        System.out.print("Nome do paciente: ");
        String nome = scanner.nextLine();
        System.out.print("Telefone do paciente: ");
        String telefone = scanner.nextLine();

        for (Paciente p : pacientes) {
            if (p.getTelefone().equals(telefone)) {
                System.out.println("\n ⚠\uFE0F Paciente já cadastrado!");
                return;
            }
        }

        pacientes.add(new Paciente(nome, telefone));
        System.out.println("\n ✅ Paciente cadastrado com sucesso!");
    }
}
