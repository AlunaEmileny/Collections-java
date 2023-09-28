import java.util.List;
import java.util.ArrayList;

public class CatalagoLivro {
    private List<Livro> livrosList;
    public CatalagoLivro() {
        this.livrosList = new ArrayList<>();
    }
    public void adicionar(String autor, String titulo , String dataPublic){
        livrosList.add(new Livro(autor, titulo, dataPublic));
    }
    public void pesqAutor(){
        
    }
}
