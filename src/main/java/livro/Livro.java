package livro;


import interfaces.LivroIf;

public class Livro implements LivroIf {
    private String titulo;
    private String autor;
    private double notaMedia;
    private int numeroAvaliacoes;
    private int numeroResenhas;
    private String isbn;
    private String isbn13;
    private String idioma;
    private int numeroPaginas;

    public Livro(String titulo, String autor, double notaMedia, int numeroAvaliacoes, int numeroResenhas, String isbn, String isbn13, String idioma, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.notaMedia = notaMedia;
        this.numeroAvaliacoes = numeroAvaliacoes;
        this.numeroResenhas = numeroResenhas;
        this.isbn = isbn;
        this.isbn13 = isbn13;
        this.idioma = idioma;
        this.numeroPaginas = numeroPaginas;
    }
    public String getTitulo() { return titulo; }
    public String getAutor() { return autor; }
    public double getNotaMedia() { return notaMedia; }
    public int getNumeroAvaliacoes() { return numeroAvaliacoes; }
    public int getNumeroResenhas() { return numeroResenhas; }
    public String getIsbn() { return isbn; }
    public String getIsbn13() { return isbn13; }
    public String getIdioma() { return idioma; }
    public int getNumeroPaginas() { return numeroPaginas; }


}
