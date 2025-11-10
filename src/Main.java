import javax.swing.*;
import java.sql.SQLOutput;
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean executando = true;

        System.out.println("toDo List");

        while (executando) {

            System.out.println("""
                    === Menu ====
                    1 - Cadastrar tarefa
                    2 - Listar tarefas pendentes
                    3 - Buscar tarefas por titulo
                    4 - Marcar tarefa como concluida
                    5 - Remover tarefa
                    0 - sair
                    """);

            System.out.println("Digite uma opção");
            Scanner sc = new Scanner(System.in);
            int opcao = sc.nextInt();
            System.out.println("A opção escolhida foi: "+ opcao);
            sc.nextLine();

            executando = switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o titulo: ");
                    String titulo = sc.nextLine();
                    System.out.println("Digite a descrição: ");
                    String descricao = sc.nextLine();
                    System.out.println("Digite a data de entrega (yyyy-mm-dd)");
                    LocalDate dataEntrega = LocalDate.parse(sc.nextLine());
                    System.out.println("Cadastrar tarefa");

                    Tarefa novaTarefa = new Tarefa(titulo, descricao, dataEntrega);
                    System.out.println(novaTarefa);
                    yield true;
                }
                case 2 -> {
                    System.out.println("Tarefa listada com sucesso");
                    yield true;
                }
                case 3 -> {
                    System.out.println("Tarefa buscada com sucesso");
                    yield true;
                }
                case 4 -> {
                    System.out.println("Tarefa concluída");
                    yield true;
                }
                case 5 -> {
                    System.out.println("Tarefa removida");
                    yield true;
                }
                case 0 -> false;
                default -> {
                    System.out.println("Opção inválida");
                    yield true;
                }
            };
        }
    }
}