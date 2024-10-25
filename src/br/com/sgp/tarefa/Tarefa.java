package br.com.sgp.tarefa;
import java.time.LocalDate;

import br.com.sgp.projeto.Projeto;

public class Tarefa {

    private long id;
    private String titulo;
    private String descricao;
    private LocalDate dataCriacao;
    private LocalDate dataConclusao;
    private TarefaPrioridade tarefaPrioridade;
    private TarefaStatus tarefaStatus;
    private Projeto projeto;

    public Tarefa() {
    }

    public Tarefa(long id, String titulo, String descricao, LocalDate dataCriacao, LocalDate dataConclusao,
            TarefaPrioridade tarefaPrioridade, TarefaStatus tarefaStatus, Projeto projeto) {
        this.id = id;
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataCriacao = dataCriacao;
        this.dataConclusao = dataConclusao;
        this.tarefaPrioridade = tarefaPrioridade;
        this.tarefaStatus = tarefaStatus;
        this.projeto = projeto;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(LocalDate dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDate getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDate dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public TarefaPrioridade getTarefaPrioridade() {
        return tarefaPrioridade;
    }

    public void setTarefaPrioridade(TarefaPrioridade tarefaPrioridade) {
        this.tarefaPrioridade = tarefaPrioridade;
    }

    public TarefaStatus getTarefaStatus() {
        return tarefaStatus;
    }

    public void setTarefaStatus(TarefaStatus tarefaStatus) {
        this.tarefaStatus = tarefaStatus;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

}
