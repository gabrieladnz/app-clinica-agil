package consulta;

import static dados.clinica.Dados.consultas;
import static org.example.Main.scanner;

/**
 * The type Cancelar consulta.
 */
public class CancelarConsulta {
    /**
     * Cancelar consulta.
     */
    public static void cancelarConsulta() {
        if (consultas.isEmpty()) {
            System.out.println("Nenhuma consulta marcada.");
            return;
        }

        System.out.println("Selecione uma consulta para cancelar:");
        for (int i = 0; i < consultas.size(); i++) {
            System.out.println((i + 1) + ". " + consultas.get(i).toString());
        }
        int consultaIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (consultaIndex < 0 || consultaIndex >= consultas.size()) {
            System.out.println("Consulta inválida!");
            return;
        }

        Consulta consulta = consultas.get(consultaIndex);
        System.out.println("Você selecionou: " + consulta.toString());
        System.out.print("Deseja realmente cancelar essa consulta? (s/n): ");
        String confirmacao = scanner.nextLine();

        if (confirmacao.equalsIgnoreCase("s")) {
            consultas.remove(consultaIndex);
            System.out.println("Consulta cancelada com sucesso!");
        } else {
            System.out.println("Cancelamento abortado.");
        }
    }
}
