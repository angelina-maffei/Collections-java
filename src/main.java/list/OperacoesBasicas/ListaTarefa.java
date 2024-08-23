package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // atributo

    private List<Tarefa> tarefasList;

    public ListaTarefa() {
        this.tarefasList = new ArrayList<>();

    }

    public void adicionaTarefa(String descricao) {
        tarefasList.add(new Tarefa(descricao));
        ;
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover - new ArrayList<>();
        for(Tarefa t : tarefasList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
                
            }
        }
        tarefasList.removeAll(tarefasParaRemover);        

    }

    public int obterNumeroTotalTarefas() {
        return tarefasList.size();

    }

    public void obterNumeroTotalTarefas() {
        System.out.println(tarefasList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();

        System.out.println("o numero total de elementos na lista é:" + listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionaTarefa(descricao: "Tarefa 1");
        listaTarefa.adicionaTarefa(descricao "Tarefa 1");
        listaTarefa.adicionaTarefa(descricao "Tarefa 2");

        listaTarefa.removerTarefa(descricao: "Tarefa 2");
        System.out.println("O numero total de elementos é:" + listaTarefa.obterNumeroTotalTarefas);


    }
}
