package br.com.sgp;
import java.time.LocalDate;

import br.com.sgp.projeto.Projeto;
import br.com.sgp.tarefa.Tarefa;
import br.com.sgp.tarefa.TarefaPrioridade;
import br.com.sgp.usuario.Usuario;
import br.com.sgp.usuario.UsuarioStatus;

public class App {
    public static void main(String[] args) throws Exception {
        
        Usuario usuario1 = new Usuario();

        usuario1.setId(1);;
        usuario1.setNome("Bernardo Silva");
        usuario1.setStatus(UsuarioStatus.ATIVO);

        Projeto projetoSGP = new Projeto();

        projetoSGP.setId(1);
        projetoSGP.setNome("Sistema de Gestão de Projetos");
        projetoSGP.setResponsavel(usuario1);

        Tarefa tarefa = new Tarefa();

        tarefa.setId(1);
        tarefa.setTitulo("Criar classes-entidades");
        tarefa.setDataCriacao(LocalDate.of(2024, 10, 24));
        tarefa.setTarefaPrioridade(TarefaPrioridade.ALTA);
    }
}
