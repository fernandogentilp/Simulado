package Cronica;

public class CronicasDoEstudanteSistema {
    private Cronica[] cronicas;

    public CronicasDoEstudanteSistema() {
        this.cronicas = new Cronica[1000];
    }

    public void cadastrarCronica(String titulo, String texto, String data, String autor) {
        Cronica cadastro = new Cronica(titulo, texto, data, autor);
    }

    public void cadastrarCronica(String titulo, String texto, String data) {
        Cronica cadastro = new Cronica(titulo, texto, data);
    }

    public String listarCronicas() {
        
    }
}

