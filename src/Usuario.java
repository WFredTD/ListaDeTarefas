public class Usuario {
    public static void main(String[] args) throws Exception{

        //instanciando umanova ListaTarefa
        ListaTarefa listaTarefa = new ListaTarefa();

        //Confirmando que temos uma lista vazia com o
        //método listaTarefa.obterNumeroTotalTarefas()
        System.out.println("O númro toal de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //adicionando as tarefas na lista:
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 1");
        System.out.println("O númro toal de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());

        //removendo tarefas da lista com mesma descrição que pedi:
        listaTarefa.removerTarefa("Tarefa 1");
        System.out.println("O númro toal de tarefas na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        
        //Obtendo a descrição das tarefas:
        listaTarefa.obterDescricoesTarefas();
    }
}
