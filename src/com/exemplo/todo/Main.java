
package com.exemplo.todo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Marcar tarefa como concluída");
            System.out.println("4. Remover tarefa");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            
            int option = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            
            switch (option) {
                case 1:
                    System.out.print("Digite o título da tarefa: ");
                    String title = scanner.nextLine();
                    manager.addTask(title);
                    break;
                case 2:
                    manager.listTasks();
                    break;
                case 3:
                    System.out.print("Digite o número da tarefa a ser concluída: ");
                    int completedTask = scanner.nextInt() - 1;
                    manager.markTaskCompleted(completedTask);
                    break;
                case 4:
                    System.out.print("Digite o número da tarefa a ser removida: ");
                    int removedTask = scanner.nextInt() - 1;
                    manager.removeTask(removedTask);
                    break;
                case 5:
                    System.out.println("Saindo...");
                    return;
                default:
                    System.out.println("Opção inválida.");
            }
        }
    }
}
