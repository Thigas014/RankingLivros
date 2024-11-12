package Menu;

import Autor.Autor;
import Interfaces.InterfaceAutor;
import Interfaces.InterfaceMenu;
import Interfaces.LivroInterface;
import Livro.Livro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu implements InterfaceMenu {
    private List<LivroInterface> livros =new ArrayList<>();
    private List<InterfaceAutor> autores = new ArrayList<>();

    public static void main(String[] args){
        Menu sistemaMenu = new Menu();
        sistemaMenu.carregarDados();

        Scanner scanner = new Scanner(System.in);
        int opc;

        do{
            System.out.println("---- Menu Principal ----");
            System.out.println("1. Listagem dos Melhores Livros");
            System.out.println("2. Ranking dos Melhores Autores");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            opc = scanner.nextInt();

            switch (opc){
                case 1 -> sistemaMenu.listarMelhoresLivros();
                case 2 -> sistemaMenu.listarMelhoresAutores();
                case 3 -> System.out.println("Saindo...");
                default -> System.out.println("Opcção Inválida! Tente denovo");
            }
        } while (opc !=3);

        scanner.close();
    }

    @Override
    public void carregarDados() {
        livros.add(new Livro("Livro A", "Autor X", 4.5, 200, 100, "1234567890", "1234567890123", "Português", 320));
        livros.add(new Livro("Livro B", "Autor Y", 5, 150, 80, "0987654321", "0987654321098", "Inglês", 280));
        autores.add(new Autor("Autor X", 4.5, 1));
        autores.add(new Autor("Autor Y", 5, 1));
    }

    @Override
    public void listarMelhoresLivros() {
        livros.sort(Comparator.comparingDouble(LivroInterface::getNotaMedia).reversed());
        System.out.println("\n--- Lista dos Melhores Livros ---");
        for (LivroInterface livro : livros) {
            System.out.println(livro + "\n");
        }
    }

    @Override
    public void listarMelhoresAutores() {
        autores.sort(Comparator.comparingDouble(InterfaceAutor::getNotaMediaGeral).reversed());
        System.out.println("\n--- Ranking dos Melhores Autores ---");
        for (InterfaceAutor autor : autores) {
            System.out.println(autor + "\n");
        }
    }
}