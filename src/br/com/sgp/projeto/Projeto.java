package br.com.sgp.projeto;
import br.com.sgp.usuario.Usuario;

public class Projeto {

    private long id;
    private String nome;
    private String descricao;
    private Usuario responsavel;

    public Projeto() {
    }

    public Projeto(long id, String nome, String descricao, Usuario responsavel) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.responsavel = responsavel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Usuario getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(Usuario responsavel) {
        this.responsavel = responsavel;
    }

}