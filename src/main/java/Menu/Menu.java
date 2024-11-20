package Menu;

import Autor.Autor;
import Interfaces.AutorIf;
import Interfaces.MenuIf;
import Interfaces.LivroIf;
import Livro.Livro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Menu implements MenuIf {
    private List<LivroIf> livros =new ArrayList<>();
    private List<AutorIf> autores = new ArrayList<>();

    public static void main(String[] args){
        Menu sistemaMenu = new Menu();
        sistemaMenu.carregarDados();

        Scanner scanner = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n-------------------------------------------------");
            System.out.printf("%-25s\n", "               Menu Principal               ");
            System.out.println("-------------------------------------------------");
            System.out.printf("%-5s%-30s\n", 1, "Listagem dos Melhores Livros");
            System.out.printf("%-5d%-30s\n", 2, "Ranking dos Melhores Autores");
            System.out.printf("%-5d%-30s\n", 3, "Sair");
            System.out.println("-------------------------------------------------");
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
        livros.sort(Comparator.comparingDouble(LivroIf::getNotaMedia).reversed());

        System.out.println("\n--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",
                "Título",
                "Autor",
                "Nota Média",
                "Avaliações",
                "Resenhas",
                "ISBN",
                "ISBN-13",
                "Idioma",
                "Páginas");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        for (LivroIf livro : livros) {
            System.out.printf("%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s%-20s\n",
                    livro.getTitulo(),
                    livro.getAutor(),
                    livro.getNotaMedia(),
                    livro.getNumeroAvaliacoes(),
                    livro.getNumeroResenhas(),
                    livro.getIsbn(),
                    livro.getIsbn13(),
                    livro.getIdioma(),
                    livro.getNumeroPaginas());
        }
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    }

    @Override
    public void listarMelhoresAutores() {
        autores.sort(Comparator.comparingDouble(AutorIf::getNotaMediaGeral).reversed());

        System.out.println("\n------------------------------------------------------------------------");
        System.out.printf("%-20s%-20s%-20s\n", "Nome do Autor", "Nota Média Geral", "Livros Bem Avaliados");
        System.out.println("-------------------------------------------------------------------------");

        for (AutorIf autor : autores) {
            System.out.printf("%-30s%-20.2f%-20d\n",
                    autor.getNome(),
                    autor.getNotaMediaGeral(),
                    autor.getNumeroLivrosBemAvaliados());
        }
        System.out.println("---------------------------------------------------------------");
    }

}