package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;


    public ListaTarefas(){
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefaLista(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public  void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public  int obterNumeroTotalDeTarefas(){
        return tarefaList.size();
    }

    public  void obterDescricaoTarefa(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println(listaTarefas.obterNumeroTotalDeTarefas());

        listaTarefas.adicionarTarefaLista("Tarefa 1");
        listaTarefas.adicionarTarefaLista("Tarefa 1");
        listaTarefas.adicionarTarefaLista("Tarefa 2");
        System.out.println(listaTarefas.obterNumeroTotalDeTarefas());
        listaTarefas.removerTarefa("Tarefa 1");
        System.out.println(listaTarefas.obterNumeroTotalDeTarefas());
        listaTarefas.obterDescricaoTarefa();
    }
}
