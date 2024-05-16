//imports necessários para usar as classes
//ArrayList e List do pacote java.util
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //criando um atributo em lista, sendo ele privado 
    //e com elementos da classe Tarefa, do tipo genérica "<>"
    //camada tarefaList
    private List<Tarefa> tarefaList;

    //criando um contrutor para sempre que chamarmos um
    //objeto do tipo ListaTarefa já ter criado uma list
    //vazia para poder adicionar e remover elementos,
    //obter o número total de tarefas e outos 
    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    }

    //método para adicionar uma nova tarefa à lista
    //com a descrição fornecida.
    public void adicionarTarefa(String descricao){
        //Como adiciono uma nova tarefa à lista?
        //Temos algumas formas, mas vamos utilizar uma
        //abaixo como exemplo para explicita melhor:
        tarefaList.add(new Tarefa(descricao));
    }

    //método para remove uma tarefa da lista
    //com base em sua descrição.
    public void removerTarefa(String descricao){
        //Como removo uma tarefa da lista?
         //Temos algumas formas, mas vamos utilizar uma
        //abaixo como exemplo para explicita melhor:

        //instanciando, ou seja, criando uma lista vazia
        //chamada tarefasParaRemover para adicionar as tarefas
        //que tiverem a descrição que for especificada nesse método
        List<Tarefa> tarefasParaRemover = new ArrayList<>();

        //criando um faço for each
        //com ele nós pegamos cada tarefa dentro da tarefaList
        //Percorrendo toda a lista
        for(Tarefa cadaTarefa : tarefaList){

            //se a descrição da cadaTarefa for igual a
            //descrição escrita no método
            if(cadaTarefa.getDescricao().equalsIgnoreCase(descricao)){

                //eu vou pegar o tarefasParaRemover e vai adicionar
                //a tarefa com mesma descrição no tarefasParaRemover
                tarefasParaRemover.add(cadaTarefa);
            }
        }
        //removendo as tarefas com descrições iguais com:
        tarefaList.removeAll(tarefasParaRemover);
    }

    //método para retornar o número total de tarefas na lista.
    public int obterNumeroTotalTarefas(){

        //return para nos retornar o resultado da operação
        //O método 'size()' é invocado no objeto tarefaList
        //para obter o número de elementos na lista.
        return tarefaList.size();
    }

    //método para obter uma lista contendo a descrição
    //de todas as tarefas na lista.
    public void obterDescricoesTarefas(){

        //imprimindo as tarefas da lista
        System.out.println(tarefaList);
    }
}