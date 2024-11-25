package menu;

import autor.Autor;
import interfaces.AutorIf;
import interfaces.LivroIf;
import interfaces.MenuIf;
import livro.Livro;

import java.util.Comparator;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.logging.Logger;

public class Menu implements MenuIf {
    private List<LivroIf> livros = new ArrayList<>();
    private List<AutorIf> autores = new ArrayList<>();
    private static final Logger logger = Logger.getLogger(Menu.class.getName());

    public static void main(String[] args) {
        Menu sistemaMenu = new Menu();
        sistemaMenu.carregarDados();

        Scanner scanner = new Scanner(System.in);
        int opc;

        do {
            String header = "\n-------------------------------------------------";
            String menuTitle = String.format("%-25s", "               Menu Principal               ");
            String option1 = String.format("%-5s%-30s", 1, "Listagem dos Melhores Livros");
            String option2 = String.format("%-5d%-30s", 2, "Ranking dos Melhores Autores");
            String option3 = String.format("%-5d%-30s", 3, "Sair");
            String footer = "-------------------------------------------------";

            logger.info(header);
            logger.info(menuTitle);
            logger.info(header);
            logger.info(option1);
            logger.info(option2);
            logger.info(option3);
            logger.info(footer);
            logger.info("Escolha uma opção: ");

            opc = scanner.nextInt();

            switch (opc) {
                case 1 -> sistemaMenu.listarMelhoresLivros();
                case 2 -> sistemaMenu.listarMelhoresAutores();
                case 3 -> logger.info("Saindo...");
                default -> logger.warning("Opção Inválida! Tente novamente.");
            }
        } while (opc != 3);

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
                "autor",
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