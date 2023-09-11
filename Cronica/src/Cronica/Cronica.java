package Cronica;

public class Cronica {
    private String titulo;

    private String texto;

    private String data;

    private String autor;

    public Cronica(String titulo, String texto, String data, String autor) {
        this.titulo = titulo;
        this.texto = texto;
        this.data = data;
        this.autor = autor;
    }

    public Cronica(String titulo, String texto, String data) {
        this.titulo = titulo;
        this.texto = texto;
        this.data = data;
        this.autor = "Anônimo";
    }

    public String getTitulo() {
        return titulo;
    }

    public String getTexto() {
        return texto;
    }

    public String getData() {
        return data;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public String toString() {
        return titulo + "\n" + data + "\n" + autor + "\n" + texto;
    }


}