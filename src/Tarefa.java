public class Tarefa {
    //atributo privado do tipo String
    private String descricao;

    //criando um construtor para receber a descricao para
    //inicializar o objeto atual (Tarefa)
    //com a descrição fornecida
    public Tarefa(String descricao){
        
        //tribuindo o valor do parâmetro descricao 
        //o atributo descricao da classe.
        //O uso de this é necessário para distinguir entre o
        //parâmetro e o atributo.
        this.descricao = descricao;
    }

    //criando o método get pois o atributo descricao está privado,
    //assim podemos saber qual a descrição da Tarefa
    //getDescricao(): permite que outras classes obtenham
    //a descrição da tarefa
    public String getDescricao(){

        //retorna o valor atual do atributo descricao.
        //Permite que outras partes do código obtenham
        //a descrição da tarefa.
        return descricao;
    }

    //método toString para podermos ver a descrição das tarefas
    //quando chamamos o método obterDescricoesTarefas() ao invés
    // do endereço de mem[oria que está a tarefa
    
    public String toString(){
        return descricao;
    }
}
