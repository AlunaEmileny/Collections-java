import java.util.ArrayList;
import java.util.List;
public class ListaTarefas {
    private List<Tarefa> tarefaList;

    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionar(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void remover(String descricao){
        List<Tarefa> remocao = new ArrayList<>();
        for (Tarefa t: tarefaList){
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                remocao.add(t);
            }
        }
        tarefaList.removeAll(remocao);
    }

    public int ObterTotal(){
        return tarefaList.size();
    }

    public void verDescricao(){
        System.out.print(tarefaList);
    }
    
    public static void main(String[] args) {
        ListaTarefas l = new ListaTarefas();
        l.adicionar("caminhar");
        System.out.println(l.ObterTotal());
        //l.toString();
        l.verDescricao();
    }
}
