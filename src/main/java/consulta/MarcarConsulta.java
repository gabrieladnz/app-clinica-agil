package consulta;

import paciente.Paciente;

import java.text.SimpleDateFormat;
import java.util.Date;

import static dados.clinica.Dados.consultas;
import static dados.clinica.Dados.pacientes;
import static org.example.Main.scanner;

/**
 * The type Marcar consulta.
 */
public class MarcarConsulta {
    /**
     * Marcar consulta.
     */
    public static void marcarConsulta() {
        if (pacientes.isEmpty()) {
            System.out.println("Nenhum paciente cadastrado.");
            return;
        }

        System.out.println("Selecione um paciente:");
        for (int i = 0; i < pacientes.size(); i++) {
            System.out.println((i + 1) + ". " + pacientes.get(i).getNome());
        }
        int pacienteIndex = scanner.nextInt() - 1;
        scanner.nextLine();

        if (pacienteIndex < 0 || pacienteIndex >= pacientes.size()) {
            System.out.println("\n ⚠\uFE0F Paciente inválido!");
            return;
        }

        Paciente paciente = pacientes.get(pacienteIndex);

        System.out.print("Dia da consulta (dd/MM/yyyy): ");
        String dia = scanner.nextLine();
        System.out.print("Hora da consulta (HH:mm): ");
        String hora = scanner.nextLine();
        System.out.print("Especialidade: ");
        String especialidade = scanner.nextLine();

        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
            Date dataConsulta = dateFormat.parse(dia + " " + hora);
            Date dataAtual = new Date();
            if (dataConsulta.before(dataAtual)) {
                System.out.println("\n ⚠\uFE0F Consultas não podem ser marcadas antes da data atual.");
                return;
            }
        } catch (Exception e) {
            System.out.println("\n ⚠\uFE0F Formato de data ou hora inválido.");
            return;
        }

        for (Consulta c : consultas) {
            if (c.getDia().equals(dia) && c.getHora().equals(hora)) {
                System.out.println("\n ⚠\uFE0F Esse horário já está ocupado.");
                return;
            }
        }

        consultas.add(new Consulta(paciente, dia, hora, especialidade));
        System.out.println("\n ✅ Consulta marcada com sucesso!");
    }
}
