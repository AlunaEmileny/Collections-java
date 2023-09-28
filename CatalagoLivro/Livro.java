public class Livro {
    private String autor, titulo, dataPublic;

    public Livro(String autor, String titulo, String dataPublic) {
        this.autor = autor;
        this.titulo = titulo;
        this.dataPublic = dataPublic;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getData() {
        return dataPublic;
    }

    public void setData(String dataPublic) {
        this.dataPublic = dataPublic;
    }

    @Override
    public String toString(){
        return "Livro: "+this.getTitulo()+"\n"+"Autor:"+this.getAutor();
    }
}
