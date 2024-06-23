package org.example;

import dados.clinica.CarregarDados;
import dados.clinica.SalvarDados;

import java.util.Scanner;

import static consulta.CancelarConsulta.cancelarConsulta;
import static consulta.MarcarConsulta.marcarConsulta;
import static paciente.CadastroPaciente.cadastrarPaciente;

/**
 * The type Main.
 */
public class Main {
    /**
     * The constant scanner.
     */
    public static Scanner scanner = new Scanner(System.in);

    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        CarregarDados.carregarDados();

        while (true) {
            System.out.println("\n Bem-vindo(a) a Clínica BelaVida! \uD83C\uDFE5");
            System.out.println("\n");
            System.out.println("1. Cadastrar um paciente \uD83E\uDDD1\u200D⚕\uFE0F");
            System.out.println("2. Marcar uma consulta \uD83D\uDCD1");
            System.out.println("3. Cancelar uma consulta ❌");
            System.out.println("4. Sair \uD83C\uDFC3\uD83D\uDEAA \n");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    cadastrarPaciente();
                    break;
                case 2:
                    marcarConsulta();
                    break;
                case 3:
                    cancelarConsulta();
                    break;
                case 4:
                    SalvarDados.salvarDados();
                    System.out.println("Encerrando o programa.");
                    return;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}