package br.com.caelum.cdcspring.model;

import javax.persistence.*;

@Entity
public class Livro {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    @Column(nullable = false)
    private String isbn;

    @Column(nullable = false)
    private Long numeroDePaginas;

    @Column(nullable = false)
    private String autor;

    /**
     * @deprecated hibernate only
     */
    public Livro() {
    }

    public Livro(String titulo, String isbn, Long numeroDePaginas, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.numeroDePaginas = numeroDePaginas;
        this.autor = autor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(Long numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
